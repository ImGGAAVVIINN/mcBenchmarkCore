package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.CameraPath;
import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.camera.CompositePath;
import com.fpstest.client.bench.camera.LinearPath;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.camera.Pose;
import com.fpstest.client.bench.scene.Arena;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.PowerParticleOption;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.npc.villager.VillagerData;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.entity.npc.villager.VillagerType;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.PistonType;
import net.minecraft.world.level.entity.EntityTypeTest;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class BaseFpsBenchmark implements Benchmark {
   private static final int GROUND_Y = 70;
   private static final int X_MIN = -16;
   private static final int X_MAX = 320;
   private static final int Z_MIN = -64;
   private static final int Z_MAX = 64;
   private static final BlockPos C_SPAWN = new BlockPos(0, 70, 0);
   private static final BlockPos C_FOREST = new BlockPos(30, 70, 22);
   private static final BlockPos C_BASE = new BlockPos(58, 70, 2);
   private static final BlockPos C_VILLAGE = new BlockPos(92, 70, -10);
   private static final BlockPos C_COMBAT = new BlockPos(105, 70, -22);
   private static final BlockPos C_REDSTONE = new BlockPos(118, 70, 0);
   private static final BlockPos C_CAVE = new BlockPos(138, 70, 18);
   private static final BlockPos C_NETHER = new BlockPos(160, 70, -8);
   private static final BlockPos C_END = new BlockPos(250, 70, 18);
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            lvl.getServer().setDifficulty(Difficulty.NORMAL, true);
            lvl.setDayTime(6000L);
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
      ctx.setArenaOrigin(new Vec3(C_SPAWN.getX() + 0.5, 70.0, C_SPAWN.getZ() + 0.5));
      ctx.setCameraPath(path);
      Arena.teleport(ctx, new Vec3(C_SPAWN.getX() + 0.5, 74.0, C_SPAWN.getZ() + 0.5), 90.0F, 10.0F);
   }

   /**
    * Resets the per-run animation state so a subsequent measurement phase replays
    * the exact same scene (combat arrows, redstone animation, particles, segment
    * logging) from the start. The cinematic camera path itself is replayed by
    * resetting {@link CinematicState#pathTick}; this method resets the world-side
    * animation clock that {@link #tick(BenchContext)} drives.
    */
   public void resetAnimation() {
      this.animTick = 0;
      this.lastLoggedSegment = -1;
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

   private static boolean within(int x, int z, BlockPos c, int r) {
      int dx = x - c.getX();
      int dz = z - c.getZ();
      return dx * dx + dz * dz <= r * r;
   }

   private void buildTerrain(ServerLevel lvl) {
      BlockState dirt = Blocks.DIRT.defaultBlockState();
      BlockState grass = Blocks.GRASS_BLOCK.defaultBlockState();
      BlockState stone = Blocks.STONE.defaultBlockState();

      for (int x = -16; x <= 320; x++) {
         for (int z = -64; z <= 64; z++) {
            // Fill the air gap between the flat-world grass (Y=3) and the
            // benchmark floor (Y=68) with solid stone so the underlying
            // super-flat terrain is never visible through the gap.
            for (int y = 4; y <= 67; y++) {
               this.setFast(lvl, x, y, z, stone);
            }

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

   private void buildPath(ServerLevel lvl) {
      BlockState path = Blocks.DIRT_PATH.defaultBlockState();
      BlockState cobble = Blocks.COBBLESTONE.defaultBlockState();
      List<BlockPos> wp = List.of(C_SPAWN, C_FOREST, C_BASE, C_VILLAGE, C_COMBAT, C_REDSTONE, C_CAVE, C_NETHER, C_END);

      for (int i = 0; i < wp.size() - 1; i++) {
         this.drawPath(lvl, wp.get(i), wp.get(i + 1), path, cobble);
      }
   }

   private void drawPath(ServerLevel lvl, BlockPos a, BlockPos b, BlockState path, BlockState edge) {
      int x1 = a.getX();
      int z1 = a.getZ();
      int x2 = b.getX();
      int z2 = b.getZ();
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

   private void decorateGround(ServerLevel lvl) {
      Random rng = new Random(47598L);
      BlockState[] flowers = new BlockState[]{
         Blocks.POPPY.defaultBlockState(),
         Blocks.DANDELION.defaultBlockState(),
         Blocks.CORNFLOWER.defaultBlockState(),
         Blocks.OXEYE_DAISY.defaultBlockState(),
         Blocks.AZURE_BLUET.defaultBlockState(),
         Blocks.ALLIUM.defaultBlockState(),
         Blocks.BLUE_ORCHID.defaultBlockState()
      };
      BlockState shortGrass = Blocks.SHORT_GRASS.defaultBlockState();
      BlockState fern = Blocks.FERN.defaultBlockState();
      BlockState bush = Blocks.SWEET_BERRY_BUSH.defaultBlockState();
      BlockState mossCarpet = Blocks.MOSS_CARPET.defaultBlockState();
      BlockState redMush = Blocks.RED_MUSHROOM.defaultBlockState();
      BlockState brownMush = Blocks.BROWN_MUSHROOM.defaultBlockState();

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
               BlockPos here = new BlockPos(x, y, z);
               BlockState below = lvl.getBlockState(here);
               if (!below.is(Blocks.DIRT_PATH) && !below.is(Blocks.COBBLESTONE) && below.is(Blocks.GRASS_BLOCK)) {
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
                  BlockState plant = null;
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

   private boolean isNearPath(ServerLevel lvl, int x, int z, int radius) {
      int r = Math.min(2, radius);

      for (int dx = -r; dx <= r; dx++) {
         for (int dz = -r; dz <= r; dz++) {
            int xx = x + dx;
            int zz = z + dz;
            if (xx >= -16 && xx <= 320 && zz >= -64 && zz <= 64) {
               BlockState s = lvl.getBlockState(new BlockPos(xx, this.surfaceY(xx, zz), zz));
               if (s.is(Blocks.DIRT_PATH) || s.is(Blocks.COBBLESTONE)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private void scatterRocksAndStumps(ServerLevel lvl) {
      Random rng = new Random(6882L);
      BlockState mossy = Blocks.MOSSY_COBBLESTONE.defaultBlockState();
      BlockState cobble = Blocks.COBBLESTONE.defaultBlockState();

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

      BlockState log = Blocks.OAK_LOG.defaultBlockState();
      BlockState slab = Blocks.OAK_SLAB.defaultBlockState();

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

   private void scatterTrees(ServerLevel lvl) {
      Random rng = new Random(5233L);

      for (int attempt = 0; attempt < 240 && this.treesBuilt < 55; attempt++) {
         int dx = rng.nextInt(34) - 17;
         int dz = rng.nextInt(30) - 15;
         int x = C_FOREST.getX() + dx;
         int z = C_FOREST.getZ() + dz;
         if (Math.abs(dx) + Math.abs(dz) >= 3 && !lvl.getBlockState(new BlockPos(x, this.surfaceY(x, z), z)).is(Blocks.DIRT_PATH)) {
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

         if (!within(x, z, C_END, 17) && !lvl.getBlockState(new BlockPos(x, this.surfaceY(x, z), z)).is(Blocks.DIRT_PATH)) {
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
            if (!lvl.getBlockState(new BlockPos(x, this.surfaceY(x, z), z)).is(Blocks.DIRT_PATH)) {
               this.placeTree(lvl, x, z, rng, variant);
            }
         }
      }
   }

   private void placeTree(ServerLevel lvl, int x, int z, Random rng, int variant) {
      int baseY = this.surfaceY(x, z) + 1;
      BlockState log;
      BlockState leaves;
      int trunkH;
      switch (variant) {
         case 1:
            log = Blocks.BIRCH_LOG.defaultBlockState();
            leaves = Blocks.BIRCH_LEAVES.defaultBlockState();
            trunkH = 5 + rng.nextInt(2);
            break;
         case 2:
            log = Blocks.DARK_OAK_LOG.defaultBlockState();
            leaves = Blocks.DARK_OAK_LEAVES.defaultBlockState();
            trunkH = 6 + rng.nextInt(2);
            break;
         default:
            log = Blocks.OAK_LOG.defaultBlockState();
            leaves = Blocks.OAK_LEAVES.defaultBlockState();
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
                  BlockPos lp = new BlockPos(x + lx, top + ly, z + lz);
                  if (!lvl.getBlockState(lp).is(log.getBlock()) && lvl.getBlockState(lp).isAir()) {
                     lvl.setBlock(lp, leaves, 2);
                     this.blocksPlaced++;
                  }
               }
            }
         }
      }

      this.treesBuilt++;
   }

   private void buildSpawnPlaza(ServerLevel lvl) {
      int cx = C_SPAWN.getX();
      int cz = C_SPAWN.getZ();
      BlockState bricks = Blocks.STONE_BRICKS.defaultBlockState();
      BlockState chiseled = Blocks.CHISELED_STONE_BRICKS.defaultBlockState();

      for (int dx = -7; dx <= 7; dx++) {
         for (int dz = -7; dz <= 7; dz++) {
            if (dx * dx + dz * dz <= 56) {
               this.set(lvl, cx + dx, 70, cz + dz, (dx + dz & 1) == 0 ? bricks : chiseled);
            }
         }
      }

      for (int[] p : new int[][]{{-5, -5}, {5, -5}, {-5, 5}, {5, 5}}) {
         for (int dy = 1; dy <= 3; dy++) {
            this.set(lvl, cx + p[0], 70 + dy, cz + p[1], Blocks.POLISHED_BLACKSTONE_WALL.defaultBlockState());
         }

         this.set(lvl, cx + p[0], 74, cz + p[1], (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true));
      }

      this.set(lvl, cx, 71, cz, Blocks.IRON_BLOCK.defaultBlockState());
      this.set(lvl, cx, 72, cz, Blocks.DIAMOND_BLOCK.defaultBlockState());
      this.set(lvl, cx, 73, cz, Blocks.SEA_LANTERN.defaultBlockState());
      this.set(lvl, cx - 6, 71, cz, Blocks.CAMPFIRE.defaultBlockState());
      this.set(lvl, cx + 6, 71, cz, Blocks.CAMPFIRE.defaultBlockState());
   }

   private void buildForestZone(ServerLevel lvl) {
      int cx = C_FOREST.getX();
      int cz = C_FOREST.getZ();

      for (int dx = -3; dx <= 3; dx++) {
         for (int dz = -3; dz <= 3; dz++) {
            if (dx * dx + dz * dz <= 9) {
               int px = cx + 10 + dx;
               int pz = cz + 4 + dz;
               int y = this.surfaceY(px, pz);
               this.setFast(lvl, px, y, pz, Blocks.WATER.defaultBlockState());
               this.setFast(lvl, px, y - 1, pz, Blocks.STONE.defaultBlockState());
            }
         }
      }

      Random rng = new Random(39440L);

      for (int i = 0; i < 20; i++) {
         int x = cx + 4 + rng.nextInt(14);
         int z = cz - 6 + rng.nextInt(20);
         int y = this.surfaceY(x, z);
         if (lvl.getBlockState(new BlockPos(x, y, z)).is(Blocks.GRASS_BLOCK)) {
            this.setFast(lvl, x, y + 1, z, rng.nextBoolean() ? Blocks.LARGE_FERN.defaultBlockState() : Blocks.AZALEA_LEAVES.defaultBlockState());
         }
      }
   }

   private void buildPlayerBase(ServerLevel lvl) {
      int cx = C_BASE.getX();
      int cz = C_BASE.getZ();
      BlockState planks = Blocks.OAK_PLANKS.defaultBlockState();
      BlockState log = Blocks.OAK_LOG.defaultBlockState();
      BlockState glass = Blocks.GLASS.defaultBlockState();
      BlockState cobble = Blocks.COBBLESTONE.defaultBlockState();

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
            BlockState s = dy != 1 && dy != 4 && x != hxMin && x != hxMax ? planks : log;
            this.set(lvl, x, 70 + dy, hzMin, s);
            this.set(lvl, x, 70 + dy, hzMax, s);
         }
      }

      for (int z = hzMin; z <= hzMax; z++) {
         for (int dy = 1; dy <= 4; dy++) {
            BlockState s = dy != 1 && dy != 4 && z != hzMin && z != hzMax ? planks : log;
            boolean window = (dy == 2 || dy == 3) && (z == cz - 1 || z == cz + 1);
            this.set(lvl, hxMin, 70 + dy, z, window ? glass : s);
            this.set(lvl, hxMax, 70 + dy, z, window ? glass : s);
         }
      }

      BlockState stairsN = (BlockState)Blocks.OAK_STAIRS.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH);
      BlockState stairsS = (BlockState)Blocks.OAK_STAIRS.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH);

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

         this.set(lvl, x, 77, cz, (BlockState)Blocks.OAK_LOG.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.X));
      }

      int chimneyX = hxMin + 1;
      int chimneyZ = hzMax;

      for (int dy = 5; dy <= 8; dy++) {
         this.set(lvl, chimneyX, 70 + dy, chimneyZ, Blocks.COBBLESTONE.defaultBlockState());
      }

      this.set(lvl, chimneyX, 79, chimneyZ, Blocks.CAMPFIRE.defaultBlockState());
      this.set(
         lvl,
         cx,
         71,
         hzMin,
         (BlockState)((BlockState)Blocks.OAK_DOOR.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER))
            .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
      );
      this.set(
         lvl,
         cx,
         72,
         hzMin,
         (BlockState)((BlockState)Blocks.OAK_DOOR.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER))
            .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
      );
      this.set(lvl, hxMin + 1, 71, hzMin + 1, Blocks.CHEST.defaultBlockState());
      this.set(lvl, hxMin + 1, 71, hzMin + 2, Blocks.CHEST.defaultBlockState());
      this.set(lvl, hxMin + 1, 71, hzMin + 3, Blocks.BARREL.defaultBlockState());
      this.set(lvl, hxMax - 1, 71, hzMin + 1, Blocks.FURNACE.defaultBlockState());
      this.set(lvl, hxMax - 1, 71, hzMin + 2, Blocks.SMOKER.defaultBlockState());
      this.set(lvl, hxMax - 1, 71, hzMin + 3, Blocks.BLAST_FURNACE.defaultBlockState());
      this.set(lvl, hxMax - 1, 71, hzMin + 5, Blocks.ENCHANTING_TABLE.defaultBlockState());
      this.set(lvl, hxMin + 1, 71, hzMin + 5, Blocks.CRAFTING_TABLE.defaultBlockState());
      this.set(lvl, cx, 71, cz + 2, Blocks.ANVIL.defaultBlockState());
      this.set(lvl, cx - 2, 74, cz, (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true));
      this.set(lvl, cx + 2, 74, cz, (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true));

      for (int dx = -7; dx <= 7; dx++) {
         this.set(lvl, cx + dx, 71, cz - 6, Blocks.OAK_FENCE.defaultBlockState());
         this.set(lvl, cx + dx, 71, cz + 6, Blocks.OAK_FENCE.defaultBlockState());
      }

      for (int dz = -6; dz <= 6; dz++) {
         this.set(lvl, cx - 7, 71, cz + dz, Blocks.OAK_FENCE.defaultBlockState());
         this.set(lvl, cx + 7, 71, cz + dz, Blocks.OAK_FENCE.defaultBlockState());
      }

      this.set(lvl, cx, 71, cz + 6, (BlockState)Blocks.OAK_FENCE_GATE.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH));

      for (int dx = -3; dx <= 0; dx++) {
         for (int dz = 4; dz <= 5; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, (BlockState)Blocks.FARMLAND.defaultBlockState().setValue(BlockStateProperties.MOISTURE, 7));
            this.set(lvl, cx + dx, 71, cz + dz, (BlockState)Blocks.WHEAT.defaultBlockState().setValue(BlockStateProperties.AGE_7, 7));
         }
      }

      this.set(lvl, cx + 1, 70, cz + 5, Blocks.WATER.defaultBlockState());
      this.set(lvl, cx + 2, 71, cz - 5, Blocks.CAMPFIRE.defaultBlockState());
      this.set(lvl, cx - 2, 71, cz - 5, Blocks.HAY_BLOCK.defaultBlockState());
      this.set(lvl, cx + 3, 71, cz + 4, Blocks.OAK_FENCE.defaultBlockState());
      this.set(lvl, cx + 3, 72, cz + 4, Blocks.HAY_BLOCK.defaultBlockState());
      this.set(lvl, cx + 3, 73, cz + 4, (BlockState)Blocks.JACK_O_LANTERN.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH));

      for (int[] p : new int[][]{{-7, -3}, {-7, 3}, {7, -3}, {7, 3}}) {
         this.set(lvl, cx + p[0], 72, cz + p[1], Blocks.LANTERN.defaultBlockState());
      }
   }

   private void buildVillage(BenchContext ctx, ServerLevel lvl) {
      int cx = C_VILLAGE.getX();
      int cz = C_VILLAGE.getZ();
      BlockState cobble = Blocks.COBBLESTONE.defaultBlockState();
      BlockState mossy = Blocks.MOSSY_COBBLESTONE.defaultBlockState();

      for (int dx = -4; dx <= 4; dx++) {
         for (int dz = -4; dz <= 4; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, (dx + dz & 1) == 0 ? cobble : mossy);
         }
      }

      this.set(lvl, cx, 71, cz, Blocks.POLISHED_BLACKSTONE.defaultBlockState());
      this.set(lvl, cx, 72, cz, Blocks.POLISHED_BLACKSTONE_WALL.defaultBlockState());
      this.set(lvl, cx, 73, cz, Blocks.BELL.defaultBlockState());
      int[][] homes = new int[][]{{-10, -7}, {10, -7}, {-10, 7}, {10, 7}, {0, 11}};

      for (int i = 0; i < homes.length; i++) {
         this.buildSmallHouse(lvl, cx + homes[i][0], cz + homes[i][1], i);
      }

      for (int dx = -3; dx <= 4; dx++) {
         for (int dz = -10; dz <= -7; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, (BlockState)Blocks.FARMLAND.defaultBlockState().setValue(BlockStateProperties.MOISTURE, 7));
            this.set(lvl, cx + dx, 71, cz + dz, (BlockState)Blocks.WHEAT.defaultBlockState().setValue(BlockStateProperties.AGE_7, 5 + (dx + dz) % 3));
         }
      }

      this.set(lvl, cx - 4, 71, cz - 8, Blocks.COMPOSTER.defaultBlockState());
      this.set(lvl, cx + 5, 71, cz - 8, Blocks.COMPOSTER.defaultBlockState());
      this.set(lvl, cx - 3, 71, cz + 4, Blocks.BARREL.defaultBlockState());
      this.set(lvl, cx - 2, 71, cz + 4, Blocks.HAY_BLOCK.defaultBlockState());
      this.set(lvl, cx - 2, 72, cz + 4, Blocks.HAY_BLOCK.defaultBlockState());
      this.set(lvl, cx + 2, 71, cz + 4, Blocks.BARREL.defaultBlockState());
      this.set(lvl, cx + 3, 71, cz + 4, Blocks.HAY_BLOCK.defaultBlockState());

      for (int[] p : new int[][]{{-12, 0}, {12, 0}, {0, -12}, {0, 12}}) {
         this.set(lvl, cx + p[0], 71, cz + p[1], Blocks.OAK_FENCE.defaultBlockState());
         this.set(lvl, cx + p[0], 72, cz + p[1], Blocks.OAK_FENCE.defaultBlockState());
         this.set(lvl, cx + p[0], 73, cz + p[1], (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true));
      }

      Holder<VillagerType> plainsType = lvl.registryAccess().lookupOrThrow(Registries.VILLAGER_TYPE).getOrThrow(VillagerType.PLAINS);
      Holder<VillagerProfession>[] profs = new Holder[]{
         prof(lvl, VillagerProfession.FARMER),
         prof(lvl, VillagerProfession.LIBRARIAN),
         prof(lvl, VillagerProfession.CARTOGRAPHER),
         prof(lvl, VillagerProfession.FLETCHER),
         prof(lvl, VillagerProfession.ARMORER),
         prof(lvl, VillagerProfession.WEAPONSMITH),
         prof(lvl, VillagerProfession.TOOLSMITH),
         prof(lvl, VillagerProfession.LEATHERWORKER),
         prof(lvl, VillagerProfession.MASON),
         prof(lvl, VillagerProfession.NITWIT),
         prof(lvl, VillagerProfession.BUTCHER),
         prof(lvl, VillagerProfession.CLERIC)
      };
      Random rng = new Random(2863L);

      for (int i = 0; i < 36; i++) {
         Villager v = new Villager(EntityType.VILLAGER, lvl, plainsType);
         double dx = (rng.nextDouble() - 0.5) * 22.0;
         double dz = (rng.nextDouble() - 0.5) * 22.0;
         v.snapTo(cx + dx, 71.0, cz + dz, rng.nextFloat() * 360.0F, 0.0F);
         v.setVillagerData(new VillagerData(plainsType, profs[i % profs.length], 1));
         v.setNoAi(false);
         v.setPersistenceRequired();
         v.setInvulnerable(true);
         ctx.spawnTracked(v, lvl);
         this.villagersSpawned++;
      }
   }

   private static Holder<VillagerProfession> prof(ServerLevel lvl, ResourceKey<VillagerProfession> key) {
      return lvl.registryAccess().lookupOrThrow(Registries.VILLAGER_PROFESSION).getOrThrow(key);
   }

   private void buildSmallHouse(ServerLevel lvl, int cx, int cz, int variant) {
      BlockState planks = Blocks.OAK_PLANKS.defaultBlockState();
      BlockState log = Blocks.OAK_LOG.defaultBlockState();
      BlockState glass = Blocks.GLASS.defaultBlockState();
      BlockState slab = Blocks.OAK_SLAB.defaultBlockState();
      int xMin = cx - 3;
      int xMax = cx + 3;
      int zMin = cz - 2;
      int zMax = cz + 2;

      for (int x = xMin; x <= xMax; x++) {
         for (int dy = 1; dy <= 3; dy++) {
            BlockState s = dy != 1 && dy != 3 && x != xMin && x != xMax ? planks : log;
            this.set(lvl, x, 70 + dy, zMin, s);
            this.set(lvl, x, 70 + dy, zMax, s);
         }
      }

      for (int z = zMin; z <= zMax; z++) {
         for (int dy = 1; dy <= 3; dy++) {
            BlockState s = dy != 1 && dy != 3 && z != zMin && z != zMax ? planks : log;
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

      Direction door = cz <= -2 ? Direction.SOUTH : (cz >= 2 ? Direction.NORTH : (cx <= -2 ? Direction.EAST : Direction.WEST));
      int dxDoor = door != Direction.NORTH && door != Direction.SOUTH ? (door == Direction.EAST ? -3 : 3) : 0;
      int dzDoor = door == Direction.NORTH ? 2 : (door == Direction.SOUTH ? -2 : 0);
      this.set(
         lvl,
         cx + dxDoor,
         71,
         cz + dzDoor,
         (BlockState)((BlockState)Blocks.OAK_DOOR.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER))
            .setValue(BlockStateProperties.HORIZONTAL_FACING, door)
      );
      this.set(
         lvl,
         cx + dxDoor,
         72,
         cz + dzDoor,
         (BlockState)((BlockState)Blocks.OAK_DOOR.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER))
            .setValue(BlockStateProperties.HORIZONTAL_FACING, door)
      );
      BlockState bedFoot = (BlockState)((BlockState)Blocks.RED_BED.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST))
         .setValue(BlockStateProperties.BED_PART, BedPart.FOOT);
      BlockState bedHead = (BlockState)((BlockState)Blocks.RED_BED.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST))
         .setValue(BlockStateProperties.BED_PART, BedPart.HEAD);
      this.set(lvl, xMin + 1, 71, zMin + 1, bedFoot);
      this.set(lvl, xMin + 2, 71, zMin + 1, bedHead);

      BlockState ws = switch (variant) {
         case 0 -> Blocks.LECTERN.defaultBlockState();
         case 1 -> Blocks.CARTOGRAPHY_TABLE.defaultBlockState();
         case 2 -> Blocks.FLETCHING_TABLE.defaultBlockState();
         case 3 -> Blocks.SMITHING_TABLE.defaultBlockState();
         default -> Blocks.GRINDSTONE.defaultBlockState();
      };
      this.set(lvl, xMax - 1, 71, zMax - 1, ws);
      this.set(lvl, cx, 73, cz, (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true));
   }

   private void buildCombatArena(BenchContext ctx, ServerLevel lvl) {
      int cx = C_COMBAT.getX();
      int cz = C_COMBAT.getZ();
      BlockState cobble = Blocks.COBBLESTONE.defaultBlockState();
      BlockState mossy = Blocks.MOSSY_COBBLESTONE.defaultBlockState();
      BlockState bricks = Blocks.STONE_BRICKS.defaultBlockState();
      BlockState chiseled = Blocks.CHISELED_STONE_BRICKS.defaultBlockState();
      BlockState wall = Blocks.COBBLESTONE_WALL.defaultBlockState();

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

      this.set(lvl, cx - 9, 71, cz, Blocks.AIR.defaultBlockState());
      this.set(lvl, cx - 9, 71, cz + 1, Blocks.AIR.defaultBlockState());

      for (int[] t : COMBAT_TOWERS) {
         int tx = cx + t[0];
         int tz = cz + t[1];

         for (int dy = 1; dy <= 4; dy++) {
            this.setFast(lvl, tx, 70 + dy, tz, dy == 4 ? chiseled : bricks);
         }

         int ddx = -t[0];
         int ddz = -t[1];
         Direction face;
         if (Math.abs(ddx) >= Math.abs(ddz)) {
            face = ddx > 0 ? Direction.EAST : Direction.WEST;
         } else {
            face = ddz > 0 ? Direction.SOUTH : Direction.NORTH;
         }

         this.set(lvl, tx, 75, tz, (BlockState)Blocks.DISPENSER.defaultBlockState().setValue(BlockStateProperties.FACING, face));
         this.set(lvl, tx, 76, tz, Blocks.OAK_FENCE.defaultBlockState());
         this.set(lvl, tx, 77, tz, (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true));
      }

      this.setFast(lvl, cx, 71, cz, Blocks.HAY_BLOCK.defaultBlockState());
      this.setFast(lvl, cx, 72, cz, Blocks.HAY_BLOCK.defaultBlockState());
      this.setFast(lvl, cx, 73, cz, (BlockState)Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH));
      this.setFast(lvl, cx - 1, 72, cz, Blocks.HAY_BLOCK.defaultBlockState());
      this.setFast(lvl, cx + 1, 72, cz, Blocks.HAY_BLOCK.defaultBlockState());
      this.setFast(lvl, cx - 3, 71, cz, chiseled);
      this.setFast(lvl, cx - 3, 72, cz, chiseled);
      this.setFast(lvl, cx + 3, 71, cz, chiseled);
      this.setFast(lvl, cx + 3, 72, cz, chiseled);
      this.spawnPassiveSafe(ctx, lvl, EntityType.ZOMBIE, cx - 5, cz - 4, false);
      this.spawnPassiveSafe(ctx, lvl, EntityType.ZOMBIE, cx + 5, cz + 4, false);
      this.spawnPassiveSafe(ctx, lvl, EntityType.SKELETON, cx - 2, cz - 6, false);
      this.spawnPassiveSafe(ctx, lvl, EntityType.SKELETON, cx + 2, cz + 6, false);
      this.spawnPassiveSafe(ctx, lvl, EntityType.PILLAGER, cx - 6, cz + 2, false);
      this.spawnPassiveSafe(ctx, lvl, EntityType.PILLAGER, cx + 6, cz - 2, false);
   }

   private void buildRedstoneScene(ServerLevel lvl) {
      int cx = C_REDSTONE.getX();
      int cz = C_REDSTONE.getZ();
      BlockState quartz = Blocks.QUARTZ_BLOCK.defaultBlockState();
      BlockState floor = Blocks.POLISHED_BLACKSTONE.defaultBlockState();

      for (int dx = -4; dx <= 4; dx++) {
         for (int dz = -4; dz <= 4; dz++) {
            this.set(lvl, cx + dx, 70, cz + dz, floor);
         }
      }

      this.set(lvl, cx, 71, cz - 2, quartz);
      this.set(lvl, cx, 71, cz - 3, (BlockState)Blocks.OBSERVER.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.NORTH));
      this.set(lvl, cx, 71, cz - 1, (BlockState)Blocks.OBSERVER.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.SOUTH));

      for (int dx = 2; dx <= 4; dx++) {
         for (int dy = 1; dy <= 3; dy++) {
            this.set(lvl, cx + dx, 70 + dy, cz, (BlockState)Blocks.REDSTONE_LAMP.defaultBlockState().setValue(BlockStateProperties.LIT, false));
         }
      }

      for (int dy = 0; dy <= 4; dy++) {
         this.set(lvl, cx + 5, 70 + dy, cz - 1, (BlockState)Blocks.QUARTZ_PILLAR.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y));
         this.set(lvl, cx + 5, 70 + dy, cz + 1, (BlockState)Blocks.QUARTZ_PILLAR.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y));
      }

      for (int dy = 1; dy <= 3; dy++) {
         this.set(lvl, cx + 5, 70 + dy, cz, Blocks.IRON_BARS.defaultBlockState());
      }

      this.set(lvl, cx + 5, 74, cz, Blocks.CHISELED_QUARTZ_BLOCK.defaultBlockState());
      this.set(
         lvl,
         cx - 2,
         71,
         cz + 2,
         (BlockState)((BlockState)Blocks.STICKY_PISTON.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP))
            .setValue(BlockStateProperties.EXTENDED, false)
      );
      this.set(lvl, cx - 2, 72, cz + 2, Blocks.IRON_BLOCK.defaultBlockState());
      this.set(lvl, cx - 2, 73, cz + 2, Blocks.AIR.defaultBlockState());
      this.set(lvl, cx - 3, 71, cz + 2, Blocks.RED_CONCRETE.defaultBlockState());
      this.set(lvl, cx + 1, 71, cz + 2, (BlockState)Blocks.REPEATER.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH));

      for (int dz = 3; dz <= 4; dz++) {
         this.set(lvl, cx + 1, 71, cz + dz, Blocks.REDSTONE_WIRE.defaultBlockState());
      }

      for (int[] p : new int[][]{{-4, -4}, {4, -4}, {-4, 4}, {4, 4}}) {
         this.set(lvl, cx + p[0], 71, cz + p[1], (BlockState)Blocks.END_ROD.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP));
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
            ServerLevel lvl = (ServerLevel) ctx.serverLevel();
            ServerPlayer p = ctx.serverPlayer();
            if (lvl != null && p != null) {
               if (camPose != null) {
                  p.teleportTo(lvl, camPose.pos().x, camPose.pos().y, camPose.pos().z, Set.of(), camPose.yaw(), camPose.pitch(), true);
                  p.setOnGround(false);
                  p.setInvulnerable(true);
                  p.setInvisible(true);
                  p.setNoGravity(true);
                  p.noPhysics = true;
               }

               int cx = C_REDSTONE.getX();
               int cz = C_REDSTONE.getZ();
               this.tickCombatArena(lvl);
               this.tickZoneParticles(lvl);
               if (this.animTick % 40 == 0) {
                  AABB hugeBox = new AABB(-1024.0, -64.0, -1024.0, 1024.0, 320.0, 1024.0);

                  for (ItemEntity it : lvl.getEntities(EntityTypeTest.forClass(ItemEntity.class), hugeBox, e -> true)) {
                     it.discard();
                  }

                  for (net.minecraft.world.entity.ExperienceOrb orb : lvl.getEntities(EntityTypeTest.forClass(net.minecraft.world.entity.ExperienceOrb.class), hugeBox, e -> true)) {
                     orb.discard();
                  }
               }

               if (this.animTick % 10 == 0) {
                  int phase = this.animTick / 10 % 3;

                  for (int col = 0; col < 3; col++) {
                     boolean lit = col == phase;
                     BlockState lamp = (BlockState)Blocks.REDSTONE_LAMP.defaultBlockState().setValue(BlockStateProperties.LIT, lit);

                     for (int dy = 1; dy <= 3; dy++) {
                        lvl.setBlock(new BlockPos(cx + 2 + col, 70 + dy, cz), lamp, 2);
                     }
                  }
               }

               if (this.animTick % 20 == 0) {
                  int x = cx - 2;
                  int z = cz + 2;
                  boolean extended = this.animTick / 20 % 2 == 1;
                  if (extended) {
                     lvl.setBlock(
                        new BlockPos(x, 71, z),
                        (BlockState)((BlockState)Blocks.STICKY_PISTON.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP))
                           .setValue(BlockStateProperties.EXTENDED, true),
                        2
                     );
                     lvl.setBlock(
                        new BlockPos(x, 72, z),
                        (BlockState)((BlockState)Blocks.PISTON_HEAD.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP))
                           .setValue(BlockStateProperties.PISTON_TYPE, PistonType.STICKY),
                        2
                     );
                     lvl.setBlock(new BlockPos(x, 73, z), Blocks.IRON_BLOCK.defaultBlockState(), 2);
                  } else {
                     lvl.setBlock(
                        new BlockPos(x, 71, z),
                        (BlockState)((BlockState)Blocks.STICKY_PISTON.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP))
                           .setValue(BlockStateProperties.EXTENDED, false),
                        2
                     );
                     lvl.setBlock(new BlockPos(x, 72, z), Blocks.IRON_BLOCK.defaultBlockState(), 2);
                     lvl.setBlock(new BlockPos(x, 73, z), Blocks.AIR.defaultBlockState(), 2);
                  }
               }
            }
         }
      );
   }

   private void tickCombatArena(ServerLevel lvl) {
      int cx = C_COMBAT.getX();
      int cz = C_COMBAT.getZ();
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
               lvl.sendParticles(
                  ParticleTypes.CRIT, s[0] + (dummyX - s[0]) * f, s[1] + (dummyY - s[1]) * f, s[2] + (dummyZ - s[2]) * f, 1, 0.06, 0.06, 0.06, 0.0
               );
            }
         }

         if (this.animTick % 15 == 0) {
            AABB arenaBox = new AABB(cx - 25, 50.0, cz - 25, cx + 25, 100.0, cz + 25);

            for (Arrow old : lvl.getEntities(EntityTypeTest.forClass(Arrow.class), arenaBox, e -> true)) {
               old.discard();
            }

            ItemStack arrowStack = new ItemStack(Items.ARROW);
            ItemStack bowStack = new ItemStack(Items.BOW);

            for (double[] s : spawn) {
               double dx = dummyX - s[0];
               double dy = dummyY - s[1];
               double dz = dummyZ - s[2];
               Arrow arrow = new Arrow(lvl, s[0], s[1], s[2], arrowStack, bowStack);
               arrow.shoot(dx, dy, dz, 0.9F, 0.0F);
               arrow.setNoGravity(true);
               arrow.setInvulnerable(true);
               lvl.addFreshEntity(arrow);
               lvl.sendParticles(ParticleTypes.FLAME, s[0], s[1], s[2], 6, 0.2, 0.2, 0.2, 0.02);
               lvl.sendParticles(ParticleTypes.POOF, s[0], s[1], s[2], 3, 0.15, 0.1, 0.15, 0.02);
            }
         }

         if (this.animTick % 3 == 0) {
            lvl.sendParticles(ParticleTypes.CRIT, dummyX, dummyY, dummyZ, 8, 0.8, 0.6, 0.8, 0.06);
         }

         if (this.animTick % 5 == 0) {
            for (double[] s : spawn) {
               lvl.sendParticles(ParticleTypes.FLAME, s[0], s[1], s[2], 2, 0.1, 0.15, 0.1, 0.01);
               lvl.sendParticles(ParticleTypes.SMOKE, s[0], s[1] + 0.3, s[2], 1, 0.1, 0.1, 0.1, 0.01);
            }
         }
      } else {
         if (this.animTick == 1811 || this.animTick == 1812) {
            AABB bigBox = new AABB(cx - 30, 40.0, cz - 30, cx + 30, 110.0, cz + 30);

            for (Arrow old : lvl.getEntities(EntityTypeTest.forClass(Arrow.class), bigBox, e -> true)) {
               old.discard();
            }
         }
      }
   }

   private void tickZoneParticles(ServerLevel lvl) {
      int caveX = C_CAVE.getX() + 9;
      int caveZ = C_CAVE.getZ();
      int nx = C_NETHER.getX();
      int nz = C_NETHER.getZ();
      int ex = C_END.getX();
      int ez = C_END.getZ();
      if (this.animTick % 8 == 0) {
         lvl.sendParticles(ParticleTypes.DRIPPING_WATER, caveX + 2.5, 73.5, caveZ + 1.0, 2, 0.3, 0.0, 0.3, 0.0);
         lvl.sendParticles(ParticleTypes.DRIPPING_WATER, caveX + 5.5, 73.5, caveZ - 1.5, 2, 0.3, 0.0, 0.3, 0.0);
      }

      if (this.animTick % 12 == 0) {
         lvl.sendParticles(ParticleTypes.SPLASH, caveX + 5.5, 71.2, caveZ + 2.5, 4, 0.2, 0.05, 0.2, 0.05);
      }

      if (this.animTick % 20 == 0) {
         lvl.sendParticles(ParticleTypes.BUBBLE_POP, caveX + 2.5, 71.2, caveZ + 2.5, 3, 0.3, 0.05, 0.3, 0.02);
      }

      if (this.animTick % 6 == 0) {
         for (int[] cascade : new int[][]{{8, 4}, {-11, -5}, {-3, 12}}) {
            lvl.sendParticles(ParticleTypes.LAVA, nx + cascade[0] + 0.5, 72.0, nz + cascade[1] + 0.5, 1, 0.2, 0.2, 0.2, 0.0);
            lvl.sendParticles(ParticleTypes.FLAME, nx + cascade[0] + 0.5, 74.0, nz + cascade[1] + 0.5, 2, 0.2, 0.4, 0.2, 0.01);
         }
      }

      if (this.animTick % 15 == 0) {
         for (int dx = -3; dx <= 3; dx += 2) {
            lvl.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, nx + dx + 0.5, 70.5, nz + 10.5, 1, 0.05, 0.1, 0.05, 0.01);
         }
      }

      if (this.animTick % 24 == 0) {
         lvl.sendParticles(ParticleTypes.PORTAL, nx + 0.5, 71.5, nz + 11.5, 6, 0.6, 0.6, 0.4, 0.05);
      }

      if (this.animTick % 8 == 0) {
         lvl.sendParticles(ParticleTypes.PORTAL, ex + 0.5, 77.5, ez + 0.5, 5, 1.2, 0.8, 1.2, 0.05);
      }

      if (this.animTick % 14 == 0) {
         int[][] tops = new int[][]{{-12, 0, 18}, {12, 0, 22}, {0, -12, 16}, {0, 12, 14}, {-9, -9, 20}, {9, 9, 22}, {-9, 9, 16}, {9, -9, 18}};

         for (int[] p : tops) {
            lvl.sendParticles(ParticleTypes.REVERSE_PORTAL, ex + p[0] + 0.5, 78 + p[2] + 0.5, ez + p[1] + 0.5, 1, 0.3, 0.1, 0.3, 0.02);
         }
      }

      if (this.animTick % 30 == 0) {
         lvl.sendParticles(PowerParticleOption.create(ParticleTypes.DRAGON_BREATH, 1.0F), ex + 0.5, 87.5, ez + 0.5, 3, 0.6, 0.2, 0.6, 0.05);
      }
   }

   private void buildWaterCave(BenchContext ctx, ServerLevel lvl) {
      int cx = C_CAVE.getX();
      int cz = C_CAVE.getZ();
      int gy = 70;

      for (int dx = -11; dx <= 11; dx++) {
         for (int dz = -11; dz <= 11; dz++) {
            int r2 = dx * dx + dz * dz;
            if (r2 <= 121) {
               int x = cx + dx;
               int z = cz + dz;
               int y = this.surfaceY(x, z);
               if (r2 <= 64) {
                  this.setFast(lvl, x, y, z, Blocks.WATER.defaultBlockState());
                  this.setFast(lvl, x, y - 1, z, Blocks.STONE.defaultBlockState());
               } else {
                  this.setFast(lvl, x, y, z, Blocks.SAND.defaultBlockState());
               }
            }
         }
      }

      int gx = cx + 9;
      BlockState cobble = Blocks.COBBLESTONE.defaultBlockState();
      BlockState mossy = Blocks.MOSSY_COBBLESTONE.defaultBlockState();

      for (int dx = 0; dx <= 13; dx++) {
         for (int dzx = -5; dzx <= 5; dzx++) {
            for (int dy = 0; dy <= 8; dy++) {
               int x = gx + dx;
               int z = cz + dzx;
               boolean shell = dy == 0 || dy == 8 || dx == 13 || dzx == -5 || dzx == 5;
               if (shell) {
                  BlockState mat = (dx + dzx + dy) % 3 == 0 ? mossy : cobble;
                  this.setFast(lvl, x, gy + dy, z, mat);
               }
            }
         }
      }

      for (int dyx = 1; dyx <= 7; dyx++) {
         for (int dzx = -4; dzx <= 4; dzx++) {
            this.setFast(lvl, gx, gy + dyx, cz + dzx, Blocks.AIR.defaultBlockState());
         }
      }

      for (int dx = 1; dx <= 12; dx++) {
         for (int dzx = -4; dzx <= 4; dzx++) {
            BlockState floor = (dx + dzx) % 4 == 0 ? Blocks.MOSS_BLOCK.defaultBlockState() : Blocks.STONE.defaultBlockState();
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
                  dyx == 2 && (dx + dzx) % 2 == 0 ? Blocks.BUDDING_AMETHYST.defaultBlockState() : Blocks.AMETHYST_BLOCK.defaultBlockState()
               );
            }
         }
      }

      for (int[] c : new int[][]{{8, -3}, {9, -1}, {10, -2}, {11, -3}, {12, -1}, {9, -4}, {11, -4}, {8, -2}, {10, -4}}) {
         BlockPos p = new BlockPos(gx + c[0], gy + 1, cz + c[1]);
         if (lvl.getBlockState(p).isAir()) {
            lvl.setBlock(p, (BlockState)Blocks.AMETHYST_CLUSTER.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP), 2);
            this.blocksPlaced++;
         }
      }

      int[][] stalac = new int[][]{{2, 0}, {4, -2}, {5, 2}, {7, -1}, {8, 1}, {3, 3}, {10, 2}, {6, -3}};

      for (int[] s : stalac) {
         BlockPos p = new BlockPos(gx + s[0], gy + 7, cz + s[1]);
         if (lvl.getBlockState(p).isAir()) {
            lvl.setBlock(p, (BlockState)Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.DOWN), 2);
            this.blocksPlaced++;
         }
      }

      int[][] stalag = new int[][]{{2, -2}, {3, 2}, {5, -1}, {7, 2}, {6, 0}, {4, 1}, {8, -2}, {1, 3}};

      for (int[] sx : stalag) {
         BlockPos p = new BlockPos(gx + sx[0], gy + 1, cz + sx[1]);
         if (lvl.getBlockState(p).isAir()) {
            lvl.setBlock(p, (BlockState)Blocks.POINTED_DRIPSTONE.defaultBlockState().setValue(BlockStateProperties.VERTICAL_DIRECTION, Direction.UP), 2);
            this.blocksPlaced++;
         }
      }

      for (int dx = 1; dx <= 12; dx++) {
         for (int dzx = -4; dzx <= 4; dzx++) {
            BlockPos p = new BlockPos(gx + dx, gy + 7, cz + dzx);
            if ((dx + dzx) % 3 == 0 && lvl.getBlockState(p).isAir()) {
               BlockPos above = new BlockPos(gx + dx, gy + 8, cz + dzx);
               if (!lvl.getBlockState(above).isAir()) {
                  lvl.setBlock(p, (BlockState)Blocks.GLOW_LICHEN.defaultBlockState().setValue(BlockStateProperties.DOWN, true), 2);
                  this.blocksPlaced++;
               }
            }
         }
      }

      for (int dx : new int[]{3, 7, 11}) {
         BlockPos p = new BlockPos(gx + dx, gy + 6, cz);
         if (lvl.getBlockState(p).isAir()) {
            lvl.setBlock(p, (BlockState)Blocks.LANTERN.defaultBlockState().setValue(BlockStateProperties.HANGING, true), 2);
            this.blocksPlaced++;
         }
      }

      for (int dyx = 1; dyx <= 5; dyx++) {
         this.setFast(lvl, gx + 13, gy + dyx, cz + 3, Blocks.LAVA.defaultBlockState());
      }

      this.setFast(lvl, gx + 12, gy, cz + 3, Blocks.MAGMA_BLOCK.defaultBlockState());
      this.setFast(lvl, gx + 13, gy, cz + 3, Blocks.MAGMA_BLOCK.defaultBlockState());
      this.setFast(lvl, gx + 13, gy, cz + 4, Blocks.MAGMA_BLOCK.defaultBlockState());

      for (int dyx = 1; dyx <= 4; dyx++) {
         this.setFast(
            lvl, gx + 12, gy + dyx, cz + 4, (BlockState)Blocks.BASALT.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y)
         );
         this.setFast(
            lvl, gx + 13, gy + dyx, cz + 4, (BlockState)Blocks.BASALT.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y)
         );
      }

      for (int dxx = 1; dxx <= 12; dxx++) {
         this.setFast(lvl, gx + dxx, gy, cz + 4, Blocks.PACKED_ICE.defaultBlockState());
         this.setFast(lvl, gx + dxx, gy + 1, cz + 4, Blocks.WATER.defaultBlockState());
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
                  this.setFast(lvl, x, gy + dyx, z, Blocks.AIR.defaultBlockState());
               }
            }
         }
      }

      for (int dxx = 5; dxx <= 6; dxx++) {
         for (int dyxx = 1; dyxx <= 2; dyxx++) {
            this.setFast(lvl, gx + dxx, gy + dyxx, cz - 5, Blocks.AIR.defaultBlockState());
         }
      }

      for (int[] m : new int[][]{{5, -7}, {6, -6}, {7, -7}, {4, -7}}) {
         this.setFast(lvl, gx + m[0], gy + 1, cz + m[1], (m[0] + m[1]) % 2 == 0 ? Blocks.RED_MUSHROOM.defaultBlockState() : Blocks.BROWN_MUSHROOM.defaultBlockState());
      }

      for (int dxx = -3; dxx <= 3; dxx++) {
         this.setFast(lvl, cx + dxx, 70, cz - 7, Blocks.COBBLESTONE.defaultBlockState());
         this.setFast(lvl, cx + dxx, 71, cz - 7, Blocks.COBBLESTONE_WALL.defaultBlockState());
      }

      this.spawnPassiveSafe(ctx, lvl, EntityType.DROWNED, cx + 2, cz, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.SKELETON, gx + 11, cz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.AXOLOTL, cx, cz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.AXOLOTL, cx + 1, cz + 2, true);
   }

   private void buildNetherAlcove(BenchContext ctx, ServerLevel lvl) {
      int cx = C_NETHER.getX();
      int cz = C_NETHER.getZ();
      int floorY = 66;
      int ceilY = 78;

      for (int dx = -17; dx <= 17; dx++) {
         for (int dz = -17; dz <= 17; dz++) {
            int r2 = dx * dx + dz * dz;
            if (r2 <= 289) {
               int x = cx + dx;
               int z = cz + dz;

               for (int y = floorY + 1; y < ceilY; y++) {
                  this.setFast(lvl, x, y, z, Blocks.AIR.defaultBlockState());
               }

               this.setFast(lvl, x, floorY, z, Blocks.NETHERRACK.defaultBlockState());
               this.setFast(lvl, x, ceilY, z, Blocks.BLACKSTONE.defaultBlockState());
               if (r2 > 225) {
                  for (int y = floorY + 1; y < ceilY; y++) {
                     this.setFast(lvl, x, y, z, (y + dx + dz) % 4 == 0 ? Blocks.NETHERRACK.defaultBlockState() : Blocks.BLACKSTONE.defaultBlockState());
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
               this.setFast(lvl, x, y, z, Blocks.AIR.defaultBlockState());
            }

            this.setFast(lvl, x, floorY, z, Blocks.NETHERRACK.defaultBlockState());
            this.setFast(lvl, x, floorY - 1, z, Blocks.BLACKSTONE.defaultBlockState());
            this.setFast(lvl, x, ceilY, z, Blocks.BLACKSTONE.defaultBlockState());
            this.setFast(lvl, x, ceilY + 1, z, Blocks.BLACKSTONE.defaultBlockState());
         }
      }

      for (int dx = -25; dx <= -8; dx++) {
         for (int y = floorY - 1; y <= ceilY + 1; y++) {
            this.setFast(lvl, cx + dx, y, cz - 6, Blocks.BLACKSTONE.defaultBlockState());
            this.setFast(lvl, cx + dx, y, cz + 6, Blocks.BLACKSTONE.defaultBlockState());
         }
      }

      for (int dx = -18; dx <= 18; dx++) {
         for (int dzx = -18; dzx <= 18; dzx++) {
            int r2 = dx * dx + dzx * dzx;
            if (r2 <= 324) {
               int x = cx + dx;
               int z = cz + dzx;
               this.setFast(lvl, x, ceilY + 1, z, Blocks.BLACKSTONE.defaultBlockState());
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
                     this.setFast(lvl, x, y, z, Blocks.BLACKSTONE.defaultBlockState());
                  }
               }
            }
         }
      }

      for (int dx = -25; dx <= -8; dx++) {
         for (int dzxxx = -6; dzxxx <= 6; dzxxx++) {
            int x = cx + dx;
            int z = cz + dzxxx;
            this.setFast(lvl, x, floorY - 1, z, Blocks.BLACKSTONE.defaultBlockState());
            if (dzxxx == 6 || dzxxx == -6) {
               this.setFast(lvl, x, floorY, z, Blocks.NETHERRACK.defaultBlockState());
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
                  this.setFast(lvl, lx + dx, floorY, lz + dzxxxx, Blocks.MAGMA_BLOCK.defaultBlockState());
                  if (dx == 0 && dzxxxx == 0) {
                     this.setFast(lvl, lx, floorY + 1, lz, Blocks.LAVA.defaultBlockState());
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
            this.setFast(lvl, lx, ceilY - 1, lz, Blocks.GLOWSTONE.defaultBlockState());
         }
      }

      for (int[] p : new int[][]{{-6, -6}, {6, -6}, {-6, 6}, {6, 6}, {0, 8}, {0, -8}}) {
         int x = cx + p[0];
         int z = cz + p[1];
         this.setFast(lvl, x, floorY + 1, z, Blocks.SOUL_SAND.defaultBlockState());
         this.setFast(lvl, x, floorY + 2, z, Blocks.SOUL_FIRE.defaultBlockState());
      }

      for (int ix = 0; ix < 12; ix++) {
         int lx = cx + rng.nextInt(18) - 9;
         int lz = cz + rng.nextInt(18) - 9;
         if ((lx - cx) * (lx - cx) + (lz - cz) * (lz - cz) <= 81) {
            BlockPos floor = new BlockPos(lx, floorY, lz);
            if (lvl.getBlockState(floor).is(Blocks.NETHERRACK)) {
               this.setFast(lvl, lx, floorY, lz, Blocks.CRIMSON_NYLIUM.defaultBlockState());
               if (rng.nextBoolean()) {
                  this.setFast(lvl, lx, floorY + 1, lz, Blocks.CRIMSON_ROOTS.defaultBlockState());
               }
            }
         }
      }

      for (int dx = -4; dx <= 4; dx++) {
         for (int dy = 0; dy < 4; dy++) {
            this.setFast(lvl, cx + dx, floorY + 1 + dy, cz + 9, Blocks.NETHER_BRICKS.defaultBlockState());
         }
      }

      for (int dx = -4; dx <= 4; dx += 2) {
         this.setFast(lvl, cx + dx, floorY + 5, cz + 9, Blocks.RED_NETHER_BRICKS.defaultBlockState());
      }

      for (int[] p : new int[][]{{-4, 6}, {4, 6}, {0, 8}, {-2, 4}, {2, 4}}) {
         this.setFast(lvl, cx + p[0], floorY + 3, cz + p[1], Blocks.SHROOMLIGHT.defaultBlockState());
      }

      int[][] columns = new int[][]{{-9, -4}, {9, -4}, {-4, 9}, {4, 9}, {-10, 3}, {10, 3}};

      for (int[] p : columns) {
         int x = cx + p[0];
         int z = cz + p[1];

         for (int dy = 1; dy <= 5; dy++) {
            BlockState b = dy % 2 == 0
               ? (BlockState)Blocks.POLISHED_BASALT.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y)
               : (BlockState)Blocks.BASALT.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y);
            this.setFast(lvl, x, floorY + dy, z, b);
         }
      }

      for (int[] p : new int[][]{{-9, -4}, {9, -4}}) {
         int x = cx + p[0];
         int z = cz + p[1];
         this.setFast(lvl, x, 75, z + 1, Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState());
         this.setFast(lvl, x, 75, z - 1, Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState());
      }

      for (int[] cascade : new int[][]{{8, 4}, {-11, -5}, {-3, 12}}) {
         int x = cx + cascade[0];
         int z = cz + cascade[1];
         this.setFast(lvl, x, ceilY - 1, z, Blocks.MAGMA_BLOCK.defaultBlockState());

         for (int dy = floorY + 1; dy < ceilY - 1; dy++) {
            this.setFast(lvl, x, dy, z, Blocks.LAVA.defaultBlockState());
         }

         this.setFast(lvl, x, floorY, z, Blocks.MAGMA_BLOCK.defaultBlockState());
      }

      BlockState nb = Blocks.NETHER_BRICKS.defaultBlockState();
      BlockState rnb = Blocks.RED_NETHER_BRICKS.defaultBlockState();

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
         BlockPos p = new BlockPos(cx + dx, floorY + 4, cz + 10);
         if (lvl.getBlockState(p).isAir()) {
            lvl.setBlock(p, (BlockState)Blocks.SOUL_WALL_TORCH.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), 2);
            this.blocksPlaced++;
         }
      }

      BlockState bsStairs = (BlockState)Blocks.BLACKSTONE_STAIRS.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH);

      for (int dxx = -1; dxx <= 1; dxx++) {
         this.setFast(lvl, cx + dxx, floorY + 1, cz + 9, bsStairs);
      }

      for (int ixx = 0; ixx < 6; ixx++) {
         this.spawnPassive(ctx, lvl, EntityType.ZOMBIFIED_PIGLIN, cx - 6 + ixx * 2, floorY + 1, cz - 2 + ixx % 3 - 1);
      }

      for (int ixx = 0; ixx < 3; ixx++) {
         this.spawnPassive(ctx, lvl, EntityType.PIGLIN, cx + 3 + ixx * 2, floorY + 1, cz + 5);
      }

      this.spawnPassive(ctx, lvl, EntityType.WITHER_SKELETON, cx, floorY + 1, cz + 11);

      for (int[] sp : new int[][]{{4, 2}, {-8, -4}}) {
         int sx = cx + sp[0];
         int sz = cz + sp[1];

         for (int dxx = -1; dxx <= 1; dxx++) {
            for (int dzxxxxxx = -1; dzxxxxxx <= 1; dzxxxxxx++) {
               this.setFast(lvl, sx + dxx, floorY, sz + dzxxxxxx, Blocks.MAGMA_BLOCK.defaultBlockState());
               this.setFast(lvl, sx + dxx, floorY + 1, sz + dzxxxxxx, Blocks.LAVA.defaultBlockState());
            }
         }

         this.spawnPassive(ctx, lvl, EntityType.STRIDER, sx, floorY + 2, sz);
      }
   }

   private void buildEndIsland(BenchContext ctx, ServerLevel lvl) {
      int cx = C_END.getX();
      int cz = C_END.getZ();
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
                     this.setFast(lvl, x, 70, z, Blocks.WATER.defaultBlockState());
                     this.setFast(lvl, x, 69, z, Blocks.STONE.defaultBlockState());
                  } else {
                     for (int y = surf; y <= islandTop; y++) {
                        this.setFast(lvl, x, y, z, Blocks.END_STONE.defaultBlockState());
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
                        this.setFast(lvl, x, y, z, Blocks.END_STONE.defaultBlockState());
                     }
                  }
               }
            }
         }

         if (ocx >= -16 && ocx <= 320 && ocz >= -64 && ocz <= 64) {
            this.setFast(lvl, ocx, oTop + 1, ocz, Blocks.PURPUR_BLOCK.defaultBlockState());
            int hClu = 4 + orng.nextInt(3);

            for (int dy = 1; dy <= hClu; dy++) {
               this.setFast(lvl, ocx + 2, oTop + dy, ocz, Blocks.CHORUS_PLANT.defaultBlockState());
            }

            this.setFast(lvl, ocx + 2, oTop + hClu + 1, ocz, Blocks.CHORUS_FLOWER.defaultBlockState());
            int hClu2 = 3 + orng.nextInt(3);

            for (int dy = 1; dy <= hClu2; dy++) {
               this.setFast(lvl, ocx - 2, oTop + dy, ocz + 1, Blocks.CHORUS_PLANT.defaultBlockState());
            }

            this.setFast(lvl, ocx - 2, oTop + hClu2 + 1, ocz + 1, Blocks.CHORUS_FLOWER.defaultBlockState());
         }
      }

      int[][] pillarPos = new int[][]{{-15, 0, 24}, {15, 0, 28}, {0, -15, 22}, {0, 15, 20}, {-11, -11, 26}, {11, 11, 28}, {-11, 11, 22}, {11, -11, 24}};

      for (int[] p : pillarPos) {
         int px = cx + p[0];
         int pz = cz + p[1];
         int h = p[2];

         for (int dy = 1; dy <= h; dy++) {
            this.setFast(lvl, px, islandTop + dy, pz, Blocks.OBSIDIAN.defaultBlockState());
         }

         for (int dx = -1; dx <= 1; dx++) {
            for (int dzxx = -1; dzxx <= 1; dzxx++) {
               if (dx != 0 || dzxx != 0) {
                  this.setFast(lvl, px + dx, islandTop + h + 1, pz + dzxx, Blocks.IRON_BARS.defaultBlockState());
               }
            }
         }

         EndCrystal crystal = new EndCrystal(lvl, px + 0.5, islandTop + h + 2, pz + 0.5);
         crystal.setShowBottom(false);
         crystal.setInvulnerable(true);
         ctx.spawnTracked(crystal, lvl);
         this.otherEntitiesSpawned++;
      }

      for (int dy = 1; dy <= 12; dy++) {
         this.setFast(
            lvl, cx, islandTop + dy, cz, (BlockState)Blocks.PURPUR_PILLAR.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y)
         );
      }

      this.setFast(lvl, cx, islandTop + 13, cz, Blocks.DRAGON_HEAD.defaultBlockState());

      for (int[] p : new int[][]{{-2, 0}, {2, 0}, {0, -2}, {0, 2}, {-2, -2}, {2, 2}, {-2, 2}, {2, -2}}) {
         this.setFast(lvl, cx + p[0], islandTop + 1, cz + p[1], Blocks.PURPUR_BLOCK.defaultBlockState());
      }

      for (int[] p : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
         this.setFast(lvl, cx + p[0], islandTop + 2, cz + p[1], Blocks.PURPUR_BLOCK.defaultBlockState());
      }

      for (int[] p : new int[][]{{-3, 0}, {3, 0}, {0, -3}, {0, 3}, {-3, 3}, {3, -3}, {-3, -3}, {3, 3}}) {
         this.setFast(
            lvl,
            cx + p[0],
            islandTop + 1,
            cz + p[1],
            (BlockState)Blocks.END_ROD.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP)
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
                  this.setFast(lvl, x, islandTop + dy, z, Blocks.CHORUS_PLANT.defaultBlockState());
               }

               this.setFast(lvl, x, islandTop + h + 1, z, Blocks.CHORUS_FLOWER.defaultBlockState());
            }
         }
      }

      int[][] aiOff = new int[][]{{-9, 0}, {9, 0}, {0, -9}, {0, 9}, {-7, 7}, {7, -7}};

      for (int[] p : aiOff) {
         this.spawnPassive(ctx, lvl, EntityType.ENDERMAN, cx + p[0], islandTop + 1, cz + p[1]);
      }

      int[][] aiOn = new int[][]{{-5, -5}, {5, 5}, {-5, 5}, {5, -5}, {-7, -2}, {7, 2}};

      for (int[] p : aiOn) {
         this.spawnPassiveSafe(ctx, lvl, EntityType.ENDERMAN, cx + p[0], cz + p[1], true);
      }

      FpsTestClient.LOG
         .info(
            "[BaseFps] End built: center=({},{}) islandR={} moatR={} pillars={} outliers={}",
            new Object[]{cx, cz, moatInner, moatOuter, pillarPos.length, outIslands.length}
         );
   }

   private void spawnAmbientAnimals(BenchContext ctx, ServerLevel lvl) {
      int bx = C_BASE.getX();
      int bz = C_BASE.getZ();
      this.spawnPassiveSafe(ctx, lvl, EntityType.COW, bx - 4, bz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.COW, bx - 4, bz + 1, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.COW, bx - 5, bz - 3, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.COW, bx - 3, bz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.CHICKEN, bx + 2, bz + 3, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.CHICKEN, bx + 4, bz + 3, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.CHICKEN, bx + 3, bz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.CHICKEN, bx + 5, bz - 1, true);
      int penCx = C_VILLAGE.getX() + 11;
      int penCz = C_VILLAGE.getZ() + 6;
      BlockState fence = Blocks.OAK_FENCE.defaultBlockState();
      BlockState gate = (BlockState)Blocks.OAK_FENCE_GATE.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST);

      for (int dx = -3; dx <= 3; dx++) {
         this.set(lvl, penCx + dx, 71, penCz - 3, fence);
         this.set(lvl, penCx + dx, 71, penCz + 3, fence);
      }

      for (int dz = -3; dz <= 3; dz++) {
         this.set(lvl, penCx - 3, 71, penCz + dz, fence);
         this.set(lvl, penCx + 3, 71, penCz + dz, fence);
      }

      this.set(lvl, penCx - 3, 71, penCz, gate);
      this.set(lvl, penCx, 71, penCz - 1, Blocks.HAY_BLOCK.defaultBlockState());
      this.set(lvl, penCx + 1, 70, penCz + 1, Blocks.WATER.defaultBlockState());
      this.spawnPassiveSafe(ctx, lvl, EntityType.SHEEP, penCx - 1, penCz - 1, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.SHEEP, penCx + 1, penCz - 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.SHEEP, penCx - 2, penCz + 1, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.SHEEP, penCx + 2, penCz + 1, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.PIG, penCx, penCz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.PIG, penCx - 1, penCz + 2, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.PIG, penCx + 2, penCz - 1, true);
      this.spawnPassiveSafe(ctx, lvl, EntityType.PIG, penCx, penCz - 2, true);
   }

   private CameraPath buildCinematicPath() {
      int gy = 70;
      List<BaseFpsBenchmark.NamedSegment> named = new ArrayList<>();
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "intro",
            160,
            new LinearPath(new Vec3(C_SPAWN.getX() - 14, gy + 22, C_SPAWN.getZ() + 18), new Vec3(0.075, -0.04, -0.025), 250.0F, 18.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "plaza_orbit", 120, new OrbitPath(new Vec3(C_SPAWN.getX() + 0.5, gy + 3, C_SPAWN.getZ() + 0.5), 10.0, 6.0, 0.6, 200.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "forest_fly",
            200,
            new LinearPath(new Vec3(C_SPAWN.getX() + 6, gy + 14, C_SPAWN.getZ() + 1), new Vec3(0.12, 0.03, 0.105), 300.0F, 12.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "forest_orbit", 200, new OrbitPath(new Vec3(C_FOREST.getX() + 0.5, gy + 5, C_FOREST.getZ() + 0.5), 20.0, 18.0, 0.55)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "base_fly",
            180,
            new LinearPath(
               new Vec3(C_FOREST.getX() + 0.5, gy + 20, C_FOREST.getZ() - 8), new Vec3(0.155, -0.044, -0.05), 200.0F, 20.0F
            )
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "base_orbit", 220, new OrbitPath(new Vec3(C_BASE.getX() + 0.5, gy + 4, C_BASE.getZ() + 0.5), 14.0, 8.0, 0.55)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "village_fly",
            140,
            new LinearPath(new Vec3(C_BASE.getX() + 8, gy + 10, C_BASE.getZ() - 2), new Vec3(0.18, 0.0, -0.06), 215.0F, 14.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "village", 200, new OrbitPath(new Vec3(C_VILLAGE.getX() + 0.5, gy + 5, C_VILLAGE.getZ() + 0.5), 18.0, 10.0, 0.45)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "combat_in",
            100,
            new LinearPath(new Vec3(C_COMBAT.getX() - 30, gy + 12, C_COMBAT.getZ() + 8), new Vec3(0.16, -0.06, -0.085), 245.0F, 18.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "combat_orbit", 260, new OrbitPath(new Vec3(C_COMBAT.getX() + 0.5, gy + 4, C_COMBAT.getZ() + 0.5), 14.0, 6.0, 0.5, 180.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "redstone",
            200,
            new LinearPath(new Vec3(C_REDSTONE.getX() - 10, gy + 7, C_REDSTONE.getZ() - 3), new Vec3(0.13, 0.0, 0.04), 270.0F, 14.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "cave_fly",
            110,
            new LinearPath(new Vec3(C_CAVE.getX() - 12, gy + 12, C_CAVE.getZ() - 8), new Vec3(0.091, -0.082, 0.073), 280.0F, 10.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "cave_inside",
            200,
            new LinearPath(new Vec3(C_CAVE.getX() - 2, gy + 3, C_CAVE.getZ() + 0.5), new Vec3(0.1, 0.0, 0.0), 270.0F, 0.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "cave_pull",
            150,
            new LinearPath(new Vec3(C_CAVE.getX() + 18, gy + 3, C_CAVE.getZ() + 0.5), new Vec3(-0.18, 0.0, -0.05), 110.0F, 6.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "nether_fly",
            160,
            new LinearPath(new Vec3(C_NETHER.getX() - 25, gy + 3, C_NETHER.getZ()), new Vec3(0.135, 0.0, 0.0), 270.0F, 0.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "nether_orbit", 240, new OrbitPath(new Vec3(C_NETHER.getX() + 0.5, gy + 3, C_NETHER.getZ() + 0.5), 4.0, 0.0, 0.6)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "end_fly",
            160,
            new LinearPath(new Vec3(C_END.getX() - 50, gy + 20, C_END.getZ() - 4), new Vec3(0.156, 0.0, 0.025), 270.0F, 6.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "end_orbit", 340, new OrbitPath(new Vec3(C_END.getX() + 0.5, gy + 10, C_END.getZ() + 0.5), 25.0, 10.0, 0.4, 180.0F)
         )
      );
      named.add(
         new BaseFpsBenchmark.NamedSegment(
            "final",
            260,
            new LinearPath(new Vec3(C_END.getX() - 25, gy + 50, C_END.getZ() - 4), new Vec3(-0.45, 0.0, -0.07), 250.0F, 25.0F)
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

   private void set(ServerLevel lvl, int x, int y, int z, BlockState state) {
      lvl.setBlock(new BlockPos(x, y, z), state, 3);
      this.blocksPlaced++;
   }

   private void setFast(ServerLevel lvl, int x, int y, int z, BlockState state) {
      lvl.setBlock(new BlockPos(x, y, z), state, 2);
      this.blocksPlaced++;
   }

   private void carveCameraCorridor(ServerLevel lvl, CameraPath path, int totalTicks) {
      if (path != null && totalTicks > 0) {
         int strippedTotal = 0;
         int coreHitTicks = 0;
         int loggedUnsafe = 0;

         for (int t = 0; t < totalTicks; t += 2) {
            Pose pose = path.poseAt(t, 0.0F);
            Vec3 pos = pose.pos();
            double r = this.carveRadiusForTick(t);
            int[] result = this.stripUnsafeAround(lvl, pos.x, pos.y, pos.z, r);
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
                           String.format("%.1f", pos.x),
                           String.format("%.1f", pos.y),
                           String.format("%.1f", pos.z),
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

   private int[] stripUnsafeAround(ServerLevel lvl, double cx, double cy, double cz, double radius) {
      int stripped = 0;
      int structuralCoreHit = 0;
      int r = (int)Math.ceil(radius);
      int icx = (int)Math.floor(cx);
      int icy = (int)Math.floor(cy);
      int icz = (int)Math.floor(cz);
      BlockState air = Blocks.AIR.defaultBlockState();
      double r2 = radius * radius;
      double coreR2 = 2.5600000000000005;

      for (int dx = -r; dx <= r; dx++) {
         for (int dy = -r; dy <= r; dy++) {
            for (int dz = -r; dz <= r; dz++) {
               double d2 = dx * dx + dy * dy + dz * dz;
               if (!(d2 > r2)) {
                  BlockPos p = new BlockPos(icx + dx, icy + dy, icz + dz);
                  BlockState s = lvl.getBlockState(p);
                  if (!s.isAir()) {
                     boolean inCore = d2 <= coreR2;
                     if (inCore) {
                        if (!this.isStrippableForCamera(s) && s.isCollisionShapeFullBlock(lvl, p)) {
                           structuralCoreHit++;
                        }

                        lvl.setBlock(p, air, 2);
                        stripped++;
                     } else if (this.isStrippableForCamera(s)) {
                        lvl.setBlock(p, air, 2);
                        stripped++;
                     }
                  }
               }
            }
         }
      }

      return new int[]{stripped, structuralCoreHit};
   }

   private boolean isStrippableForCamera(BlockState s) {
      return s.is(Blocks.OAK_LEAVES)
         || s.is(Blocks.BIRCH_LEAVES)
         || s.is(Blocks.DARK_OAK_LEAVES)
         || s.is(Blocks.SPRUCE_LEAVES)
         || s.is(Blocks.JUNGLE_LEAVES)
         || s.is(Blocks.ACACIA_LEAVES)
         || s.is(Blocks.AZALEA_LEAVES)
         || s.is(Blocks.FLOWERING_AZALEA_LEAVES)
         || s.is(Blocks.OAK_LOG)
         || s.is(Blocks.BIRCH_LOG)
         || s.is(Blocks.DARK_OAK_LOG)
         || s.is(Blocks.VINE)
         || s.is(Blocks.GLOW_LICHEN)
         || s.is(Blocks.POINTED_DRIPSTONE)
         || s.is(Blocks.AMETHYST_CLUSTER)
         || s.is(Blocks.LARGE_AMETHYST_BUD)
         || s.is(Blocks.MEDIUM_AMETHYST_BUD)
         || s.is(Blocks.SMALL_AMETHYST_BUD)
         || s.is(Blocks.BIG_DRIPLEAF)
         || s.is(Blocks.SMALL_DRIPLEAF)
         || s.is(Blocks.CHORUS_PLANT)
         || s.is(Blocks.CHORUS_FLOWER)
         || s.is(Blocks.IRON_BARS)
         || s.is(Blocks.LANTERN)
         || s.is(Blocks.SOUL_LANTERN)
         || s.is(Blocks.WATER)
         || s.is(Blocks.LAVA)
         || s.is(Blocks.SHORT_GRASS)
         || s.is(Blocks.FERN)
         || s.is(Blocks.TALL_GRASS)
         || s.is(Blocks.LARGE_FERN)
         || s.is(Blocks.SWEET_BERRY_BUSH)
         || s.is(Blocks.MOSS_CARPET)
         || s.is(Blocks.RED_MUSHROOM)
         || s.is(Blocks.BROWN_MUSHROOM);
   }

   private void spawnPassive(BenchContext ctx, ServerLevel lvl, EntityType<? extends Entity> type, double x, double y, double z) {
      Entity e = type.create(lvl, EntitySpawnReason.COMMAND);
      if (e != null) {
         e.snapTo(x + 0.5, y, z + 0.5, 0.0F, 0.0F);
         if (e instanceof Mob m) {
            m.finalizeSpawn(lvl, lvl.getCurrentDifficultyAt(e.blockPosition()), EntitySpawnReason.COMMAND, null);
            m.setNoAi(false);
            m.setPersistenceRequired();
            m.setInvulnerable(true);
            m.setSilent(true);
         }

         ctx.spawnTracked(e, lvl);
         this.otherEntitiesSpawned++;
      }
   }

   private void spawnPassiveSafe(BenchContext ctx, ServerLevel lvl, EntityType<? extends Entity> type, int x, int z, boolean aiEnabled) {
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

      BlockState air = Blocks.AIR.defaultBlockState();

      for (int dy = 1; dy <= 2; dy++) {
         BlockPos p = new BlockPos(sx, sy + dy, sz);
         BlockState s = lvl.getBlockState(p);
         if (s.getFluidState().isEmpty() && !s.isAir() && s.canBeReplaced()) {
            lvl.setBlock(p, air, 2);
         }
      }

      Entity e = type.create(lvl, EntitySpawnReason.COMMAND);
      if (e != null) {
         e.snapTo(sx + 0.5, sy + 1.01, sz + 0.5, 0.0F, 0.0F);
         if (e instanceof Mob m) {
            m.finalizeSpawn(lvl, lvl.getCurrentDifficultyAt(e.blockPosition()), EntitySpawnReason.COMMAND, null);
            m.setNoAi(!aiEnabled);
            m.setPersistenceRequired();
            m.setInvulnerable(true);
         }

         ctx.spawnTracked(e, lvl);
         this.otherEntitiesSpawned++;
      }
   }

   private int topSolidY(ServerLevel lvl, int x, int z) {
      for (int y = 84; y >= 62; y--) {
         BlockState s = lvl.getBlockState(new BlockPos(x, y, z));
         if (!s.isAir()
            && !s.canBeReplaced()
            && s.getFluidState().isEmpty()
            && !s.is(Blocks.OAK_FENCE)
            && !s.is(Blocks.OAK_FENCE_GATE)
            && !s.is(Blocks.COBBLESTONE_WALL)
            && !s.is(Blocks.MOSSY_COBBLESTONE_WALL)
            && !s.is(Blocks.POLISHED_BLACKSTONE_WALL)
            && !s.is(Blocks.OAK_LEAVES)
            && !s.is(Blocks.BIRCH_LEAVES)
            && !s.is(Blocks.DARK_OAK_LEAVES)
            && !s.is(Blocks.IRON_BARS)
            && !s.is(Blocks.DIRT_PATH)
            && !s.is(Blocks.FARMLAND)
            && !s.is(Blocks.OAK_SLAB)
            && !s.is(Blocks.HAY_BLOCK)) {
            return y;
         }
      }

      return 61;
   }

   private boolean isSafeSpawn(ServerLevel lvl, int x, int z) {
      int top = this.topSolidY(lvl, x, z);
      if (top < 62) {
         return false;
      } else {
         BlockState a1 = lvl.getBlockState(new BlockPos(x, top + 1, z));
         BlockState a2 = lvl.getBlockState(new BlockPos(x, top + 2, z));
         return (a1.isAir() || a1.canBeReplaced()) && (a2.isAir() || a2.canBeReplaced());
      }
   }

   private int[] findSafeSpawn(ServerLevel lvl, int x, int z) {
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