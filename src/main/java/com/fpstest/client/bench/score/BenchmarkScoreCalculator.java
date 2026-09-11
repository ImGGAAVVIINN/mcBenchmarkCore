package com.fpstest.client.bench.score;

import com.fpstest.client.bench.BenchmarkResult;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
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
 *        category score = weighted harmonic mean of its workload scores
 *              ↓
 *        overall score = weighted harmonic mean of GPU / CPU / RAM
 * </pre>
 *
 * <p><b>Aggregation rules</b>:</p>
 * <ul>
 *   <li>Every valid test contributes to its primary workload group (GPU/CPU)
 *       via its average FPS, and to the RAM JVM/GC workload via its recorded GC
 *       time — both are genuinely measured per test.</li>
 *   <li>A workload's score is the <em>harmonic mean</em> of its tests' points,
 *       so a workload with many tests is not automatically more important than
 *       one with a single test (the declared weight is what matters).</li>
 *   <li>Category and overall scores use <em>weighted harmonic means</em> so a
 *       single extremely strong workload cannot hide a substantially weaker one.</li>
 *   <li>Missing/invalid data is NaN (never zero, never substituted). The overall
 *       score requires all three categories; otherwise it is NaN.</li>
 * </ul>
 */
@Environment(EnvType.CLIENT)
public final class BenchmarkScoreCalculator {

    private BenchmarkScoreCalculator() {
    }

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
                    addTest(byWorkload, r, ScoreWorkload.CPU_WORLD);
                }
                // Every valid test also contributes to the allocation workload
                // via its measured heap-growth footprint (peak minus start) and
                // to the JVM/GC workload via its recorded GC time — both are
                // genuinely measured per test.
                addTest(byWorkload, r, ScoreWorkload.RAM_ALLOCATION);
                addTest(byWorkload, r, ScoreWorkload.RAM_JVM_GC);
            }
        }

        // 2. Workload scores = harmonic mean of each workload's test points.
        Map<ScoreWorkload, BenchmarkScore.WorkloadScore> workloads = new EnumMap<>(ScoreWorkload.class);
        for (ScoreWorkload w : ScoreWorkload.values()) {
            List<BenchmarkScore.TestScore> tests = byWorkload.get(w);
            double score = harmonicMean(tests.stream().map(BenchmarkScore.TestScore::points).toList());
            workloads.put(w, new BenchmarkScore.WorkloadScore(w, score, tests.size(), List.copyOf(tests)));
        }

        // 3. Category scores = weighted harmonic mean of present workload scores.
        double gpu = categoryScore(ScoreCategory.GPU, workloads);
        double cpu = categoryScore(ScoreCategory.CPU, workloads);
        double ram = categoryScore(ScoreCategory.RAM, workloads);

        // 4. Overall = weighted harmonic mean of the three categories.
        double overall = overallScore(gpu, cpu, ram);

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
            case FPS -> r.fps().avg();
            case GC_TIME_MS -> (double) r.gcTimeMs();
            case HEAP_DELTA_MB -> (r.heapPeak() - r.heapUsedStart()) / 1048576.0;
            case PRELOAD_MS -> r.extras().getOrDefault("preload_duration_ms", Double.NaN);
        };
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
     * Weighted harmonic mean of a category's present workload scores.
     *
     * <p>Weights are renormalized over the workloads that actually have a valid
     * score, so a missing workload does not silently become zero and does not
     * distort the remaining weights.</p>
     */
    private static double categoryScore(ScoreCategory category, Map<ScoreWorkload, BenchmarkScore.WorkloadScore> workloads) {
        double weightSum = 0.0;
        double weightedReciprocalSum = 0.0;
        for (ScoreWorkload w : ScoreWorkload.values()) {
            if (w.category != category) {
                continue;
            }
            BenchmarkScore.WorkloadScore ws = workloads.get(w);
            double score = ws == null ? Double.NaN : ws.score();
            if (!Double.isNaN(score) && score > 0) {
                weightSum += w.weight;
                weightedReciprocalSum += w.weight / score;
            }
        }
        if (weightSum == 0.0 || weightedReciprocalSum == 0.0) {
            return Double.NaN;
        }
        return weightSum / weightedReciprocalSum;
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