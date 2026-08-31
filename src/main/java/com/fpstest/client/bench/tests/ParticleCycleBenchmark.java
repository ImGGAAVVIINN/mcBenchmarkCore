package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.RunPlan;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.scene.Arena;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.PowerParticleOption;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ParticleCycleBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final int PIT_HALF = 14;
   private static final int PIT_DEPTH = 16;
   private static final int PARTICLES_PER_EMITTER_BURST = 80;
   private static final int BURST_PERIOD = 20;
   private static final List<ParticleCycleBenchmark.Stage> STAGES = List.of(
      stage("flame", ParticleTypes.FLAME),
      stage("smoke", ParticleTypes.SMOKE),
      stage("end_rod", ParticleTypes.END_ROD),
      stage("portal", ParticleTypes.PORTAL),
      stage("dripping_water", ParticleTypes.DRIPPING_WATER),
      stage("dragon_breath", ParticleTypes.DRAGON_BREATH),
      stage("sculk_charge_pop", ParticleTypes.SCULK_CHARGE_POP),
      stage("ALL_TOGETHER", null)
   );
   private int[] perStageSpawned = new int[STAGES.size()];
   private int tickCounter = 0;
   private final String id;
   private final String name;

   private static ParticleCycleBenchmark.Stage stage(String label, ParticleType<?> type) {
      return new ParticleCycleBenchmark.Stage(label, type);
   }

   public ParticleCycleBenchmark(String id, String name) {
      this.id = id;
      this.name = name;
   }

   public ParticleCycleBenchmark() {
      this("particle_cycle", "Particle cycle (7 types → all together)");
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String displayName() {
      return this.name;
   }

   @Override
   public String category() {
      return "Particles";
   }

   @Override
   public long seed() {
      return 2503L;
   }

   @Override
   public String description() {
      return "Cycles through every vanilla particle type in sequence; final stage fires all of them simultaneously.";
   }

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public int warmupTicks() {
      return 60;
   }

   @Override
   public int sampleTicks() {
      return STAGES.size() * 100;
   }

   @Override
   public int preloadTicks() {
      return 80;
   }

   @Override
   public int cooldownTicks() {
      return 40;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arrays.fill(this.perStageSpawned, 0);
      this.tickCounter = 0;
      Arena.freezeDaytime(ctx);
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int) CENTER.y - 16, 0, 14, 14);
            Arena.carveBox(lvl, 0, (int) CENTER.y - 16, 0, 14, 16, 14);
         }
      });
      ctx.setArenaOrigin(CENTER);
      Vec3 lookAt = new Vec3(CENTER.x, CENTER.y - 11.2, CENTER.z);
      ctx.setCameraPath(new OrbitPath(lookAt, 8.4, 4.0, 0.8));
      Arena.teleport(ctx, CENTER, 0.0F, 0.0F);
   }

   private int currentStageIndex() {
      CinematicRunner runner = FpsTestClient.RUNNER;
      RunPlan plan = runner.currentPlan();
      if (plan == null) {
         return -1;
      } else {
         int sampleTick = runner.phaseTicks();
         int perStage = Math.max(20, plan.sampleTicks / STAGES.size());
         int idx = sampleTick / perStage;
         return Math.min(STAGES.size() - 1, Math.max(0, idx));
      }
   }

   private boolean isSampling() {
      CinematicRunner runner = FpsTestClient.RUNNER;
      return runner.state() == CinematicRunner.State.SAMPLING;
   }

   @Override
   public void tick(BenchContext ctx) {
      this.tickCounter++;
      if (this.tickCounter % 20 == 0) {
         boolean sampling = this.isSampling();
         int stageIdx = this.currentStageIndex();
         boolean allTypesThisBurst = !sampling || stageIdx < 0 || stageIdx >= 0 && STAGES.get(stageIdx).type == null;
         ParticleType<?> onlyType = !allTypesThisBurst && stageIdx >= 0 ? STAGES.get(stageIdx).type : null;
         List<ParticleType<?>> typeList = new ArrayList<>();
         for (ParticleCycleBenchmark.Stage st : STAGES) {
            if (st.type != null) {
               typeList.add(st.type);
            }
         }
         ctx.onServer(s -> {
            ServerLevel lvl = (ServerLevel) ctx.serverLevel();
            if (lvl != null) {
               ThreadLocalRandom rng = ThreadLocalRandom.current();
               int emittersAround = 8;
               List<ServerPlayer> players = new ArrayList<>(lvl.players());
               List<ParticleType<?>> emitTypes = allTypesThisBurst ? typeList : List.of(onlyType);

               for (int e = 0; e < emitTypes.size(); e++) {
                  ParticleType<?> type = emitTypes.get(e);
                  ParticleOptions particle = toParticleOptions(type);
                  int em = e % emittersAround;
                  double angle = em * (Math.PI * 2) / emittersAround;
                  double ex = CENTER.x + Math.cos(angle) * 12.0;
                  double ez = CENTER.z + Math.sin(angle) * 12.0;

                  for (int i = 0; i < 80; i++) {
                     double dy = rng.nextDouble() * 16.0 * 0.8;
                     double jx = rng.nextDouble() - 0.5;
                     double jz = rng.nextDouble() - 0.5;
                     double px = ex + jx;
                     double py = CENTER.y - 16.0 + dy;
                     double pz = ez + jz;
                     if (players.isEmpty()) {
                        lvl.sendParticles(particle, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
                     } else {
                        for (ServerPlayer p : players) {
                           lvl.sendParticles(p, particle, true, false, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
                        }
                     }

                     if (sampling) {
                        int slot = allTypesThisBurst ? STAGES.size() - 1 : stageIdx;
                        if (slot >= 0 && slot < this.perStageSpawned.length) {
                           this.perStageSpawned[slot]++;
                        }
                     }
                  }
               }
            }
         });
      }
   }

   private static ParticleOptions toParticleOptions(ParticleType<?> type) {
      if (type instanceof ParticleOptions opts) {
         return opts;
      } else if (type == ParticleTypes.DRAGON_BREATH) {
         return PowerParticleOption.create(ParticleTypes.DRAGON_BREATH, 1.0F);
      } else {
         @SuppressWarnings("unchecked")
         ParticleType<PowerParticleOption> powerType = (ParticleType<PowerParticleOption>) type;
         return PowerParticleOption.create(powerType, 1.0F);
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      int total = 0;

      for (int i = 0; i < STAGES.size(); i++) {
         ParticleCycleBenchmark.Stage s = STAGES.get(i);
         r.extra("particles_stage_" + s.label, this.perStageSpawned[i]);
         total += this.perStageSpawned[i];
      }

      r.extra("particles_total", total);
      r.extra("particle_stage_count", STAGES.size());
      RunPlan plan = FpsTestClient.RUNNER.currentPlan();
      int perStage = plan != null ? Math.max(20, plan.sampleTicks / STAGES.size()) : 80;
      r.extra("particle_stage_ticks", perStage);
   }

   @Environment(EnvType.CLIENT)
   private record Stage(String label, ParticleType<?> type) {
   }
}
