package com.fpstest.client.bench.score;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * Top-level score categories (3DMark-style). Each category aggregates its
 * workload groups via a weighted harmonic mean, and the three categories are
 * combined into the overall score with the declared overall weights.
 */
@Environment(EnvType.CLIENT)
public enum ScoreCategory {
    /** Graphics/rendering performance. Dominant in the overall score. */
    GPU(0.70),
    /** CPU-bound simulation / logic / world processing performance. */
    CPU(0.20),
    /** RAM / JVM memory-management performance. */
    RAM(0.10);

    /** Weight of this category in the overall score (sums to 1.0). */
    public final double overallWeight;

    ScoreCategory(double overallWeight) {
        this.overallWeight = overallWeight;
    }
}