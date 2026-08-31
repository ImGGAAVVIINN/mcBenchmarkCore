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
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.PowerParticleOption;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ParticleQuarryBenchmark implements Benchmark {
   private static final int HALF_X = 20;
   private static final int HALF_Z = 20;
   private static final int DEPTH = 22;
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final ParticleOptions[] EMITTERS = new ParticleOptions[]{
      ParticleTypes.FLAME,
      ParticleTypes.SMOKE,
      ParticleTypes.CLOUD,
      ParticleTypes.ENCHANT,
      ParticleTypes.PORTAL,
      ParticleTypes.END_ROD,
      ParticleTypes.DRIPPING_WATER,
      ParticleTypes.HEART,
      ParticleTypes.CRIT,
      ParticleTypes.ENCHANTED_HIT,
      ParticleTypes.DAMAGE_INDICATOR,
      ParticleTypes.NAUTILUS,
      ParticleTypes.SCULK_CHARGE_POP,
      ParticleTypes.ASH,
      PowerParticleOption.create(ParticleTypes.DRAGON_BREATH, 1.0F),
      ParticleTypes.SNOWFLAKE
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 22, 0, 20, 20);
            Arena.carveBox(lvl, 0, (int)CENTER.y - 22, 0, 20, 22, 20);
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            ThreadLocalRandom rng = ThreadLocalRandom.current();
            List<ServerPlayer> players = new ArrayList<>(lvl.players());

            for (int e = 0; e < EMITTERS.length; e++) {
               ParticleOptions type = EMITTERS[e];
               double angle = e * (Math.PI * 2) / EMITTERS.length;
               double ex = CENTER.x + Math.cos(angle) * 18.0;
               double ez = CENTER.z + Math.sin(angle) * 18.0;

               for (int i = 0; i < 40; i++) {
                  double dy = rng.nextDouble() * 22.0 * 0.8;
                  double jx = rng.nextDouble() - 0.5;
                  double jz = rng.nextDouble() - 0.5;
                  double px = ex + jx;
                  double py = CENTER.y - 22.0 + dy;
                  double pz = ez + jz;
                  if (players.isEmpty()) {
                     lvl.sendParticles(type, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
                  } else {
                     for (ServerPlayer p : players) {
                        lvl.sendParticles(p, type, true, false, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
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