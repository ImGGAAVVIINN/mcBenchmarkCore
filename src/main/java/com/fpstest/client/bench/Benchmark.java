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

   /**
    * Number of sequential measurement phases this benchmark performs.
    * Defaults to 1 (a single measurement). A benchmark that measures multiple
    * configurations (e.g. different shader packs) returns a higher count; the
    * runner then performs one warm-up + sampling cycle per phase and records a
    * separate {@link BenchmarkResult} for each.
    */
   default int phaseCount() {
      return 1;
   }

   /**
    * Display name used for a specific phase's result. Defaults to the
    * benchmark's display name. Phases should return distinct names so each
    * phase's result is clearly identifiable in the results screen and report.
    */
   default String phaseDisplayName(int phaseIndex) {
      return displayName();
   }

   /**
    * Called after each phase's sampling completes, EXCEPT the last phase.
    * The benchmark should set up the next phase here (e.g. swap the shader
    * pack). The runner then waits for {@link #isReady(BenchContext)} before
    * starting the next phase's warm-up + sampling.
    */
   default void onPhaseComplete(BenchContext ctx) {
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
