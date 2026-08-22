package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.scene.Arena;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_3218;
import net.minecraft.class_3222;

@Environment(EnvType.CLIENT)
public final class ParticleQuarryBenchmark implements Benchmark {
   private static final int HALF_X = 20;
   private static final int HALF_Z = 20;
   private static final int DEPTH = 22;
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final class_2394[] EMITTERS = new class_2394[]{
      class_2398.field_11240,
      class_2398.field_11251,
      class_2398.field_11204,
      class_2398.field_11215,
      class_2398.field_11214,
      class_2398.field_11207,
      class_2398.field_11232,
      class_2398.field_11201,
      class_2398.field_11205,
      class_2398.field_11208,
      class_2398.field_11209,
      class_2398.field_11229,
      class_2398.field_38004,
      class_2398.field_22247,
      class_2398.field_11216,
      class_2398.field_28013
   };
   private int particlesSpawned = 0;

   @Override
   public String id() {
      return "particle_diversity_stress";
   }

   @Override
   public String displayName() {
      return "Particle diversity stress (16 types simultaneously)";
   }

   @Override
   public String category() {
      return "Stress";
   }

   @Override
   public boolean heavy() {
      return true;
   }

   @Override
   public long seed() {
      return 2521L;
   }

   @Override
   public String description() {
      return "16 distinct particle types firing simultaneously in a quarry; flat world, fixed seed, smooth orbit.";
   }

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.particlesSpawned = 0;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 22, 0, 20, 20);
            Arena.carveBox(lvl, 0, (int)CENTER.field_1351 - 22, 0, 20, 22, 20);
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 32.0, 10.0, 1.2));
      Arena.teleport(ctx, CENTER, 180.0F, 10.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      boolean count = runner.state() == CinematicRunner.State.SAMPLING;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            ThreadLocalRandom rng = ThreadLocalRandom.current();
            List<class_3222> players = new ArrayList<>(lvl.method_18456());

            for (int e = 0; e < EMITTERS.length; e++) {
               class_2394 type = EMITTERS[e];
               double angle = e * (Math.PI * 2) / EMITTERS.length;
               double ex = CENTER.field_1352 + Math.cos(angle) * 18.0;
               double ez = CENTER.field_1350 + Math.sin(angle) * 18.0;

               for (int i = 0; i < 40; i++) {
                  double dy = rng.nextDouble() * 22.0 * 0.8;
                  double jx = rng.nextDouble() - 0.5;
                  double jz = rng.nextDouble() - 0.5;
                  double px = ex + jx;
                  double py = CENTER.field_1351 - 22.0 + dy;
                  double pz = ez + jz;
                  if (players.isEmpty()) {
                     lvl.method_14199(type, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
                  } else {
                     for (class_3222 p : players) {
                        lvl.method_14166(p, type, true, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
                     }
                  }

                  if (count) {
                     this.particlesSpawned++;
                  }
               }
            }
         }
      });
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("particles_spawned", this.particlesSpawned);
      r.extra("particle_types", EMITTERS.length);
   }
}
