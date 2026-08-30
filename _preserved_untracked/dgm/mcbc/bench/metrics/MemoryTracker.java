package com.dgm.mcbc.bench.metrics;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public final class MemoryTracker {
    private final MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
    private final RingBuffer<Long> heapUsed = new RingBuffer<>(1000);
    private final RingBuffer<Long> heapMax = new RingBuffer<>(1000);
    private final RingBuffer<Long> nonHeapUsed = new RingBuffer<>(1000);

    public void sample() {
        MemoryUsage heap = memoryBean.getHeapMemoryUsage();
        MemoryUsage nonHeap = memoryBean.getNonHeapMemoryUsage();

        heapUsed.add(heap.getUsed());
        heapMax.add(heap.getMax());
        nonHeapUsed.add(nonHeap.getUsed());
    }

    public long getCurrentHeapUsed() {
        return heapUsed.getLatest() != null ? heapUsed.getLatest() : 0;
    }

    public long getCurrentHeapMax() {
        return heapMax.getLatest() != null ? heapMax.getLatest() : 0;
    }

    public long getCurrentNonHeapUsed() {
        return nonHeapUsed.getLatest() != null ? nonHeapUsed.getLatest() : 0;
    }

    public double getAverageHeapUsed() {
        if (heapUsed.size() == 0) return 0;
        long sum = 0;
        for (int i = 0; i < heapUsed.size(); i++) {
            sum += heapUsed.get(i);
        }
        return sum / (double) heapUsed.size();
    }

    public double getAverageHeapMax() {
        if (heapMax.size() == 0) return 0;
        long sum = 0;
        for (int i = 0; i < heapMax.size(); i++) {
            sum += heapMax.get(i);
        }
        return sum / (double) heapMax.size();
    }

    public double getPeakHeapUsed() {
        if (heapUsed.size() == 0) return 0;
        long max = 0;
        for (int i = 0; i < heapUsed.size(); i++) {
            long v = heapUsed.get(i);
            if (v > max) max = v;
        }
        return max;
    }

    public double getHeapUsagePercent() {
        long used = getCurrentHeapUsed();
        long max = getCurrentHeapMax();
        if (max == 0) return 0;
        return (used / (double) max) * 100;
    }

    public void reset() {
        heapUsed.clear();
        heapMax.clear();
        nonHeapUsed.clear();
    }
}