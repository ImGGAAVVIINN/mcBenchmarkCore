package com.fpstest.client.metrics;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class MemoryTracker {
   private final MemoryMXBean heap = ManagementFactory.getMemoryMXBean();
   private final List<GarbageCollectorMXBean> gc = ManagementFactory.getGarbageCollectorMXBeans();
   private long usedNow;
   private long maxHeap;
   private long snapshotHeap;
   private int snapshotGcCount;
   private long snapshotGcTime;
   private long peakHeapSinceSnapshot;

   public void sample() {
      MemoryUsage usage = this.heap.getHeapMemoryUsage();
      this.usedNow = usage.getUsed();
      this.maxHeap = usage.getMax();
      if (this.usedNow > this.peakHeapSinceSnapshot) {
         this.peakHeapSinceSnapshot = this.usedNow;
      }
   }

   public long usedBytes() {
      return this.usedNow;
   }

   public long maxBytes() {
      return this.maxHeap;
   }

   public long peakBytesSinceSnapshot() {
      return this.peakHeapSinceSnapshot;
   }

   public int gcCount() {
      int sum = 0;

      for (GarbageCollectorMXBean b : this.gc) {
         long c = b.getCollectionCount();
         if (c > 0L) {
            sum = (int)(sum + c);
         }
      }

      return sum;
   }

   public long gcTimeMs() {
      long sum = 0L;

      for (GarbageCollectorMXBean b : this.gc) {
         long t = b.getCollectionTime();
         if (t > 0L) {
            sum += t;
         }
      }

      return sum;
   }

   public void snapshot() {
      this.sample();
      this.snapshotHeap = this.usedNow;
      this.peakHeapSinceSnapshot = this.usedNow;
      this.snapshotGcCount = this.gcCount();
      this.snapshotGcTime = this.gcTimeMs();
   }

   public long snapshotHeap() {
      return this.snapshotHeap;
   }

   public int gcEventsSinceSnapshot() {
      return this.gcCount() - this.snapshotGcCount;
   }

   public long gcTimeMsSinceSnapshot() {
      return this.gcTimeMs() - this.snapshotGcTime;
   }
}
