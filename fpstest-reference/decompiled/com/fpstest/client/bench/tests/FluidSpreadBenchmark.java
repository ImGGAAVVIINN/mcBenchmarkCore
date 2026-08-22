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
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3612;

@Environment(EnvType.CLIENT)
public final class FluidSpreadBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int RADIUS = 16;
   private static final int STEPS = 4;
   private static final int WAVE_INTERVAL = 80;
   private static final int LATE_CUTOFF = 60;
   private int waves = 0;
   private int phaseTicks = 0;
   private int sourcesPlaced = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "fluid_spread";
   }

   @Override
   public String displayName() {
      return "Fluid spread (water basin, 4-step periodic reset)";
   }

   @Override
   public String category() {
      return "Fluids";
   }

   @Override
   public long seed() {
      return 9043L;
   }

   @Override
   public String description() {
      return "Stepped stone basin; water sources placed at the top, flow down 4 levels, reset every 4s.";
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
      this.waves = 0;
      this.phaseTicks = 0;
      this.sourcesPlaced = 0;
      this.instrStart = null;
      ctx.onServer(
         s -> {
            class_3218 lvl = ctx.serverLevel();
            if (lvl != null) {
               int by = (int)CENTER.field_1351;
               class_2680 stone = class_2246.field_10340.method_9564();

               for (int dx = -16; dx <= 16; dx++) {
                  for (int dz = -16; dz <= 16; dz++) {
                     int dist = Math.max(Math.abs(dx), Math.abs(dz));
                     int dropBy = Math.min(4, dist * 4 / Math.max(1, 15));
                     int floorY = by + 4 - dropBy;

                     for (int fy = by - 1; fy <= floorY; fy++) {
                        lvl.method_8652(new class_2338((int)CENTER.field_1352 + dx, fy, (int)CENTER.field_1350 + dz), stone, 3);
                     }

                     for (int dy = 1; dy <= 4; dy++) {
                        lvl.method_8652(
                           new class_2338((int)CENTER.field_1352 + dx, floorY + dy, (int)CENTER.field_1350 + dz), class_2246.field_10124.method_9564(), 3
                        );
                     }
                  }
               }
            }
         }
      );
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.method_1031(0.0, 6.0, 0.0), 24.0, 16.0, 0.5));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 16.0, 26.0), 180.0F, 35.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING && this.instrStart == null) {
         this.instrStart = Instr.snapshot();
      }

      boolean firstWave = this.phaseTicks == 1;
      if (firstWave || this.phaseTicks % 80 == 0) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 60) {
            ctx.onServer(s -> {
               class_3218 lvl = ctx.serverLevel();
               if (lvl != null) {
                  int by = (int)CENTER.field_1351;
                  class_2680 air = class_2246.field_10124.method_9564();

                  for (int dx = -16; dx <= 16; dx++) {
                     for (int dz = -16; dz <= 16; dz++) {
                        for (int yy = by; yy <= by + 4 + 4; yy++) {
                           class_2338 p = new class_2338((int)CENTER.field_1352 + dx, yy, (int)CENTER.field_1350 + dz);
                           if (lvl.method_8320(p).method_27852(class_2246.field_10382)) {
                              lvl.method_8652(p, air, 3);
                           }
                        }
                     }
                  }

                  class_2680 water = class_2246.field_10382.method_9564();
                  int top = by + 4 + 1;

                  for (int dx = -1; dx <= 1; dx++) {
                     for (int dz = -1; dz <= 1; dz++) {
                        class_2338 p = new class_2338((int)CENTER.field_1352 + dx, top, (int)CENTER.field_1350 + dz);
                        lvl.method_8652(p, water, 3);
                        lvl.method_39281(p, class_3612.field_15910, 5);
                        this.sourcesPlaced++;
                     }
                  }

                  this.waves++;
               }
            });
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("waves_spawned", this.waves);
      r.extra("sources_placed_total", this.sourcesPlaced);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_fluid_ticks", (double)d.scheduledFluidTicks());
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
