package com.fpstest.client.bench.score;

import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * The calculated 3DMark-style score for a complete benchmark session.
 *
 * <p>This is a pure data result produced by {@link BenchmarkScoreCalculator} and
 * consumed by the GUI. It is computed from the <em>complete</em> benchmark
 * dataset — never from the first detailed test and never from whichever test is
 * currently selected.</p>
 *
 * <p>Missing values are represented as {@link Double#NaN} (never silently zero,
 * never substituted with another test's result). A category with no scored
 * workload reports NaN; the overall score is NaN unless all three categories
 * (GPU, CPU, RAM) are present.</p>
 */
@Environment(EnvType.CLIENT)
public final class BenchmarkScore {
    /** Overall score (weighted harmonic mean of GPU/CPU/RAM). NaN unless all three present. */
    public final double overallScore;
    /** GPU category score. NaN when no GPU workload has a valid result. */
    public final double gpuScore;
    /** CPU category score. NaN when no CPU workload has a valid result. */
    public final double cpuScore;
    /** RAM category score. NaN when no RAM workload has a valid result. */
    public final double ramScore;
    /** Per-workload scores (all twelve declared workloads, present or N/A). */
    public final Map<ScoreWorkload, WorkloadScore> workloads;

    /**
     * One workload group's score, aggregated from its constituent tests.
     *
     * @param workload  the workload group
     * @param score     the workload score (NaN when no valid test contributed)
     * @param testCount number of valid tests that contributed
     * @param tests     per-test normalized points (for debugging/validation)
     */
    @Environment(EnvType.CLIENT)
    public record WorkloadScore(ScoreWorkload workload, double score, int testCount, List<TestScore> tests) {
    }

    /**
     * One test's normalized points contribution to a workload.
     *
     * @param testId     the benchmark test id
     * @param displayName human-readable test name
     * @param points     normalized points (10000 = reference)
     * @param measured   the raw measured value
     * @param reference  the fixed reference value used
     */
    @Environment(EnvType.CLIENT)
    public record TestScore(String testId, String displayName, double points, double measured, double reference) {
    }

    public BenchmarkScore(
        double overallScore,
        double gpuScore,
        double cpuScore,
        double ramScore,
        Map<ScoreWorkload, WorkloadScore> workloads
    ) {
        this.overallScore = overallScore;
        this.gpuScore = gpuScore;
        this.cpuScore = cpuScore;
        this.ramScore = ramScore;
        this.workloads = workloads;
    }

    /** Convenience: the workload score for a group, or NaN if absent. */
    public double workloadScore(ScoreWorkload workload) {
        WorkloadScore ws = this.workloads.get(workload);
        return ws == null ? Double.NaN : ws.score();
    }
}