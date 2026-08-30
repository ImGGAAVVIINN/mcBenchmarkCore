package com.dgm.mcbc.bench.metrics;

public final class Stats {
    private Stats() {}

    public static double mean(double[] values) {
        if (values.length == 0) return 0;
        double sum = 0;
        for (double v : values) sum += v;
        return sum / values.length;
    }

    public static double median(double[] values) {
        if (values.length == 0) return 0;
        double[] sorted = values.clone();
        java.util.Arrays.sort(sorted);
        int mid = sorted.length / 2;
        if (sorted.length % 2 == 0) {
            return (sorted[mid - 1] + sorted[mid]) / 2.0;
        }
        return sorted[mid];
    }

    public static double min(double[] values) {
        if (values.length == 0) return 0;
        double min = values[0];
        for (double v : values) if (v < min) min = v;
        return min;
    }

    public static double max(double[] values) {
        if (values.length == 0) return 0;
        double max = values[0];
        for (double v : values) if (v > max) max = v;
        return max;
    }

    public static double stdDev(double[] values) {
        if (values.length < 2) return 0;
        double m = mean(values);
        double sum = 0;
        for (double v : values) {
            double d = v - m;
            sum += d * d;
        }
        return Math.sqrt(sum / (values.length - 1));
    }

    public static double percentile(double[] values, double p) {
        if (values.length == 0) return 0;
        double[] sorted = values.clone();
        java.util.Arrays.sort(sorted);
        int idx = (int) Math.ceil(p / 100.0 * sorted.length) - 1;
        idx = Math.max(0, Math.min(idx, sorted.length - 1));
        return sorted[idx];
    }

    public static double mean(long[] values) {
        if (values.length == 0) return 0;
        long sum = 0;
        for (long v : values) sum += v;
        return (double) sum / values.length;
    }

    public static double median(long[] values) {
        if (values.length == 0) return 0;
        long[] sorted = values.clone();
        java.util.Arrays.sort(sorted);
        int mid = sorted.length / 2;
        if (sorted.length % 2 == 0) {
            return (sorted[mid - 1] + sorted[mid]) / 2.0;
        }
        return sorted[mid];
    }

    public static long min(long[] values) {
        if (values.length == 0) return 0;
        long min = values[0];
        for (long v : values) if (v < min) min = v;
        return min;
    }

    public static long max(long[] values) {
        if (values.length == 0) return 0;
        long max = values[0];
        for (long v : values) if (v > max) max = v;
        return max;
    }

    public static double stdDev(long[] values) {
        if (values.length < 2) return 0;
        double m = mean(values);
        double sum = 0;
        for (long v : values) {
            double d = v - m;
            sum += d * d;
        }
        return Math.sqrt(sum / (values.length - 1));
    }

    public static double percentile(long[] values, double p) {
        if (values.length == 0) return 0;
        long[] sorted = values.clone();
        java.util.Arrays.sort(sorted);
        int idx = (int) Math.ceil(p / 100.0 * sorted.length) - 1;
        idx = Math.max(0, Math.min(idx, sorted.length - 1));
        return sorted[idx];
    }
}