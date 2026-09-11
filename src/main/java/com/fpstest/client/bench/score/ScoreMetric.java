package com.fpstest.client.bench.score;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * The raw measured metric a workload is scored on, together with its direction.
 *
 * <p>Every metric is first normalized onto the common points scale
 * ({@code 10000 = reference}) before any aggregation, so different metric types
 * are never averaged together raw.</p>
 */
@Environment(EnvType.CLIENT)
public enum ScoreMetric {
    /** Frames per second — higher is better. */
    FPS(true),
    /** Total garbage-collection time in milliseconds — lower is better. */
    GC_TIME_MS(false),
    /** Heap-growth footprint (peak minus start) in megabytes — lower is better. */
    HEAP_DELTA_MB(false),
    /** Chunk-preload duration in milliseconds (terrain generation) — lower is better. */
    PRELOAD_MS(false);

    /** Whether a larger measured value means better performance. */
    public final boolean higherIsBetter;

    ScoreMetric(boolean higherIsBetter) {
        this.higherIsBetter = higherIsBetter;
    }
}