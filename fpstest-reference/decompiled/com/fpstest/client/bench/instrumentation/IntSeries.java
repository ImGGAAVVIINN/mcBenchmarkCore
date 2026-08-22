package com.fpstest.client.bench.instrumentation;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IntSeries {
   private int[] buf = new int[256];
   private int n = 0;

   public void add(int v) {
      if (this.n == this.buf.length) {
         this.buf = Arrays.copyOf(this.buf, this.buf.length * 2);
      }

      this.buf[this.n++] = v;
   }

   public void clear() {
      this.n = 0;
   }

   public int size() {
      return this.n;
   }

   public double avg() {
      if (this.n == 0) {
         return 0.0;
      } else {
         long sum = 0L;

         for (int i = 0; i < this.n; i++) {
            sum += this.buf[i];
         }

         return (double)sum / this.n;
      }
   }

   public int p50() {
      return this.percentile(50);
   }

   public int p95() {
      return this.percentile(95);
   }

   public int p99() {
      return this.percentile(99);
   }

   public int max() {
      if (this.n == 0) {
         return 0;
      } else {
         int m = this.buf[0];

         for (int i = 1; i < this.n; i++) {
            if (this.buf[i] > m) {
               m = this.buf[i];
            }
         }

         return m;
      }
   }

   public int percentile(int p) {
      if (this.n == 0) {
         return 0;
      } else {
         int[] sorted = Arrays.copyOf(this.buf, this.n);
         Arrays.sort(sorted);
         int idx = (int)Math.min(this.n - 1L, Math.round(p / 100.0 * (this.n - 1)));
         return sorted[idx];
      }
   }
}
