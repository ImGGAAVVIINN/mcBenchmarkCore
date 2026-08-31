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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.entity.projectile.throwableitemprojectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ProjectileStormBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 2, 0, 36, 36);
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
               ServerLevel lvl = (ServerLevel) ctx.serverLevel();
               if (lvl != null) {
                  Random rng = new Random(this.phaseTicks * 31L + this.seed());

                  for (int i = 0; i < 25; i++) {
                     double angle = rng.nextDouble() * Math.PI * 2.0;
                     double sx = CENTER.x + Math.cos(angle) * 30.0;
                     double sz = CENTER.z + Math.sin(angle) * 30.0;
                     double sy = CENTER.y + 8.0 + rng.nextDouble() * 4.0;
                     Vec3 toCenter = CENTER.subtract(sx, sy, sz).normalize().scale(1.6);
                     if (i % 2 == 0) {
                        Arrow arrow = new Arrow(lvl, sx, sy, sz, new ItemStack(Items.ARROW), null);
                        arrow.setDeltaMovement(toCenter);
                        arrow.setNoGravity(false);
                        ctx.spawnTracked(arrow, lvl);
                     } else {
                        Snowball ball = new Snowball(lvl, sx, sy, sz, new ItemStack(Items.SNOWBALL));
                        ball.setDeltaMovement(toCenter);
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            int inFlight = 0;
            int landed = 0;
            List<Entity> live = new ArrayList<>();

            for (Entity e : lvl.getAllEntities()) {
               boolean isProjectile = e instanceof AbstractArrow || e instanceof Snowball;
               if (isProjectile) {
                  if (e.onGround()) {
                     e.discard();
                     landed++;
                  } else {
                     inFlight++;
                     live.add(e);
                  }
               }
            }

            if (inFlight > 250) {
               live.sort(Comparator.comparingInt(Entity::getId));
               int excess = inFlight - 250;

               for (int i = 0; i < excess && i < live.size(); i++) {
                  live.get(i).discard();
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