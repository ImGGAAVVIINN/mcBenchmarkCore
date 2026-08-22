package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.instrumentation.Instr;
import com.fpstest.client.bench.scene.Arena;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public final class RedstoneClockBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int GRID = 6;
   private static final int SPACING = 3;
   private static final int PLACE_FLAGS = 3;
   private int clocksBuilt = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "redstone_clocks";
   }

   @Override
   public String displayName() {
      return "Redstone clocks (6×6)";
   }

   @Override
   public String category() {
      return "Redstone";
   }

   @Override
   public long seed() {
      return 4001L;
   }

   @Override
   public String description() {
      return "36 observer-pair clocks producing a continuous block-update storm.";
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.clocksBuilt = 0;
      this.instrStart = null;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int half = 22;
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 1, 0, half, half);
            class_2680 observerEast = (class_2680)class_2246.field_10282.method_9564().method_11657(class_2741.field_12525, class_2350.field_11034);
            class_2680 observerWest = (class_2680)class_2246.field_10282.method_9564().method_11657(class_2741.field_12525, class_2350.field_11039);
            int by = (int)CENTER.field_1351;

            for (int gx = 0; gx < 6; gx++) {
               for (int gz = 0; gz < 6; gz++) {
                  int bx = (int)CENTER.field_1352 + (gx - 3) * 3;
                  int bz = (int)CENTER.field_1350 + (gz - 3) * 3;
                  class_2338 posA = new class_2338(bx, by, bz);
                  class_2338 posB = new class_2338(bx + 1, by, bz);
                  lvl.method_8652(posA, observerEast, 3);
                  lvl.method_8652(posB, observerWest, 3);
                  lvl.method_39279(posA, class_2246.field_10282, 1);
                  this.clocksBuilt++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 16.0, 6.0, 1.1));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 8.0, 0.0), 0.0F, 30.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (this.instrStart == null && runner.state() == CinematicRunner.State.SAMPLING) {
         this.instrStart = Instr.snapshot();
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("clocks_built", this.clocksBuilt);
      r.extra("observers_placed", this.clocksBuilt * 2);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
