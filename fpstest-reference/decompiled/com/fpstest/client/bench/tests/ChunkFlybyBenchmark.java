package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.LinearPath;
import com.fpstest.client.bench.scene.Arena;
import com.fpstest.client.control.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1959;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3611;
import net.minecraft.class_3612;
import net.minecraft.class_5321;
import net.minecraft.class_2902.class_2903;

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
   private final class_5321<class_1959> targetBiome;
   private final long seed;
   private int chosenXOffset = 0;
   private int chosenZOffset = 0;
   private double chosenWaterRatio = 0.0;
   private boolean scanFallback = false;
   private boolean stampedFallback = false;
   private int stampedBlocks = 0;

   public ChunkFlybyBenchmark(String id, String name, class_5321<class_1959> targetBiome, long seed) {
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
      return "Single-biome world (" + this.targetBiome.method_29177() + "), fixed seed, forward flyby at 24 m/s.";
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
         class_3218 lvl = ctx.serverLevel();
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
      class_243 start = new class_243(this.chosenXOffset + 0.5, 180.0, this.chosenZOffset + 0.5);
      class_243 vel = new class_243(1.2, 0.0, 0.0);
      ctx.setCameraPath(new LinearPath(start, vel, 270.0F, 35.0F));
      ctx.setArenaOrigin(start);
      Arena.teleport(ctx, start, 270.0F, 35.0F);
   }

   private double scanWaterRatio(class_3218 lvl, int xOff, int zOff) {
      double routeBlocks = 1.2 * this.sampleTicks();
      int water = 0;
      int total = 0;
      int[] zOffsets = new int[]{-16, 0, 16};

      for (int dz : zOffsets) {
         for (int i = 0; i < 30; i++) {
            int x = xOff + (int)(i * routeBlocks / 30.0);
            int z = zOff + dz;
            int topY = lvl.method_8624(class_2903.field_13202, x, z);
            class_2338 check = new class_2338(x, topY - 1, z);
            class_2680 state = lvl.method_8320(check);
            class_3611 f = state.method_26227().method_15772();
            if (state.method_27852(class_2246.field_10382) || f == class_3612.field_15910 || f == class_3612.field_15909) {
               water++;
            }

            total++;
         }
      }

      return (double)water / total;
   }

   private int stampStoneStrip(class_3218 lvl, int xOff, int zOff) {
      int routeBlocks = (int)(1.2 * this.sampleTicks());
      class_2680 stone = class_2246.field_10340.method_9564();
      int changed = 0;

      for (int dx = 0; dx <= routeBlocks; dx++) {
         int wx = xOff + dx;

         for (int dz = -24; dz <= 24; dz++) {
            int wz = zOff + dz;
            int topY = lvl.method_8624(class_2903.field_13202, wx, wz);
            class_2338 top = new class_2338(wx, topY - 1, wz);
            class_2680 topState = lvl.method_8320(top);
            class_3611 topF = topState.method_26227().method_15772();
            if (topState.method_27852(class_2246.field_10382) || topF == class_3612.field_15910 || topF == class_3612.field_15909) {
               for (int y = topY - 1; y <= 63; y++) {
                  class_2338 p = new class_2338(wx, y, wz);
                  class_2680 st = lvl.method_8320(p);
                  if (st.method_27852(class_2246.field_10382)
                     || st.method_26227().method_15772() == class_3612.field_15910
                     || st.method_26227().method_15772() == class_3612.field_15909) {
                     lvl.method_8652(p, stone, 2);
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
            class_3218 lvl = ctx.serverLevel();
            if (lvl != null) {
               ctx.serverPlayer().method_14251(lvl, x, y, z, 270.0F, 35.0F);
            }
         }
      });
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("flyby_blocks_per_tick", 1.2);
      r.extra("flyby_distance_blocks", 1.2 * this.sampleTicks());
      r.extra("biome", this.targetBiome.method_29177().toString());
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
