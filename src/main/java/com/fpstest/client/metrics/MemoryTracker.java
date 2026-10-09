package com.fpstest.client.metrics;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

public final class MemoryTracker {
    /**
     * A tick longer than this on the benchmark thread is treated as a memory-led
     * stall. Thread CPU time is compared against wall time, so heavy compute
     * ticks (CPU == wall) are never miscounted; only time the thread spent
     * actually suspended (e.g. a stop-the-world pause) accumulates.
     */
    private static final long STALL_THRESHOLD_NANOS = 1_000_000L;

    private final MemoryMXBean heap;
    private final List<GarbageCollectorMXBean> gc;
    private final com.sun.management.ThreadMXBean threadBean;
    private final boolean threadInfoSupported;

    private long usedNow;
    private long maxHeap;
    private long snapshotHeap;
    private int snapshotGcCount;
    private long snapshotGcTime;
    private long peakHeapSinceSnapshot;
    private long stallNanos;
    private int stallEvents;
    private long[] allocStartIds = new long[0];
    private long[] allocStartBytes = new long[0];

    public MemoryTracker() {
        this.heap = ManagementFactory.getMemoryMXBean();
        this.gc = ManagementFactory.getGarbageCollectorMXBeans();
        java.lang.management.ThreadMXBean mx = ManagementFactory.getThreadMXBean();
        this.threadBean = mx instanceof com.sun.management.ThreadMXBean t ? t : null;
        this.threadInfoSupported = this.threadBean != null
            && this.threadBean.isThreadAllocatedMemorySupported()
            && this.threadBean.isCurrentThreadCpuTimeSupported();
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
        stallNanos = 0L;
        stallEvents = 0;
        captureAllocationBaseline();
    }

    /**
     * Reports whether the current JVM can measure thread CPU time and per-thread
     * allocated bytes. When unsupported, stall/allocation extras are omitted so
     * legacy scoring stays in effect.
     */
    public boolean isThreadInfoSupported() {
        return threadInfoSupported;
    }

    /**
     * True when the JVM's garbage collectors are concurrent (ZGC, Shenandoah) —
     * their MXBean collection-time totals include background phases that never
     * suspend the benchmark thread, so recorded GC time is not experienced
     * memory latency. Stop-the-world collectors (G1, Parallel, Serial) report
     * time that genuinely stalled the workload and are left untouched.
     */
    public boolean isConcurrentCollector() {
        for (GarbageCollectorMXBean bean : gc) {
            String n = bean.getName();
            if (n != null && (n.startsWith("ZGC") || n.contains("Shenandoah"))) {
                return true;
            }
        }
        return false;
    }

    public long currentThreadCpuNanos() {
        return threadInfoSupported ? threadBean.getCurrentThreadCpuTime() : -1L;
    }

    /**
     * Accumulates wall-vs-CPU time for one benchmark tick as memory-led stall.
     * Only the suspended portion beyond the normal tick baseline counts, and a
     * stall event is recorded whenever a single tick shows that suspension.
     */
    public void recordStall(long wallDeltaNanos, long cpuDeltaNanos) {
        if (!threadInfoSupported || wallDeltaNanos <= 0L || cpuDeltaNanos < 0L) {
            return;
        }
        long stall = wallDeltaNanos - cpuDeltaNanos;
        if (stall > STALL_THRESHOLD_NANOS) {
            stallNanos += stall;
            stallEvents++;
        }
    }

    public long stallTimeMs() {
        return stallNanos / 1_000_000L;
    }

    public int stallEvents() {
        return stallEvents;
    }

    public long allocatedBytes() {
        if (!threadInfoSupported) {
            return 0L;
        }
        long total = 0L;
        for (int i = 0; i < allocStartIds.length; i++) {
            long start = allocStartBytes[i];
            if (start < 0L) {
                continue;
            }
            try {
                long now = threadBean.getThreadAllocatedBytes(allocStartIds[i]);
                if (now > start) {
                    total += now - start;
                }
            } catch (Throwable ignored) {
                // Thread ended during the window; its start allocation stays
                // attributed, its delta is no longer observable.
            }
        }
        return total;
    }

    private void captureAllocationBaseline() {
        if (!threadInfoSupported) {
            allocStartIds = new long[0];
            allocStartBytes = new long[0];
            return;
        }
        long[] ids = threadBean.getAllThreadIds();
        long[] bytes = new long[ids.length];
        for (int i = 0; i < ids.length; i++) {
            try {
                bytes[i] = threadBean.getThreadAllocatedBytes(ids[i]);
            } catch (Throwable t) {
                bytes[i] = -1L;
            }
        }
        allocStartIds = ids;
        allocStartBytes = bytes;
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
