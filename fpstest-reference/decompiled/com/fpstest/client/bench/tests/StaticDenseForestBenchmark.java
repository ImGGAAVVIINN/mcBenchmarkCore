package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.scene.Arena;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3218;

@Environment(EnvType.CLIENT)
public final class StaticDenseForestBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int FOREST_HALF = 24;
   private static final int TREE_COUNT = 64;
   private static final int TRUNK_HEIGHT = 5;
   private static final int LEAF_RADIUS = 3;
   private int treesBuilt = 0;
   private int leafBlocks = 0;
   private int logBlocks = 0;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "static_dense_forest";
   }

   @Override
   public String displayName() {
      return "Static dense forest (orbit canopy, no worldgen)";
   }

   @Override
   public String category() {
      return "Chunks";
   }

   @Override
   public long seed() {
      return 7039L;
   }

   @Override
   public String description() {
      return "Hand-built oak forest on flat ground; orbit camera at canopy height. Pairs with chunk_forest.";
   }

   @Override
   public int warmupTicks() {
      return 60;
   }

   @Override
   public int sampleTicks() {
      return 500;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.treesBuilt = 0;
      this.leafBlocks = 0;
      this.logBlocks = 0;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            int by = (int)CENTER.field_1351;
            class_2680 grass = class_2246.field_10219.method_9564();

            for (int dx = -24; dx <= 24; dx++) {
               for (int dz = -24; dz <= 24; dz++) {
                  lvl.method_8652(new class_2338((int)CENTER.field_1352 + dx, by - 1, (int)CENTER.field_1350 + dz), grass, 3);
               }
            }

            Random rng = new Random(this.seed());
            class_2680 log = class_2246.field_10431.method_9564();
            class_2680 leaves = class_2246.field_10503.method_9564();
            int placed = 0;
            int attempts = 0;

            while (placed < 64 && attempts < 640) {
               attempts++;
               int x = rng.nextInt(48) - 24;
               int z = rng.nextInt(48) - 24;
               class_2338 base = new class_2338((int)CENTER.field_1352 + x, by, (int)CENTER.field_1350 + z);
               if (lvl.method_8320(base).method_26215()) {
                  for (int h = 0; h < 5; h++) {
                     lvl.method_8652(base.method_10086(h), log, 3);
                     this.logBlocks++;
                  }

                  class_2338 leafCentre = base.method_10086(5);

                  for (int lx = -3; lx <= 3; lx++) {
                     for (int ly = -3; ly <= 3; ly++) {
                        for (int lz = -3; lz <= 3; lz++) {
                           int distSq = lx * lx + ly * ly + lz * lz;
                           if (distSq <= 9) {
                              class_2338 lp = leafCentre.method_10069(lx, ly, lz);
                              if (!lvl.method_8320(lp).method_27852(class_2246.field_10431)) {
                                 lvl.method_8652(lp, leaves, 3);
                                 this.leafBlocks++;
                              }
                           }
                        }
                     }
                  }

                  placed++;
               }
            }

            this.treesBuilt = placed;
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.method_1031(0.0, 8.0, 0.0), 30.0, 6.0, 0.5));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 8.0, 32.0), 180.0F, 5.0F);
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("trees_built", this.treesBuilt);
      r.extra("log_blocks", this.logBlocks);
      r.extra("leaf_blocks", this.leafBlocks);
   }
}
