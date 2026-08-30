package com.fpstest.client.metrics;

import com.fpstest.client.bench.BenchmarkResult.FrameStats;

import java.util.Arrays;

public final class Stats {
    private Stats() {
    }

    public static FrameStats of(double[] data) {
        if (data.length == 0) {
            return FrameStats.EMPTY;
        }
        double[] sorted = data.clone();
        Arrays.sort(sorted);
        double sum = 0;
        double min = sorted[0];
        double max = sorted[sorted.length - 1];
        for (double v : sorted) {
            sum += v;
        }
        double avg = sum / sorted.length;
        double varianceSum = 0;
        for (double v : sorted) {
            double diff = v - avg;
            varianceSum += diff * diff;
        }
        double variance = varianceSum / sorted.length;
        double stdDev = Math.sqrt(variance);
        return new FrameStats(
                avg,
                min,
                max,
                percentile(sorted, 0.5),
                percentile(sorted, 0.95),
                percentile(sorted, 0.99),
                percentile(sorted, 0.999),
                stdDev,
                sorted.length);
    }

    public static double percentile(double[] data, double p) {
        if (data.length == 0) {
            return 0;
        }
        double pos = p * (data.length - 1);
        int lower = (int) Math.floor(pos);
        int upper = (int) Math.ceil(pos);
        if (lower == upper) {
            return data[lower];
        }
        double frac = pos - lower;
        return data[lower] + frac * (data[upper] - data[lower]);
    }

    public static double lowPercentFps(double[] data, double p) {
        if (data.length == 0) {
            return 0;
        }
        double count = data.length * p;
        if (count < 0.5) {
            return Double.NaN;
        }
        double[] sorted = data.clone();
        Arrays.sort(sorted);
        int n = Math.max(1, (int) Math.round(count));
        double sum = 0;
        for (int i = sorted.length - n; i < sorted.length; i++) {
            sum += sorted[i];
        }
        double avg = sum / n;
        return avg > 0 ? 1000.0 / avg : 0;
    }
}
