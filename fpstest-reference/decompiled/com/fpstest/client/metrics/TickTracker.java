package com.fpstest.client.metrics;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class TickTracker {
   private static final int RECENT = 40;
   private final RingBuffer recent = new RingBuffer(40);
   private long tickStartNs = 0L;
   private double lastTickMs = 0.0;
   private boolean recording = false;
   private RingBuffer recording_ = null;

   public void onTickStart() {
      this.tickStartNs = System.nanoTime();
   }

   public void onTickEnd() {
      if (this.tickStartNs != 0L) {
         double ms = (System.nanoTime() - this.tickStartNs) / 1000000.0;
         this.lastTickMs = ms;
         this.recent.push(ms);
         if (this.recording && this.recording_ != null) {
            this.recording_.push(ms);
         }
      }
   }

   public double lastTickMs() {
      return this.lastTickMs;
   }

   public double smoothedTickMs() {
      return this.recent.average();
   }

   public void startRecording(int capacity) {
      this.recording_ = new RingBuffer(capacity);
      this.recording = true;
   }

   public double[] stopAndGetSamples() {
      this.recording = false;
      if (this.recording_ == null) {
         return new double[0];
      } else {
         double[] out = this.recording_.toArray();
         this.recording_ = null;
         return out;
      }
   }
}
