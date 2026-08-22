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
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2614;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public final class HopperGridBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int GRID = 20;
   private static final int SPACING_Z = 2;
   private static final int RESTOCK_INTERVAL = 20;
   private static final int LATE_CUTOFF = 60;
   private int hoppersBuilt = 0;
   private int restocks = 0;
   private int phaseTicks = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "hopper_grid";
   }

   @Override
   public String displayName() {
      return "Hopper grid 20×20 (transfer storm)";
   }

   @Override
   public String category() {
      return "Block-Entities";
   }

   @Override
   public long seed() {
      return 8011L;
   }

   @Override
   public String description() {
      return "400 hoppers polling/transferring, top row restocked every 2s; primary block-entity stress.";
   }

   @Override
   public int warmupTicks() {
      return 60;
   }

   @Override
   public int sampleTicks() {
      return 600;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.hoppersBuilt = 0;
      this.restocks = 0;
      this.phaseTicks = 0;
      this.instrStart = null;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int halfX = 24;
            int halfZ = 44;
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 1, 0, halfX, halfZ);
            class_2680 hopperEast = (class_2680)class_2246.field_10312.method_9564().method_11657(class_2741.field_12545, class_2350.field_11034);
            int by = (int)CENTER.field_1351;

            for (int gz = 0; gz < 20; gz++) {
               int bz = (int)CENTER.field_1350 + (gz - 10) * 2;
               int rowStartX = (int)CENTER.field_1352 - 10;

               for (int gx = 0; gx < 20; gx++) {
                  int bx = rowStartX + gx;
                  class_2338 hopperPos = new class_2338(bx, by, bz);
                  if (gx == 19) {
                     lvl.method_8652(new class_2338(bx + 1, by, bz), class_2246.field_10034.method_9564(), 3);
                  }

                  lvl.method_8652(hopperPos, hopperEast, 3);
                  this.hoppersBuilt++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 16.0, 14.0, 0.6));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 14.0, 46.0), 180.0F, 30.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING && this.instrStart == null) {
         this.instrStart = Instr.snapshot();
      }

      if (this.phaseTicks % 20 == 0) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 60) {
            ctx.onServer(s -> {
               class_3218 lvl = ctx.serverLevel();
               if (lvl != null) {
                  int by = (int)CENTER.field_1351;
                  int rowStartX = (int)CENTER.field_1352 - 10;

                  for (int gz = 0; gz < 20; gz++) {
                     int bz = (int)CENTER.field_1350 + (gz - 10) * 2;
                     if (lvl.method_8321(new class_2338(rowStartX, by, bz)) instanceof class_2614 h) {
                        h.method_5447(0, new class_1799(class_1802.field_20412, 64));
                     }
                  }

                  this.restocks++;
               }
            });
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("hoppers_built", this.hoppersBuilt);
      r.extra("restocks", this.restocks);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
