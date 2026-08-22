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
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_3218;
import net.minecraft.class_3222;

@Environment(EnvType.CLIENT)
public final class ParticleCycleBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int PIT_HALF = 14;
   private static final int PIT_DEPTH = 16;
   private static final int PARTICLES_PER_EMITTER_BURST = 80;
   private static final int BURST_PERIOD = 20;
   private static final List<ParticleCycleBenchmark.Stage> STAGES = List.of(
      stage("flame", class_2398.field_11240),
      stage("smoke", class_2398.field_11251),
      stage("end_rod", class_2398.field_11207),
      stage("portal", class_2398.field_11214),
      stage("dripping_water", class_2398.field_11232),
      stage("dragon_breath", class_2398.field_11216),
      stage("sculk_charge_pop", class_2398.field_38004),
      stage("ALL_TOGETHER", null)
   );
   private int[] perStageSpawned = new int[STAGES.size()];
   private int tickCounter = 0;
   private final String id;
   private final String name;

   private static ParticleCycleBenchmark.Stage stage(String label, class_2394 type) {
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
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 16, 0, 14, 14);
            Arena.carveBox(lvl, 0, (int)CENTER.field_1351 - 16, 0, 14, 16, 14);
         }
      });
      ctx.setArenaOrigin(CENTER);
      class_243 lookAt = new class_243(CENTER.field_1352, CENTER.field_1351 - 11.2, CENTER.field_1350);
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
         class_2394 onlyType = !allTypesThisBurst && stageIdx >= 0 ? STAGES.get(stageIdx).type : null;
         List<class_2394> typeList = STAGES.stream().filter(st -> st.type != null).map(st -> st.type).toList();
         ctx.onServer(s -> {
            class_3218 lvl = ctx.serverLevel();
            if (lvl != null) {
               ThreadLocalRandom rng = ThreadLocalRandom.current();
               int emittersAround = 8;
               List<class_3222> players = new ArrayList<>(lvl.method_18456());
               List<class_2394> emitTypes = allTypesThisBurst ? typeList : List.of(onlyType);

               for (int e = 0; e < emitTypes.size(); e++) {
                  class_2394 type = emitTypes.get(e);
                  int em = e % emittersAround;
                  double angle = em * (Math.PI * 2) / emittersAround;
                  double ex = CENTER.field_1352 + Math.cos(angle) * 12.0;
                  double ez = CENTER.field_1350 + Math.sin(angle) * 12.0;

                  for (int i = 0; i < 80; i++) {
                     double dy = rng.nextDouble() * 16.0 * 0.8;
                     double jx = rng.nextDouble() - 0.5;
                     double jz = rng.nextDouble() - 0.5;
                     double px = ex + jx;
                     double py = CENTER.field_1351 - 16.0 + dy;
                     double pz = ez + jz;
                     if (players.isEmpty()) {
                        lvl.method_14199(type, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
                     } else {
                        for (class_3222 p : players) {
                           lvl.method_14166(p, type, true, px, py, pz, 1, 0.0, 0.0, 0.0, 0.04);
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
   private record Stage(String label, class_2394 type) {
   }
}
