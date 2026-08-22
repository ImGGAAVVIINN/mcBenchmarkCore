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
public final class PistonSlimeArrayBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int GRID = 8;
   private static final int CELL_SPACING = 4;
   private static final int PULSE_PERIOD = 8;
   private static final int SLIME_STACK = 3;
   private int pistonsBuilt = 0;
   private int phaseTicks = 0;
   private int powerToggles = 0;
   private boolean poweredHigh = false;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "piston_slime_array";
   }

   @Override
   public String displayName() {
      return "Piston/slime array (8×8 toggled every 8t)";
   }

   @Override
   public String category() {
      return "Redstone";
   }

   @Override
   public long seed() {
      return 4027L;
   }

   @Override
   public String description() {
      return "64 sticky pistons + 3-slime stacks; redstone-block toggle pulses produce continuous piston events.";
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
      this.pistonsBuilt = 0;
      this.phaseTicks = 0;
      this.powerToggles = 0;
      this.poweredHigh = false;
      this.instrStart = null;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int half = 36;
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 2, 0, half, half);
            class_2680 pistonUp = (class_2680)class_2246.field_10615.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036);
            class_2680 slime = class_2246.field_10030.method_9564();
            class_2680 stone = class_2246.field_10340.method_9564();
            int by = (int)CENTER.field_1351;

            for (int gx = 0; gx < 8; gx++) {
               for (int gz = 0; gz < 8; gz++) {
                  int bx = (int)CENTER.field_1352 + (gx - 4) * 4;
                  int bz = (int)CENTER.field_1350 + (gz - 4) * 4;
                  lvl.method_8652(new class_2338(bx, by, bz), pistonUp, 3);

                  for (int k = 0; k < 3; k++) {
                     lvl.method_8652(new class_2338(bx, by + 1 + k, bz), slime, 3);
                  }

                  lvl.method_8652(new class_2338(bx + 1, by, bz), stone, 3);
                  this.pistonsBuilt++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.method_1031(0.0, 4.0, 0.0), 22.4, 14.0, 0.5));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 14.0, 38.0), 180.0F, 30.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING && this.instrStart == null) {
         this.instrStart = Instr.snapshot();
      }

      if (this.phaseTicks % 8 == 0) {
         ctx.onServer(s -> {
            class_3218 lvl = ctx.serverLevel();
            if (lvl != null) {
               class_2680 power = this.poweredHigh ? class_2246.field_10340.method_9564() : class_2246.field_10002.method_9564();
               int by = (int)CENTER.field_1351;

               for (int gx = 0; gx < 8; gx++) {
                  for (int gz = 0; gz < 8; gz++) {
                     int bx = (int)CENTER.field_1352 + (gx - 4) * 4;
                     int bz = (int)CENTER.field_1350 + (gz - 4) * 4;
                     lvl.method_8652(new class_2338(bx + 1, by, bz), power, 3);
                  }
               }

               this.poweredHigh = !this.poweredHigh;
               this.powerToggles++;
            }
         });
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("pistons_built", this.pistonsBuilt);
      r.extra("power_toggles", this.powerToggles);
      r.extra("slime_blocks", this.pistonsBuilt * 3);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
