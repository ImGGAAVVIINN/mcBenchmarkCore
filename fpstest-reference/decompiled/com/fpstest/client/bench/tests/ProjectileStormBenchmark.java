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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1665;
import net.minecraft.class_1667;
import net.minecraft.class_1680;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public final class ProjectileStormBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final double SPAWN_RADIUS = 30.0;
   private static final int WAVE_SIZE = 25;
   private static final int WAVE_INTERVAL = 10;
   private static final int LATE_CUTOFF = 60;
   private static final int SWEEP_INTERVAL = 40;
   private static final int IN_FLIGHT_HARD_CAP = 250;
   private int phaseTicks = 0;
   private int wavesSpawned = 0;
   private int projectilesSpawned = 0;
   private int projectilesSwept = 0;
   private int sweepMaxObserved = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "projectile_storm";
   }

   @Override
   public String displayName() {
      return "Projectile storm (arrows + snowballs)";
   }

   @Override
   public String category() {
      return "Physics";
   }

   @Override
   public long seed() {
      return 5099L;
   }

   @Override
   public String description() {
      return "25 arrows + snowballs fired every 0.5s from random ring positions toward centre.";
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
      this.phaseTicks = 0;
      this.wavesSpawned = 0;
      this.projectilesSpawned = 0;
      this.projectilesSwept = 0;
      this.sweepMaxObserved = 0;
      this.instrStart = null;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 2, 0, 36, 36);
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 26.0, 6.0, 0.5));
      Arena.teleport(ctx, CENTER, 0.0F, 0.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING && this.instrStart == null) {
         this.instrStart = Instr.snapshot();
      }

      if (this.phaseTicks % 40 == 0) {
         this.sweepLandedProjectiles(ctx);
      }

      if (this.phaseTicks % 10 == 0) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 60) {
            ctx.onServer(s -> {
               class_3218 lvl = ctx.serverLevel();
               if (lvl != null) {
                  Random rng = new Random(this.phaseTicks * 31L + this.seed());

                  for (int i = 0; i < 25; i++) {
                     double angle = rng.nextDouble() * Math.PI * 2.0;
                     double sx = CENTER.field_1352 + Math.cos(angle) * 30.0;
                     double sz = CENTER.field_1350 + Math.sin(angle) * 30.0;
                     double sy = CENTER.field_1351 + 8.0 + rng.nextDouble() * 4.0;
                     class_243 toCenter = CENTER.method_1023(sx, sy, sz).method_1029().method_1021(1.6);
                     if (i % 2 == 0) {
                        class_1667 arrow = new class_1667(lvl, sx, sy, sz, new class_1799(class_1802.field_8107), null);
                        arrow.method_18799(toCenter);
                        arrow.method_5875(false);
                        ctx.spawnTracked(arrow, lvl);
                     } else {
                        class_1680 ball = new class_1680(lvl, sx, sy, sz);
                        ball.method_18799(toCenter);
                        ctx.spawnTracked(ball, lvl);
                     }

                     this.projectilesSpawned++;
                  }

                  this.wavesSpawned++;
               }
            });
         }
      }
   }

   private void sweepLandedProjectiles(BenchContext ctx) {
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int inFlight = 0;
            int landed = 0;
            List<class_1297> live = new ArrayList<>();

            for (class_1297 e : lvl.method_27909()) {
               boolean isProjectile = e instanceof class_1665 || e instanceof class_1680;
               if (isProjectile) {
                  if (e.method_24828()) {
                     e.method_31472();
                     landed++;
                  } else {
                     inFlight++;
                     live.add(e);
                  }
               }
            }

            if (inFlight > 250) {
               live.sort(Comparator.comparingInt(class_1297::method_5628));
               int excess = inFlight - 250;

               for (int i = 0; i < excess && i < live.size(); i++) {
                  live.get(i).method_31472();
                  landed++;
               }

               inFlight = 250;
            }

            this.projectilesSwept += landed;
            if (inFlight > this.sweepMaxObserved) {
               this.sweepMaxObserved = inFlight;
            }
         }
      });
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("waves_spawned", this.wavesSpawned);
      r.extra("projectiles_spawned", this.projectilesSpawned);
      r.extra("projectiles_swept", this.projectilesSwept);
      r.extra("max_in_flight_observed", this.sweepMaxObserved);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
