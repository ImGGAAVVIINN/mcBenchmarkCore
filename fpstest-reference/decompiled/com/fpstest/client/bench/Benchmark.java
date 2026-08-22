package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface Benchmark {
   String id();

   String displayName();

   String description();

   default String category() {
      return "General";
   }

   default long seed() {
      return this.id().hashCode() * 31L + 7L;
   }

   default int warmupTicks() {
      return 80;
   }

   default int sampleTicks() {
      return 600;
   }

   default int cooldownTicks() {
      return 40;
   }

   default int preloadTicks() {
      return 100;
   }

   default WorldType worldType() {
      return WorldType.FLAT;
   }

   void prepare(BenchContext var1);

   default void tick(BenchContext ctx) {
   }

   default void recordExtra(BenchContext ctx, BenchmarkResult.Builder result) {
   }

   default void cleanup(BenchContext ctx) {
   }

   default boolean heavy() {
      return false;
   }

   default boolean fixedDuration() {
      return false;
   }
}
