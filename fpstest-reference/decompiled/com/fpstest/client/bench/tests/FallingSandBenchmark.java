package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.instrumentation.Instr;
import com.fpstest.client.bench.instrumentation.IntSeries;
import com.fpstest.client.bench.scene.Arena;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1540;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public class FallingSandBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int SIDE = 40;
   private static final int INITIAL_ALTITUDE = 120;
   private final String id;
   private final String displayName;
   private final long seed;
   private final boolean mixed;
   private final boolean lite;
   private final int topupSide;
   private final int topupStride;
   private final int waveInterval;
   private static final int LATE_CUTOFF = 80;
   private int sandSpawned = 0;
   private int phaseTicks = 0;
   private int wavesSpawned = 0;
   private final IntSeries fallingSeries = new IntSeries();
   private Instr.Snapshot instrStart = null;

   public FallingSandBenchmark() {
      this("falling_sand", "Falling sand wall 40×40 (heavy)", 5077L, false, false);
   }

   public FallingSandBenchmark(String id, String displayName, long seed, boolean mixed) {
      this(id, displayName, seed, mixed, false);
   }

   public FallingSandBenchmark(String id, String displayName, long seed, boolean mixed, boolean lite) {
      this.id = id;
      this.displayName = displayName;
      this.seed = seed;
      this.mixed = mixed;
      this.lite = lite;
      if (lite) {
         this.topupSide = 14;
         this.topupStride = 2;
         this.waveInterval = 6;
      } else {
         this.topupSide = 40;
         this.topupStride = 1;
         this.waveInterval = 30;
      }
   }

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String displayName() {
      return this.displayName;
   }

   @Override
   public String category() {
      return "Physics";
   }

   @Override
   public long seed() {
      return this.seed;
   }

   @Override
   public boolean heavy() {
      return !this.lite;
   }

   @Override
   public String description() {
      if (this.lite) {
         return this.mixed
            ? "Lite: ~50 mixed falling blocks every 0.3s; smoothed top-up, no big spawn spike."
            : "Lite: ~50 sand falling blocks every 0.3s; smoothed top-up, no big spawn spike.";
      } else {
         return this.mixed
            ? "⚠ HEAVY — 1600 mixed falling-block entities per wave; large per-tick physics spike."
            : "⚠ HEAVY — 1600 sand entities per wave; large per-tick physics spike on weak hardware.";
      }
   }

   @Override
   public int warmupTicks() {
      return 30;
   }

   @Override
   public int sampleTicks() {
      return 500;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.sandSpawned = 0;
      this.phaseTicks = 0;
      this.wavesSpawned = 0;
      this.fallingSeries.clear();
      this.instrStart = null;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 2, 0, 40, 40);
            if (!this.lite) {
               for (int x = 0; x < 40; x++) {
                  for (int z = 0; z < 40; z++) {
                     this.spawnSand(lvl, x, z, 120.0 + (x + z) * 0.1);
                  }
               }
            }
         }
      });
      class_243 side = CENTER.method_1031(0.0, 10.0, 38.0);
      ctx.setCameraPath(new OrbitPath(CENTER.method_1031(0.0, 12.0, 0.0), 40.0, 8.0, 0.8));
      Arena.teleport(ctx, side, 0.0F, 20.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      this.sampleAlive(ctx);
      if (this.phaseTicks >= this.waveInterval) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 80) {
            if (this.phaseTicks % this.waveInterval == 0) {
               ctx.onServer(s -> {
                  class_3218 lvl = ctx.serverLevel();
                  if (lvl != null) {
                     int half = this.topupSide / 2;
                     int xOffset = 20 - half;

                     for (int dx = 0; dx < this.topupSide; dx += this.topupStride) {
                        for (int dz = 0; dz < this.topupSide; dz += this.topupStride) {
                           this.spawnSand(lvl, xOffset + dx, xOffset + dz, 120.0);
                        }
                     }

                     this.wavesSpawned++;
                  }
               });
            }
         }
      }
   }

   private void spawnSand(class_3218 lvl, int x, int z, double altitude) {
      double sx = CENTER.field_1352 + x - 20.0;
      double sz = CENTER.field_1350 + z - 20.0;
      double sy = CENTER.field_1351 + altitude;
      class_2680 state;
      if (!this.mixed) {
         state = class_2246.field_10102.method_9564();
      } else {
         int kind = (x + z) % 3;

         state = switch (kind) {
            case 0 -> class_2246.field_10102.method_9564();
            case 1 -> class_2246.field_10255.method_9564();
            default -> class_2246.field_10287.method_9564();
         };
      }

      class_1540 e = class_1540.method_40005(lvl, new class_2338((int)sx, (int)sy, (int)sz), state);
      e.field_7192 = 1;
      this.sandSpawned++;
   }

   private void sampleAlive(BenchContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING) {
         if (this.instrStart == null) {
            this.instrStart = Instr.snapshot();
         }

         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int alive = 0;

            for (class_1297 e : lvl.method_27909()) {
               if (e instanceof class_1540) {
                  alive++;
               }
            }

            this.fallingSeries.add(alive);
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("variant", this.lite ? "lite" : "heavy");
      r.extra("wave_interval_ticks", this.waveInterval);
      r.extra("topup_blocks_per_wave", this.topupSide / this.topupStride * (this.topupSide / this.topupStride));
      r.extra("sand_spawned", this.sandSpawned);
      r.extra("waves_spawned", this.wavesSpawned);
      r.extra("falling_blocks_alive_avg", this.fallingSeries.avg());
      r.extra("falling_blocks_alive_p50", this.fallingSeries.p50());
      r.extra("falling_blocks_alive_p95", this.fallingSeries.p95());
      r.extra("falling_blocks_alive_max", this.fallingSeries.max());
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("falling_blocks_landed", (double)d.fallingBlockLandings());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
