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

   /**
    * Called every client tick while the runner is in the PREPARING state.
    * A benchmark that performs asynchronous setup in {@link #prepare(BenchContext)}
    * (e.g. resource-pack reloads or shader compilation) should return {@code false}
    * until that setup is complete, so the runner holds in PREPARING and does not
    * start measuring before the environment is actually in place.
    */
   default boolean isReady(BenchContext ctx) {
      return true;
   }

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
