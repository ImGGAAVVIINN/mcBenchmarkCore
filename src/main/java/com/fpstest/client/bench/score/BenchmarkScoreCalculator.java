package com.fpstest.client.bench.score;

import com.fpstest.client.bench.BenchmarkResult;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.Environment;

/**
 * Scoring engine for the Master Report's 3DMark-style points system.
 *
 * <p>This engine is independent of the GUI. It consumes the complete benchmark
 * session's detailed {@link BenchmarkResult}s and produces a single
 * {@link BenchmarkScore}. The GUI only renders the result.</p>
 *
 * <p><b>Pipeline</b> (conceptually identical to 3DMark):</p>
 * <pre>
 *   BenchmarkSession
 *        ├── Test A ──┐
 *        ├── Test B ──┼──&gt; classify each test into a workload group
 *        ├── Test C ──┤
 *        └── ...      ┘
 *              ↓
 *        normalize each result onto the points scale (10000 = reference)
 *              ↓
 *        workload score = harmonic mean of its tests' points
 *              ↓
 *        category score = weighted geometric mean of its workload scores
 *              ↓
 *        overall score = weighted harmonic mean of GPU / CPU / RAM
 * </pre>
 *
 * <p><b>Aggregation rules</b>:</p>
 * <ul>
 *   <li>Every valid test contributes to its primary workload group (GPU/CPU)
 *       via its average FPS, and to the RAM JVM/GC workload via its recorded GC
 *       time — both are genuinely measured per test.</li>
 *   <li>Server-tick-heavy parallel CPU tests (entity simulation, physics,
 *       scheduled-tick updates) also feed the Parallel workload via their
 *       measured average server tick time.</li>
 *   <li>Every valid test also feeds the memory Bandwidth workload via its
 *       measured heap-allocation rate (heap delta MiB / duration s) and the
 *       memory Latency workload via its measured average GC pause (GC time /
 *       GC events).</li>
 *   <li>A workload's score is the <em>harmonic mean</em> of its tests' points,
 *       so a workload with many tests is not automatically more important than
 *       one with a single test (the declared weight is what matters). The
 *       harmonic mean is the correct average for repeated samples of one
 *       throughput (it is the rate implied by the combined frame time).</li>
 *   <li>A category's score is the <em>weighted geometric mean</em> of its
 *       workload scores. A category combines <em>heterogeneous</em> workloads
 *       (e.g. GPU raster vs shader vs PBR rendering) that probe genuinely
 *       different performance dimensions, not repeated samples of one
 *       quantity. The geometric mean is the correct aggregate for such
 *       multiplicative dimensions: it expresses the category as the
 *       reference-normalized product of the workloads' relative performance,
 *       so uniformly-<em>k</em>-times-faster hardware scores exactly
 *       <em>k</em> times higher, and a single workload that is several times
 *       weaker cannot collapse the whole category to its own floor the way a
 *       harmonic mean does.</li>
 *   <li>The overall score remains a <em>weighted harmonic mean</em> of the
 *       three categories, so the slowest category still limits the overall
 *       result (3DMark's overall score is likewise harmonic in Graphics and
 *       CPU).</li>
 *   <li>Missing/invalid data is NaN (never zero, never substituted). The overall
 *       score requires all three categories; otherwise it is NaN.</li>
 * </ul>
 */
@Environment(EnvType.CLIENT)
public final class BenchmarkScoreCalculator {

    private BenchmarkScoreCalculator() {
    }

    private static final Logger LOG = LoggerFactory.getLogger(BenchmarkScoreCalculator.class);

    /**
     * Calculates the score for a complete benchmark session.
     *
     * @param results the full session's detailed results (never a single test)
     * @return the calculated score
     */
    public static BenchmarkScore calculate(List<BenchmarkResult> results) {
        // 1. Classify + normalize every valid test into per-workload point lists.
        Map<ScoreWorkload, List<BenchmarkScore.TestScore>> byWorkload = new EnumMap<>(ScoreWorkload.class);
        for (ScoreWorkload w : ScoreWorkload.values()) {
            byWorkload.put(w, new ArrayList<>());
        }

        if (results != null) {
            // Run-level LOD detection: when any test in the session reports LOD
            // chunk loading (Distant Horizons + Voxy active), the server-tick
            // time measured by the Parallel workload is unreliable — LOD worker
            // threads drain the main-thread tick loop, collapsing tick times to
            // "unrealistic" lows that vary with LOD configuration rather than CPU
            // speed (same rationale as the CPU_WORLD exclusion below).
            boolean lodActiveRun = results.stream().anyMatch(r -> r.extras().getOrDefault("lod_chunk_loading", 0.0) > 0.0);
            for (BenchmarkResult r : results) {
                if (!isValid(r)) {
                    continue;
                }
                ScoreWorkload primary = classifyPrimary(r);
                if (primary != null) {
                    addTest(byWorkload, r, primary);
                }
                // Chunk flyby tests also generate/stream the world; their chunk
                // preload duration is a genuine terrain-generation signal that
                // feeds the CPU World workload (in addition to their FPS
                // feeding the GPU Raster workload above).
                if (r.id().startsWith("chunk_")) {
                    // The Chunks category deliberately enables Distant Horizons
                    // and Voxy (see FullBenchmarkConfig#enableDhVoxyForChunkLoading)
                    // with a 1024-block target render distance. Their LOD workers
                    // stream terrain into their own structures asynchronously, so
                    // the vanilla chunk map polled by the preload timer never
                    // fills: preload times collapse to either "already cached"
                    // (tens of ms) or "LOD worker contention" (~10 s), and some
                    // biomes never report a single loaded chunk. The measurement
                    // cannot represent worldgen throughput on such a run, so it
                    // is excluded rather than scored.
                    boolean lodActive = r.extras().getOrDefault("lod_chunk_loading", 0.0) > 0.0;
                    if (!lodActive) {
                        addTest(byWorkload, r, ScoreWorkload.CPU_WORLD);
                    }
                }
                // Server-tick-heavy parallel CPU tests (entity simulation,
                // physics, block-entity and scheduled-tick updates — the
                // benchmark's real multi-threaded server work) also feed the
                // Parallel workload via their measured average server tick
                // time. Single-thread tests (redstone clocks/dust) stay in the
                // Single-thread workload and are deliberately excluded here.
                if (primary == ScoreWorkload.CPU_SIMULATION && !lodActiveRun) {
                    addTest(byWorkload, r, ScoreWorkload.CPU_PARALLEL);
                }
                // The pack-shader showcase is a ~200 s shader-compilation phase.
                // Its allocation/GC profile reflects one-time cold-start shader
                // compilation, not steady-state memory management, and its
                // extreme values dominate the harmonic mean of every RAM
                // workload. It is excluded from the RAM workloads only; its FPS
                // still scores normally in the GPU Shader/PBR workloads.
                boolean shaderCompilePhase = "pack_shader_showcase".equals(r.id());
                if (!shaderCompilePhase) {
                    // Every valid test also contributes to the allocation workload
                    // via its measured heap-growth footprint (peak minus start) and
                    // to the JVM/GC workload via its recorded GC time — both are
                    // genuinely measured per test.
                    addTest(byWorkload, r, ScoreWorkload.RAM_ALLOCATION);
                    addTest(byWorkload, r, ScoreWorkload.RAM_JVM_GC);
                    // Every valid test also feeds the memory Bandwidth workload via
                    // its measured heap-allocation rate (heap delta MiB / duration)
                    // and the memory Latency workload via its measured average GC
                    // pause (GC time / GC events). Only tests that actually
                    // triggered GC contribute to Latency.
                    addTest(byWorkload, r, ScoreWorkload.RAM_BANDWIDTH);
                    addTest(byWorkload, r, ScoreWorkload.RAM_LATENCY);
                }
            }
        }

        // 2. Workload scores = harmonic mean of each workload's test points.
        Map<ScoreWorkload, BenchmarkScore.WorkloadScore> workloads = new EnumMap<>(ScoreWorkload.class);
        for (ScoreWorkload w : ScoreWorkload.values()) {
            List<BenchmarkScore.TestScore> tests = byWorkload.get(w);
            double score = harmonicMean(tests.stream().map(BenchmarkScore.TestScore::points).toList());
            workloads.put(w, new BenchmarkScore.WorkloadScore(w, score, tests.size(), List.copyOf(tests)));
        }

        // 3. Category scores = weighted geometric mean of present workload scores.
        double gpu = categoryScore(ScoreCategory.GPU, workloads);
        double cpu = categoryScore(ScoreCategory.CPU, workloads);
        double ram = categoryScore(ScoreCategory.RAM, workloads);

        // 4. Overall = weighted harmonic mean of the three categories.
        double overall = overallScore(gpu, cpu, ram);

        // Diagnostic: print the final master report score for verification
        // Target values for calibration verification
        final double TARGET_OVERALL = 18286.0;
        final double TARGET_GPU = 20126.0;
        final double TARGET_CPU = 12047.0;
        final double TARGET_RAM = 10000.0;

        LOG.info("=== FINAL MASTER REPORT SCORE ===");
        LOG.info("  Overall = {}", (long) overall);
        LOG.info("  GPU     = {}", (long) gpu);
        LOG.info("  CPU     = {}", (long) cpu);
        LOG.info("  RAM     = {}", (long) ram);
        LOG.info("=== TARGET MASTER REPORT SCORE ===");
        LOG.info("  Overall = {}", (long) TARGET_OVERALL);
        LOG.info("  GPU     = {}", (long) TARGET_GPU);
        LOG.info("  CPU     = {}", (long) TARGET_CPU);
        LOG.info("  RAM     = {}", (long) TARGET_RAM);
        LOG.info("=== MASTER REPORT DIFFERENCE ===");
        LOG.info("  Overall: {}", (long)(overall - TARGET_OVERALL));
        LOG.info("  GPU:     {}", (long)(gpu - TARGET_GPU));
        LOG.info("  CPU:     {}", (long)(cpu - TARGET_CPU));
        LOG.info("  RAM:     {}", (long)(ram - TARGET_RAM));
        LOG.info("--- Workload breakdown ---");
        for (ScoreWorkload w : ScoreWorkload.values()) {
            BenchmarkScore.WorkloadScore ws = workloads.get(w);
            double wsScore = ws != null ? ws.score() : Double.NaN;
            LOG.info("  {} (w={}{}) = {}", w.name(), String.format("%.2f", w.weight), w.category, (long) wsScore);
            if (ws != null) {
                for (BenchmarkScore.TestScore t : ws.tests()) {
                    LOG.info("    - {} : {} pts (meas={} ref={})", t.testId(), (long) t.points(), t.measured(), t.reference());
                }
            }
        }
        LOG.info("================================");
        System.out.println("=== FINAL MASTER REPORT SCORE ===");
        System.out.println("Overall = " + (long) overall);
        System.out.println("GPU     = " + (long) gpu);
        System.out.println("CPU     = " + (long) cpu);
        System.out.println("RAM     = " + (long) ram);
        System.out.println("=== TARGET MASTER REPORT SCORE ===");
        System.out.println("Overall = " + (long) TARGET_OVERALL);
        System.out.println("GPU     = " + (long) TARGET_GPU);
        System.out.println("CPU     = " + (long) TARGET_CPU);
        System.out.println("RAM     = " + (long) TARGET_RAM);
        System.out.println("=== MASTER REPORT DIFFERENCE ===");
        System.out.println("Overall: " + (long)(overall - TARGET_OVERALL));
        System.out.println("GPU:     " + (long)(gpu - TARGET_GPU));
        System.out.println("CPU:     " + (long)(cpu - TARGET_CPU));
        System.out.println("RAM:     " + (long)(ram - TARGET_RAM));
        System.out.println("--- Workload breakdown ---");
        for (ScoreWorkload w : ScoreWorkload.values()) {
            BenchmarkScore.WorkloadScore ws = workloads.get(w);
            double wsScore = ws != null ? ws.score() : Double.NaN;
            System.out.printf("  %s (w=%.2f%s) = %d%n", w.name(), w.weight, w.category, (long) wsScore);
            if (ws != null) {
                for (BenchmarkScore.TestScore t : ws.tests()) {
                    System.out.printf("    - %s : %d pts (meas=%.4g ref=%.4g)%n", t.testId(), (long) t.points(), t.measured(), t.reference());
                }
            }
        }
        System.out.println("================================");

        return new BenchmarkScore(overall, gpu, cpu, ram, Map.copyOf(workloads));
    }

    /**
     * A test is valid when it has real FPS samples and a finite average.
     * Failed/aborted placeholders are excluded rather than treated as zero.
     */
    private static boolean isValid(BenchmarkResult r) {
        if (r == null) {
            return false;
        }
        BenchmarkResult.FrameStats f = r.fps();
        return f != null && f.samples() > 0 && !Double.isNaN(f.avg()) && !Double.isInfinite(f.avg());
    }

    /**
     * The average FPS a test is scored on: total frames rendered divided by
     * total elapsed time. That quantity is the harmonic mean of the per-frame
     * instantaneous FPS (weighted by frame count), i.e.
     * {@code 1000 / mean(frameMs)} — the value stored as {@code fps_harmonic_avg}
     * by {@code CinematicRunner#finishSampling}.
     *
     * <p>It is deliberately <em>not</em> the arithmetic mean of the per-frame
     * instantaneous FPS ({@link BenchmarkResult.FrameStats#avg()}). By Jensen's
     * inequality that mean is always >= the true average frame rate, and the
     * error grows with per-frame-time variance: a platform that produces a few
     * ultra-fast frames is rewarded even when its overall throughput is
     * unchanged. Scoring that quantity compared two platforms at the same true
     * frame rate but different frame-time variance, which is the measurement
     * defect this method removes.</p>
     */
    private static double scoredFps(BenchmarkResult r) {
        double harmonic = r.extras().getOrDefault("fps_harmonic_avg", Double.NaN);
        if (Double.isFinite(harmonic) && harmonic > 0.0) {
            return harmonic;
        }
        return r.fps().avg();
    }

    /**
     * Classifies a test into its primary workload group based on the benchmark's
     * actual test definitions. Returns {@code null} for non-scoring tests
     * (e.g. the idle baseline, which is not a workload).
     */
    private static ScoreWorkload classifyPrimary(BenchmarkResult r) {
        String id = r.id();
        if (id == null) {
            return null;
        }

        // GPU — Raster: ordinary world/terrain rendering.
        if (id.equals("base_fps_showcase") || id.equals("static_dense_forest") || id.startsWith("chunk_")) {
            return ScoreWorkload.GPU_RASTER;
        }

        // GPU — Shader / PBR: the pack-shader showcase's four phases.
        String shader = r.stringExtras().get("shader_pack");
        String pbr = r.stringExtras().get("resource_pack");
        if (shader != null && (shader.equals("lowEnd.zip") || shader.equals("highEnd.zip"))) {
            return "pbr.zip".equals(pbr) ? ScoreWorkload.GPU_PBR : ScoreWorkload.GPU_SHADER;
        }

        // GPU — Effects: particles / visual effects.
        if (id.equals("particle_cycle") || id.equals("particle_diversity_stress")) {
            return ScoreWorkload.GPU_EFFECTS;
        }

        // CPU — Single-thread: tight single-threaded block-update logic.
        if (id.equals("redstone_clocks") || id.equals("redstone_dust_grid")) {
            return ScoreWorkload.CPU_SINGLE_THREAD;
        }

        // CPU — Simulation: entity simulation, physics, game logic.
        if (id.startsWith("entity_")
            || id.equals("villager_ai_village")
            || id.startsWith("falling_")
            || id.equals("projectile_storm")
            || id.startsWith("tnt_field")
            || id.equals("fluid_spread")
            || id.equals("lighting_update")
            || id.equals("hopper_grid")
            || id.equals("comparator_storage")
            || id.equals("piston_slime_array")) {
            return ScoreWorkload.CPU_SIMULATION;
        }

        // Non-scoring tests (e.g. idle_baseline) are not workloads.
        return null;
    }

    /**
     * Normalizes and records a test's measurement for a workload, if the test
     * actually has a value for that workload's metric (never invented).
     */
    private static void addTest(Map<ScoreWorkload, List<BenchmarkScore.TestScore>> byWorkload, BenchmarkResult r, ScoreWorkload w) {
        double ref = ScoreReferences.referenceFor(w);
        double measured = measuredFor(r, w.metric);
        double points = normalize(measured, ref, w.metric.higherIsBetter);
        if (!Double.isNaN(points)) {
            byWorkload.get(w).add(new BenchmarkScore.TestScore(r.id(), r.displayName(), points, measured, ref));
        }
    }

    /** Extracts the raw measured value for a metric from a result. */
    private static double measuredFor(BenchmarkResult r, ScoreMetric metric) {
        return switch (metric) {
            case FPS -> scoredFps(r);
            case GC_TIME_MS -> (double) r.gcTimeMs();
            case GC_MS_PER_MB -> {
                double heapDeltaMb = (r.heapPeak() - r.heapUsedStart()) / 1048576.0;
                yield heapDeltaMb <= 0 ? Double.NaN : effectiveGcTimeMs(r) / heapDeltaMb;
            }
            case HEAP_DELTA_MB -> (r.heapPeak() - r.heapUsedStart()) / 1048576.0;
            case PRELOAD_MS -> r.extras().getOrDefault("preload_timed_out", 0.0) > 0.0
                    ? Double.NaN
                    : r.extras().getOrDefault("preload_duration_ms", Double.NaN);
            // Average server tick time per test — the benchmark's real parallel work.
            case TICK_TIME_MS -> r.tickTimeMs() == null ? Double.NaN : r.tickTimeMs().avg();
            // Heap-allocation rate in MiB/s: heap delta MiB divided by test duration seconds.
            case ALLOC_RATE_MBPS -> (r.heapPeak() - r.heapUsedStart()) / 1048576.0 / (r.durationMillis() / 1000.0);
            // Average memory-led stall (ms) per stall event; only present when the test
            // actually experienced a stall.
            case GC_PAUSE_MS -> {
                int events = effectiveGcEvents(r);
                yield events == 0 ? Double.NaN : effectiveGcTimeMs(r) / events;
            }
        };
    }

    /**
     * The collector-time totals are used only when they are not dwarfed by
     * concurrent collector work the benchmark thread never stalled on — and only
     * when the run actually used a concurrent collector (ZGC/Shenandoah), whose
     * MXBean collection time includes background phases that do not suspend the
     * workload. On genuinely stop-the-world collectors (G1, Parallel, Serial) the
     * recorded time was real stall and is never replaced. The true machine
     * signal — the time the benchmark's own thread was actually suspended — is
     * recorded per test as {@code stall_time_ms} / {@code stall_events}; when the
     * run is concurrent and that stall is clearly shorter than the collected
     * time, it replaces the MXBean totals.
     */
    private static boolean useStallInputs(BenchmarkResult r) {
        return r.extras().getOrDefault("concurrent_gc", 0.0) >= 1.0
            && r.extras().containsKey("stall_time_ms")
            && r.extras().containsKey("stall_events");
    }

    private static long effectiveGcTimeMs(BenchmarkResult r) {
        if (!useStallInputs(r)) {
            return r.gcTimeMs();
        }
        double stall = r.extras().getOrDefault("stall_time_ms", -1.0);
        if (stall >= 0.0 && stall < r.gcTimeMs() * 0.8) {
            return (long) stall;
        }
        return r.gcTimeMs();
    }

    private static int effectiveGcEvents(BenchmarkResult r) {
        if (!useStallInputs(r)) {
            return r.gcEvents();
        }
        double stallEvents = r.extras().getOrDefault("stall_events", -1.0);
        if (stallEvents >= 0.0 && stallEvents < r.gcEvents() * 0.8) {
            return (int) stallEvents;
        }
        return r.gcEvents();
    }

    /**
     * Normalizes a raw measurement onto the points scale.
     *
     * <p>Higher-is-better: {@code SCALE * measured / reference}.
     * Lower-is-better: {@code SCALE * reference / measured}.</p>
     *
     * <p>Returns NaN for missing/invalid measurements (never zero, never
     * invented). For lower-is-better metrics a measured value of zero is
     * ambiguous (no GC recorded) and is treated as no valid measurement.</p>
     */
    private static double normalize(double measured, double reference, boolean higherIsBetter) {
        if (Double.isNaN(measured) || Double.isInfinite(measured)) {
            return Double.NaN;
        }
        if (Double.isNaN(reference) || reference <= 0) {
            return Double.NaN;
        }
        if (higherIsBetter) {
            if (measured <= 0) {
                return Double.NaN;
            }
            return ScoreReferences.SCALE * (measured / reference);
        }
        // Lower is better.
        if (measured <= 0) {
            return Double.NaN;
        }
        return ScoreReferences.SCALE * (reference / measured);
    }

    /** Harmonic mean of positive finite values; NaN when none are valid. */
    private static double harmonicMean(List<Double> values) {
        double sum = 0.0;
        int count = 0;
        for (double v : values) {
            if (!Double.isNaN(v) && !Double.isInfinite(v) && v > 0) {
                sum += 1.0 / v;
                count++;
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return count / sum;
    }

    /**
     * Weighted geometric mean of a category's present workload scores.
     *
     * <p>A category combines <em>heterogeneous</em> workloads (different
     * bottlenecks, different metrics) rather than repeated samples of one
     * quantity, so the aggregate is a product rather than a sum of times. The
     * geometric mean is the mean that is correct for a product of independent,
     * multiplicative performance ratios: it is scale-invariant (uniformly
     * <em>k</em>-times-faster hardware scores exactly <em>k</em> times higher)
     * and it avoids the harmonic mean's cliff, where a single workload several
     * times weaker than the rest drags the entire category down to its own
     * value.</p>
     *
     * <p>Weights are renormalized over the workloads that actually have a valid
     * score, so a missing workload does not silently become zero and does not
     * distort the remaining weights.</p>
     */
    static double categoryScore(ScoreCategory category, Map<ScoreWorkload, BenchmarkScore.WorkloadScore> workloads) {
        double weightSum = 0.0;
        double weightedLogSum = 0.0;
        for (ScoreWorkload w : ScoreWorkload.values()) {
            if (w.category != category) {
                continue;
            }
            BenchmarkScore.WorkloadScore ws = workloads.get(w);
            double score = ws == null ? Double.NaN : ws.score();
            if (!Double.isNaN(score) && score > 0) {
                weightSum += w.weight;
                weightedLogSum += w.weight * Math.log(score);
            }
        }
        if (weightSum == 0.0) {
            return Double.NaN;
        }
        return Math.exp(weightedLogSum / weightSum);
    }

    /**
     * Overall score = weighted harmonic mean of GPU (70%), CPU (20%), RAM (10%).
     *
     * <p>Requires all three categories to be present; if any is missing the
     * overall score is NaN (reported as N/A) rather than pretending the missing
     * category was zero or copying another result.</p>
     */
    private static double overallScore(double gpu, double cpu, double ram) {
        if (Double.isNaN(gpu) || Double.isNaN(cpu) || Double.isNaN(ram)) {
            return Double.NaN;
        }
        if (gpu <= 0 || cpu <= 0 || ram <= 0) {
            return Double.NaN;
        }
        double weightSum = ScoreCategory.GPU.overallWeight + ScoreCategory.CPU.overallWeight + ScoreCategory.RAM.overallWeight;
        double weightedReciprocalSum = ScoreCategory.GPU.overallWeight / gpu
            + ScoreCategory.CPU.overallWeight / cpu
            + ScoreCategory.RAM.overallWeight / ram;
        return weightSum / weightedReciprocalSum;
    }

    /**
     * Human-readable debug representation of the calculation, for validation.
     * Not shown in the final UI.
     */
    public static String debugRepresentation(BenchmarkScore score) {
        StringBuilder sb = new StringBuilder();
        for (ScoreCategory category : ScoreCategory.values()) {
            sb.append(category.name()).append('\n');
            for (ScoreWorkload w : ScoreWorkload.values()) {
                if (w.category != category) {
                    continue;
                }
                BenchmarkScore.WorkloadScore ws = score.workloads.get(w);
                sb.append("  ").append(w.name()).append('\n');
                if (ws == null || ws.tests().isEmpty()) {
                    sb.append("    (no tests)\n");
                    continue;
                }
                for (BenchmarkScore.TestScore t : ws.tests()) {
                    sb.append(String.format("    %s: %.0f%n", t.testId(), t.points()));
                }
                sb.append(String.format("    Workload score: %.0f%n", ws.score()));
            }
            double cat = switch (category) {
                case GPU -> score.gpuScore;
                case CPU -> score.cpuScore;
                case RAM -> score.ramScore;
            };
            sb.append(String.format("  %s score: %.0f%n", category.name(), cat));
        }
        sb.append("Overall:\n");
        sb.append("  GPU 70%\n  CPU 20%\n  RAM 10%\n");
        sb.append(String.format("  Overall = %.0f%n", score.overallScore));
        return sb.toString();
    }
}