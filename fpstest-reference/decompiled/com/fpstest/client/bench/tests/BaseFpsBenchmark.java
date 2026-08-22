package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.CameraPath;
import com.fpstest.client.bench.camera.CompositePath;
import com.fpstest.client.bench.camera.LinearPath;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.camera.Pose;
import com.fpstest.client.bench.scene.Arena;
import com.fpstest.client.control.CinematicState;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1267;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1303;
import net.minecraft.class_1308;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1646;
import net.minecraft.class_1667;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2742;
import net.minecraft.class_2756;
import net.minecraft.class_2764;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3730;
import net.minecraft.class_3850;
import net.minecraft.class_3852;
import net.minecraft.class_3854;
import net.minecraft.class_2350.class_2351;

@Environment(EnvType.CLIENT)
public final class BaseFpsBenchmark implements Benchmark {
   private static final int GROUND_Y = 70;
   private static final int X_MIN = -16;
   private static final int X_MAX = 320;
   private static final int Z_MIN = -64;
   private static final int Z_MAX = 64;
   private static final class_2338 C_SPAWN = new class_2338(0, 70, 0);
   private static final class_2338 C_FOREST = new class_2338(30, 70, 22);
   private static final class_2338 C_BASE = new class_2338(58, 70, 2);
   private static final class_2338 C_VILLAGE = new class_2338(92, 70, -10);
   private static final class_2338 C_COMBAT = new class_2338(105, 70, -22);
   private static final class_2338 C_REDSTONE = new class_2338(118, 70, 0);
   private static final class_2338 C_CAVE = new class_2338(138, 70, 18);
   private static final class_2338 C_NETHER = new class_2338(160, 70, -8);
   private static final class_2338 C_END = new class_2338(250, 70, 18);
   private static final int FAST = 2;
   private static final int FULL = 3;
   private static final long SEED = 27182L;
   private int blocksPlaced = 0;
   private int treesBuilt = 0;
   private int villagersSpawned = 0;
   private int otherEntitiesSpawned = 0;
   private int animTick = 0;
   private List<BaseFpsBenchmark.NamedSegment> segments = List.of();
   private int[] segmentStarts = new int[0];
   private String[] segmentNames = new String[0];
   private int totalSegmentTicks = 0;
   private int lastLoggedSegment = -1;
   private static final int[][] COMBAT_TOWERS = new int[][]{{-7, -6}, {7, -6}, {-7, 6}, {7, 6}};

   @Override
   public String id() {
      return "base_fps_showcase";
   }

   @Override
   public String displayName() {
      return "Base FPS Benchmark (showcase)";
   }

   @Override
   public String category() {
      return "Showcase";
   }

   @Override
   public String description() {
      return "3-minute cinematic across a single connected ~210x90 landscape — forest / player base / village / redstone garden / cave + water / Nether alcove / End island / final flyby. Designed to estimate real-world Minecraft FPS.";
   }

   @Override
   public long seed() {
      return 27182L;
   }

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public int warmupTicks() {
      return 240;
   }

   @Override
   public int sampleTicks() {
      return 3600;
   }

   @Override
   public int cooldownTicks() {
      return 60;
   }

   @Override
   public int preloadTicks() {
      return 240;
   }

   @Override
   public boolean fixedDuration() {
      return true;
   }

   @Override
   public boolean heavy() {
      return false;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.blocksPlaced = 0;
      this.treesBuilt = 0;
      this.villagersSpawned = 0;
      this.otherEntitiesSpawned = 0;
      this.animTick = 0;
      this.lastLoggedSegment = -1;
      CameraPath path = this.buildCinematicPath();
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            lvl.method_8503().method_3776(class_1267.field_5802, true);
            lvl.method_29199(6000L);
            this.buildTerrain(lvl);
            this.buildPath(lvl);
            this.decorateGround(lvl);
            this.scatterRocksAndStumps(lvl);
            this.scatterTrees(lvl);
            this.buildSpawnPlaza(lvl);
            this.buildForestZone(lvl);
            this.buildPlayerBase(lvl);
            this.buildVillage(ctx, lvl);
            this.buildCombatArena(ctx, lvl);
            this.buildRedstoneScene(lvl);
            this.buildWaterCave(ctx, lvl);
            this.buildNetherAlcove(ctx, lvl);
            this.buildEndIsland(ctx, lvl);
            this.carveCameraCorridor(lvl, path, this.totalSegmentTicks);
            this.spawnAmbientAnimals(ctx, lvl);
         }
      });
      ctx.setArenaOrigin(new class_243(C_SPAWN.method_10263() + 0.5, 70.0, C_SPAWN.method_10260() + 0.5));
      ctx.setCameraPath(path);
      Arena.teleport(ctx, new class_243(C_SPAWN.method_10263() + 0.5, 74.0, C_SPAWN.method_10260() + 0.5), 90.0F, 10.0F);
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("blocks_placed", this.blocksPlaced);
      r.extra("trees_built", this.treesBuilt);
      r.extra("villagers_spawned", this.villagersSpawned);
      r.extra("other_entities_spawned", this.otherEntitiesSpawned);
      r.extra("terrain_area_blocks", 43473);
      StringBuilder plan = new StringBuilder();
      StringBuilder windows = new StringBuilder();

      for (int i = 0; i < this.segmentNames.length; i++) {
         if (i > 0) {
            plan.append(',');
            windows.append(',');
         }

         plan.append(this.segmentNames[i]);
         int start = this.segmentStarts[i];
         int end = i + 1 < this.segmentNames.length ? this.segmentStarts[i + 1] : this.totalSegmentTicks;
         windows.append(this.segmentNames[i]).append('=').append(start).append('-').append(end);
      }

      r.extra("segment_plan", plan.toString());
      r.extra("segment_windows", windows.toString());
      r.extra("segment_count", this.segmentNames.length);
   }

   private int surfaceY(int x, int z) {
      if (within(x, z, C_SPAWN, 11)) {
         return 70;
      } else if (within(x, z, C_BASE, 13)) {
         return 70;
      } else if (within(x, z, C_VILLAGE, 22)) {
         return 70;
      } else if (within(x, z, C_COMBAT, 12)) {
         return 70;
      } else if (within(x, z, C_REDSTONE, 9)) {
         return 70;
      } else if (within(x, z, C_NETHER, 14)) {
         return 70;
      } else {
         double h1 = Math.sin(x * 0.07) * Math.cos(z * 0.09);
         double h2 = Math.sin(x * 0.14 + z * 0.07) * 0.5;
         double v = h1 * 1.6 + h2 + 1.5;
         int hill = (int)Math.max(0L, Math.min(3L, Math.round(v)));
         int distFromW = x - -16;
         int distFromN = z - -64;
         int distFromS = 64 - z;
         int rim = Math.min(distFromW, Math.min(distFromN, distFromS));
         if (rim < 9) {
            int berm = Math.max(0, 5 - rim / 2);
            return 70 + Math.max(berm, hill);
         } else {
            return 70 + hill;
         }
      }
   }

   private static boolean within(int x, int z, class_2338 c, int r) {
      int dx = x - c.method_10263();
      int dz = z - c.method_10260();
      return dx * dx + dz * dz <= r * r;
   }

   private void buildTerrain(class_3218 lvl) {
      class_2680 dirt = class_2246.field_10566.method_9564();
      class_2680 grass = class_2246.field_10219.method_9564();

      for (int x = -16; x <= 320; x++) {
         for (int z = -64; z <= 64; z++) {
            int top = this.surfaceY(x, z);
            this.setFast(lvl, x, 68, z, dirt);
            this.setFast(lvl, x, 69, z, dirt);

            for (int y = 70; y < top; y++) {
               this.setFast(lvl, x, y, z, dirt);
            }

            this.setFast(lvl, x, top, z, grass);
         }
      }
   }

   private void buildPath(class_3218 lvl) {
      class_2680 path = class_2246.field_10194.method_9564();
      class_2680 cobble = class_2246.field_10445.method_9564();
      List<class_2338> wp = List.of(C_SPAWN, C_FOREST, C_BASE, C_VILLAGE, C_COMBAT, C_REDSTONE, C_CAVE, C_NETHER, C_END);

      for (int i = 0; i < wp.size() - 1; i++) {
         this.drawPath(lvl, wp.get(i), wp.get(i + 1), path, cobble);
      }
   }

   private void drawPath(class_3218 lvl, class_2338 a, class_2338 b, class_2680 path, class_2680 edge) {
      int x1 = a.method_10263();
      int z1 = a.method_10260();
      int x2 = b.method_10263();
      int z2 = b.method_10260();
      double dx = x2 - x1;
      double dz = z2 - z1;
      double len = Math.max(1.0, Math.hypot(dx, dz));
      int steps = (int)(len * 1.1) + 2;
      double pdx = -dz / len;
      double pdz = dx / len;

      for (int i = 0; i <= steps; i++) {
         double t = (double)i / steps;
         double envelope = 4.0 * t * (1.0 - t);
         double jitter = envelope * (Math.sin(t * Math.PI * 2.5) * 1.4 + Math.sin(t * Math.PI * 5.7) * 0.6);
         int cx = (int)Math.round(x1 + dx * t + pdx * jitter);
         int cz = (int)Math.round(z1 + dz * t + pdz * jitter);
         boolean widen = i % 14 == 0;
         int rad2 = widen ? 8 : 5;
         int rim2 = widen ? 8 : 4;

         for (int ddx = -3; ddx <= 3; ddx++) {
            for (int ddz = -3; ddz <= 3; ddz++) {
               int d2 = ddx * ddx + ddz * ddz;
               if (d2 <= rad2) {
                  int x = cx + ddx;
                  int z = cz + ddz;
                  if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
                     int y = this.surfaceY(x, z);
                     boolean isRim = d2 >= rim2;
                     this.setFast(lvl, x, y, z, isRim ? edge : path);
                  }
               }
            }
         }
      }
   }

   private void decorateGround(class_3218 lvl) {
      Random rng = new Random(47598L);
      class_2680[] flowers = new class_2680[]{
         class_2246.field_10449.method_9564(),
         class_2246.field_10182.method_9564(),
         class_2246.field_9995.method_9564(),
         class_2246.field_10554.method_9564(),
         class_2246.field_10573.method_9564(),
         class_2246.field_10226.method_9564(),
         class_2246.field_10086.method_9564()
      };
      class_2680 shortGrass = class_2246.field_10479.method_9564();
      class_2680 fern = class_2246.field_10112.method_9564();
      class_2680 bush = class_2246.field_16999.method_9564();
      class_2680 mossCarpet = class_2246.field_28680.method_9564();
      class_2680 redMush = class_2246.field_10559.method_9564();
      class_2680 brownMush = class_2246.field_10251.method_9564();

      for (int x = -15; x < 320; x++) {
         for (int z = -63; z < 64; z++) {
            int y = this.surfaceY(x, z);
            if (!within(x, z, C_SPAWN, 8)
               && !within(x, z, C_BASE, 9)
               && !within(x, z, C_VILLAGE, 16)
               && !within(x, z, C_COMBAT, 11)
               && !within(x, z, C_REDSTONE, 7)
               && !within(x, z, C_NETHER, 13)
               && !within(x, z, C_END, 17)
               && !within(x, z, C_CAVE, 9)) {
               class_2338 here = new class_2338(x, y, z);
               class_2680 below = lvl.method_8320(here);
               if (!below.method_27852(class_2246.field_10194) && !below.method_27852(class_2246.field_10445) && below.method_27852(class_2246.field_10219)) {
                  double density = 1.0;
                  if (within(x, z, C_FOREST, 18)) {
                     density = 1.55;
                  }

                  int distFromW = x - -16;
                  int distFromN = z - -64;
                  int distFromS = 64 - z;
                  int rim = Math.min(distFromW, Math.min(distFromN, distFromS));
                  if (rim < 9) {
                     density *= 1.4;
                  }

                  if (this.isNearPath(lvl, x, z, 3)) {
                     density *= 0.3;
                  }

                  double r = rng.nextDouble();
                  class_2680 plant = null;
                  if (r < 0.42 * density) {
                     plant = shortGrass;
                  } else if (r < 0.55 * density) {
                     plant = fern;
                  } else if (r < 0.66 * density) {
                     plant = flowers[rng.nextInt(flowers.length)];
                  } else if (r < 0.69 * density) {
                     plant = bush;
                  } else if (r < 0.71 * density) {
                     plant = mossCarpet;
                  } else if (r < 0.715 * density) {
                     plant = redMush;
                  } else if (r < 0.72 * density) {
                     plant = brownMush;
                  }

                  if (plant != null) {
                     this.setFast(lvl, x, y + 1, z, plant);
                  }
               }
            }
         }
      }
   }

   private boolean isNearPath(class_3218 lvl, int x, int z, int radius) {
      int r = Math.min(2, radius);

      for (int dx = -r; dx <= r; dx++) {
         for (int dz = -r; dz <= r; dz++) {
            int xx = x + dx;
            int zz = z + dz;
            if (xx >= -16 && xx <= 320 && zz >= -64 && zz <= 64) {
               class_2680 s = lvl.method_8320(new class_2338(xx, this.surfaceY(xx, zz), zz));
               if (s.method_27852(class_2246.field_10194) || s.method_27852(class_2246.field_10445)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private void scatterRocksAndStumps(class_3218 lvl) {
      Random rng = new Random(6882L);
      class_2680 mossy = class_2246.field_9989.method_9564();
      class_2680 cobble = class_2246.field_10445.method_9564();

      for (int i = 0; i < 32; i++) {
         int x = -12 + rng.nextInt(329);
         int z = -60 + rng.nextInt(121);
         if (!within(x, z, C_SPAWN, 10)
            && !within(x, z, C_BASE, 11)
            && !within(x, z, C_VILLAGE, 18)
            && !within(x, z, C_COMBAT, 13)
            && !within(x, z, C_CAVE, 13)
            && !within(x, z, C_REDSTONE, 9)
            && !within(x, z, C_NETHER, 14)
            && !within(x, z, C_END, 14)) {
            int y = this.surfaceY(x, z);
            this.setFast(lvl, x, y + 1, z, mossy);
            if (rng.nextBoolean()) {
               this.setFast(lvl, x + 1, y + 1, z, cobble);
            }

            if (rng.nextBoolean()) {
               this.setFast(lvl, x, y + 1, z + 1, cobble);
            }

            if (rng.nextDouble() < 0.4) {
               this.setFast(lvl, x, y + 2, z, mossy);
            }
         }
      }

      class_2680 log = class_2246.field_10431.method_9564();
      class_2680 slab = class_2246.field_10119.method_9564();

      for (int ix = 0; ix < 14; ix++) {
         int x = -12 + rng.nextInt(329);
         int z = -60 + rng.nextInt(121);
         if (!within(x, z, C_SPAWN, 10)
            && !within(x, z, C_BASE, 12)
            && !within(x, z, C_VILLAGE, 18)
            && !within(x, z, C_COMBAT, 13)
            && !within(x, z, C_REDSTONE, 9)
            && !within(x, z, C_CAVE, 13)
            && !within(x, z, C_NETHER, 14)
            && !within(x, z, C_END, 14)) {
            int yx = this.surfaceY(x, z);
            this.setFast(lvl, x, yx + 1, z, log);
            this.setFast(lvl, x, yx + 2, z, slab);
         }
      }
   }

   private void scatterTrees(class_3218 lvl) {
      Random rng = new Random(5233L);

      for (int attempt = 0; attempt < 240 && this.treesBuilt < 55; attempt++) {
         int dx = rng.nextInt(34) - 17;
         int dz = rng.nextInt(30) - 15;
         int x = C_FOREST.method_10263() + dx;
         int z = C_FOREST.method_10260() + dz;
         if (Math.abs(dx) + Math.abs(dz) >= 3 && !lvl.method_8320(new class_2338(x, this.surfaceY(x, z), z)).method_27852(class_2246.field_10194)) {
            this.placeTree(lvl, x, z, rng, 0);
         }
      }

      int rimTreeTarget = this.treesBuilt + 90;

      for (int attemptx = 0; attemptx < 600 && this.treesBuilt < rimTreeTarget; attemptx++) {
         int side = rng.nextInt(3);
         int x;
         int z;
         switch (side) {
            case 0:
               x = -15 + rng.nextInt(8);
               z = -63 + rng.nextInt(126);
               break;
            case 1:
               x = -15 + rng.nextInt(334);
               z = -63 + rng.nextInt(8);
               break;
            default:
               x = -15 + rng.nextInt(334);
               z = 63 - rng.nextInt(8);
         }

         if (!within(x, z, C_END, 17) && !lvl.method_8320(new class_2338(x, this.surfaceY(x, z), z)).method_27852(class_2246.field_10194)) {
            int variant = rng.nextInt(3);
            this.placeTree(lvl, x, z, rng, variant);
         }
      }

      for (int i = 0; i < 32; i++) {
         int x = -12 + rng.nextInt(329);
         int z = -60 + rng.nextInt(121);
         if (!within(x, z, C_SPAWN, 9)
            && !within(x, z, C_BASE, 10)
            && !within(x, z, C_VILLAGE, 17)
            && !within(x, z, C_COMBAT, 13)
            && !within(x, z, C_REDSTONE, 8)
            && !within(x, z, C_NETHER, 14)
            && !within(x, z, C_END, 17)
            && !within(x, z, C_CAVE, 12)) {
            int variant = rng.nextInt(3);
            if (!lvl.method_8320(new class_2338(x, this.surfaceY(x, z), z)).method_27852(class_2246.field_10194)) {
               this.placeTree(lvl, x, z, rng, variant);
            }
         }
      }
   }

   private void placeTree(class_3218 lvl, int x, int z, Random rng, int variant) {
      int baseY = this.surfaceY(x, z) + 1;
      class_2680 log;
      class_2680 leaves;
      int trunkH;
      switch (variant) {
         case 1:
            log = class_2246.field_10511.method_9564();
            leaves = class_2246.field_10539.method_9564();
            trunkH = 5 + rng.nextInt(2);
            break;
         case 2:
            log = class_2246.field_10010.method_9564();
            leaves = class_2246.field_10035.method_9564();
            trunkH = 6 + rng.nextInt(2);
            break;
         default:
            log = class_2246.field_10431.method_9564();
            leaves = class_2246.field_10503.method_9564();
            trunkH = 4 + rng.nextInt(3);
      }

      for (int h = 0; h < trunkH; h++) {
         this.setFast(lvl, x, baseY + h, z, log);
      }

      int top = baseY + trunkH;
      int rad = variant == 2 ? 3 : 2;

      for (int lx = -rad; lx <= rad; lx++) {
         for (int ly = -1; ly <= 2; ly++) {
            for (int lz = -rad; lz <= rad; lz++) {
               int d2 = lx * lx + ly * ly + lz * lz;
               if (d2 <= rad * rad + 2) {
                  class_2338 lp = new class_2338(x + lx, top + ly, z + lz);
                  if (!lvl.method_8320(lp).method_27852(log.method_26204()) && lvl.method_8320(lp).method_26215()) {
                     lvl.method_8652(lp, leaves, 2);
                     this.blocksPlaced++;
                  }
               }
            }
         }
      }

      this.treesBuilt++;
   }

   private void buildSpawnPlaza(class_3218 lvl) {
      int cx = C_SPAWN.method_10263();
      int cz = C_SPAWN.method_10260();
      class_2680 bricks = class_2246.field_10056.method_9564();
      class_2680 chiseled = class_2246.field_10552.method_9564();

      for (int dx = -7; dx <= 7; dx++) {
         for (int dz = -7; dz <= 7; dz++) {
            if (dx * dx + dz * dz <= 56) {
               this.set(lvl, cx + dx, 70, cz + dz, (dx + dz & 1) == 0 ? bricks : chiseled);
            }
         }
      }

      for (int[] p : new int[][]{{-5, -5}, {5, -5}, {-5, 5}, {5, 5}}) {
         for (int dy = 1; dy <= 3; dy++) {
            this.set(lvl, cx + p[0], 70 + dy, cz + p[1], class_2246.field_23865.method_9564());
         }

         this.set(lvl, cx + p[0], 74, cz + p[1], (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true));
      }

      this.set(lvl, cx, 71, cz, class_2246.field_10085.method_9564());
      this.set(lvl, cx, 72, cz, class_2246.field_10201.method_9564());
      this.set(lvl, cx, 73, cz, class_2246.field_10174.method_9564());
      this.set(lvl, cx - 6, 71, cz, class_2246.field_17350.method_9564());
      this.set(lvl, cx + 6, 71, cz, class_2246.field_17350.method_9564());
   }

   private void buildForestZone(class_3218 lvl) {
      int cx = C_FOREST.method_10263();
      int cz = C_FOREST.method_10260();

      for (int dx = -3; dx <= 3; dx++) {
         for (int dz = -3; dz <= 3; dz++) {
            if (dx * dx + dz * dz <= 9) {
               int px = cx + 10 + dx;
               int pz = cz + 4 + dz;
               int y = this.surfaceY(px, pz);
               this.setFast(lvl, px, y, pz, class_2246.field_10382.method_9564());
               this.setFast(lvl, px, y - 1, pz, class_2246.field_10340.method_9564());
            }
         }
      }

      Random rng = new Random(39440L);

      for (int i = 0; i < 20; i++) {
         int x = cx + 4 + rng.nextInt(14);
         int z = cz - 6 + rng.nextInt(20);
         int y = this.surfaceY(x, z);
         if (lvl.method_8320(new class_2338(x, y, z)).method_27852(class_2246.field_10219)) {
            this.setFast(lvl, x, y + 1, z, rng.nextBoolean() ? class_2246.field_10313.method_9564() : class_2246.field_28673.method_9564());
         }
      }
   }

   private void buildPlayerBase(class_3218 lvl) {
      int cx = C_BASE.method_10263();
      int cz = C_BASE.method_10260();
      class_2680 planks = class_2246.field_10161.method_9564();
      class_2680 log = class_2246.field_10431.method_9564();
      class_2680 glass = class_2246.field_10033.method_9564();
      class_2680 cobble = class_2246.field_10445.method_9564();

      for (int dx = -7; dx <= 7; dx++) {
         for (int dz = -6; dz <= 6; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, cobble);
         }
      }

      int hxMin = cx - 5;
      int hxMax = cx + 5;
      int hzMin = cz - 3;
      int hzMax = cz + 3;

      for (int x = hxMin; x <= hxMax; x++) {
         for (int dy = 1; dy <= 4; dy++) {
            class_2680 s = dy != 1 && dy != 4 && x != hxMin && x != hxMax ? planks : log;
            this.set(lvl, x, 70 + dy, hzMin, s);
            this.set(lvl, x, 70 + dy, hzMax, s);
         }
      }

      for (int z = hzMin; z <= hzMax; z++) {
         for (int dy = 1; dy <= 4; dy++) {
            class_2680 s = dy != 1 && dy != 4 && z != hzMin && z != hzMax ? planks : log;
            boolean window = (dy == 2 || dy == 3) && (z == cz - 1 || z == cz + 1);
            this.set(lvl, hxMin, 70 + dy, z, window ? glass : s);
            this.set(lvl, hxMax, 70 + dy, z, window ? glass : s);
         }
      }

      class_2680 stairsN = (class_2680)class_2246.field_10563.method_9564().method_11657(class_2741.field_12481, class_2350.field_11043);
      class_2680 stairsS = (class_2680)class_2246.field_10563.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035);

      for (int x = hxMin; x <= hxMax; x++) {
         this.set(lvl, x, 75, hzMin, stairsS);
         this.set(lvl, x, 75, hzMax, stairsN);

         for (int dz = hzMin + 1; dz <= hzMax - 1; dz++) {
            this.set(lvl, x, 75, dz, planks);
         }

         this.set(lvl, x, 76, hzMin + 1, stairsS);
         this.set(lvl, x, 76, hzMax - 1, stairsN);

         for (int dz = hzMin + 2; dz <= hzMax - 2; dz++) {
            this.set(lvl, x, 76, dz, planks);
         }

         this.set(lvl, x, 77, cz, (class_2680)class_2246.field_10431.method_9564().method_11657(class_2741.field_12496, class_2351.field_11048));
      }

      int chimneyX = hxMin + 1;
      int chimneyZ = hzMax;

      for (int dy = 5; dy <= 8; dy++) {
         this.set(lvl, chimneyX, 70 + dy, chimneyZ, class_2246.field_10445.method_9564());
      }

      this.set(lvl, chimneyX, 79, chimneyZ, class_2246.field_17350.method_9564());
      this.set(
         lvl,
         cx,
         71,
         hzMin,
         (class_2680)((class_2680)class_2246.field_10149.method_9564().method_11657(class_2741.field_12533, class_2756.field_12607))
            .method_11657(class_2741.field_12481, class_2350.field_11043)
      );
      this.set(
         lvl,
         cx,
         72,
         hzMin,
         (class_2680)((class_2680)class_2246.field_10149.method_9564().method_11657(class_2741.field_12533, class_2756.field_12609))
            .method_11657(class_2741.field_12481, class_2350.field_11043)
      );
      this.set(lvl, hxMin + 1, 71, hzMin + 1, class_2246.field_10034.method_9564());
      this.set(lvl, hxMin + 1, 71, hzMin + 2, class_2246.field_10034.method_9564());
      this.set(lvl, hxMin + 1, 71, hzMin + 3, class_2246.field_16328.method_9564());
      this.set(lvl, hxMax - 1, 71, hzMin + 1, class_2246.field_10181.method_9564());
      this.set(lvl, hxMax - 1, 71, hzMin + 2, class_2246.field_16334.method_9564());
      this.set(lvl, hxMax - 1, 71, hzMin + 3, class_2246.field_16333.method_9564());
      this.set(lvl, hxMax - 1, 71, hzMin + 5, class_2246.field_10485.method_9564());
      this.set(lvl, hxMin + 1, 71, hzMin + 5, class_2246.field_9980.method_9564());
      this.set(lvl, cx, 71, cz + 2, class_2246.field_10535.method_9564());
      this.set(lvl, cx - 2, 74, cz, (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true));
      this.set(lvl, cx + 2, 74, cz, (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true));

      for (int dx = -7; dx <= 7; dx++) {
         this.set(lvl, cx + dx, 71, cz - 6, class_2246.field_10620.method_9564());
         this.set(lvl, cx + dx, 71, cz + 6, class_2246.field_10620.method_9564());
      }

      for (int dz = -6; dz <= 6; dz++) {
         this.set(lvl, cx - 7, 71, cz + dz, class_2246.field_10620.method_9564());
         this.set(lvl, cx + 7, 71, cz + dz, class_2246.field_10620.method_9564());
      }

      this.set(lvl, cx, 71, cz + 6, (class_2680)class_2246.field_10188.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035));

      for (int dx = -3; dx <= 0; dx++) {
         for (int dz = 4; dz <= 5; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, (class_2680)class_2246.field_10362.method_9564().method_11657(class_2741.field_12510, 7));
            this.set(lvl, cx + dx, 71, cz + dz, (class_2680)class_2246.field_10293.method_9564().method_11657(class_2741.field_12550, 7));
         }
      }

      this.set(lvl, cx + 1, 70, cz + 5, class_2246.field_10382.method_9564());
      this.set(lvl, cx + 2, 71, cz - 5, class_2246.field_17350.method_9564());
      this.set(lvl, cx - 2, 71, cz - 5, class_2246.field_10359.method_9564());
      this.set(lvl, cx + 3, 71, cz + 4, class_2246.field_10620.method_9564());
      this.set(lvl, cx + 3, 72, cz + 4, class_2246.field_10359.method_9564());
      this.set(lvl, cx + 3, 73, cz + 4, (class_2680)class_2246.field_10009.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035));

      for (int[] p : new int[][]{{-7, -3}, {-7, 3}, {7, -3}, {7, 3}}) {
         this.set(lvl, cx + p[0], 72, cz + p[1], class_2246.field_16541.method_9564());
      }
   }

   private void buildVillage(BenchContext ctx, class_3218 lvl) {
      int cx = C_VILLAGE.method_10263();
      int cz = C_VILLAGE.method_10260();
      class_2680 cobble = class_2246.field_10445.method_9564();
      class_2680 mossy = class_2246.field_9989.method_9564();

      for (int dx = -4; dx <= 4; dx++) {
         for (int dz = -4; dz <= 4; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, (dx + dz & 1) == 0 ? cobble : mossy);
         }
      }

      this.set(lvl, cx, 71, cz, class_2246.field_23873.method_9564());
      this.set(lvl, cx, 72, cz, class_2246.field_23865.method_9564());
      this.set(lvl, cx, 73, cz, class_2246.field_16332.method_9564());
      int[][] homes = new int[][]{{-10, -7}, {10, -7}, {-10, 7}, {10, 7}, {0, 11}};

      for (int i = 0; i < homes.length; i++) {
         this.buildSmallHouse(lvl, cx + homes[i][0], cz + homes[i][1], i);
      }

      for (int dx = -3; dx <= 4; dx++) {
         for (int dz = -10; dz <= -7; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, (class_2680)class_2246.field_10362.method_9564().method_11657(class_2741.field_12510, 7));
            this.set(lvl, cx + dx, 71, cz + dz, (class_2680)class_2246.field_10293.method_9564().method_11657(class_2741.field_12550, 5 + (dx + dz) % 3));
         }
      }

      this.set(lvl, cx - 4, 71, cz - 8, class_2246.field_17563.method_9564());
      this.set(lvl, cx + 5, 71, cz - 8, class_2246.field_17563.method_9564());
      this.set(lvl, cx - 3, 71, cz + 4, class_2246.field_16328.method_9564());
      this.set(lvl, cx - 2, 71, cz + 4, class_2246.field_10359.method_9564());
      this.set(lvl, cx - 2, 72, cz + 4, class_2246.field_10359.method_9564());
      this.set(lvl, cx + 2, 71, cz + 4, class_2246.field_16328.method_9564());
      this.set(lvl, cx + 3, 71, cz + 4, class_2246.field_10359.method_9564());

      for (int[] p : new int[][]{{-12, 0}, {12, 0}, {0, -12}, {0, 12}}) {
         this.set(lvl, cx + p[0], 71, cz + p[1], class_2246.field_10620.method_9564());
         this.set(lvl, cx + p[0], 72, cz + p[1], class_2246.field_10620.method_9564());
         this.set(lvl, cx + p[0], 73, cz + p[1], (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true));
      }

      class_3852[] profs = new class_3852[]{
         class_3852.field_17056,
         class_3852.field_17060,
         class_3852.field_17054,
         class_3852.field_17058,
         class_3852.field_17052,
         class_3852.field_17065,
         class_3852.field_17064,
         class_3852.field_17059,
         class_3852.field_17061,
         class_3852.field_17062,
         class_3852.field_17053,
         class_3852.field_17055
      };
      Random rng = new Random(2863L);

      for (int i = 0; i < 36; i++) {
         class_1646 v = new class_1646(class_1299.field_6077, lvl, class_3854.field_17073);
         double dx = (rng.nextDouble() - 0.5) * 22.0;
         double dz = (rng.nextDouble() - 0.5) * 22.0;
         v.method_5808(cx + dx, 71.0, cz + dz, rng.nextFloat() * 360.0F, 0.0F);
         v.method_7195(new class_3850(class_3854.field_17073, profs[i % profs.length], 1));
         v.method_5977(false);
         v.method_5971();
         v.method_5684(true);
         ctx.spawnTracked(v, lvl);
         this.villagersSpawned++;
      }
   }

   private void buildSmallHouse(class_3218 lvl, int cx, int cz, int variant) {
      class_2680 planks = class_2246.field_10161.method_9564();
      class_2680 log = class_2246.field_10431.method_9564();
      class_2680 glass = class_2246.field_10033.method_9564();
      class_2680 slab = class_2246.field_10119.method_9564();
      int xMin = cx - 3;
      int xMax = cx + 3;
      int zMin = cz - 2;
      int zMax = cz + 2;

      for (int x = xMin; x <= xMax; x++) {
         for (int dy = 1; dy <= 3; dy++) {
            class_2680 s = dy != 1 && dy != 3 && x != xMin && x != xMax ? planks : log;
            this.set(lvl, x, 70 + dy, zMin, s);
            this.set(lvl, x, 70 + dy, zMax, s);
         }
      }

      for (int z = zMin; z <= zMax; z++) {
         for (int dy = 1; dy <= 3; dy++) {
            class_2680 s = dy != 1 && dy != 3 && z != zMin && z != zMax ? planks : log;
            boolean window = dy == 2 && z == cz;
            this.set(lvl, xMin, 70 + dy, z, window ? glass : s);
            this.set(lvl, xMax, 70 + dy, z, window ? glass : s);
         }
      }

      for (int x = xMin; x <= xMax; x++) {
         for (int z = zMin; z <= zMax; z++) {
            this.set(lvl, x, 74, z, slab);
         }
      }

      class_2350 door = cz <= -2 ? class_2350.field_11035 : (cz >= 2 ? class_2350.field_11043 : (cx <= -2 ? class_2350.field_11034 : class_2350.field_11039));
      int dxDoor = door != class_2350.field_11043 && door != class_2350.field_11035 ? (door == class_2350.field_11034 ? -3 : 3) : 0;
      int dzDoor = door == class_2350.field_11043 ? 2 : (door == class_2350.field_11035 ? -2 : 0);
      this.set(
         lvl,
         cx + dxDoor,
         71,
         cz + dzDoor,
         (class_2680)((class_2680)class_2246.field_10149.method_9564().method_11657(class_2741.field_12533, class_2756.field_12607))
            .method_11657(class_2741.field_12481, door)
      );
      this.set(
         lvl,
         cx + dxDoor,
         72,
         cz + dzDoor,
         (class_2680)((class_2680)class_2246.field_10149.method_9564().method_11657(class_2741.field_12533, class_2756.field_12609))
            .method_11657(class_2741.field_12481, door)
      );
      class_2680 bedFoot = (class_2680)((class_2680)class_2246.field_10069.method_9564().method_11657(class_2741.field_12481, class_2350.field_11034))
         .method_11657(class_2741.field_12483, class_2742.field_12557);
      class_2680 bedHead = (class_2680)((class_2680)class_2246.field_10069.method_9564().method_11657(class_2741.field_12481, class_2350.field_11034))
         .method_11657(class_2741.field_12483, class_2742.field_12560);
      this.set(lvl, xMin + 1, 71, zMin + 1, bedFoot);
      this.set(lvl, xMin + 2, 71, zMin + 1, bedHead);

      class_2680 ws = switch (variant) {
         case 0 -> class_2246.field_16330.method_9564();
         case 1 -> class_2246.field_16336.method_9564();
         case 2 -> class_2246.field_16331.method_9564();
         case 3 -> class_2246.field_16329.method_9564();
         default -> class_2246.field_16337.method_9564();
      };
      this.set(lvl, xMax - 1, 71, zMax - 1, ws);
      this.set(lvl, cx, 73, cz, (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true));
   }

   private void buildCombatArena(BenchContext ctx, class_3218 lvl) {
      int cx = C_COMBAT.method_10263();
      int cz = C_COMBAT.method_10260();
      class_2680 cobble = class_2246.field_10445.method_9564();
      class_2680 mossy = class_2246.field_9989.method_9564();
      class_2680 bricks = class_2246.field_10056.method_9564();
      class_2680 chiseled = class_2246.field_10552.method_9564();
      class_2680 wall = class_2246.field_10625.method_9564();

      for (int dx = -9; dx <= 9; dx++) {
         for (int dz = -8; dz <= 8; dz++) {
            this.setFast(lvl, cx + dx, 70, cz + dz, (dx + dz & 1) == 0 ? cobble : mossy);
         }
      }

      for (int dx = -9; dx <= 9; dx++) {
         this.set(lvl, cx + dx, 71, cz - 8, wall);
         this.set(lvl, cx + dx, 71, cz + 8, wall);
      }

      for (int dz = -8; dz <= 8; dz++) {
         this.set(lvl, cx - 9, 71, cz + dz, wall);
         this.set(lvl, cx + 9, 71, cz + dz, wall);
      }

      this.set(lvl, cx - 9, 71, cz, class_2246.field_10124.method_9564());
      this.set(lvl, cx - 9, 71, cz + 1, class_2246.field_10124.method_9564());

      for (int[] t : COMBAT_TOWERS) {
         int tx = cx + t[0];
         int tz = cz + t[1];

         for (int dy = 1; dy <= 4; dy++) {
            this.setFast(lvl, tx, 70 + dy, tz, dy == 4 ? chiseled : bricks);
         }

         int ddx = -t[0];
         int ddz = -t[1];
         class_2350 face;
         if (Math.abs(ddx) >= Math.abs(ddz)) {
            face = ddx > 0 ? class_2350.field_11034 : class_2350.field_11039;
         } else {
            face = ddz > 0 ? class_2350.field_11035 : class_2350.field_11043;
         }

         this.set(lvl, tx, 75, tz, (class_2680)class_2246.field_10200.method_9564().method_11657(class_2741.field_12525, face));
         this.set(lvl, tx, 76, tz, class_2246.field_10620.method_9564());
         this.set(lvl, tx, 77, tz, (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true));
      }

      this.setFast(lvl, cx, 71, cz, class_2246.field_10359.method_9564());
      this.setFast(lvl, cx, 72, cz, class_2246.field_10359.method_9564());
      this.setFast(lvl, cx, 73, cz, (class_2680)class_2246.field_10147.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035));
      this.setFast(lvl, cx - 1, 72, cz, class_2246.field_10359.method_9564());
      this.setFast(lvl, cx + 1, 72, cz, class_2246.field_10359.method_9564());
      this.setFast(lvl, cx - 3, 71, cz, chiseled);
      this.setFast(lvl, cx - 3, 72, cz, chiseled);
      this.setFast(lvl, cx + 3, 71, cz, chiseled);
      this.setFast(lvl, cx + 3, 72, cz, chiseled);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6051, cx - 5, cz - 4, false);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6051, cx + 5, cz + 4, false);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6137, cx - 2, cz - 6, false);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6137, cx + 2, cz + 6, false);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6105, cx - 6, cz + 2, false);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6105, cx + 6, cz - 2, false);
   }

   private void buildRedstoneScene(class_3218 lvl) {
      int cx = C_REDSTONE.method_10263();
      int cz = C_REDSTONE.method_10260();
      class_2680 quartz = class_2246.field_10153.method_9564();
      class_2680 floor = class_2246.field_23873.method_9564();

      for (int dx = -4; dx <= 4; dx++) {
         for (int dz = -4; dz <= 4; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, floor);
         }
      }

      this.set(lvl, cx, 71, cz - 2, quartz);
      this.set(lvl, cx, 71, cz - 3, (class_2680)class_2246.field_10282.method_9564().method_11657(class_2741.field_12525, class_2350.field_11043));
      this.set(lvl, cx, 71, cz - 1, (class_2680)class_2246.field_10282.method_9564().method_11657(class_2741.field_12525, class_2350.field_11035));

      for (int dx = 2; dx <= 4; dx++) {
         for (int dy = 1; dy <= 3; dy++) {
            this.set(lvl, cx + dx, 70 + dy, cz, (class_2680)class_2246.field_10524.method_9564().method_11657(class_2741.field_12548, false));
         }
      }

      for (int dy = 0; dy <= 4; dy++) {
         this.set(lvl, cx + 5, 70 + dy, cz - 1, (class_2680)class_2246.field_10437.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052));
         this.set(lvl, cx + 5, 70 + dy, cz + 1, (class_2680)class_2246.field_10437.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052));
      }

      for (int dy = 1; dy <= 3; dy++) {
         this.set(lvl, cx + 5, 70 + dy, cz, class_2246.field_10576.method_9564());
      }

      this.set(lvl, cx + 5, 74, cz, class_2246.field_10044.method_9564());
      this.set(
         lvl,
         cx - 2,
         71,
         cz + 2,
         (class_2680)((class_2680)class_2246.field_10615.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036))
            .method_11657(class_2741.field_12552, false)
      );
      this.set(lvl, cx - 2, 72, cz + 2, class_2246.field_10085.method_9564());
      this.set(lvl, cx - 2, 73, cz + 2, class_2246.field_10124.method_9564());
      this.set(lvl, cx - 3, 71, cz + 2, class_2246.field_10058.method_9564());
      this.set(lvl, cx + 1, 71, cz + 2, (class_2680)class_2246.field_10450.method_9564().method_11657(class_2741.field_12481, class_2350.field_11039));

      for (int dz = 3; dz <= 4; dz++) {
         this.set(lvl, cx + 1, 71, cz + dz, class_2246.field_10091.method_9564());
      }

      for (int[] p : new int[][]{{-4, -4}, {4, -4}, {-4, 4}, {4, 4}}) {
         this.set(lvl, cx + p[0], 71, cz + p[1], (class_2680)class_2246.field_10455.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036));
      }
   }

   @Override
   public void tick(BenchContext ctx) {
      this.animTick++;
      int segIdx = this.segmentIndexAtTick(this.animTick);
      if (segIdx >= 0 && segIdx != this.lastLoggedSegment) {
         this.lastLoggedSegment = segIdx;
         FpsTestClient.LOG.info("[BaseFps] segment={} start tick={}", this.segmentNames[segIdx], this.animTick);
      }

      CinematicState.active = true;
      CinematicState.hidePlayer = true;
      Pose camPose = CinematicState.currentPose(0.0F);
      ctx.onServer(
         server -> {
            class_3218 lvl = ctx.serverLevel();
            class_3222 p = ctx.serverPlayer();
            if (lvl != null && p != null) {
               if (camPose != null) {
                  p.method_14251(lvl, camPose.pos().field_1352, camPose.pos().field_1351, camPose.pos().field_1350, camPose.yaw(), camPose.pitch());
                  p.method_24830(false);
                  p.method_5684(true);
                  p.method_5648(true);
                  p.method_5875(true);
                  p.field_5960 = true;
               }

               int cx = C_REDSTONE.method_10263();
               int cz = C_REDSTONE.method_10260();
               this.tickCombatArena(lvl);
               this.tickZoneParticles(lvl);
               if (this.animTick % 40 == 0) {
                  class_238 hugeBox = new class_238(-1024.0, -64.0, -1024.0, 1024.0, 320.0, 1024.0);

                  for (class_1542 it : lvl.method_8390(class_1542.class, hugeBox, e -> true)) {
                     it.method_31472();
                  }

                  for (class_1303 orb : lvl.method_8390(class_1303.class, hugeBox, e -> true)) {
                     orb.method_31472();
                  }
               }

               if (this.animTick % 10 == 0) {
                  int phase = this.animTick / 10 % 3;

                  for (int col = 0; col < 3; col++) {
                     boolean lit = col == phase;
                     class_2680 lamp = (class_2680)class_2246.field_10524.method_9564().method_11657(class_2741.field_12548, lit);

                     for (int dy = 1; dy <= 3; dy++) {
                        lvl.method_8652(new class_2338(cx + 2 + col, 70 + dy, cz), lamp, 2);
                     }
                  }
               }

               if (this.animTick % 20 == 0) {
                  int x = cx - 2;
                  int z = cz + 2;
                  boolean extended = this.animTick / 20 % 2 == 1;
                  if (extended) {
                     lvl.method_8652(
                        new class_2338(x, 71, z),
                        (class_2680)((class_2680)class_2246.field_10615.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036))
                           .method_11657(class_2741.field_12552, true),
                        2
                     );
                     lvl.method_8652(
                        new class_2338(x, 72, z),
                        (class_2680)((class_2680)class_2246.field_10379.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036))
                           .method_11657(class_2741.field_12492, class_2764.field_12634),
                        2
                     );
                     lvl.method_8652(new class_2338(x, 73, z), class_2246.field_10085.method_9564(), 2);
                  } else {
                     lvl.method_8652(
                        new class_2338(x, 71, z),
                        (class_2680)((class_2680)class_2246.field_10615.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036))
                           .method_11657(class_2741.field_12552, false),
                        2
                     );
                     lvl.method_8652(new class_2338(x, 72, z), class_2246.field_10085.method_9564(), 2);
                     lvl.method_8652(new class_2338(x, 73, z), class_2246.field_10124.method_9564(), 2);
                  }
               }
            }
         }
      );
   }

   private void tickCombatArena(class_3218 lvl) {
      int cx = C_COMBAT.method_10263();
      int cz = C_COMBAT.method_10260();
      if (this.animTick >= 1380 && this.animTick <= 1810) {
         double dummyX = cx + 0.5;
         double dummyY = 72.5;
         double dummyZ = cz + 0.5;
         double[][] spawn = new double[COMBAT_TOWERS.length][3];

         for (int i = 0; i < COMBAT_TOWERS.length; i++) {
            int[] t = COMBAT_TOWERS[i];
            double sx0 = cx + t[0] + 0.5;
            double sz0 = cz + t[1] + 0.5;
            double dxh = dummyX - sx0;
            double dzh = dummyZ - sz0;
            double mag = Math.max(0.001, Math.sqrt(dxh * dxh + dzh * dzh));
            spawn[i][0] = sx0 + dxh / mag * 0.9;
            spawn[i][1] = 78.5;
            spawn[i][2] = sz0 + dzh / mag * 0.9;
         }

         for (double[] s : spawn) {
            for (int i = 1; i <= 5; i++) {
               double f = i / 6.0;
               lvl.method_14199(
                  class_2398.field_11205, s[0] + (dummyX - s[0]) * f, s[1] + (dummyY - s[1]) * f, s[2] + (dummyZ - s[2]) * f, 1, 0.06, 0.06, 0.06, 0.0
               );
            }
         }

         if (this.animTick % 15 == 0) {
            class_238 arenaBox = new class_238(cx - 25, 50.0, cz - 25, cx + 25, 100.0, cz + 25);

            for (class_1667 old : lvl.method_8390(class_1667.class, arenaBox, e -> true)) {
               old.method_31472();
            }

            class_1799 arrowStack = new class_1799(class_1802.field_8107);
            class_1799 bowStack = new class_1799(class_1802.field_8102);

            for (double[] s : spawn) {
               double dx = dummyX - s[0];
               double dy = dummyY - s[1];
               double dz = dummyZ - s[2];
               class_1667 arrow = new class_1667(lvl, s[0], s[1], s[2], arrowStack, bowStack);
               arrow.method_7485(dx, dy, dz, 0.9F, 0.0F);
               arrow.method_5875(true);
               arrow.method_5684(true);
               lvl.method_8649(arrow);
               lvl.method_14199(class_2398.field_11240, s[0], s[1], s[2], 6, 0.2, 0.2, 0.2, 0.02);
               lvl.method_14199(class_2398.field_11203, s[0], s[1], s[2], 3, 0.15, 0.1, 0.15, 0.02);
            }
         }

         if (this.animTick % 3 == 0) {
            lvl.method_14199(class_2398.field_11205, dummyX, dummyY, dummyZ, 8, 0.8, 0.6, 0.8, 0.06);
         }

         if (this.animTick % 5 == 0) {
            for (double[] s : spawn) {
               lvl.method_14199(class_2398.field_11240, s[0], s[1], s[2], 2, 0.1, 0.15, 0.1, 0.01);
               lvl.method_14199(class_2398.field_11251, s[0], s[1] + 0.3, s[2], 1, 0.1, 0.1, 0.1, 0.01);
            }
         }
      } else {
         if (this.animTick == 1811 || this.animTick == 1812) {
            class_238 bigBox = new class_238(cx - 30, 40.0, cz - 30, cx + 30, 110.0, cz + 30);

            for (class_1667 old : lvl.method_8390(class_1667.class, bigBox, e -> true)) {
               old.method_31472();
            }
         }
      }
   }

   private void tickZoneParticles(class_3218 lvl) {
      int caveX = C_CAVE.method_10263() + 9;
      int caveZ = C_CAVE.method_10260();
      int nx = C_NETHER.method_10263();
      int nz = C_NETHER.method_10260();
      int ex = C_END.method_10263();
      int ez = C_END.method_10260();
      if (this.animTick % 8 == 0) {
         lvl.method_14199(class_2398.field_11232, caveX + 2.5, 73.5, caveZ + 1.0, 2, 0.3, 0.0, 0.3, 0.0);
         lvl.method_14199(class_2398.field_11232, caveX + 5.5, 73.5, caveZ - 1.5, 2, 0.3, 0.0, 0.3, 0.0);
      }

      if (this.animTick % 12 == 0) {
         lvl.method_14199(class_2398.field_11202, caveX + 5.5, 71.2, caveZ + 2.5, 4, 0.2, 0.05, 0.2, 0.05);
      }

      if (this.animTick % 20 == 0) {
         lvl.method_14199(class_2398.field_11241, caveX + 2.5, 71.2, caveZ + 2.5, 3, 0.3, 0.05, 0.3, 0.02);
      }

      if (this.animTick % 6 == 0) {
         for (int[] cascade : new int[][]{{8, 4}, {-11, -5}, {-3, 12}}) {
            lvl.method_14199(class_2398.field_11239, nx + cascade[0] + 0.5, 72.0, nz + cascade[1] + 0.5, 1, 0.2, 0.2, 0.2, 0.0);
            lvl.method_14199(class_2398.field_11240, nx + cascade[0] + 0.5, 74.0, nz + cascade[1] + 0.5, 2, 0.2, 0.4, 0.2, 0.01);
         }
      }

      if (this.animTick % 15 == 0) {
         for (int dx = -3; dx <= 3; dx += 2) {
            lvl.method_14199(class_2398.field_22246, nx + dx + 0.5, 70.5, nz + 10.5, 1, 0.05, 0.1, 0.05, 0.01);
         }
      }

      if (this.animTick % 24 == 0) {
         lvl.method_14199(class_2398.field_11214, nx + 0.5, 71.5, nz + 11.5, 6, 0.6, 0.6, 0.4, 0.05);
      }

      if (this.animTick % 8 == 0) {
         lvl.method_14199(class_2398.field_11214, ex + 0.5, 77.5, ez + 0.5, 5, 1.2, 0.8, 1.2, 0.05);
      }

      if (this.animTick % 14 == 0) {
         int[][] tops = new int[][]{{-12, 0, 18}, {12, 0, 22}, {0, -12, 16}, {0, 12, 14}, {-9, -9, 20}, {9, 9, 22}, {-9, 9, 16}, {9, -9, 18}};

         for (int[] p : tops) {
            lvl.method_14199(class_2398.field_23190, ex + p[0] + 0.5, 78 + p[2] + 0.5, ez + p[1] + 0.5, 1, 0.3, 0.1, 0.3, 0.02);
         }
      }

      if (this.animTick % 30 == 0) {
         lvl.method_14199(class_2398.field_11216, ex + 0.5, 87.5, ez + 0.5, 3, 0.6, 0.2, 0.6, 0.05);
      }
   }

   private void buildWaterCave(BenchContext ctx, class_3218 lvl) {
      int cx = C_CAVE.method_10263();
      int cz = C_CAVE.method_10260();
      int gy = 70;

      for (int dx = -11; dx <= 11; dx++) {
         for (int dz = -11; dz <= 11; dz++) {
            int r2 = dx * dx + dz * dz;
            if (r2 <= 121) {
               int x = cx + dx;
               int z = cz + dz;
               int y = this.surfaceY(x, z);
               if (r2 <= 64) {
                  this.setFast(lvl, x, y, z, class_2246.field_10382.method_9564());
                  this.setFast(lvl, x, y - 1, z, class_2246.field_10340.method_9564());
               } else {
                  this.setFast(lvl, x, y, z, class_2246.field_10102.method_9564());
               }
            }
         }
      }

      int gx = cx + 9;
      class_2680 cobble = class_2246.field_10445.method_9564();
      class_2680 mossy = class_2246.field_9989.method_9564();

      for (int dx = 0; dx <= 13; dx++) {
         for (int dzx = -5; dzx <= 5; dzx++) {
            for (int dy = 0; dy <= 8; dy++) {
               int x = gx + dx;
               int z = cz + dzx;
               boolean shell = dy == 0 || dy == 8 || dx == 13 || dzx == -5 || dzx == 5;
               if (shell) {
                  class_2680 mat = (dx + dzx + dy) % 3 == 0 ? mossy : cobble;
                  this.setFast(lvl, x, gy + dy, z, mat);
               }
            }
         }
      }

      for (int dyx = 1; dyx <= 7; dyx++) {
         for (int dzx = -4; dzx <= 4; dzx++) {
            this.setFast(lvl, gx, gy + dyx, cz + dzx, class_2246.field_10124.method_9564());
         }
      }

      for (int dx = 1; dx <= 12; dx++) {
         for (int dzx = -4; dzx <= 4; dzx++) {
            class_2680 floor = (dx + dzx) % 4 == 0 ? class_2246.field_28681.method_9564() : class_2246.field_10340.method_9564();
            this.setFast(lvl, gx + dx, gy, cz + dzx, floor);
         }
      }

      for (int dx = 9; dx <= 12; dx++) {
         for (int dzx = -4; dzx <= -2; dzx++) {
            for (int dyx = 0; dyx <= 2; dyx++) {
               this.setFast(
                  lvl,
                  gx + dx,
                  gy + dyx,
                  cz + dzx,
                  dyx == 2 && (dx + dzx) % 2 == 0 ? class_2246.field_27160.method_9564() : class_2246.field_27159.method_9564()
               );
            }
         }
      }

      for (int[] c : new int[][]{{8, -3}, {9, -1}, {10, -2}, {11, -3}, {12, -1}, {9, -4}, {11, -4}, {8, -2}, {10, -4}}) {
         class_2338 p = new class_2338(gx + c[0], gy + 1, cz + c[1]);
         if (lvl.method_8320(p).method_26215()) {
            lvl.method_8652(p, (class_2680)class_2246.field_27161.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036), 2);
            this.blocksPlaced++;
         }
      }

      int[][] stalac = new int[][]{{2, 0}, {4, -2}, {5, 2}, {7, -1}, {8, 1}, {3, 3}, {10, 2}, {6, -3}};

      for (int[] s : stalac) {
         class_2338 p = new class_2338(gx + s[0], gy + 7, cz + s[1]);
         if (lvl.method_8320(p).method_26215()) {
            lvl.method_8652(p, (class_2680)class_2246.field_28048.method_9564().method_11657(class_2741.field_28062, class_2350.field_11033), 2);
            this.blocksPlaced++;
         }
      }

      int[][] stalag = new int[][]{{2, -2}, {3, 2}, {5, -1}, {7, 2}, {6, 0}, {4, 1}, {8, -2}, {1, 3}};

      for (int[] sx : stalag) {
         class_2338 p = new class_2338(gx + sx[0], gy + 1, cz + sx[1]);
         if (lvl.method_8320(p).method_26215()) {
            lvl.method_8652(p, (class_2680)class_2246.field_28048.method_9564().method_11657(class_2741.field_28062, class_2350.field_11036), 2);
            this.blocksPlaced++;
         }
      }

      for (int dx = 1; dx <= 12; dx++) {
         for (int dzx = -4; dzx <= 4; dzx++) {
            class_2338 p = new class_2338(gx + dx, gy + 7, cz + dzx);
            if ((dx + dzx) % 3 == 0 && lvl.method_8320(p).method_26215()) {
               class_2338 above = new class_2338(gx + dx, gy + 8, cz + dzx);
               if (!lvl.method_8320(above).method_26215()) {
                  lvl.method_8652(p, (class_2680)class_2246.field_28411.method_9564().method_11657(class_2741.field_12546, true), 2);
                  this.blocksPlaced++;
               }
            }
         }
      }

      for (int dx : new int[]{3, 7, 11}) {
         class_2338 p = new class_2338(gx + dx, gy + 6, cz);
         if (lvl.method_8320(p).method_26215()) {
            lvl.method_8652(p, (class_2680)class_2246.field_16541.method_9564().method_11657(class_2741.field_16561, true), 2);
            this.blocksPlaced++;
         }
      }

      for (int dyx = 1; dyx <= 5; dyx++) {
         this.setFast(lvl, gx + 13, gy + dyx, cz + 3, class_2246.field_10164.method_9564());
      }

      this.setFast(lvl, gx + 12, gy, cz + 3, class_2246.field_10092.method_9564());
      this.setFast(lvl, gx + 13, gy, cz + 3, class_2246.field_10092.method_9564());
      this.setFast(lvl, gx + 13, gy, cz + 4, class_2246.field_10092.method_9564());

      for (int dyx = 1; dyx <= 4; dyx++) {
         this.setFast(
            lvl, gx + 12, gy + dyx, cz + 4, (class_2680)class_2246.field_22091.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052)
         );
         this.setFast(
            lvl, gx + 13, gy + dyx, cz + 4, (class_2680)class_2246.field_22091.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052)
         );
      }

      for (int dxx = 1; dxx <= 12; dxx++) {
         this.setFast(lvl, gx + dxx, gy, cz + 4, class_2246.field_10225.method_9564());
         this.setFast(lvl, gx + dxx, gy + 1, cz + 4, class_2246.field_10382.method_9564());
      }

      for (int dxx = 4; dxx <= 7; dxx++) {
         for (int dzxx = -8; dzxx <= -6; dzxx++) {
            for (int dyx = 0; dyx <= 3; dyx++) {
               int x = gx + dxx;
               int z = cz + dzxx;
               boolean shell = dyx == 0 || dyx == 3 || dxx == 4 || dxx == 7 || dzxx == -8;
               if (shell) {
                  this.setFast(lvl, x, gy + dyx, z, mossy);
               } else {
                  this.setFast(lvl, x, gy + dyx, z, class_2246.field_10124.method_9564());
               }
            }
         }
      }

      for (int dxx = 5; dxx <= 6; dxx++) {
         for (int dyxx = 1; dyxx <= 2; dyxx++) {
            this.setFast(lvl, gx + dxx, gy + dyxx, cz - 5, class_2246.field_10124.method_9564());
         }
      }

      for (int[] m : new int[][]{{5, -7}, {6, -6}, {7, -7}, {4, -7}}) {
         this.setFast(lvl, gx + m[0], gy + 1, cz + m[1], (m[0] + m[1]) % 2 == 0 ? class_2246.field_10559.method_9564() : class_2246.field_10251.method_9564());
      }

      for (int dxx = -3; dxx <= 3; dxx++) {
         this.setFast(lvl, cx + dxx, 70, cz - 7, class_2246.field_10445.method_9564());
         this.setFast(lvl, cx + dxx, 71, cz - 7, class_2246.field_10625.method_9564());
      }

      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6123, cx + 2, cz, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6137, gx + 11, cz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_28315, cx, cz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_28315, cx + 1, cz + 2, true);
   }

   private void buildNetherAlcove(BenchContext ctx, class_3218 lvl) {
      int cx = C_NETHER.method_10263();
      int cz = C_NETHER.method_10260();
      int floorY = 66;
      int ceilY = 78;

      for (int dx = -17; dx <= 17; dx++) {
         for (int dz = -17; dz <= 17; dz++) {
            int r2 = dx * dx + dz * dz;
            if (r2 <= 289) {
               int x = cx + dx;
               int z = cz + dz;

               for (int y = floorY + 1; y < ceilY; y++) {
                  this.setFast(lvl, x, y, z, class_2246.field_10124.method_9564());
               }

               this.setFast(lvl, x, floorY, z, class_2246.field_10515.method_9564());
               this.setFast(lvl, x, ceilY, z, class_2246.field_23869.method_9564());
               if (r2 > 225) {
                  for (int y = floorY + 1; y < ceilY; y++) {
                     this.setFast(lvl, x, y, z, (y + dx + dz) % 4 == 0 ? class_2246.field_10515.method_9564() : class_2246.field_23869.method_9564());
                  }
               }
            }
         }
      }

      for (int dx = -25; dx <= -8; dx++) {
         for (int dzx = -5; dzx <= 5; dzx++) {
            int x = cx + dx;
            int z = cz + dzx;

            for (int y = floorY + 1; y < ceilY; y++) {
               this.setFast(lvl, x, y, z, class_2246.field_10124.method_9564());
            }

            this.setFast(lvl, x, floorY, z, class_2246.field_10515.method_9564());
            this.setFast(lvl, x, floorY - 1, z, class_2246.field_23869.method_9564());
            this.setFast(lvl, x, ceilY, z, class_2246.field_23869.method_9564());
            this.setFast(lvl, x, ceilY + 1, z, class_2246.field_23869.method_9564());
         }
      }

      for (int dx = -25; dx <= -8; dx++) {
         for (int y = floorY - 1; y <= ceilY + 1; y++) {
            this.setFast(lvl, cx + dx, y, cz - 6, class_2246.field_23869.method_9564());
            this.setFast(lvl, cx + dx, y, cz + 6, class_2246.field_23869.method_9564());
         }
      }

      for (int dx = -18; dx <= 18; dx++) {
         for (int dzx = -18; dzx <= 18; dzx++) {
            int r2 = dx * dx + dzx * dzx;
            if (r2 <= 324) {
               int x = cx + dx;
               int z = cz + dzx;
               this.setFast(lvl, x, ceilY + 1, z, class_2246.field_23869.method_9564());
            }
         }
      }

      for (int dx = -19; dx <= 19; dx++) {
         for (int dzxx = -19; dzxx <= 19; dzxx++) {
            int r2 = dx * dx + dzxx * dzxx;
            if (r2 >= 225 && r2 <= 361) {
               int x = cx + dx;
               int z = cz + dzxx;
               if (dx < -25 || dx > -8 || dzxx < -5 || dzxx > 5) {
                  for (int y = floorY - 1; y <= ceilY + 1; y++) {
                     this.setFast(lvl, x, y, z, class_2246.field_23869.method_9564());
                  }
               }
            }
         }
      }

      for (int dx = -25; dx <= -8; dx++) {
         for (int dzxxx = -6; dzxxx <= 6; dzxxx++) {
            int x = cx + dx;
            int z = cz + dzxxx;
            this.setFast(lvl, x, floorY - 1, z, class_2246.field_23869.method_9564());
            if (dzxxx == 6 || dzxxx == -6) {
               this.setFast(lvl, x, floorY, z, class_2246.field_10515.method_9564());
            }
         }
      }

      Random rng = new Random(41168L);

      for (int i = 0; i < 4; i++) {
         int lx = cx + rng.nextInt(15) - 7;
         int lz = cz + rng.nextInt(15) - 7;

         for (int dx = -1; dx <= 1; dx++) {
            for (int dzxxxx = -1; dzxxxx <= 1; dzxxxx++) {
               if (dx * dx + dzxxxx * dzxxxx <= 2) {
                  this.setFast(lvl, lx + dx, floorY, lz + dzxxxx, class_2246.field_10092.method_9564());
                  if (dx == 0 && dzxxxx == 0) {
                     this.setFast(lvl, lx, floorY + 1, lz, class_2246.field_10164.method_9564());
                  }
               }
            }
         }
      }

      for (int i = 0; i < 22; i++) {
         int lx = cx + rng.nextInt(28) - 14;
         int lz = cz + rng.nextInt(28) - 14;
         int dx = lx - cx;
         int dzxxxxx = lz - cz;
         if (dx * dx + dzxxxxx * dzxxxxx <= 196) {
            this.setFast(lvl, lx, ceilY - 1, lz, class_2246.field_10171.method_9564());
         }
      }

      for (int[] p : new int[][]{{-6, -6}, {6, -6}, {-6, 6}, {6, 6}, {0, 8}, {0, -8}}) {
         int x = cx + p[0];
         int z = cz + p[1];
         this.setFast(lvl, x, floorY + 1, z, class_2246.field_10114.method_9564());
         this.setFast(lvl, x, floorY + 2, z, class_2246.field_22089.method_9564());
      }

      for (int ix = 0; ix < 12; ix++) {
         int lx = cx + rng.nextInt(18) - 9;
         int lz = cz + rng.nextInt(18) - 9;
         if ((lx - cx) * (lx - cx) + (lz - cz) * (lz - cz) <= 81) {
            class_2338 floor = new class_2338(lx, floorY, lz);
            if (lvl.method_8320(floor).method_27852(class_2246.field_10515)) {
               this.setFast(lvl, lx, floorY, lz, class_2246.field_22120.method_9564());
               if (rng.nextBoolean()) {
                  this.setFast(lvl, lx, floorY + 1, lz, class_2246.field_22125.method_9564());
               }
            }
         }
      }

      for (int dx = -4; dx <= 4; dx++) {
         for (int dy = 0; dy < 4; dy++) {
            this.setFast(lvl, cx + dx, floorY + 1 + dy, cz + 9, class_2246.field_10266.method_9564());
         }
      }

      for (int dx = -4; dx <= 4; dx += 2) {
         this.setFast(lvl, cx + dx, floorY + 5, cz + 9, class_2246.field_9986.method_9564());
      }

      for (int[] p : new int[][]{{-4, 6}, {4, 6}, {0, 8}, {-2, 4}, {2, 4}}) {
         this.setFast(lvl, cx + p[0], floorY + 3, cz + p[1], class_2246.field_22122.method_9564());
      }

      int[][] columns = new int[][]{{-9, -4}, {9, -4}, {-4, 9}, {4, 9}, {-10, 3}, {10, 3}};

      for (int[] p : columns) {
         int x = cx + p[0];
         int z = cz + p[1];

         for (int dy = 1; dy <= 5; dy++) {
            class_2680 b = dy % 2 == 0
               ? (class_2680)class_2246.field_23151.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052)
               : (class_2680)class_2246.field_22091.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052);
            this.setFast(lvl, x, floorY + dy, z, b);
         }
      }

      for (int[] p : new int[][]{{-9, -4}, {9, -4}}) {
         int x = cx + p[0];
         int z = cz + p[1];
         this.setFast(lvl, x, 75, z + 1, class_2246.field_23874.method_9564());
         this.setFast(lvl, x, 75, z - 1, class_2246.field_23874.method_9564());
      }

      for (int[] cascade : new int[][]{{8, 4}, {-11, -5}, {-3, 12}}) {
         int x = cx + cascade[0];
         int z = cz + cascade[1];
         this.setFast(lvl, x, ceilY - 1, z, class_2246.field_10092.method_9564());

         for (int dy = floorY + 1; dy < ceilY - 1; dy++) {
            this.setFast(lvl, x, dy, z, class_2246.field_10164.method_9564());
         }

         this.setFast(lvl, x, floorY, z, class_2246.field_10092.method_9564());
      }

      class_2680 nb = class_2246.field_10266.method_9564();
      class_2680 rnb = class_2246.field_9986.method_9564();

      for (int dx = -4; dx <= 4; dx++) {
         for (int dy = 0; dy < 5; dy++) {
            for (int dzxxxxx = 0; dzxxxxx < 3; dzxxxxx++) {
               int x = cx + dx;
               int z = cz + 11 + dzxxxxx;
               if (dzxxxxx != 1 || dx < -2 || dx > 2 || dy < 1 || dy > 3) {
                  this.setFast(lvl, x, floorY + 1 + dy, z, dy == 4 ? rnb : nb);
               }
            }
         }
      }

      for (int dx = -3; dx <= 3; dx += 2) {
         class_2338 p = new class_2338(cx + dx, floorY + 4, cz + 10);
         if (lvl.method_8320(p).method_26215()) {
            lvl.method_8652(p, (class_2680)class_2246.field_22093.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035), 2);
            this.blocksPlaced++;
         }
      }

      class_2680 bsStairs = (class_2680)class_2246.field_23870.method_9564().method_11657(class_2741.field_12481, class_2350.field_11043);

      for (int dxx = -1; dxx <= 1; dxx++) {
         this.setFast(lvl, cx + dxx, floorY + 1, cz + 9, bsStairs);
      }

      for (int ixx = 0; ixx < 6; ixx++) {
         this.spawnPassive(ctx, lvl, class_1299.field_6050, cx - 6 + ixx * 2, floorY + 1, cz - 2 + ixx % 3 - 1);
      }

      for (int ixx = 0; ixx < 3; ixx++) {
         this.spawnPassive(ctx, lvl, class_1299.field_22281, cx + 3 + ixx * 2, floorY + 1, cz + 5);
      }

      this.spawnPassive(ctx, lvl, class_1299.field_6076, cx, floorY + 1, cz + 11);

      for (int[] sp : new int[][]{{4, 2}, {-8, -4}}) {
         int sx = cx + sp[0];
         int sz = cz + sp[1];

         for (int dxx = -1; dxx <= 1; dxx++) {
            for (int dzxxxxxx = -1; dzxxxxxx <= 1; dzxxxxxx++) {
               this.setFast(lvl, sx + dxx, floorY, sz + dzxxxxxx, class_2246.field_10092.method_9564());
               this.setFast(lvl, sx + dxx, floorY + 1, sz + dzxxxxxx, class_2246.field_10164.method_9564());
            }
         }

         this.spawnPassive(ctx, lvl, class_1299.field_23214, sx, floorY + 2, sz);
      }
   }

   private void buildEndIsland(BenchContext ctx, class_3218 lvl) {
      int cx = C_END.method_10263();
      int cz = C_END.method_10260();
      int islandTop = 80;
      int moatInner = 22;
      int moatOuter = 30;

      for (int dx = -moatOuter; dx <= moatOuter; dx++) {
         for (int dz = -moatOuter; dz <= moatOuter; dz++) {
            int r2 = dx * dx + dz * dz;
            if (r2 <= moatOuter * moatOuter) {
               int x = cx + dx;
               int z = cz + dz;
               if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
                  int surf = this.surfaceY(x, z);
                  if (r2 > moatInner * moatInner) {
                     this.setFast(lvl, x, 70, z, class_2246.field_10382.method_9564());
                     this.setFast(lvl, x, 69, z, class_2246.field_10340.method_9564());
                  } else {
                     for (int y = surf; y <= islandTop; y++) {
                        this.setFast(lvl, x, y, z, class_2246.field_10471.method_9564());
                     }
                  }
               }
            }
         }
      }

      int[][] outIslands = new int[][]{
         {34, 0}, {-34, 0}, {0, 34}, {0, -34}, {26, 22}, {-26, 22}, {26, -22}, {-26, -22}, {18, 32}, {-18, 32}, {18, -32}, {-18, -32}
      };
      Random orng = new Random(980868L);

      for (int[] off : outIslands) {
         int ocx = cx + off[0];
         int ocz = cz + off[1];
         int oTop = islandTop - 2 + orng.nextInt(3);

         for (int dx = -6; dx <= 6; dx++) {
            for (int dzx = -6; dzx <= 6; dzx++) {
               if (dx * dx + dzx * dzx <= 36) {
                  int x = ocx + dx;
                  int z = ocz + dzx;
                  if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
                     for (int y = 70; y <= oTop; y++) {
                        this.setFast(lvl, x, y, z, class_2246.field_10471.method_9564());
                     }
                  }
               }
            }
         }

         if (ocx >= -16 && ocx <= 320 && ocz >= -64 && ocz <= 64) {
            this.setFast(lvl, ocx, oTop + 1, ocz, class_2246.field_10286.method_9564());
            int hClu = 4 + orng.nextInt(3);

            for (int dy = 1; dy <= hClu; dy++) {
               this.setFast(lvl, ocx + 2, oTop + dy, ocz, class_2246.field_10021.method_9564());
            }

            this.setFast(lvl, ocx + 2, oTop + hClu + 1, ocz, class_2246.field_10528.method_9564());
            int hClu2 = 3 + orng.nextInt(3);

            for (int dy = 1; dy <= hClu2; dy++) {
               this.setFast(lvl, ocx - 2, oTop + dy, ocz + 1, class_2246.field_10021.method_9564());
            }

            this.setFast(lvl, ocx - 2, oTop + hClu2 + 1, ocz + 1, class_2246.field_10528.method_9564());
         }
      }

      int[][] pillarPos = new int[][]{{-15, 0, 24}, {15, 0, 28}, {0, -15, 22}, {0, 15, 20}, {-11, -11, 26}, {11, 11, 28}, {-11, 11, 22}, {11, -11, 24}};

      for (int[] p : pillarPos) {
         int px = cx + p[0];
         int pz = cz + p[1];
         int h = p[2];

         for (int dy = 1; dy <= h; dy++) {
            this.setFast(lvl, px, islandTop + dy, pz, class_2246.field_10540.method_9564());
         }

         for (int dx = -1; dx <= 1; dx++) {
            for (int dzxx = -1; dzxx <= 1; dzxx++) {
               if (dx != 0 || dzxx != 0) {
                  this.setFast(lvl, px + dx, islandTop + h + 1, pz + dzxx, class_2246.field_10576.method_9564());
               }
            }
         }

         class_1511 crystal = new class_1511(lvl, px + 0.5, islandTop + h + 2, pz + 0.5);
         crystal.method_6839(false);
         crystal.method_5684(true);
         ctx.spawnTracked(crystal, lvl);
         this.otherEntitiesSpawned++;
      }

      for (int dy = 1; dy <= 12; dy++) {
         this.setFast(
            lvl, cx, islandTop + dy, cz, (class_2680)class_2246.field_10505.method_9564().method_11657(class_2741.field_12496, class_2351.field_11052)
         );
      }

      this.setFast(lvl, cx, islandTop + 13, cz, class_2246.field_10337.method_9564());

      for (int[] p : new int[][]{{-2, 0}, {2, 0}, {0, -2}, {0, 2}, {-2, -2}, {2, 2}, {-2, 2}, {2, -2}}) {
         this.setFast(lvl, cx + p[0], islandTop + 1, cz + p[1], class_2246.field_10286.method_9564());
      }

      for (int[] p : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
         this.setFast(lvl, cx + p[0], islandTop + 2, cz + p[1], class_2246.field_10286.method_9564());
      }

      for (int[] p : new int[][]{{-3, 0}, {3, 0}, {0, -3}, {0, 3}, {-3, 3}, {3, -3}, {-3, -3}, {3, 3}}) {
         this.setFast(
            lvl,
            cx + p[0],
            islandTop + 1,
            cz + p[1],
            (class_2680)class_2246.field_10455.method_9564().method_11657(class_2741.field_12525, class_2350.field_11036)
         );
      }

      Random rng = new Random(25779L);

      for (int i = 0; i < 36; i++) {
         int dx = rng.nextInt(42) - 21;
         int dzxxx = rng.nextInt(42) - 21;
         int r2 = dx * dx + dzxxx * dzxxx;
         if (r2 >= 144 && r2 <= 400) {
            int x = cx + dx;
            int z = cz + dzxxx;
            if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
               int h = 3 + rng.nextInt(4);

               for (int dy = 1; dy <= h; dy++) {
                  this.setFast(lvl, x, islandTop + dy, z, class_2246.field_10021.method_9564());
               }

               this.setFast(lvl, x, islandTop + h + 1, z, class_2246.field_10528.method_9564());
            }
         }
      }

      int[][] aiOff = new int[][]{{-9, 0}, {9, 0}, {0, -9}, {0, 9}, {-7, 7}, {7, -7}};

      for (int[] p : aiOff) {
         this.spawnPassive(ctx, lvl, class_1299.field_6091, cx + p[0], islandTop + 1, cz + p[1]);
      }

      int[][] aiOn = new int[][]{{-5, -5}, {5, 5}, {-5, 5}, {5, -5}, {-7, -2}, {7, 2}};

      for (int[] p : aiOn) {
         this.spawnPassiveSafe(ctx, lvl, class_1299.field_6091, cx + p[0], cz + p[1], true);
      }

      FpsTestClient.LOG
         .info(
            "[BaseFps] End built: center=({},{}) islandR={} moatR={} pillars={} outliers={}",
            new Object[]{cx, cz, moatInner, moatOuter, pillarPos.length, outIslands.length}
         );
   }

   private void spawnAmbientAnimals(BenchContext ctx, class_3218 lvl) {
      int bx = C_BASE.method_10263();
      int bz = C_BASE.method_10260();
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6085, bx - 4, bz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6085, bx - 4, bz + 1, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6085, bx - 5, bz - 3, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6085, bx - 3, bz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6132, bx + 2, bz + 3, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6132, bx + 4, bz + 3, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6132, bx + 3, bz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6132, bx + 5, bz - 1, true);
      int penCx = C_VILLAGE.method_10263() + 11;
      int penCz = C_VILLAGE.method_10260() + 6;
      class_2680 fence = class_2246.field_10620.method_9564();
      class_2680 gate = (class_2680)class_2246.field_10188.method_9564().method_11657(class_2741.field_12481, class_2350.field_11039);

      for (int dx = -3; dx <= 3; dx++) {
         this.set(lvl, penCx + dx, 71, penCz - 3, fence);
         this.set(lvl, penCx + dx, 71, penCz + 3, fence);
      }

      for (int dz = -3; dz <= 3; dz++) {
         this.set(lvl, penCx - 3, 71, penCz + dz, fence);
         this.set(lvl, penCx + 3, 71, penCz + dz, fence);
      }

      this.set(lvl, penCx - 3, 71, penCz, gate);
      this.set(lvl, penCx, 71, penCz - 1, class_2246.field_10359.method_9564());
      this.set(lvl, penCx + 1, 70, penCz + 1, class_2246.field_10382.method_9564());
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6115, penCx - 1, penCz - 1, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6115, penCx + 1, penCz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6115, penCx - 2, penCz + 1, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6115, penCx + 2, penCz + 1, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6093, penCx, penCz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6093, penCx - 1, penCz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6093, penCx + 2, penCz - 1, true);
      this.spawnPassiveSafe(ctx, lvl, class_1299.field_6093, penCx, penCz - 2, true);
   }

   private CameraPath buildCinematicPath() {
      int gy = 70;
      List<BaseFpsBenchmark.NamedSegment> named = new ArrayList<>();
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "intro",
            160,
            new LinearPath(new class_243(C_SPAWN.method_10263() - 14, gy + 22, C_SPAWN.method_10260() + 18), new class_243(0.075, -0.04, -0.025), 250.0F, 18.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "plaza_orbit", 120, new OrbitPath(new class_243(C_SPAWN.method_10263() + 0.5, gy + 3, C_SPAWN.method_10260() + 0.5), 10.0, 6.0, 0.6, 200.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "forest_fly",
            200,
            new LinearPath(new class_243(C_SPAWN.method_10263() + 6, gy + 14, C_SPAWN.method_10260() + 1), new class_243(0.12, 0.03, 0.105), 300.0F, 12.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "forest_orbit", 200, new OrbitPath(new class_243(C_FOREST.method_10263() + 0.5, gy + 5, C_FOREST.method_10260() + 0.5), 20.0, 18.0, 0.55)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "base_fly",
            180,
            new LinearPath(
               new class_243(C_FOREST.method_10263() + 0.5, gy + 20, C_FOREST.method_10260() - 8), new class_243(0.155, -0.044, -0.05), 200.0F, 20.0F
            )
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "base_orbit", 220, new OrbitPath(new class_243(C_BASE.method_10263() + 0.5, gy + 4, C_BASE.method_10260() + 0.5), 14.0, 8.0, 0.55)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "village_fly",
            140,
            new LinearPath(new class_243(C_BASE.method_10263() + 8, gy + 10, C_BASE.method_10260() - 2), new class_243(0.18, 0.0, -0.06), 215.0F, 14.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "village", 200, new OrbitPath(new class_243(C_VILLAGE.method_10263() + 0.5, gy + 5, C_VILLAGE.method_10260() + 0.5), 18.0, 10.0, 0.45)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "combat_in",
            100,
            new LinearPath(new class_243(C_COMBAT.method_10263() - 30, gy + 12, C_COMBAT.method_10260() + 8), new class_243(0.16, -0.06, -0.085), 245.0F, 18.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "combat_orbit", 260, new OrbitPath(new class_243(C_COMBAT.method_10263() + 0.5, gy + 4, C_COMBAT.method_10260() + 0.5), 14.0, 6.0, 0.5, 180.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "redstone",
            200,
            new LinearPath(new class_243(C_REDSTONE.method_10263() - 10, gy + 7, C_REDSTONE.method_10260() - 3), new class_243(0.13, 0.0, 0.04), 270.0F, 14.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "cave_fly",
            110,
            new LinearPath(new class_243(C_CAVE.method_10263() - 12, gy + 12, C_CAVE.method_10260() - 8), new class_243(0.091, -0.082, 0.073), 280.0F, 10.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "cave_inside",
            200,
            new LinearPath(new class_243(C_CAVE.method_10263() - 2, gy + 3, C_CAVE.method_10260() + 0.5), new class_243(0.1, 0.0, 0.0), 270.0F, 0.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "cave_pull",
            150,
            new LinearPath(new class_243(C_CAVE.method_10263() + 18, gy + 3, C_CAVE.method_10260() + 0.5), new class_243(-0.18, 0.0, -0.05), 110.0F, 6.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "nether_fly",
            160,
            new LinearPath(new class_243(C_NETHER.method_10263() - 25, gy + 3, C_NETHER.method_10260()), new class_243(0.135, 0.0, 0.0), 270.0F, 0.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "nether_orbit", 240, new OrbitPath(new class_243(C_NETHER.method_10263() + 0.5, gy + 3, C_NETHER.method_10260() + 0.5), 4.0, 0.0, 0.6)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "end_fly",
            160,
            new LinearPath(new class_243(C_END.method_10263() - 50, gy + 20, C_END.method_10260() - 4), new class_243(0.156, 0.0, 0.025), 270.0F, 6.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "end_orbit", 340, new OrbitPath(new class_243(C_END.method_10263() + 0.5, gy + 10, C_END.method_10260() + 0.5), 25.0, 10.0, 0.4, 180.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "final",
            260,
            new LinearPath(new class_243(C_END.method_10263() - 25, gy + 50, C_END.method_10260() - 4), new class_243(-0.45, 0.0, -0.07), 250.0F, 25.0F)
         )
      );
      this.segments = named;
      this.segmentStarts = new int[named.size()];
      this.segmentNames = new String[named.size()];
      int t = 0;

      for (int i = 0; i < named.size(); i++) {
         this.segmentStarts[i] = t;
         this.segmentNames[i] = named.get(i).name();
         t += named.get(i).ticks();
      }

      this.totalSegmentTicks = t;
      if (t != this.sampleTicks()) {
         FpsTestClient.LOG.warn("[BaseFps] segment-tick total {} != sampleTicks {}", t, this.sampleTicks());
      }

      List<CompositePath.Segment> compSegs = new ArrayList<>(named.size());

      for (BaseFpsBenchmark.NamedSegment ns : named) {
         compSegs.add(new CompositePath.Segment(ns.ticks(), ns.path()));
      }

      return new CompositePath(compSegs);
   }

   private int segmentIndexAtTick(int tick) {
      if (this.segmentStarts.length == 0) {
         return -1;
      } else {
         for (int i = this.segmentStarts.length - 1; i >= 0; i--) {
            if (tick >= this.segmentStarts[i]) {
               return i;
            }
         }

         return -1;
      }
   }

   private void set(class_3218 lvl, int x, int y, int z, class_2680 state) {
      lvl.method_8652(new class_2338(x, y, z), state, 3);
      this.blocksPlaced++;
   }

   private void setFast(class_3218 lvl, int x, int y, int z, class_2680 state) {
      lvl.method_8652(new class_2338(x, y, z), state, 2);
      this.blocksPlaced++;
   }

   private void carveCameraCorridor(class_3218 lvl, CameraPath path, int totalTicks) {
      if (path != null && totalTicks > 0) {
         int strippedTotal = 0;
         int coreHitTicks = 0;
         int loggedUnsafe = 0;

         for (int t = 0; t < totalTicks; t += 2) {
            Pose pose = path.poseAt(t, 0.0F);
            class_243 pos = pose.pos();
            double r = this.carveRadiusForTick(t);
            int[] result = this.stripUnsafeAround(lvl, pos.field_1352, pos.field_1351, pos.field_1350, r);
            strippedTotal += result[0];
            if (result[1] > 0) {
               coreHitTicks++;
               if (loggedUnsafe < 8) {
                  loggedUnsafe++;
                  int idx = this.segmentIndexAtTick(t);
                  String name = idx >= 0 ? this.segmentNames[idx] : "?";
                  FpsTestClient.LOG
                     .warn(
                        "[BaseFps] camera-corridor segment={} tick={} pos=({}, {}, {}) STRIPPED {} structural block(s) from camera core — path tweak needed",
                        new Object[]{
                           name,
                           t,
                           String.format("%.1f", pos.field_1352),
                           String.format("%.1f", pos.field_1351),
                           String.format("%.1f", pos.field_1350),
                           result[1]
                        }
                     );
               }
            }
         }

         FpsTestClient.LOG
            .info("[BaseFps] camera-corridor carve done: stripped={} core-hits={}/{} samples", new Object[]{strippedTotal, coreHitTicks, totalTicks / 2});
      }
   }

   private double carveRadiusForTick(int tick) {
      int idx = this.segmentIndexAtTick(tick);
      if (idx < 0) {
         return 2.5;
      } else {
         String var3 = this.segmentNames[idx];

         return switch (var3) {
            case "forest_fly", "forest_orbit", "base_fly" -> 3.5;
            case "nether_fly", "nether_orbit" -> 3.5;
            case "end_fly", "end_orbit", "final" -> 3.5;
            case "cave_fly", "cave_orbit" -> 3.0;
            default -> 2.5;
         };
      }
   }

   private int[] stripUnsafeAround(class_3218 lvl, double cx, double cy, double cz, double radius) {
      int stripped = 0;
      int structuralCoreHit = 0;
      int r = (int)Math.ceil(radius);
      int icx = (int)Math.floor(cx);
      int icy = (int)Math.floor(cy);
      int icz = (int)Math.floor(cz);
      class_2680 air = class_2246.field_10124.method_9564();
      double r2 = radius * radius;
      double coreR2 = 2.5600000000000005;

      for (int dx = -r; dx <= r; dx++) {
         for (int dy = -r; dy <= r; dy++) {
            for (int dz = -r; dz <= r; dz++) {
               double d2 = dx * dx + dy * dy + dz * dz;
               if (!(d2 > r2)) {
                  class_2338 p = new class_2338(icx + dx, icy + dy, icz + dz);
                  class_2680 s = lvl.method_8320(p);
                  if (!s.method_26215()) {
                     boolean inCore = d2 <= coreR2;
                     if (inCore) {
                        if (!this.isStrippableForCamera(s) && s.method_26212(lvl, p)) {
                           structuralCoreHit++;
                        }

                        lvl.method_8652(p, air, 2);
                        stripped++;
                     } else if (this.isStrippableForCamera(s)) {
                        lvl.method_8652(p, air, 2);
                        stripped++;
                     }
                  }
               }
            }
         }
      }

      return new int[]{stripped, structuralCoreHit};
   }

   private boolean isStrippableForCamera(class_2680 s) {
      return s.method_27852(class_2246.field_10503)
         || s.method_27852(class_2246.field_10539)
         || s.method_27852(class_2246.field_10035)
         || s.method_27852(class_2246.field_9988)
         || s.method_27852(class_2246.field_10335)
         || s.method_27852(class_2246.field_10098)
         || s.method_27852(class_2246.field_28673)
         || s.method_27852(class_2246.field_28674)
         || s.method_27852(class_2246.field_10431)
         || s.method_27852(class_2246.field_10511)
         || s.method_27852(class_2246.field_10010)
         || s.method_27852(class_2246.field_10597)
         || s.method_27852(class_2246.field_28411)
         || s.method_27852(class_2246.field_28048)
         || s.method_27852(class_2246.field_27161)
         || s.method_27852(class_2246.field_27162)
         || s.method_27852(class_2246.field_27163)
         || s.method_27852(class_2246.field_27164)
         || s.method_27852(class_2246.field_28682)
         || s.method_27852(class_2246.field_28684)
         || s.method_27852(class_2246.field_10021)
         || s.method_27852(class_2246.field_10528)
         || s.method_27852(class_2246.field_10576)
         || s.method_27852(class_2246.field_16541)
         || s.method_27852(class_2246.field_22110)
         || s.method_27852(class_2246.field_10382)
         || s.method_27852(class_2246.field_10164)
         || s.method_27852(class_2246.field_10479)
         || s.method_27852(class_2246.field_10112)
         || s.method_27852(class_2246.field_10214)
         || s.method_27852(class_2246.field_10313)
         || s.method_27852(class_2246.field_16999)
         || s.method_27852(class_2246.field_28680)
         || s.method_27852(class_2246.field_10559)
         || s.method_27852(class_2246.field_10251);
   }

   private void spawnPassive(BenchContext ctx, class_3218 lvl, class_1299<? extends class_1297> type, double x, double y, double z) {
      class_1297 e = type.method_5883(lvl);
      if (e != null) {
         e.method_5808(x + 0.5, y, z + 0.5, 0.0F, 0.0F);
         if (e instanceof class_1308 m) {
            m.method_5943(lvl, lvl.method_8404(e.method_24515()), class_3730.field_16462, null);
            m.method_5977(false);
            m.method_5971();
            m.method_5684(true);
            m.method_5803(true);
         }

         ctx.spawnTracked(e, lvl);
         this.otherEntitiesSpawned++;
      }
   }

   private void spawnPassiveSafe(BenchContext ctx, class_3218 lvl, class_1299<? extends class_1297> type, int x, int z, boolean aiEnabled) {
      int[] safeXZ = this.findSafeSpawn(lvl, x, z);
      if (safeXZ == null) {
         FpsTestClient.LOG
            .warn(
               "[BaseFps] spawnPassiveSafe: no safe spawn within r=4 of ({}, {}) for {} — falling back to requested cell with forced air clear",
               new Object[]{x, z, type}
            );
         safeXZ = new int[]{x, z};
      }

      int sx = safeXZ[0];
      int sz = safeXZ[1];
      int sy = this.topSolidY(lvl, sx, sz);
      if (sy < 62) {
         sy = this.surfaceY(sx, sz);
      }

      class_2680 air = class_2246.field_10124.method_9564();

      for (int dy = 1; dy <= 2; dy++) {
         class_2338 p = new class_2338(sx, sy + dy, sz);
         class_2680 s = lvl.method_8320(p);
         if (s.method_26227().method_15769() && !s.method_26215() && s.method_45474()) {
            lvl.method_8652(p, air, 2);
         }
      }

      class_1297 e = type.method_5883(lvl);
      if (e != null) {
         e.method_5808(sx + 0.5, sy + 1.01, sz + 0.5, 0.0F, 0.0F);
         if (e instanceof class_1308 m) {
            m.method_5943(lvl, lvl.method_8404(e.method_24515()), class_3730.field_16462, null);
            m.method_5977(!aiEnabled);
            m.method_5971();
            m.method_5684(true);
         }

         ctx.spawnTracked(e, lvl);
         this.otherEntitiesSpawned++;
      }
   }

   private int topSolidY(class_3218 lvl, int x, int z) {
      for (int y = 84; y >= 62; y--) {
         class_2680 s = lvl.method_8320(new class_2338(x, y, z));
         if (!s.method_26215()
            && !s.method_45474()
            && s.method_26227().method_15769()
            && !s.method_27852(class_2246.field_10620)
            && !s.method_27852(class_2246.field_10188)
            && !s.method_27852(class_2246.field_10625)
            && !s.method_27852(class_2246.field_9990)
            && !s.method_27852(class_2246.field_23865)
            && !s.method_27852(class_2246.field_10503)
            && !s.method_27852(class_2246.field_10539)
            && !s.method_27852(class_2246.field_10035)
            && !s.method_27852(class_2246.field_10576)
            && !s.method_27852(class_2246.field_10194)
            && !s.method_27852(class_2246.field_10362)
            && !s.method_27852(class_2246.field_10119)
            && !s.method_27852(class_2246.field_10359)) {
            return y;
         }
      }

      return 61;
   }

   private boolean isSafeSpawn(class_3218 lvl, int x, int z) {
      int top = this.topSolidY(lvl, x, z);
      if (top < 62) {
         return false;
      } else {
         class_2680 a1 = lvl.method_8320(new class_2338(x, top + 1, z));
         class_2680 a2 = lvl.method_8320(new class_2338(x, top + 2, z));
         return (a1.method_26215() || a1.method_45474()) && (a2.method_26215() || a2.method_45474());
      }
   }

   private int[] findSafeSpawn(class_3218 lvl, int x, int z) {
      if (this.isSafeSpawn(lvl, x, z)) {
         return new int[]{x, z};
      } else {
         int[][] offsets = new int[][]{
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1},
            {1, 1},
            {-1, 1},
            {1, -1},
            {-1, -1},
            {2, 0},
            {-2, 0},
            {0, 2},
            {0, -2},
            {2, 1},
            {-2, 1},
            {2, -1},
            {-2, -1},
            {1, 2},
            {-1, 2},
            {1, -2},
            {-1, -2},
            {3, 0},
            {-3, 0},
            {0, 3},
            {0, -3},
            {2, 2},
            {-2, 2},
            {2, -2},
            {-2, -2},
            {4, 0},
            {-4, 0},
            {0, 4},
            {0, -4}
         };

         for (int[] o : offsets) {
            if (this.isSafeSpawn(lvl, x + o[0], z + o[1])) {
               return new int[]{x + o[0], z + o[1]};
            }
         }

         return null;
      }
   }

   @Environment(EnvType.CLIENT)
   private record NamedSegment(String name, int ticks, CameraPath path) {
   }
}
