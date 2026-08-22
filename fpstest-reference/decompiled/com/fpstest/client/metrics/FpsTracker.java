package com.fpstest.client.metrics;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class FpsTracker {
   private static final int RECENT = 120;
   private final RingBuffer recent = new RingBuffer(120);
   private long lastFrameNs = 0L;
   private double lastFrameMs = 0.0;
   private volatile boolean recording = false;
   private volatile RingBuffer recording_ = null;

   public void onFrame() {
      long now = System.nanoTime();
      if (this.lastFrameNs != 0L) {
         double ms = (now - this.lastFrameNs) / 1000000.0;
         this.lastFrameMs = ms;
         this.recent.push(ms);
         RingBuffer rec = this.recording_;
         if (this.recording && rec != null) {
            rec.push(ms);
         }
      }

      this.lastFrameNs = now;
   }

   public double lastFrameMs() {
      return this.lastFrameMs;
   }

   public double smoothedFps() {
      double avg = this.recent.average();
      return avg > 0.0 ? 1000.0 / avg : 0.0;
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
