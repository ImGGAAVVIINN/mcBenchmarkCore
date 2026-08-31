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
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ItemsMergeStormBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final double SPAWN_RADIUS = 6.0;
   private static final int INITIAL_BURST = 600;
   private static final int WAVE_SIZE = 80;
   private static final int WAVE_INTERVAL = 30;
   private static final int LATE_CUTOFF = 80;
   private int itemsSpawned = 0;
   private int wavesSpawned = 0;
   private int phaseTicks = 0;
   private final IntSeries aliveSeries = new IntSeries();
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "entity_items_merge_storm";
   }

   @Override
   public String displayName() {
      return "Item merge storm (cobblestone, mergeable)";
   }

   @Override
   public String category() {
      return "Entities";
   }

   @Override
   public long seed() {
      return 6287L;
   }

   @Override
   public String description() {
      return "600 cobblestone item entities + waves of 80 every 1.5s; merge engine saturation.";
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
      this.itemsSpawned = 0;
      this.wavesSpawned = 0;
      this.phaseTicks = 0;
      this.aliveSeries.clear();
      this.instrStart = null;
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, 12, 12);
            this.spawnBurst(ctx, lvl, 600);
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 12.0, 4.0, 0.6));
      Arena.teleport(ctx, CENTER.add(0.0, 6.0, 14.0), 180.0F, 25.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING) {
         if (this.instrStart == null) {
            this.instrStart = Instr.snapshot();
         }

         this.sampleAlive(ctx);
      }

      if (this.phaseTicks % 30 == 0) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 80) {
            ctx.onServer(s -> {
               ServerLevel lvl = (ServerLevel) ctx.serverLevel();
               if (lvl != null) {
                  this.spawnBurst(ctx, lvl, 80);
               }

               this.wavesSpawned++;
            });
         }
      }
   }

   private void spawnBurst(BenchContext ctx, ServerLevel lvl, int n) {
      Random rng = new Random(this.itemsSpawned * 31L + this.seed());

      for (int i = 0; i < n; i++) {
         double angle = rng.nextDouble() * Math.PI * 2.0;
         double r = rng.nextDouble() * 6.0;
         double x = CENTER.x + Math.cos(angle) * r;
         double z = CENTER.z + Math.sin(angle) * r;
         ItemEntity ie = new ItemEntity(lvl, x, CENTER.y + 1.0, z, new ItemStack(Items.COBBLESTONE, 1));
         ie.setNeverPickUp();
         ie.setUnlimitedLifetime();
         ie.setInvulnerable(true);
         ctx.spawnTracked(ie, lvl);
         this.itemsSpawned++;
      }
   }

   private void sampleAlive(BenchContext ctx) {
      if (FpsTestClient.RUNNER.state() == CinematicRunner.State.SAMPLING) {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            int alive = 0;

            for (Entity e : lvl.getAllEntities()) {
               if (e instanceof ItemEntity) {
                  alive++;
               }
            }

            this.aliveSeries.add(alive);
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("items_spawned", this.itemsSpawned);
      r.extra("waves_spawned", this.wavesSpawned);
      r.extra("items_alive_avg", this.aliveSeries.avg());
      r.extra("items_alive_p50", this.aliveSeries.p50());
      r.extra("items_alive_p95", this.aliveSeries.p95());
      r.extra("items_alive_max", this.aliveSeries.max());
      r.extra("items_merged_estimate", Math.max(0, this.itemsSpawned - this.aliveSeries.max()));
   }
}
