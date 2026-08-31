package com.fpstest.client.metrics;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class RingBuffer {
   private final double[] buf;
   private int head;
   private int size;

   public RingBuffer(int capacity) {
      if (capacity <= 0) {
         throw new IllegalArgumentException("capacity <= 0");
      } else {
         this.buf = new double[capacity];
      }
   }

   public void push(double value) {
      this.buf[this.head] = value;
      this.head = (this.head + 1) % this.buf.length;
      if (this.size < this.buf.length) {
         this.size++;
      }
   }

   public int size() {
      return this.size;
   }

   public int capacity() {
      return this.buf.length;
   }

   public void clear() {
      this.head = 0;
      this.size = 0;
   }

   public double[] toArray() {
      double[] out = new double[this.size];
      int start = (this.head - this.size + this.buf.length) % this.buf.length;

      for (int i = 0; i < this.size; i++) {
         out[i] = this.buf[(start + i) % this.buf.length];
      }

      return out;
   }

   public double average() {
      if (this.size == 0) {
         return 0.0;
      } else {
         double sum = 0.0;

         for (int i = 0; i < this.size; i++) {
            sum += this.buf[i];
         }

         return sum / this.size;
      }
   }

   public double min() {
      if (this.size == 0) {
         return 0.0;
      } else {
         double m = Double.POSITIVE_INFINITY;

         for (int i = 0; i < this.size; i++) {
            if (this.buf[i] < m) {
               m = this.buf[i];
            }
         }

         return m;
      }
   }
}
