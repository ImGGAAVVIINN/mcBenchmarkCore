package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.camera.LinearPath;
import com.fpstest.client.bench.scene.Arena;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ChunkFlybyBenchmark implements Benchmark {
   private static final double FLY_BLOCKS_PER_TICK = 1.2;
   private static final float FLY_YAW = 270.0F;
   private static final float FLY_PITCH = 35.0F;
   private static final double FLY_ALTITUDE = 180.0;
   private static final int[][] OFFSET_CANDIDATES;
   private static final double MAX_WATER_RATIO = 0.15;
   private static final double STAMP_FALLBACK_RATIO = 0.4;
   private static final int SCAN_SAMPLES = 30;
   private static final int STAMP_HALF_WIDTH = 24;
   private static final int STAMP_MAX_BLOCKS = 50000;
   private final String id;
   private final String name;
   private final ResourceKey<Biome> targetBiome;
   private final long seed;
   private int chosenXOffset = 0;
   private int chosenZOffset = 0;
   private double chosenWaterRatio = 0.0;
   private boolean scanFallback = false;
   private boolean stampedFallback = false;
   private int stampedBlocks = 0;

   public ChunkFlybyBenchmark(String id, String name, ResourceKey<Biome> targetBiome, long seed) {
      this.id = id;
      this.name = name;
      this.targetBiome = targetBiome;
      this.seed = seed;
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
      return "Chunks";
   }

   @Override
   public long seed() {
      return this.seed;
   }

   @Override
   public String description() {
      return "Single-biome world (" + this.targetBiome.identifier() + "), fixed seed, forward flyby at 24 m/s.";
   }

   @Override
   public WorldType worldType() {
      return WorldType.fixedBiome(this.targetBiome);
   }

   @Override
   public int warmupTicks() {
      return 30;
   }

   @Override
   public int sampleTicks() {
      return 600;
   }

   @Override
   public int preloadTicks() {
      return 60;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.chosenXOffset = 0;
      this.chosenZOffset = 0;
      this.chosenWaterRatio = 0.0;
      this.scanFallback = false;
      this.stampedFallback = false;
      this.stampedBlocks = 0;
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            double bestRatio = Double.MAX_VALUE;
            int bestX = 0;
            int bestZ = 0;

            for (int[] off : OFFSET_CANDIDATES) {
               double r = this.scanWaterRatio(lvl, off[0], off[1]);
               if (r < bestRatio) {
                  bestRatio = r;
                  bestX = off[0];
                  bestZ = off[1];
               }

               if (r <= 0.15) {
                  break;
               }
            }

            this.chosenXOffset = bestX;
            this.chosenZOffset = bestZ;
            this.chosenWaterRatio = bestRatio;
            this.scanFallback = bestRatio > 0.15;
            if (bestRatio > 0.4) {
               this.stampedBlocks = this.stampStoneStrip(lvl, bestX, bestZ);
               this.stampedFallback = this.stampedBlocks > 0;
            }
         }
      });
      Vec3 start = new Vec3(this.chosenXOffset + 0.5, 180.0, this.chosenZOffset + 0.5);
      Vec3 vel = new Vec3(1.2, 0.0, 0.0);
      ctx.setCameraPath(new LinearPath(start, vel, 270.0F, 35.0F));
      ctx.setArenaOrigin(start);
      Arena.teleport(ctx, start, 270.0F, 35.0F);
   }

   private double scanWaterRatio(ServerLevel lvl, int xOff, int zOff) {
      double routeBlocks = 1.2 * this.sampleTicks();
      int water = 0;
      int total = 0;
      int[] zOffsets = new int[]{-16, 0, 16};

      for (int dz : zOffsets) {
         for (int i = 0; i < 30; i++) {
            int x = xOff + (int)(i * routeBlocks / 30.0);
            int z = zOff + dz;
            int topY = lvl.getHeight(Heightmap.Types.WORLD_SURFACE, x, z);
            BlockPos check = new BlockPos(x, topY - 1, z);
            BlockState state = lvl.getBlockState(check);
            Fluid f = state.getFluidState().getType();
            if (state.is(Blocks.WATER) || f == Fluids.FLOWING_WATER || f == Fluids.WATER) {
               water++;
            }

            total++;
         }
      }

      return (double)water / total;
   }

   private int stampStoneStrip(ServerLevel lvl, int xOff, int zOff) {
      int routeBlocks = (int)(1.2 * this.sampleTicks());
      BlockState stone = Blocks.STONE.defaultBlockState();
      int changed = 0;

      for (int dx = 0; dx <= routeBlocks; dx++) {
         int wx = xOff + dx;

         for (int dz = -24; dz <= 24; dz++) {
            int wz = zOff + dz;
            int topY = lvl.getHeight(Heightmap.Types.WORLD_SURFACE, wx, wz);
            BlockPos top = new BlockPos(wx, topY - 1, wz);
            BlockState topState = lvl.getBlockState(top);
            Fluid topF = topState.getFluidState().getType();
            if (topState.is(Blocks.WATER) || topF == Fluids.FLOWING_WATER || topF == Fluids.WATER) {
               for (int y = topY - 1; y <= 63; y++) {
                  BlockPos p = new BlockPos(wx, y, wz);
                  BlockState st = lvl.getBlockState(p);
                  if (st.is(Blocks.WATER)
                     || st.getFluidState().getType() == Fluids.FLOWING_WATER
                     || st.getFluidState().getType() == Fluids.WATER) {
                     lvl.setBlock(p, stone, 2);
                     if (++changed >= 50000) {
                        return changed;
                     }
                  }
               }
            }
         }
      }

      return changed;
   }

   @Override
   public void tick(BenchContext ctx) {
      ctx.onServer(s -> {
         if (ctx.serverPlayer() != null) {
            int t = CinematicState.pathTick;
            double x = this.chosenXOffset + 0.5 + 1.2 * t;
            double y = 180.0;
            double z = this.chosenZOffset + 0.5;
            ServerLevel lvl = (ServerLevel) ctx.serverLevel();
            if (lvl != null) {
               ctx.serverPlayer().teleportTo(lvl, x, y, z, Set.of(), 270.0F, 35.0F, true);
            }
         }
      });
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("flyby_blocks_per_tick", 1.2);
      r.extra("flyby_distance_blocks", 1.2 * this.sampleTicks());
      r.extra("biome", this.targetBiome.identifier().toString());
      r.extra("surface_water_ratio", this.chosenWaterRatio);
      r.extra("x_offset_used", this.chosenXOffset);
      r.extra("z_offset_used", this.chosenZOffset);
      r.extra("scan_fallback", this.scanFallback ? "true" : "false");
      r.extra("stamped_fallback", this.stampedFallback ? "true" : "false");
      r.extra("stamped_blocks", this.stampedBlocks);
   }

   static {
      int[] axis = new int[]{0, 512, -512, 1024, -1024, 2048, -2048};
      OFFSET_CANDIDATES = new int[axis.length * axis.length][2];
      int i = 0;

      for (int xo : axis) {
         for (int zo : axis) {
            OFFSET_CANDIDATES[i++] = new int[]{xo, zo};
         }
      }
   }
}
