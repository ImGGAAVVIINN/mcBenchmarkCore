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
    PRELOAD_MS(false),
    /** Average server tick time in milliseconds per test — lower is better. The
     *  server tick loop is real parallel work (entity simulation, physics,
     *  block/scheduled-tick updates happen server-side across threads), and the
     *  tick-time recorder already samples every tick of every test. */
    TICK_TIME_MS(false),
    /** Heap-allocated footprint rate in MiB/second (heap peak minus start,
     *  divided by test duration) — higher is better. Represents the measured
     *  memory write/allocate throughput of each test. */
    ALLOC_RATE_MBPS(true),
    /** Average stop-the-world GC pause length in milliseconds per GC event
     *  (total GC time divided by GC event count) — lower is better. Represents
     *  the measured memory-stall latency of each test; only present for tests
     *  that actually triggered garbage collection. */
    GC_PAUSE_MS(false);

    /** Whether a larger measured value means better performance. */
    public final boolean higherIsBetter;

    ScoreMetric(boolean higherIsBetter) {
        this.higherIsBetter = higherIsBetter;
    }
}