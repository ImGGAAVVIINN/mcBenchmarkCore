package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class RunPlan {
   public final Benchmark bench;
   public final int warmupTicks;
   public final int sampleTicks;
   public final int cooldownTicks;
   public final int preloadTicks;
   public final String presetName;

   public RunPlan(Benchmark bench, int warmup, int sample, int cooldown, int preload, String presetName) {
      this.bench = bench;
      this.warmupTicks = warmup;
      this.sampleTicks = sample;
      this.cooldownTicks = cooldown;
      this.preloadTicks = preload;
      this.presetName = presetName;
   }

   public static RunPlan fromBench(Benchmark b) {
      return new RunPlan(b, b.warmupTicks(), b.sampleTicks(), b.cooldownTicks(), b.preloadTicks(), "default");
   }

   public static RunPlan quick(Benchmark b) {
      return new RunPlan(b, 60, 400, 30, 80, "quick");
   }

   public static RunPlan full(Benchmark b) {
      return new RunPlan(b, 100, 1200, 40, 120, "full");
   }

   public static RunPlan longRun(Benchmark b) {
      return new RunPlan(b, 140, 4000, 60, 160, "long");
   }

   public double estimatedSeconds() {
      return (this.warmupTicks + this.sampleTicks + this.cooldownTicks + this.preloadTicks / 2.0) / 20.0 + 7.0;
   }

   public String describe() {
      return this.bench.displayName() + " (" + this.presetName + ", ~" + (int)this.estimatedSeconds() + "s)";
   }
}
