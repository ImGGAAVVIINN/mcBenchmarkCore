package com.fpstest.client.bench.score;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Standalone (dependency-free) self-test for the category aggregation change:
 * heterogeneous workloads within a category are combined with a weighted
 * <em>geometric</em> mean instead of a weighted harmonic mean.
 *
 * <p>It deliberately avoids JUnit so it can run in the offline build
 * environment. Compile and run against the compiled main classes, e.g.:</p>
 * <pre>
 *   ./gradlew compileJava
 *   SLF4J=$(find ~/.gradle/caches -name 'slf4j-api-*.jar' | head -1)
 *   javac -cp "build/classes/java/main:$SLF4J" -d /tmp/score-selftest \
 *       src/test/java/com/fpstest/client/bench/score/ScoringAggregationSelfTest.java
 *   java  -cp "build/classes/java/main:$SLF4J:/tmp/score-selftest" \
 *       com.fpstest.client.bench.score.ScoringAggregationSelfTest
 * </pre>
 *
 * <p>It is the Java twin of {@code fpstest-reference/test_scoring.py} and must
 * agree with it bit-for-bit (within floating-point tolerance).</p>
 */
public final class ScoringAggregationSelfTest {

    private static int failures = 0;

    private static void check(String name, double actual, double expected, double tol) {
        boolean ok = Math.abs(actual - expected) <= tol;
        System.out.printf("%-55s %s  (got %.4f, expected %.4f)%n",
            name, ok ? "PASS" : "FAIL", actual, expected);
        if (!ok) {
            failures++;
        }
    }

    private static void checkTrue(String name, boolean cond) {
        System.out.printf("%-55s %s%n", name, cond ? "PASS" : "FAIL");
        if (!cond) {
            failures++;
        }
    }

    private static Map<ScoreWorkload, BenchmarkScore.WorkloadScore> wl(ScoreWorkload... ignore) {
        return new EnumMap<>(ScoreWorkload.class);
    }

    private static void put(Map<ScoreWorkload, BenchmarkScore.WorkloadScore> m, ScoreWorkload w, double score) {
        m.put(w, new BenchmarkScore.WorkloadScore(w, score, 1, List.of()));
    }

    public static void main(String[] args) {
        // 1. Scale invariance: uniformly k-times-faster hardware scores k times higher.
        for (double k : new double[] {0.05, 0.5, 1.0, 3.7, 25.0}) {
            Map<ScoreWorkload, BenchmarkScore.WorkloadScore> m = wl();
            put(m, ScoreWorkload.GPU_RASTER, 10000.0 * k);
            put(m, ScoreWorkload.GPU_SHADER, 10000.0 * k);
            put(m, ScoreWorkload.GPU_PBR, 10000.0 * k);
            put(m, ScoreWorkload.GPU_EFFECTS, 10000.0 * k);
            check("scale invariance k=" + k,
                BenchmarkScoreCalculator.categoryScore(ScoreCategory.GPU, m), 10000.0 * k, 1e-6);
        }

        // 2. Recorded high-end GPU workloads -> weighted geometric mean.
        double highGpu;
        {
            Map<ScoreWorkload, BenchmarkScore.WorkloadScore> m = wl();
            put(m, ScoreWorkload.GPU_RASTER, 19882.0);
            put(m, ScoreWorkload.GPU_SHADER, 23640.0);
            put(m, ScoreWorkload.GPU_PBR, 22437.0);
            put(m, ScoreWorkload.GPU_EFFECTS, 16088.0);
            highGpu = BenchmarkScoreCalculator.categoryScore(ScoreCategory.GPU, m);
            check("high-end GPU geometric score", highGpu, 20784.0, 1.0);
        }

        // 3. Low-end GPU workloads: must not collapse to the weakest workload.
        double lowGpu;
        {
            Map<ScoreWorkload, BenchmarkScore.WorkloadScore> m = wl();
            put(m, ScoreWorkload.GPU_RASTER, 17511.0);
            put(m, ScoreWorkload.GPU_SHADER, 504.0);
            put(m, ScoreWorkload.GPU_PBR, 369.0);
            put(m, ScoreWorkload.GPU_EFFECTS, 9953.0);
            lowGpu = BenchmarkScoreCalculator.categoryScore(ScoreCategory.GPU, m);
            check("low-end GPU no longer collapses", lowGpu, 2564.0, 1.0);
            checkTrue("low-end GPU >> weakest workload", lowGpu > 6.0 * 369.0);
        }

        // 4. Geometric strictly exceeds the old weighted harmonic (no cliff).
        {
            Map<ScoreWorkload, BenchmarkScore.WorkloadScore> m = wl();
            put(m, ScoreWorkload.GPU_RASTER, 20000.0);
            put(m, ScoreWorkload.GPU_SHADER, 500.0);
            put(m, ScoreWorkload.GPU_PBR, 370.0);
            put(m, ScoreWorkload.GPU_EFFECTS, 16000.0);
            double geo = BenchmarkScoreCalculator.categoryScore(ScoreCategory.GPU, m);
            double wsum = 0.35 + 0.30 + 0.20 + 0.15;
            double rsum = 0.35 / 20000.0 + 0.30 / 500.0 + 0.20 / 370.0 + 0.15 / 16000.0;
            double harmonic = wsum / rsum;
            checkTrue("geometric > 3x harmonic (cliff removed)", geo > 3.0 * harmonic);
        }

        // 5. Missing workloads renormalize weights; empty -> NaN.
        {
            Map<ScoreWorkload, BenchmarkScore.WorkloadScore> m = wl();
            put(m, ScoreWorkload.GPU_RASTER, 20000.0);
            put(m, ScoreWorkload.GPU_EFFECTS, 8000.0);
            double expected = Math.exp((0.35 * Math.log(20000.0) + 0.15 * Math.log(8000.0)) / 0.50);
            check("missing workloads renormalize", BenchmarkScoreCalculator.categoryScore(ScoreCategory.GPU, m), expected, 1e-6);
            checkTrue("empty category is NaN", Double.isNaN(BenchmarkScoreCalculator.categoryScore(ScoreCategory.GPU, wl())));
        }

        System.out.println();
        if (failures == 0) {
            System.out.println("ALL SCORING SELF-TESTS PASSED");
        } else {
            System.out.println(failures + " SCORING SELF-TEST(S) FAILED");
            System.exit(1);
        }
    }

    private ScoringAggregationSelfTest() {
    }
}
