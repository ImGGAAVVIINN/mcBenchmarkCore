package com.fpstest.client.bench;

import com.fpstest.client.bench.score.BenchmarkScore;
import com.fpstest.client.bench.score.BenchmarkScoreCalculator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * Mathematically calculated summary of a benchmark session's detailed results.
 *
 * <p>This is the data backing the Master Report. It is computed from ALL of the
 * underlying detailed {@link BenchmarkResult}s that belong to the report — it is
 * never a copy of the first detailed test, never the currently selected test, and
 * never a link to another screen.</p>
 *
 * <p><b>Aggregation semantics</b> (authoritative source = each detailed test's
 * {@link BenchmarkResult.FrameStats fps} record, which is itself computed from
 * that test's raw frame samples):</p>
 * <ul>
 *   <li>{@code overallAvgFps} = arithmetic mean of every valid test's average FPS
 *       ({@code sum(test.fps().avg()) / numberOfValidTests}).</li>
 *   <li>{@code overallMinFps} = minimum of every valid test's minimum FPS
 *       ({@code min(test.fps().min())}).</li>
 *   <li>{@code overallMaxFps} = maximum of every valid test's maximum FPS
 *       ({@code max(test.fps().max())}).</li>
 *   <li>Each shader {@link Section} aggregates ONLY the tests belonging to that
 *       section (matched by the {@code shader_pack}/{@code resource_pack} extras,
 *       falling back to the {@code part} extra for parts 2-5).</li>
 *   <li>A test is <em>valid</em> when it has real FPS samples
 *       ({@code fps().samples() > 0} and a finite average); failed/aborted
 *       placeholders are excluded rather than treated as zero.</li>
 * </ul>
 *
 * <p>Missing/invalid measurements are represented as {@link Double#NaN} (never
 * silently zero), and a section with no tests reports {@link Section#EMPTY}.</p>
 */
@Environment(EnvType.CLIENT)
public final class MasterReportSummary {
    /** Arithmetic mean of every valid detailed test's average FPS. NaN when no valid tests. */
    public final double overallAvgFps;
    /** Minimum of every valid detailed test's minimum FPS. NaN when no valid tests. */
    public final double overallMinFps;
    /** Maximum of every valid detailed test's maximum FPS. NaN when no valid tests. */
    public final double overallMaxFps;
    /** Number of valid detailed tests aggregated into the overall figures. */
    public final int overallTestCount;
    /** Low-End Shader section (its own tests only). */
    public final Section lowPlain;
    /** Low-End + PBR section (its own tests only). */
    public final Section lowPbr;
    /** High-End Shader section (its own tests only). */
    public final Section hiPlain;
    /** High-End + PBR section (its own tests only). */
    public final Section hiPbr;
    /** Averaged panel data (frame timing + benchmark stats) across all valid tests. */
    public final PanelStats panels;
    /** 3DMark-style points score computed from the complete benchmark dataset. */
    public final BenchmarkScore score;

    /**
     * Aggregate of one benchmark group (e.g. Low-End Shader). Each section
     * aggregates ONLY the tests belonging to that group.
     */
    @Environment(EnvType.CLIENT)
    public record Section(double avgFps, double minFps, double maxFps, double fps1pctLow, double fps0p1pctLow, int testCount) {
        /** Empty section (no tests ran in this group). All values NaN, count 0. */
        public static final Section EMPTY = new Section(Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0);
    }

    /**
     * Averaged panel data backing the Master Report's "Average ..." panels.
     *
     * <p>Frame/tick timing values are the arithmetic mean of every valid test's
     * corresponding statistic; totals (frames, duration, GC events/time) are
     * summed across all valid tests; heap peak is averaged. Extras are only
     * those that are <em>identical in every valid test</em> (session-level
     * constants such as seed/preset) — per-test identity fields like
     * {@code part}, {@code phase}, {@code shader_pack} or {@code resource_pack}
     * are never carried into the Master Report.</p>
     */
    @Environment(EnvType.CLIENT)
    public record PanelStats(
        double frameAvg, double frameP95, double frameP99, double frameP999, double frameMax, double frameMin,
        double tickAvg, double tickP99, double tickMax,
        long totalFrames, long totalDurationMs,
        double avgHeapPeakBytes, long totalGcEvents, double totalGcTimeMs,
        Map<String, String> commonStringExtras,
        Map<String, Double> commonNumericExtras
    ) {
        /** Empty panel stats (no valid tests). */
        public static final PanelStats EMPTY = new PanelStats(
            Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN,
            Double.NaN, Double.NaN, Double.NaN,
            0L, 0L,
            Double.NaN, 0L, Double.NaN,
            Map.of(), Map.of()
        );
    }

    private MasterReportSummary(
        double overallAvgFps,
        double overallMinFps,
        double overallMaxFps,
        int overallTestCount,
        Section lowPlain,
        Section lowPbr,
        Section hiPlain,
        Section hiPbr,
        PanelStats panels,
        BenchmarkScore score
    ) {
        this.overallAvgFps = overallAvgFps;
        this.overallMinFps = overallMinFps;
        this.overallMaxFps = overallMaxFps;
        this.overallTestCount = overallTestCount;
        this.lowPlain = lowPlain;
        this.lowPbr = lowPbr;
        this.hiPlain = hiPlain;
        this.hiPbr = hiPbr;
        this.panels = panels;
        this.score = score;
    }

    /**
     * Calculates the Master Report summary from the complete set of detailed
     * results belonging to the report.
     *
     * @param results the full session's detailed results (never a single test)
     * @return the calculated aggregate summary
     */
    public static MasterReportSummary calculate(List<BenchmarkResult> results) {
        List<BenchmarkResult> valid = new ArrayList<>();
        if (results != null) {
            for (BenchmarkResult r : results) {
                if (isValid(r)) {
                    valid.add(r);
                }
            }
        }

        double sumAvg = 0.0;
        double minMin = Double.POSITIVE_INFINITY;
        double maxMax = Double.NEGATIVE_INFINITY;
        for (BenchmarkResult r : valid) {
            sumAvg += r.fps().avg();
            minMin = Math.min(minMin, r.fps().min());
            maxMax = Math.max(maxMax, r.fps().max());
        }
        int n = valid.size();
        double overallAvg = n > 0 ? sumAvg / n : Double.NaN;
        double overallMin = n > 0 ? minMin : Double.NaN;
        double overallMax = n > 0 ? maxMax : Double.NaN;

        return new MasterReportSummary(
            overallAvg,
            overallMin,
            overallMax,
            n,
            aggregate(group(valid, "lowEnd.zip", false)),
            aggregate(group(valid, "lowEnd.zip", true)),
            aggregate(group(valid, "highEnd.zip", false)),
            aggregate(group(valid, "highEnd.zip", true)),
            aggregatePanels(valid),
            BenchmarkScoreCalculator.calculate(results)
        );
    }

    /** A test is valid when it has real FPS samples and a finite average. */
    private static boolean isValid(BenchmarkResult r) {
        if (r == null) {
            return false;
        }
        BenchmarkResult.FrameStats f = r.fps();
        return f != null && f.samples() > 0 && !Double.isNaN(f.avg()) && !Double.isInfinite(f.avg());
    }

    /** Filters the valid tests down to one shader group (shader pack × PBR on/off). */
    private static List<BenchmarkResult> group(List<BenchmarkResult> valid, String shader, boolean hasPbr) {
        List<BenchmarkResult> out = new ArrayList<>();
        for (BenchmarkResult r : valid) {
            if (groupOf(r) == groupKey(shader, hasPbr)) {
                out.add(r);
            }
        }
        return out;
    }

    /** Canonical group id: 2 = Low-End Shader, 3 = Low-End + PBR, 4 = High-End Shader, 5 = High-End + PBR. */
    private static int groupKey(String shader, boolean hasPbr) {
        if ("lowEnd.zip".equals(shader)) {
            return hasPbr ? 3 : 2;
        }
        if ("highEnd.zip".equals(shader)) {
            return hasPbr ? 5 : 4;
        }
        return 0;
    }

    /** Determines which group a result belongs to, from its recorded extras. */
    private static int groupOf(BenchmarkResult r) {
        String shader = strExtra(r, "shader_pack");
        String pbr = strExtra(r, "resource_pack");
        if (shader != null) {
            if ("lowEnd.zip".equals(shader)) {
                return "pbr.zip".equals(pbr) ? 3 : 2;
            }
            if ("highEnd.zip".equals(shader)) {
                return "pbr.zip".equals(pbr) ? 5 : 4;
            }
        }
        Double part = r.extras().get("part");
        if (part != null) {
            int p = part.intValue();
            if (p >= 2 && p <= 5) {
                return p;
            }
        }
        return 0;
    }

    /**
     * Aggregates one group's tests: avg = mean of test averages, min = min of
     * test minima, max = max of test maxima, 1%/0.1% low = worst (minimum) of the
     * tests' recorded 1%/0.1% lows.
     */
    private static Section aggregate(List<BenchmarkResult> tests) {
        if (tests.isEmpty()) {
            return Section.EMPTY;
        }
        double sumAvg = 0.0;
        double minMin = Double.POSITIVE_INFINITY;
        double maxMax = Double.NEGATIVE_INFINITY;
        double min1pct = Double.POSITIVE_INFINITY;
        double min0p1pct = Double.POSITIVE_INFINITY;
        for (BenchmarkResult r : tests) {
            sumAvg += r.fps().avg();
            minMin = Math.min(minMin, r.fps().min());
            maxMax = Math.max(maxMax, r.fps().max());
            double low1 = r.extras().getOrDefault("fps_1pct_low", Double.NaN);
            double low0p1 = r.extras().getOrDefault("fps_0p1pct_low", Double.NaN);
            if (!Double.isNaN(low1)) {
                min1pct = Math.min(min1pct, low1);
            }
            if (!Double.isNaN(low0p1)) {
                min0p1pct = Math.min(min0p1pct, low0p1);
            }
        }
        int n = tests.size();
        return new Section(
            sumAvg / n,
            minMin,
            maxMax,
            Double.isInfinite(min1pct) ? Double.NaN : min1pct,
            Double.isInfinite(min0p1pct) ? Double.NaN : min0p1pct,
            n
        );
    }

    /** Aggregates the panel data (frame timing + benchmark stats) across all valid tests. */
    private static PanelStats aggregatePanels(List<BenchmarkResult> valid) {
        if (valid.isEmpty()) {
            return PanelStats.EMPTY;
        }
        double sumFrameAvg = 0.0, sumFrameP95 = 0.0, sumFrameP99 = 0.0, sumFrameP999 = 0.0, sumFrameMax = 0.0, sumFrameMin = 0.0;
        double sumTickAvg = 0.0, sumTickP99 = 0.0, sumTickMax = 0.0;
        long totalFrames = 0L, totalDuration = 0L;
        double sumHeapPeak = 0.0;
        long totalGcEvents = 0L;
        double totalGcTime = 0.0;
        for (BenchmarkResult r : valid) {
            BenchmarkResult.FrameStats f = r.frameTimeMs();
            BenchmarkResult.FrameStats t = r.tickTimeMs();
            if (f != null) {
                sumFrameAvg += f.avg();
                sumFrameP95 += f.p95();
                sumFrameP99 += f.p99();
                sumFrameP999 += f.p999();
                sumFrameMax += f.max();
                sumFrameMin += f.min();
            }
            if (t != null) {
                sumTickAvg += t.avg();
                sumTickP99 += t.p99();
                sumTickMax += t.max();
            }
            if (r.frameTimesMs() != null) {
                totalFrames += r.frameTimesMs().length;
            }
            totalDuration += r.durationMillis();
            sumHeapPeak += r.heapPeak();
            totalGcEvents += r.gcEvents();
            totalGcTime += r.gcTimeMs();
        }
        int n = valid.size();
        return new PanelStats(
            sumFrameAvg / n, sumFrameP95 / n, sumFrameP99 / n, sumFrameP999 / n, sumFrameMax / n, sumFrameMin / n,
            sumTickAvg / n, sumTickP99 / n, sumTickMax / n,
            totalFrames, totalDuration,
            sumHeapPeak / n, totalGcEvents, totalGcTime,
            commonStringExtras(valid), commonNumericExtras(valid)
        );
    }

    /** String extras that have the identical value in every valid test. */
    private static Map<String, String> commonStringExtras(List<BenchmarkResult> valid) {
        Map<String, String> out = new LinkedHashMap<>();
        if (valid.isEmpty()) {
            return out;
        }
        Set<String> keys = new LinkedHashSet<>(valid.get(0).stringExtras().keySet());
        for (BenchmarkResult r : valid) {
            keys.retainAll(r.stringExtras().keySet());
        }
        for (String k : keys) {
            String v0 = valid.get(0).stringExtras().get(k);
            boolean same = true;
            for (BenchmarkResult r : valid) {
                if (!v0.equals(r.stringExtras().get(k))) {
                    same = false;
                    break;
                }
            }
            if (same) {
                out.put(k, v0);
            }
        }
        return out;
    }

    /** Numeric extras that have the identical value in every valid test. */
    private static Map<String, Double> commonNumericExtras(List<BenchmarkResult> valid) {
        Map<String, Double> out = new LinkedHashMap<>();
        if (valid.isEmpty()) {
            return out;
        }
        Set<String> keys = new LinkedHashSet<>(valid.get(0).extras().keySet());
        for (BenchmarkResult r : valid) {
            keys.retainAll(r.extras().keySet());
        }
        for (String k : keys) {
            Double v0 = valid.get(0).extras().get(k);
            boolean same = true;
            for (BenchmarkResult r : valid) {
                Double v = r.extras().get(k);
                if (v == null || Double.compare(v0, v) != 0) {
                    same = false;
                    break;
                }
            }
            if (same) {
                out.put(k, v0);
            }
        }
        return out;
    }

    private static String strExtra(BenchmarkResult r, String key) {
        String v = r.stringExtras().get(key);
        if (v != null) {
            return v;
        }
        Double d = r.extras().get(key);
        return d != null ? String.valueOf(d.longValue()) : null;
    }
}