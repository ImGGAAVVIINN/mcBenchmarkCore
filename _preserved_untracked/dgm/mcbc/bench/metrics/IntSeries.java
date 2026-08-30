package com.dgm.mcbc.bench.metrics;

import java.util.ArrayList;
import java.util.List;

public final class IntSeries {
    private final List<Integer> values = new ArrayList<>();

    public void add(int value) {
        values.add(value);
    }

    public void addAll(IntSeries other) {
        values.addAll(other.values);
    }

    public int size() {
        return values.size();
    }

    public int get(int index) {
        return values.get(index);
    }

    public List<Integer> getValues() {
        return values;
    }

    public double mean() {
        if (values.isEmpty()) return 0;
        long sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.size();
    }

    public double median() {
        if (values.isEmpty()) return 0;
        List<Integer> sorted = new ArrayList<>(values);
        sorted.sort(Integer::compareTo);
        int mid = sorted.size() / 2;
        if (sorted.size() % 2 == 0) {
            return (sorted.get(mid - 1) + sorted.get(mid)) / 2.0;
        }
        return sorted.get(mid);
    }

    public int min() {
        if (values.isEmpty()) return 0;
        int min = values.get(0);
        for (int v : values) if (v < min) min = v;
        return min;
    }

    public int max() {
        if (values.isEmpty()) return 0;
        int max = values.get(0);
        for (int v : values) if (v > max) max = v;
        return max;
    }

    public double stdDev() {
        if (values.size() < 2) return 0;
        double m = mean();
        double sum = 0;
        for (int v : values) {
            double d = v - m;
            sum += d * d;
        }
        return Math.sqrt(sum / (values.size() - 1));
    }

    public double percentile(double p) {
        if (values.isEmpty()) return 0;
        List<Integer> sorted = new ArrayList<>(values);
        sorted.sort(Integer::compareTo);
        int idx = (int) Math.ceil(p / 100.0 * sorted.size()) - 1;
        idx = Math.max(0, Math.min(idx, sorted.size() - 1));
        return sorted.get(idx);
    }

    public void clear() {
        values.clear();
    }
}