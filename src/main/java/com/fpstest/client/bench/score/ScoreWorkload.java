package com.fpstest.client.bench.score;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * The twelve declared workload groups (3DMark-style), grouped into the three
 * top-level categories. Each workload carries its declared weight within its
 * category and the metric it is scored on.
 *
 * <p>Weights are the <em>declared</em> workload weights — they are the important
 * weights, not the accidental number of tests. A workload with many tests does
 * not become more important than a workload with one test.</p>
 */
@Environment(EnvType.CLIENT)
public enum ScoreWorkload {
    // ---- GPU ----
    /** Ordinary Minecraft / terrain / geometry-heavy rendering. */
    GPU_RASTER(ScoreCategory.GPU, 0.35, ScoreMetric.FPS),
    /** Shader-heavy workloads (high-end shader tests). */
    GPU_SHADER(ScoreCategory.GPU, 0.30, ScoreMetric.FPS),
    /** PBR / resource-pack texture-material-heavy rendering. */
    GPU_PBR(ScoreCategory.GPU, 0.20, ScoreMetric.FPS),
    /** Particles, transparency, visual effects. */
    GPU_EFFECTS(ScoreCategory.GPU, 0.15, ScoreMetric.FPS),

    // ---- CPU ----
    /** CPU-bound single-thread / client-tick workloads. */
    CPU_SINGLE_THREAD(ScoreCategory.CPU, 0.30, ScoreMetric.FPS),
    /** Entity simulation, physics, game logic. */
    CPU_SIMULATION(ScoreCategory.CPU, 0.35, ScoreMetric.FPS),
    /** Chunk generation / world scanning / terrain-generation CPU work, measured
     *  via chunk-preload duration (milliseconds) per test. */
    CPU_WORLD(ScoreCategory.CPU, 0.20, ScoreMetric.PRELOAD_MS),
    /** Workloads that meaningfully exercise multiple CPU cores/threads. No
     *  dedicated measured metric exists in this benchmark, so this workload is
     *  reported as not measured. */
    CPU_PARALLEL(ScoreCategory.CPU, 0.15, ScoreMetric.FPS),

    // ---- RAM / JVM ----
    /** Memory throughput. No dedicated measured metric exists in this benchmark. */
    RAM_BANDWIDTH(ScoreCategory.RAM, 0.35, ScoreMetric.FPS),
    /** Memory access latency. No dedicated measured metric exists in this benchmark. */
    RAM_LATENCY(ScoreCategory.RAM, 0.25, ScoreMetric.FPS),
    /** Object allocation / allocation-heavy workloads, measured via the heap-growth
     *  footprint (peak minus start, in megabytes) per test. */
    RAM_ALLOCATION(ScoreCategory.RAM, 0.20, ScoreMetric.HEAP_DELTA_MB),
    /** Garbage collection / heap / JVM memory-management workloads. */
    RAM_JVM_GC(ScoreCategory.RAM, 0.20, ScoreMetric.GC_TIME_MS);

    /** The top-level category this workload belongs to. */
    public final ScoreCategory category;
    /** Declared weight of this workload within its category (sums to 1.0 per category). */
    public final double weight;
    /** The raw metric this workload is scored on. */
    public final ScoreMetric metric;

    ScoreWorkload(ScoreCategory category, double weight, ScoreMetric metric) {
        this.category = category;
        this.weight = weight;
        this.metric = metric;
    }
}