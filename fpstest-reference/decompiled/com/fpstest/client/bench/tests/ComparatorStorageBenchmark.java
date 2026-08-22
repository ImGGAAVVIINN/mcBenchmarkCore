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
import net.minecraft.class_2595;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public final class ComparatorStorageBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int GRID = 8;
   private static final int CELL_SPACING = 3;
   private static final int PULSE_PERIOD = 20;
   private static final int LATE_CUTOFF = 60;
   private int chestsBuilt = 0;
   private int comparatorsBuilt = 0;
   private int phaseTicks = 0;
   private int oscillations = 0;
   private boolean fullState = true;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "comparator_storage";
   }

   @Override
   public String displayName() {
      return "Comparator storage (8×8 chests + comparators)";
   }

   @Override
   public String category() {
      return "Block-Entities";
   }

   @Override
   public long seed() {
      return 8053L;
   }

   @Override
   public String description() {
      return "64 chest+comparator pairs; inventory contents oscillate so comparators recompute every 1s.";
   }

   @Override
   public int warmupTicks() {
      return 40;
   }

   @Override
   public int sampleTicks() {
      return 500;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.chestsBuilt = 0;
      this.comparatorsBuilt = 0;
      this.phaseTicks = 0;
      this.oscillations = 0;
      this.fullState = true;
      this.instrStart = null;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int half = 28;
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 1, 0, half, half);
            class_2680 chest = class_2246.field_10034.method_9564();
            class_2680 comparator = (class_2680)class_2246.field_10377.method_9564().method_11657(class_2741.field_12481, class_2350.field_11043);
            class_2680 dust = class_2246.field_10091.method_9564();
            int by = (int)CENTER.field_1351;

            for (int gx = 0; gx < 8; gx++) {
               for (int gz = 0; gz < 8; gz++) {
                  int bx = (int)CENTER.field_1352 + (gx - 4) * 3;
                  int bz = (int)CENTER.field_1350 + (gz - 4) * 3;
                  lvl.method_8652(new class_2338(bx, by, bz), chest, 3);
                  lvl.method_8652(new class_2338(bx, by, bz + 1), comparator, 3);
                  lvl.method_8652(new class_2338(bx, by, bz + 2), dust, 3);
                  this.chestsBuilt++;
                  this.comparatorsBuilt++;
               }
            }

            this.fillAllChests(lvl, true);
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.method_1031(0.0, 4.0, 0.0), 14.399999999999999, 12.0, 0.5));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 14.0, 30.0), 180.0F, 30.0F);
   }

   private void fillAllChests(class_3218 lvl, boolean full) {
      int by = (int)CENTER.field_1351;

      for (int gx = 0; gx < 8; gx++) {
         for (int gz = 0; gz < 8; gz++) {
            int bx = (int)CENTER.field_1352 + (gx - 4) * 3;
            int bz = (int)CENTER.field_1350 + (gz - 4) * 3;
            if (lvl.method_8321(new class_2338(bx, by, bz)) instanceof class_2595 chest) {
               if (full) {
                  for (int slot = 0; slot < chest.method_5439(); slot++) {
                     chest.method_5447(slot, new class_1799(class_1802.field_8620, 64));
                  }
               } else {
                  for (int slot = 0; slot < chest.method_5439(); slot++) {
                     chest.method_5447(slot, class_1799.field_8037);
                  }

                  chest.method_5447(0, new class_1799(class_1802.field_8620, 1));
               }

               chest.method_5431();
               lvl.method_8452(new class_2338(bx, by, bz), chest.method_11010().method_26204());
            }
         }
      }
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
                  this.fillAllChests(lvl, !this.fullState);
                  this.fullState = !this.fullState;
                  this.oscillations++;
               }
            });
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("chests_built", this.chestsBuilt);
      r.extra("comparators_built", this.comparatorsBuilt);
      r.extra("oscillations", this.oscillations);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
