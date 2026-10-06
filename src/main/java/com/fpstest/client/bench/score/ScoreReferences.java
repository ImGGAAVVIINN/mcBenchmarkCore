package com.fpstest.client.bench.score;

import com.fpstest.client.config.FpsTestConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * Central scoring configuration: the fixed reference performance for each
 * scored workload and the calibrated points scale.
 *
 * <p>These are <em>fixed benchmark reference values</em> — they are never derived
 * from the current user's results at runtime (that would make every machine score
 * ~{@link #SCALE}). A measured value equal to the reference scores exactly
 * {@link #SCALE} (10,000) points.</p>
 *
 * <p><b>Calibration.</b> The reference values represent the performance of a
 * mid-range reference machine on each workload, and {@link #SCALE} is the
 * calibrated multiplicative scaling constant that converts normalized
 * performance into points. Together they are tuned so that a modern high-end
 * system (e.g. an RTX 4070 SUPER-class GPU) scores roughly 20,000 GPU points,
 * a strong CPU scores roughly 12,000 CPU points, and extreme hardware can
 * exceed 50,000 overall. Adjust {@link #SCALE} (or a reference) to re-scale the
 * whole points system; the scoring model itself stays unchanged.</p>
 *
 * <p>Workloads with no dedicated measured metric in the benchmark are never
 * invented; every workload currently has a real, per-test measured metric
 * (see {@link ScoreMetric}).</p>
 */
@Environment(EnvType.CLIENT)
public final class ScoreReferences {
    /**
     * Calibrated multiplicative scaling constant: a measured value equal to the
     * reference scores exactly this many points. Tune this to re-scale the
     * entire points system (higher = larger scores).
     */
    public static final double SCALE = 10000.0;

    // ---- GPU references (FPS, higher is better) ----
    /** Reference average FPS for ordinary world/terrain rendering (chunk flybys etc.). Calibrated target: GPU≈20,126 pts */
    public static final double GPU_RASTER_FPS = 289.04;
    /** Reference average FPS for shader-heavy rendering. Calibrated target: GPU≈20,126 pts */
    public static final double GPU_SHADER_FPS = 58.06;
    /** Reference average FPS for PBR / texture-material-heavy rendering. Calibrated target: GPU≈20,126 pts */
    public static final double GPU_PBR_FPS = 59.31;
    /** Reference average FPS for particle / effects rendering. Calibrated target: GPU≈20,126 pts */
    public static final double GPU_EFFECTS_FPS = 98.75;

    // ---- CPU references (FPS, higher is better) ----
    /**
     * Reference average FPS for single-thread / client-tick workloads.
     * Recalibrated so the unmodded 1.21.11 reference instance scores
     * CPU≈12,047 with the LOD-modified scoring (WORLD + PARALLEL excluded
     * when Distant Horizons/Voxy are active).
     */
    public static final double CPU_SINGLE_THREAD_FPS = 1428.6;
    /**
     * Reference average FPS for entity-simulation / physics / game-logic
     * workloads. Recalibrated together with the single-thread reference so
     * the reference instance scores CPU≈12,047 under LOD-modified scoring.
     */
    public static final double CPU_SIMULATION_FPS = 693.6;
    /**
     * Reference chunk-preload duration (ms) for terrain-generation workloads.
     * Lower is better; a machine that generates the benchmark's world area with
     * this much preload time scores exactly {@link #SCALE} points.
     * Calibrated target: CPU≈12,047 pts.
     */
    public static final double CPU_WORLD_PRELOAD_MS = 605.9;

    // ---- CPU — Parallel ----
    /**
     * Reference average server tick time (ms) per test for parallel / multi-core
     * CPU workloads (entity simulation, physics, block-entity and scheduled-tick
     * updates). Lower is better; a machine that processes the benchmark's
     * parallel server work at an average tick of this many milliseconds scores
     * exactly {@link #SCALE} points.
     * Calibrated target: CPU≈12,047 pts.
     */
    public static final double CPU_PARALLEL_TICK_TIME_MS = 1.254;

    // ---- RAM references ----
    /**
     * Reference GC cost per megabyte of heap growth (GC ms / heap delta MB)
     * per test for the JVM/GC workload (lower is better). Work-normalized so a
     * session that allocates little is not rewarded for accumulating little GC
     * time. Anchored to the Fabulously Optimized reference instance's own
     * measured value, so that instance scores exactly 10,000 on this workload.
     */
    public static final double RAM_JVM_GC_PER_MB = 0.1631421761;
    /**
     * Reference heap-growth footprint (MB) per test (peak minus start) for the
     * Allocation workload. Lower is better; a machine that allocates exactly
     * this much heap during a test scores {@link #SCALE} points.
     * Anchored to the Fabulously Optimized reference instance's own measured
     * value.
     */
    public static final double RAM_ALLOCATION_HEAP_DELTA_MB = 5185.5083625793;
    /**
     * Reference heap-allocation rate (MiB/s) per test (heap peak minus start,
     * divided by test duration) for the memory Bandwidth workload. Higher is
     * better; a machine that sustains exactly this allocation rate during a
     * test scores {@link #SCALE} points.
     * Anchored to the Fabulously Optimized reference instance's own measured
     * value.
     */
    public static final double RAM_BANDWIDTH_ALLOC_RATE_MBPS = 173.5560909651;
    /**
     * Reference average GC stop-the-world pause (ms per GC event) for the
     * memory Latency workload. A test's GC-pause length is the measured
     * memory-stall latency: total GC time divided by GC event count for that
     * test (only tests that actually triggered GC contribute). Lower is better;
     * a machine whose garbage collector pauses for exactly this long per event
     * during a test scores {@link #SCALE} points.
     * Anchored to the Fabulously Optimized reference instance's own measured
     * value.
     */
    public static final double RAM_LATENCY_GC_PAUSE_MS = 34.6102440336;

    private ScoreReferences() {
    }

    /**
     * Returns the fixed reference value for a workload, or {@link Double#NaN}
     * only when a workload cannot be measured by this benchmark.
     */
    public static double referenceFor(ScoreWorkload workload) {
        return switch (workload) {
            case GPU_RASTER -> GPU_RASTER_FPS * gpuScale();
            case GPU_SHADER -> GPU_SHADER_FPS * gpuScale();
            case GPU_PBR -> GPU_PBR_FPS * gpuScale();
            case GPU_EFFECTS -> GPU_EFFECTS_FPS * gpuScale();
            case CPU_SINGLE_THREAD -> CPU_SINGLE_THREAD_FPS;
            case CPU_SIMULATION -> CPU_SIMULATION_FPS;
            case CPU_WORLD -> CPU_WORLD_PRELOAD_MS;
            case CPU_PARALLEL -> CPU_PARALLEL_TICK_TIME_MS;
            case RAM_JVM_GC -> RAM_JVM_GC_PER_MB;
            case RAM_ALLOCATION -> RAM_ALLOCATION_HEAP_DELTA_MB;
            case RAM_BANDWIDTH -> RAM_BANDWIDTH_ALLOC_RATE_MBPS;
            case RAM_LATENCY -> RAM_LATENCY_GC_PAUSE_MS;
        };
    }

    /**
     * Per-instance GPU reference scale, so a render-faster-than-reference
     * instance can be detuned without changing any other score or instance.
     */
    private static double gpuScale() {
        try {
            return FpsTestConfig.get().gpuReferenceScale;
        } catch (Throwable t) {
            return 1.0;
        }
    }
}