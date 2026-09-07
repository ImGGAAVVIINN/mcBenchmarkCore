package com.fpstest.client.bench.score;

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
 * <p>Workloads with no dedicated measured metric in the benchmark (RAM
 * bandwidth/latency/allocation, CPU world/parallel) have <em>no</em> reference
 * here and are reported as N/A rather than inventing a value.</p>
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
    /** Reference average FPS for ordinary world/terrain rendering (chunk flybys etc.). */
    public static final double GPU_RASTER_FPS = 8.0;
    /** Reference average FPS for shader-heavy rendering. */
    public static final double GPU_SHADER_FPS = 6.0;
    /** Reference average FPS for PBR / texture-material-heavy rendering. */
    public static final double GPU_PBR_FPS = 7.0;
    /** Reference average FPS for particle / effects rendering. */
    public static final double GPU_EFFECTS_FPS = 8.0;

    // ---- CPU references (FPS, higher is better) ----
    /** Reference average FPS for single-thread / client-tick workloads. */
    public static final double CPU_SINGLE_THREAD_FPS = 12.0;
    /** Reference average FPS for entity-simulation / physics / game-logic workloads. */
    public static final double CPU_SIMULATION_FPS = 10.0;

    // ---- RAM references ----
    /** Reference total GC time (ms) per test for the JVM/GC workload (lower is better). */
    public static final double RAM_JVM_GC_TIME_MS = 100.0;

    private ScoreReferences() {
    }

    /**
     * Returns the fixed reference value for a workload, or {@link Double#NaN}
     * when the workload has no dedicated measured metric in this benchmark.
     */
    public static double referenceFor(ScoreWorkload workload) {
        return switch (workload) {
            case GPU_RASTER -> GPU_RASTER_FPS;
            case GPU_SHADER -> GPU_SHADER_FPS;
            case GPU_PBR -> GPU_PBR_FPS;
            case GPU_EFFECTS -> GPU_EFFECTS_FPS;
            case CPU_SINGLE_THREAD -> CPU_SINGLE_THREAD_FPS;
            case CPU_SIMULATION -> CPU_SIMULATION_FPS;
            case RAM_JVM_GC -> RAM_JVM_GC_TIME_MS;
            // No dedicated measured metric exists for these workloads in the
            // current benchmark; they are reported as N/A, never invented.
            case CPU_WORLD, CPU_PARALLEL, RAM_BANDWIDTH, RAM_LATENCY, RAM_ALLOCATION -> Double.NaN;
        };
    }
}