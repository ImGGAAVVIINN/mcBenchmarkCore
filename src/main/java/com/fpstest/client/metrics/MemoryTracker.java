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
