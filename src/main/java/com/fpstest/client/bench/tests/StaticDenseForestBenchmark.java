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
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class StaticDenseForestBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            int by = (int)CENTER.y;
            BlockState grass = Blocks.GRASS_BLOCK.defaultBlockState();

            for (int dx = -24; dx <= 24; dx++) {
               for (int dz = -24; dz <= 24; dz++) {
                  lvl.setBlock(new BlockPos((int)CENTER.x + dx, by - 1, (int)CENTER.z + dz), grass, 3);
               }
            }

            Random rng = new Random(this.seed());
            BlockState log = Blocks.OAK_LOG.defaultBlockState();
            BlockState leaves = Blocks.OAK_LEAVES.defaultBlockState();
            int placed = 0;
            int attempts = 0;

            while (placed < 64 && attempts < 640) {
               attempts++;
               int x = rng.nextInt(48) - 24;
               int z = rng.nextInt(48) - 24;
               BlockPos base = new BlockPos((int)CENTER.x + x, by, (int)CENTER.z + z);
               if (lvl.getBlockState(base).isAir()) {
                  for (int h = 0; h < 5; h++) {
                     lvl.setBlock(base.above(h), log, 3);
                     this.logBlocks++;
                  }

                  BlockPos leafCentre = base.above(5);

                  for (int lx = -3; lx <= 3; lx++) {
                     for (int ly = -3; ly <= 3; ly++) {
                        for (int lz = -3; lz <= 3; lz++) {
                           int distSq = lx * lx + ly * ly + lz * lz;
                           if (distSq <= 9) {
                              BlockPos lp = leafCentre.offset(lx, ly, lz);
                              if (!lvl.getBlockState(lp).is(Blocks.OAK_LOG)) {
                                 lvl.setBlock(lp, leaves, 3);
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
      ctx.setCameraPath(new OrbitPath(CENTER.add(0.0, 8.0, 0.0), 30.0, 6.0, 0.5));
      Arena.teleport(ctx, CENTER.add(0.0, 8.0, 32.0), 180.0F, 5.0F);
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("trees_built", this.treesBuilt);
      r.extra("log_blocks", this.logBlocks);
      r.extra("leaf_blocks", this.leafBlocks);
   }
}