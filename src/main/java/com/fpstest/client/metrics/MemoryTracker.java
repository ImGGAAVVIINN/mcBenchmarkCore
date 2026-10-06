package com.fpstest.client.metrics;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

public final class MemoryTracker {
    private final MemoryMXBean heap;
    private final List<GarbageCollectorMXBean> gc;

    private long usedNow;
    private long maxHeap;
    private long snapshotHeap;
    private int snapshotGcCount;
    private long snapshotGcTime;
    private long peakHeapSinceSnapshot;

    public MemoryTracker() {
        this.heap = ManagementFactory.getMemoryMXBean();
        this.gc = ManagementFactory.getGarbageCollectorMXBeans();
    }

    public void sample() {
        MemoryUsage usage = heap.getHeapMemoryUsage();
        usedNow = usage.getUsed();
        maxHeap = usage.getMax();
        if (usedNow > peakHeapSinceSnapshot) {
            peakHeapSinceSnapshot = usedNow;
        }
    }

    public long usedBytes() {
        return usedNow;
    }

    public long maxBytes() {
        return maxHeap;
    }

    public long peakBytesSinceSnapshot() {
        return peakHeapSinceSnapshot;
    }

    public int gcCount() {
        int count = 0;
        for (GarbageCollectorMXBean bean : gc) {
            long c = bean.getCollectionCount();
            if (c > 0) {
                count += (int) c;
            }
        }
        return count;
    }

    public long gcTimeMs() {
        long total = 0;
        for (GarbageCollectorMXBean bean : gc) {
            long t = bean.getCollectionTime();
            if (t > 0) {
                total += t;
            }
        }
        return total;
    }

    public void snapshot() {
        sample();
        snapshotHeap = usedNow;
        peakHeapSinceSnapshot = usedNow;
        snapshotGcCount = gcCount();
        snapshotGcTime = gcTimeMs();
    }

    /**
     * Runs a full garbage collection then forgets all baseline state.
     *
     * <p>Session-wide heaps (e.g. Distant Horizons + Voxy terrain) keep the
     * used-heap high, so without this the {@code heap_used_start} baseline of a
     * test is whatever G1 happened to leave after the previous test — never the
     * same between runs. That collapses {@code peak - start} heap deltas
     * arbitrarily and destroys the reproducibility of every RAM workload. A
     * forced collect right before the per-test snapshot makes the baseline the
     * (stable, reproducible) live-set floor instead.</p>
     */
    public void collect() {
        heap.gc();
        sample();
        peakHeapSinceSnapshot = usedNow;
    }

    public long snapshotHeap() {
        return snapshotHeap;
    }

    public int gcEventsSinceSnapshot() {
        return gcCount() - snapshotGcCount;
    }

    public long gcTimeMsSinceSnapshot() {
        return gcTimeMs() - snapshotGcTime;
    }
}
