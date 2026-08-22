package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.MultiAnglePath;
import com.fpstest.client.bench.camera.Pose;
import com.fpstest.client.bench.instrumentation.Instr;
import com.fpstest.client.bench.instrumentation.IntSeries;
import com.fpstest.client.bench.scene.Arena;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1541;
import net.minecraft.class_243;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public class TntFieldBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int SIDE = 14;
   private static final int SPACING = 3;
   private static final int WAVE_SIZE = 18;
   private static final int WAVE_INTERVAL = 30;
   private static final int TNT_LIFT = 3;
   private static final int LATE_CUTOFF = 60;
   private final String id;
   private final String displayName;
   private final long seed;
   private final boolean destructible;
   private int tntSpawned = 0;
   private int phaseTicks = 0;
   private int wavesSpawned = 0;
   private final IntSeries tntActiveSeries = new IntSeries();
   private Instr.Snapshot instrStart = null;
   private final Random rng;

   public TntFieldBenchmark() {
      this("tnt_field", "TNT field (14×14 staggered fuses)", 3539L, false);
   }

   public TntFieldBenchmark(String id, String displayName, long seed, boolean destructible) {
      this.id = id;
      this.displayName = displayName;
      this.seed = seed;
      this.destructible = destructible;
      this.rng = new Random(seed);
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
   public String description() {
      return this.destructible
         ? "196 primed TNT on thick stone — explosions break blocks, mesh rebuilds + lighting churn."
         : "196 primed TNT at start + staggered waves of 18 TNT every 1.5s through the sample.";
   }

   @Override
   public int warmupTicks() {
      return 30;
   }

   @Override
   public int sampleTicks() {
      return 400;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.tntSpawned = 0;
      this.phaseTicks = 0;
      this.wavesSpawned = 0;
      this.tntActiveSeries.clear();
      this.instrStart = null;
      this.rng.setSeed(this.seed());
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int half = 52;
            if (this.destructible) {
               Arena.bedrockSlab(lvl, 0, (int)CENTER.field_1351 - 14, 0, half, half);

               for (int yOff = -13; yOff <= -2; yOff++) {
                  Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 + yOff, 0, half, half);
               }
            } else {
               Arena.bedrockSlab(lvl, 0, (int)CENTER.field_1351 - 2, 0, half, half);
            }

            for (int i = 0; i < 14; i++) {
               for (int j = 0; j < 14; j++) {
                  double x = CENTER.field_1352 + (i - 7.0) * 3.0;
                  double z = CENTER.field_1350 + (j - 7.0) * 3.0;
                  double tntY = CENTER.field_1351 + (this.destructible ? 11 : 3);
                  class_1541 tnt = new class_1541(lvl, x, tntY, z, null);
                  tnt.method_6967(40 + (i + j) * 4);
                  ctx.spawnTracked(tnt, lvl);
                  this.tntSpawned++;
               }
            }
         }
      });
      class_243 high = CENTER.method_1031(0.0, 24.0, 0.0);
      class_243 side = CENTER.method_1031(35.0, 8.0, 0.0);
      class_243 wide = CENTER.method_1031(0.0, 12.0, -40.0);
      ctx.setCameraPath(
         new MultiAnglePath(
            List.of(
               new MultiAnglePath.Cut(60, Pose.lookAt(side, CENTER)),
               new MultiAnglePath.Cut(60, new Pose(high, 0.0F, 89.0F)),
               new MultiAnglePath.Cut(80, Pose.lookAt(wide, CENTER))
            )
         )
      );
      Arena.teleport(ctx, CENTER.method_1031(0.0, 8.0, 0.0), 0.0F, 35.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      this.sampleTntCount(ctx);
      if (this.phaseTicks >= 30) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 60) {
            if (this.phaseTicks % 30 == 0) {
               ctx.onServer(s -> {
                  class_3218 lvl = ctx.serverLevel();
                  if (lvl != null) {
                     for (int n = 0; n < 18; n++) {
                        int i = this.rng.nextInt(14);
                        int j = this.rng.nextInt(14);
                        double x = CENTER.field_1352 + (i - 7.0) * 3.0 + (this.rng.nextDouble() - 0.5) * 0.4;
                        double z = CENTER.field_1350 + (j - 7.0) * 3.0 + (this.rng.nextDouble() - 0.5) * 0.4;
                        double tntY = CENTER.field_1351 + (this.destructible ? 11 : 3);
                        class_1541 tnt = new class_1541(lvl, x, tntY, z, null);
                        tnt.method_6967(20 + this.rng.nextInt(40));
                        ctx.spawnTracked(tnt, lvl);
                        this.tntSpawned++;
                     }

                     this.wavesSpawned++;
                  }
               });
            }
         }
      }
   }

   private void sampleTntCount(BenchContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING) {
         if (this.instrStart == null) {
            this.instrStart = Instr.snapshot();
         }

         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int alive = 0;

            for (class_1297 e : lvl.method_27909()) {
               if (e instanceof class_1541) {
                  alive++;
               }
            }

            this.tntActiveSeries.add(alive);
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("tnt_spawned", this.tntSpawned);
      r.extra("waves_spawned", this.wavesSpawned);
      r.extra("tnt_active_avg", this.tntActiveSeries.avg());
      r.extra("tnt_active_p50", this.tntActiveSeries.p50());
      r.extra("tnt_active_p95", this.tntActiveSeries.p95());
      r.extra("tnt_active_max", this.tntActiveSeries.max());
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("explosions_count", (double)d.explosions());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
         r.extra("section_rebuilds", (double)d.sectionRebuilds());
      }
   }
}
