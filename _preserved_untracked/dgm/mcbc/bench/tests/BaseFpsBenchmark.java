package com.dgm.mcbc.bench.tests;

import com.dgm.mcbc.bench.BenchContext;
import com.dgm.mcbc.bench.Benchmark;
import com.dgm.mcbc.bench.CameraPath;
import com.dgm.mcbc.bench.CinematicState;
import com.dgm.mcbc.client.FpsTestClient;
import com.mojang.logging.LogUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class BaseFpsBenchmark implements Benchmark {
    private static final Logger LOGGER = LogUtils.getLogger();

    // Zone center coordinates (using BlockPos for clarity)
    private static final BlockPos C_SPAWN = new BlockPos(0, 70, 0);
    private static final BlockPos C_BASE = new BlockPos(0, 70, -100);
    private static final BlockPos C_VILLAGE = new BlockPos(0, 70, -200);
    private static final BlockPos C_COMBAT = new BlockPos(0, 70, -300);
    private static final BlockPos C_CAVE = new BlockPos(0, 70, -400);
    private static final BlockPos C_REDSTONE = new BlockPos(0, 70, -500);
    private static final BlockPos C_NETHER = new BlockPos(0, 70, -600);
    private static final BlockPos C_END = new BlockPos(0, 70, -700);
    private static final BlockPos C_FOREST = new BlockPos(0, 70, 100);

    // Benchmark configuration
    private static final int SAMPLE_TICKS = 2400;
    private static final int WARMUP_TICKS = 200;
    private static final int PREPARATION_TICKS = 400;

    // Runtime state
    private long animTick = 0;
    private int currentSegment = -1;
    private String[] segmentNames;
    private int[] segmentStarts;
    private int totalSegmentTicks = 0;
    private List<CameraPath.NamedSegment> segments = new ArrayList<>();
    private CameraPath cinematicPath;
    private CinematicState cinematicState;
    private int blocksPlaced = 0;
    private int otherEntitiesSpawned = 0;
    private int combatArrowsSpawned = 0;
    private int zoneParticlesSpawned = 0;

    @Override
    public String getId() {
        return "base_fps";
    }

    @Override
    public String getDisplayName() {
        return "Base FPS Showcase";
    }

    @Override
    public String getDescription() {
        return "Comprehensive FPS benchmark covering 9 distinct scenes with cinematic camera";
    }

    @Override
    public int sampleTicks() {
        return SAMPLE_TICKS;
    }

    @Override
    public int warmupTicks() {
        return WARMUP_TICKS;
    }

    @Override
    public int preparationTicks() {
        return PREPARATION_TICKS;
    }

    @Override
    public void prepare(BenchContext ctx) {
        ServerWorld world = ctx.getWorld();
        this.blocksPlaced = 0;
        this.otherEntitiesSpawned = 0;
        this.combatArrowsSpawned = 0;
        this.zoneParticlesSpawned = 0;

        // Build all terrain and structures
        buildTerrain(ctx, world);
        buildPath(ctx, world);
        decorateGround(ctx, world);
        scatterRocksAndStumps(ctx, world);
        scatterTrees(ctx, world);

        buildSpawnPlaza(ctx, world);
        buildForestZone(ctx, world);
        buildPlayerBase(ctx, world);
        buildVillage(ctx, world);
        buildCombatArena(ctx, world);
        buildRedstoneScene(ctx, world);
        buildWaterCave(ctx, world);
        buildNetherAlcove(ctx, world);
        buildEndIsland(ctx, world);
        spawnAmbientAnimals(ctx, world);

        // Build cinematic camera path
        this.cinematicPath = buildCinematicPath();
        this.cinematicState = new CinematicState(this.cinematicPath, SAMPLE_TICKS);

        // Carve camera corridor to prevent clipping
        carveCameraCorridor(world, this.cinematicPath, SAMPLE_TICKS);

        LOGGER.info("[BaseFps] Preparation complete: blocksPlaced={}, entitiesSpawned={}", blocksPlaced, otherEntitiesSpawned);
    }

    @Override
    public void tick(BenchContext ctx) {
        ServerWorld world = ctx.getWorld();
        this.animTick++;

        // Update cinematic camera
        if (this.cinematicState != null) {
            this.cinematicState.tick();
            CameraPath.Pose pose = this.cinematicState.getPose();
            ctx.setCameraPose(pose.pos(), pose.yaw(), pose.pitch());
        }

        // Determine current segment for logging
        int newSegment = segmentIndexAtTick((int) this.animTick);
        if (newSegment != this.currentSegment && newSegment >= 0 && newSegment < this.segmentNames.length) {
            this.currentSegment = newSegment;
            LOGGER.info("[BaseFps] Segment: {} (tick {})", this.segmentNames[newSegment], this.animTick);
        }

        // Run scene-specific animations
        tickCombatArena(ctx, world);
        tickZoneParticles(ctx, world);

        // Cleanup entities periodically to prevent buildup
        if (this.animTick % 600 == 0) {
            cleanupDistantEntities(world);
        }
    }

    @Override
    public void onComplete(BenchContext ctx) {
        LOGGER.info("[BaseFps] Benchmark complete: blocksPlaced={}, entitiesSpawned={}, combatArrows={}, zoneParticles={}",
                blocksPlaced, otherEntitiesSpawned, combatArrowsSpawned, zoneParticlesSpawned);
    }

    // ==================== Terrain & Structure Builders ====================

    private void buildTerrain(BenchContext ctx, ServerWorld world) {
        // Base flat platform across all zones
        for (int x = -16; x <= 320; x++) {
            for (int z = -64; z <= 64; z++) {
                int y = surfaceY(x, z);
                setFast(world, x, y, z, Blocks.GRASS_BLOCK.getDefaultState());
                setFast(world, x, y - 1, z, Blocks.DIRT.getDefaultState());
                setFast(world, x, y - 2, z, Blocks.DIRT.getDefaultState());
                setFast(world, x, y - 3, z, Blocks.STONE.getDefaultState());
            }
        }
    }

    private void buildPath(BenchContext ctx, ServerWorld world) {
        // Gravel path connecting zones
        for (int z = 0; z >= -700; z -= 2) {
            int y = surfaceY(0, z);
            setFast(world, 0, y, z, Blocks.GRAVEL.getDefaultState());
            setFast(world, 1, y, z, Blocks.GRAVEL.getDefaultState());
            setFast(world, -1, y, z, Blocks.GRAVEL.getDefaultState());
        }
    }

    private void decorateGround(BenchContext ctx, ServerWorld world) {
        Random rng = new Random(12345L);
        for (int x = -16; x <= 320; x++) {
            for (int z = -64; z <= 64; z++) {
                if (rng.nextFloat() < 0.02f) {
                    int y = surfaceY(x, z);
                    BlockState state = world.getBlockState(new BlockPos(x, y, z));
                    if (state.isOf(Blocks.GRASS_BLOCK)) {
                        setFast(world, x, y + 1, z, Blocks.SHORT_GRASS.getDefaultState());
                    }
                }
            }
        }
    }

    private void scatterRocksAndStumps(BenchContext ctx, ServerWorld world) {
        Random rng = new Random(54321L);
        for (int i = 0; i < 200; i++) {
            int x = rng.nextInt(336) - 16;
            int z = rng.nextInt(128) - 64;
            int y = surfaceY(x, z);
            if (rng.nextBoolean()) {
                setFast(world, x, y + 1, z, Blocks.COBBLESTONE.getDefaultState());
            } else {
                setFast(world, x, y + 1, z, Blocks.OAK_LOG.getDefaultState().with(Properties.AXIS, Direction.Axis.Y));
            }
        }
    }

    private void scatterTrees(BenchContext ctx, ServerWorld world) {
        Random rng = new Random(99999L);
        for (int i = 0; i < 80; i++) {
            int x = rng.nextInt(336) - 16;
            int z = rng.nextInt(128) - 64;
            // Only place in forest zone
            if (z > 50 && z < 150) {
                placeTree(world, x, surfaceY(x, z), z, rng);
            }
        }
    }

    private void placeTree(ServerWorld world, int x, int y, int z, Random rng) {
        // Simple oak tree
        int height = 4 + rng.nextInt(3);
        for (int dy = 0; dy < height; dy++) {
            setFast(world, x, y + dy, z, Blocks.OAK_LOG.getDefaultState().with(Properties.AXIS, Direction.Axis.Y));
        }
        // Leaves
        for (int dx = -2; dx <= 2; dx++) {
            for (int dz = -2; dz <= 2; dz++) {
                for (int dy = height - 3; dy < height; dy++) {
                    if (dx * dx + dz * dz + (dy - (height - 2)) * (dy - (height - 2)) <= 4) {
                        BlockPos pos = new BlockPos(x + dx, y + dy, z + dz);
                        if (world.getBlockState(pos).isAir()) {
                            setFast(world, x + dx, y + dy, z + dz, Blocks.OAK_LEAVES.getDefaultState());
                        }
                    }
                }
            }
        }
    }

    private void buildSpawnPlaza(BenchContext ctx, ServerWorld world) {
        int cx = C_SPAWN.getX();
        int cz = C_SPAWN.getZ();
        int floorY = 70;
        int ceilY = 75;

        // Central platform
        for (int dx = -10; dx <= 10; dx++) {
            for (int dz = -10; dz <= 10; dz++) {
                setFast(world, cx + dx, floorY, cz + dz, Blocks.STONE_BRICKS.getDefaultState());
                setFast(world, cx + dx, floorY - 1, cz + dz, Blocks.STONE.getDefaultState());
            }
        }

        // Pillars at corners
        for (int[] p : new int[][]{{-10, -10}, {10, -10}, {-10, 10}, {10, 10}}) {
            for (int dy = 1; dy <= 5; dy++) {
                setFast(world, cx + p[0], floorY + dy, cz + p[1], Blocks.STONE_BRICKS.getDefaultState());
            }
        }

        // Center beacon
        setFast(world, cx, floorY + 1, cz, Blocks.BEACON.getDefaultState());
        setFast(world, cx, floorY + 2, cz, Blocks.IRON_BLOCK.getDefaultState());
        setFast(world, cx, floorY + 3, cz, Blocks.IRON_BLOCK.getDefaultState());
        setFast(world, cx, floorY + 4, cz, Blocks.IRON_BLOCK.getDefaultState());

        // Lanterns
        for (int[] p : new int[][]{{-6, -6}, {6, -6}, {-6, 6}, {6, 6}, {0, 8}, {0, -8}}) {
            setFast(world, cx + p[0], floorY + 1, cz + p[1], Blocks.LANTERN.getDefaultState());
            setFast(world, cx + p[0], floorY + 2, cz + p[1], Blocks.CHAIN.getDefaultState());
        }
    }

    private void buildForestZone(BenchContext ctx, ServerWorld world) {
        int cx = C_FOREST.getX();
        int cz = C_FOREST.getZ();
        int floorY = 70;

        // Dense tree placement
        Random rng = new Random(11111L);
        for (int i = 0; i < 60; i++) {
            int tx = cx + rng.nextInt(40) - 20;
            int tz = cz + rng.nextInt(40) - 20;
            if (tx * tx + tz * tz <= 400) {
                placeTree(world, tx, floorY, tz, rng);
            }
        }

        // Podzol ground cover
        for (int dx = -20; dx <= 20; dx++) {
            for (int dz = -20; dz <= 20; dz++) {
                if (dx * dx + dz * dz <= 400) {
                    int x = cx + dx;
                    int z = cz + dz;
                    if (world.getBlockState(new BlockPos(x, floorY, z)).isOf(Blocks.GRASS_BLOCK)) {
                        setFast(world, x, floorY, z, Blocks.PODZOL.getDefaultState());
                        if (rng.nextBoolean()) {
                            setFast(world, x, floorY + 1, z, Blocks.SPRUCE_LEAVES.getDefaultState());
                        }
                    }
                }
            }
        }

        // Fallen logs
        for (int i = 0; i < 12; i++) {
            int lx = cx + rng.nextInt(18) - 9;
            int lz = cz + rng.nextInt(18) - 9;
            if ((lx - cx) * (lx - cx) + (lz - cz) * (lz - cz) <= 81) {
                BlockPos floor = new BlockPos(lx, floorY, lz);
                if (world.getBlockState(floor).isOf(Blocks.PODZOL)) {
                    setFast(world, lx, floorY, lz, Blocks.STRIPPED_SPRUCE_LOG.getDefaultState().with(Properties.AXIS, Direction.Axis.X));
                    if (rng.nextBoolean()) {
                        setFast(world, lx, floorY + 1, lz, Blocks.SPRUCE_LEAVES.getDefaultState());
                    }
                }
            }
        }
    }

    private void buildPlayerBase(BenchContext ctx, ServerWorld world) {
        int cx = C_BASE.getX();
        int cz = C_BASE.getZ();
        int floorY = 70;

        // Foundation
        for (int dx = -8; dx <= 8; dx++) {
            for (int dz = -8; dz <= 8; dz++) {
                setFast(world, cx + dx, floorY, cz + dz, Blocks.OAK_PLANKS.getDefaultState());
                setFast(world, cx + dx, floorY - 1, cz + dz, Blocks.COBBLESTONE.getDefaultState());
            }
        }

        // Walls
        for (int dx = -8; dx <= 8; dx++) {
            for (int dy = 1; dy < 4; dy++) {
                setFast(world, cx + dx, floorY + dy, cz + 8, Blocks.OAK_PLANKS.getDefaultState());
            }
        }

        // Window openings
        for (int dx = -8; dx <= 8; dx += 2) {
            setFast(world, cx + dx, floorY + 4, cz + 8, Blocks.OAK_LOG.getDefaultState());
        }

        // Fence posts
        for (int[] p : new int[][]{{-8, 6}, {8, 6}, {0, 8}, {-4, 4}, {4, 4}}) {
            setFast(world, cx + p[0], floorY + 3, cz + p[1], Blocks.OAK_FENCE.getDefaultState());
        }

        // Corner columns
        int[][] columns = new int[][]{{-9, -4}, {9, -4}, {-4, 9}, {4, 9}, {-10, 3}, {10, 3}};
        for (int[] p : columns) {
            int x = cx + p[0];
            int z = cz + p[1];
            for (int dy = 1; dy <= 5; dy++) {
                BlockState state = (dy % 2 == 0)
                        ? Blocks.STRIPPED_OAK_LOG.getDefaultState().with(Properties.AXIS, Direction.Axis.Y)
                        : Blocks.OAK_LOG.getDefaultState().with(Properties.AXIS, Direction.Axis.Y);
                setFast(world, x, floorY + dy, z, state);
            }
        }

        // Lanterns on columns
        for (int[] p : new int[][]{{-9, -4}, {9, -4}}) {
            int x = cx + p[0];
            int z = cz + p[1];
            setFast(world, x, 75, z + 1, Blocks.LANTERN.getDefaultState());
            setFast(world, x, 75, z - 1, Blocks.LANTERN.getDefaultState());
        }

        // Cascading vines
        for (int[] cascade : new int[][]{{8, 4}, {-11, -5}, {-3, 12}}) {
            int x = cx + cascade[0];
            int z = cz + cascade[1];
            setFast(world, x, 75, z, Blocks.VINE.getDefaultState());
            for (int dy = floorY + 1; dy < 75; dy++) {
                setFast(world, x, dy, z, Blocks.VINE.getDefaultState());
            }
            setFast(world, x, floorY, z, Blocks.VINE.getDefaultState());
        }

        // Porch
        BlockState planks = Blocks.OAK_PLANKS.getDefaultState();
        BlockState logs = Blocks.OAK_LOG.getDefaultState();
        for (int dx = -4; dx <= 4; dx++) {
            for (int dy = 0; dy < 5; dy++) {
                for (int dz = 0; dz < 3; dz++) {
                    int x = cx + dx;
                    int z = cz + 11 + dz;
                    if (dz != 1 || dx < -2 || dx > 2 || dy < 1 || dy > 3) {
                        setFast(world, x, floorY + 1 + dy, z, dy == 4 ? logs : planks);
                    }
                }
            }
        }

        // Stairs
        BlockState stairs = Blocks.OAK_STAIRS.getDefaultState().with(Properties.FACING, Direction.NORTH).with(Properties.HALF, BlockHalf.BOTTOM);
        for (int dxx = -1; dxx <= 1; dxx++) {
            setFast(world, cx + dxx, floorY + 1, cz + 9, stairs);
        }

        // Animals
        for (int ixx = 0; ixx < 6; ixx++) {
            spawnPassive(ctx, world, EntityType.COW, cx - 6 + ixx * 2, floorY + 1, cz - 2 + ixx % 3 - 1);
        }
        for (int ixx = 0; ixx < 3; ixx++) {
            spawnPassive(ctx, world, EntityType.SHEEP, cx + 3 + ixx * 2, floorY + 1, cz + 5);
        }
        spawnPassive(ctx, world, EntityType.PIG, cx, floorY + 1, cz + 11);

        // Animal pens
        for (int[] sp : new int[][]{{4, 2}, {-8, -4}}) {
            int sx = cx + sp[0];
            int sz = cz + sp[1];
            for (int dxx = -1; dxx <= 1; dxx++) {
                for (int dz = -1; dz <= 1; dz++) {
                    setFast(world, sx + dxx, floorY, sz + dz, Blocks.STONE_BRICKS.getDefaultState());
                    setFast(world, sx + dxx, floorY + 1, sz + dz, Blocks.STONE_BRICK_SLAB.getDefaultState());
                }
            }
            spawnPassive(ctx, world, EntityType.CHICKEN, sx, floorY + 2, sz);
        }
    }

    private void buildVillage(BenchContext ctx, ServerWorld world) {
        int cx = C_VILLAGE.getX();
        int cz = C_VILLAGE.getZ();
        int floorY = 70;

        // Village houses
        for (int i = 0; i < 5; i++) {
            int hx = cx + (i - 2) * 18;
            buildSmallHouse(ctx, world, hx, floorY, cz);
        }

        // Villagers
        Random vrng = new Random(2863L);
        for (int i = 0; i < 8; i++) {
            int vx = cx + vrng.nextInt(40) - 20;
            int vz = cz + vrng.nextInt(20) - 10;
            spawnPassiveSafe(ctx, world, EntityType.VILLAGER, vx, vz, true);
        }

        // Iron golem
        spawnPassiveSafe(ctx, world, EntityType.IRON_GOLEM, cx, cz + 15, true);
    }

    private void buildSmallHouse(BenchContext ctx, ServerWorld world, int cx, int floorY, int cz) {
        // Foundation
        for (int dx = -3; dx <= 3; dx++) {
            for (int dz = -3; dz <= 3; dz++) {
                setFast(world, cx + dx, floorY, cz + dz, Blocks.OAK_PLANKS.getDefaultState());
            }
        }

        // Walls
        for (int dx = -3; dx <= 3; dx++) {
            for (int dy = 1; dy <= 3; dy++) {
                if (dx == -3 || dx == 3 || dz == -3 || dz == 3) {
                    for (int dz = -3; dz <= 3; dz++) {
                        if (dx == -3 || dx == 3 || dz == -3 || dz == 3) {
                            if (!(dx == 0 && dz == 3 && dy <= 2)) { // Door opening
                                setFast(world, cx + dx, floorY + dy, cz + dz, Blocks.OAK_PLANKS.getDefaultState());
                            }
                        }
                    }
                }
            }
        }

        // Roof
        for (int dx = -4; dx <= 4; dx++) {
            for (int dz = -4; dz <= 4; dz++) {
                setFast(world, cx + dx, floorY + 4, cz + dz, Blocks.OAK_STAIRS.getDefaultState()
                        .with(Properties.FACING, dx < 0 ? Direction.EAST : Direction.WEST)
                        .with(Properties.HALF, BlockHalf.TOP));
            }
        }

        // Door
        setFast(world, cx, floorY + 1, cz + 3, Blocks.OAK_DOOR.getDefaultState().with(Properties.FACING, Direction.SOUTH).with(Properties.HALF, BlockHalf.LOWER));
        setFast(world, cx, floorY + 2, cz + 3, Blocks.OAK_DOOR.getDefaultState().with(Properties.FACING, Direction.SOUTH).with(Properties.HALF, BlockHalf.UPPER));
    }

    private void buildCombatArena(BenchContext ctx, ServerWorld world) {
        int cx = C_COMBAT.getX();
        int cz = C_COMBAT.getZ();
        int floorY = 70;

        // Arena floor
        for (int dx = -15; dx <= 15; dx++) {
            for (int dz = -15; dz <= 15; dz++) {
                setFast(world, cx + dx, floorY, cz + dz, Blocks.SMOOTH_STONE.getDefaultState());
            }
        }

        // Walls
        for (int dx = -15; dx <= 15; dx++) {
            for (int dy = 1; dy <= 5; dy++) {
                setFast(world, cx + dx, floorY + dy, cz + 15, Blocks.STONE_BRICKS.getDefaultState());
                setFast(world, cx + dx, floorY + dy, cz - 15, Blocks.STONE_BRICKS.getDefaultState());
            }
        }
        for (int dz = -15; dz <= 15; dz++) {
            for (int dy = 1; dy <= 5; dy++) {
                setFast(world, cx - 15, floorY + dy, cz + dz, Blocks.STONE_BRICKS.getDefaultState());
                setFast(world, cx + 15, floorY + dy, cz + dz, Blocks.STONE_BRICKS.getDefaultState());
            }
        }

        // Target dummy (armor stand)
        spawnPassive(ctx, world, EntityType.ARMOR_STAND, cx, floorY + 1, cz);

        // Hostile mobs around arena
        Random rng = new Random(77777L);
        for (int i = 0; i < 12; i++) {
            double angle = rng.nextDouble() * Math.PI * 2;
            int mx = cx + (int) (Math.cos(angle) * 12);
            int mz = cz + (int) (Math.sin(angle) * 12);
            spawnPassiveSafe(ctx, world, EntityType.ZOMBIE, mx, mz, true);
        }
    }

    private void buildRedstoneScene(BenchContext ctx, ServerWorld world) {
        int cx = C_REDSTONE.getX();
        int cz = C_REDSTONE.getZ();
        int floorY = 70;

        // Redstone clock
        for (int i = 0; i < 20; i++) {
            int x = cx + (i % 5) * 2 - 4;
            int z = cz + (i / 5) * 2 - 4;
            setFast(world, x, floorY, z, Blocks.REDSTONE_BLOCK.getDefaultState());
            setFast(world, x, floorY + 1, z, Blocks.REDSTONE_WIRE.getDefaultState());
        }

        // Pistons
        for (int i = 0; i < 8; i++) {
            int x = cx + (i % 4) * 3 - 4;
            int z = cz + 10;
            setFast(world, x, floorY + 1, z, Blocks.STICKY_PISTON.getDefaultState().with(Properties.FACING, Direction.UP));
            setFast(world, x, floorY + 2, z, Blocks.SLIME_BLOCK.getDefaultState());
        }

        // Observers
        for (int i = 0; i < 6; i++) {
            int x = cx - 6 + i * 2;
            int z = cz - 6;
            setFast(world, x, floorY + 1, z, Blocks.OBSERVER.getDefaultState().with(Properties.FACING, Direction.UP));
        }

        // Lamps
        for (int i = 0; i < 12; i++) {
            double angle = i * Math.PI / 6;
            int x = cx + (int) (Math.cos(angle) * 8);
            int z = cz + (int) (Math.sin(angle) * 8);
            setFast(world, x, floorY + 2, z, Blocks.REDSTONE_LAMP.getDefaultState());
        }
    }

    private void buildWaterCave(BenchContext ctx, ServerWorld world) {
        int cx = C_CAVE.getX();
        int cz = C_CAVE.getZ();
        int floorY = 50;
        int ceilY = 70;

        // Cave cavity
        for (int dx = -12; dx <= 12; dx++) {
            for (int dz = -12; dz <= 12; dz++) {
                for (int dy = floorY; dy <= ceilY; dy++) {
                    int x = cx + dx;
                    int z = cz + dz;
                    double dist = Math.sqrt(dx * dx + dz * dz);
                    if (dist <= 12 && dy < ceilY - 2) {
                        setFast(world, x, dy, z, Blocks.AIR.getDefaultState());
                    }
                }
            }
        }

        // Water pool at bottom
        for (int dx = -8; dx <= 8; dx++) {
            for (int dz = -8; dz <= 8; dz++) {
                if (dx * dx + dz * dz <= 64) {
                    setFast(world, cx + dx, floorY, cz + dz, Blocks.WATER.getDefaultState());
                }
            }
        }

        // Dripstone
        Random rng = new Random(33333L);
        for (int i = 0; i < 30; i++) {
            int x = cx + rng.nextInt(20) - 10;
            int z = cz + rng.nextInt(20) - 10;
            for (int y = ceilY - 1; y > floorY + 5; y--) {
                if (world.getBlockState(new BlockPos(x, y, z)).isAir() && rng.nextFloat() < 0.1f) {
                    setFast(world, x, y, z, Blocks.POINTED_DRIPSTONE.getDefaultState().with(Properties.VERTICAL_DIRECTION, VerticalDirection.DOWN));
                    break;
                }
            }
        }

        // Glow lichen
        for (int i = 0; i < 40; i++) {
            int x = cx + rng.nextInt(24) - 12;
            int y = floorY + rng.nextInt(20);
            int z = cz + rng.nextInt(24) - 12;
            if (world.getBlockState(new BlockPos(x, y, z)).isAir()) {
                setFast(world, x, y, z, Blocks.GLOW_LICHEN.getDefaultState());
            }
        }
    }

    private void buildNetherAlcove(BenchContext ctx, ServerWorld world) {
        int cx = C_NETHER.getX();
        int cz = C_NETHER.getZ();
        int floorY = 70;

        // Netherrack platform
        for (int dx = -10; dx <= 10; dx++) {
            for (int dz = -10; dz <= 10; dz++) {
                setFast(world, cx + dx, floorY, cz + dz, Blocks.NETHERRACK.getDefaultState());
            }
        }

        // Basalt pillars
        for (int[] p : new int[][]{{-8, -8}, {8, -8}, {-8, 8}, {8, 8}}) {
            for (int dy = 1; dy <= 8; dy++) {
                setFast(world, cx + p[0], floorY + dy, cz + p[1], Blocks.BASALT.getDefaultState());
            }
        }

        // Soul sand valley
        for (int dx = -5; dx <= 5; dx++) {
            for (int dz = -5; dz <= 5; dz++) {
                setFast(world, cx + dx, floorY + 1, cz + dz, Blocks.SOUL_SAND.getDefaultState());
            }
        }

        // Soul fire
        for (int[] p : new int[][]{{-3, 0}, {3, 0}, {0, -3}, {0, 3}}) {
            setFast(world, cx + p[0], floorY + 2, cz + p[1], Blocks.SOUL_FIRE.getDefaultState());
        }

        // Soul campfire
        setFast(world, cx, floorY + 1, cz, Blocks.SOUL_CAMPFIRE.getDefaultState());

        // Lava pool
        for (int dx = -3; dx <= 3; dx++) {
            for (int dz = -3; dz <= 3; dz++) {
                if (dx * dx + dz * dz <= 9) {
                    setFast(world, cx + dx, floorY + 1, cz + dz + 15, Blocks.LAVA.getDefaultState());
                }
            }
        }

        // Magma blocks
        for (int i = 0; i < 8; i++) {
            double angle = i * Math.PI / 4;
            int x = cx + (int) (Math.cos(angle) * 6);
            int z = cz + (int) (Math.sin(angle) * 6) + 15;
            setFast(world, x, floorY + 1, z, Blocks.MAGMA_BLOCK.getDefaultState());
        }

        // Striders
        Random rng = new Random(41168L);
        for (int i = 0; i < 4; i++) {
            spawnPassiveSafe(ctx, world, EntityType.STRIDER, cx + rng.nextInt(6) - 3, cz + 15 + rng.nextInt(6) - 3, true);
        }
    }

    private void buildEndIsland(BenchContext ctx, ServerWorld world) {
        int cx = C_END.getX();
        int cz = C_END.getZ();
        int islandTop = 80;
        int moatInner = 22;
        int moatOuter = 30;

        // Main island with moat
        for (int dx = -moatOuter; dx <= moatOuter; dx++) {
            for (int dz = -moatOuter; dz <= moatOuter; dz++) {
                int r2 = dx * dx + dz * dz;
                if (r2 <= moatOuter * moatOuter) {
                    int x = cx + dx;
                    int z = cz + dz;
                    if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
                        int surf = surfaceY(x, z);
                        if (r2 > moatInner * moatInner) {
                            setFast(world, x, 70, z, Blocks.END_STONE.getDefaultState());
                            setFast(world, x, 69, z, Blocks.OBSIDIAN.getDefaultState());
                        } else {
                            for (int y = surf; y <= islandTop; y++) {
                                setFast(world, x, y, z, Blocks.END_STONE.getDefaultState());
                            }
                        }
                    }
                }
            }
        }

        // Outer islands
        int[][] outIslands = new int[][]{
                {34, 0}, {-34, 0}, {0, 34}, {0, -34},
                {26, 22}, {-26, 22}, {26, -22}, {-26, -22},
                {18, 32}, {-18, 32}, {18, -32}, {-18, -32}
        };
        Random orng = new Random(980868L);

        for (int[] off : outIslands) {
            int ocx = cx + off[0];
            int ocz = cz + off[1];
            int oTop = islandTop - 2 + orng.nextInt(3);

            for (int dx = -6; dx <= 6; dx++) {
                for (int dz = -6; dz <= 6; dz++) {
                    if (dx * dx + dz * dz <= 36) {
                        int x = ocx + dx;
                        int z = ocz + dz;
                        if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
                            for (int y = 70; y <= oTop; y++) {
                                setFast(world, x, y, z, Blocks.END_STONE.getDefaultState());
                            }
                        }
                    }
                }
            }

            if (ocx >= -16 && ocx <= 320 && ocz >= -64 && ocz <= 64) {
                setFast(world, ocx, oTop + 1, ocz, Blocks.BEDROCK.getDefaultState());
                int hClu = 4 + orng.nextInt(3);

                for (int dy = 1; dy <= hClu; dy++) {
                    setFast(world, ocx + 2, oTop + dy, ocz, Blocks.PURPUR_BLOCK.getDefaultState());
                }
                setFast(world, ocx + 2, oTop + hClu + 1, ocz, Blocks.END_ROD.getDefaultState());

                int hClu2 = 3 + orng.nextInt(3);
                for (int dy = 1; dy <= hClu2; dy++) {
                    setFast(world, ocx - 2, oTop + dy, ocz + 1, Blocks.PURPUR_BLOCK.getDefaultState());
                }
                setFast(world, ocx - 2, oTop + hClu2 + 1, ocz + 1, Blocks.END_ROD.getDefaultState());
            }
        }

        // Obsidian pillars with end crystals
        int[][] pillarPos = new int[][]{
                {-15, 0, 24}, {15, 0, 28}, {0, -15, 22}, {0, 15, 20},
                {-11, -11, 26}, {11, 11, 28}, {-11, 11, 22}, {11, -11, 24}
        };

        for (int[] p : pillarPos) {
            int px = cx + p[0];
            int pz = cz + p[1];
            int h = p[2];

            for (int dy = 1; dy <= h; dy++) {
                setFast(world, px, islandTop + dy, pz, Blocks.OBSIDIAN.getDefaultState());
            }

            for (int dx = -1; dx <= 1; dx++) {
                for (int dz = -1; dz <= 1; dz++) {
                    if (dx != 0 || dz != 0) {
                        setFast(world, px + dx, islandTop + h + 1, pz + dz, Blocks.END_CRYSTAL.getDefaultState());
                    }
                }
            }

            // Spawn end crystal entity
            net.minecraft.entity.boss.dragon.EndCrystalEntity crystal = new net.minecraft.entity.boss.dragon.EndCrystalEntity(world, px + 0.5, islandTop + h + 2, pz + 0.5);
            crystal.setShowBottom(false);
            crystal.setPersistent(true);
            ctx.spawnTracked(crystal, world);
            this.otherEntitiesSpawned++;
        }

        // Center bedrock pillar
        for (int dy = 1; dy <= 12; dy++) {
            setFast(world, cx, islandTop + dy, cz, Blocks.END_STONE_BRICKS.getDefaultState().with(Properties.AXIS, Direction.Axis.Y));
        }
        setFast(world, cx, islandTop + 13, cz, Blocks.DRAGON_EGG.getDefaultState());

        // End crystals on bedrock
        for (int[] p : new int[][]{{-2, 0}, {2, 0}, {0, -2}, {0, 2}, {-2, -2}, {2, 2}, {-2, 2}, {2, -2}}) {
            setFast(world, cx + p[0], islandTop + 1, cz + p[1], Blocks.BEDROCK.getDefaultState());
        }
        for (int[] p : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
            setFast(world, cx + p[0], islandTop + 2, cz + p[1], Blocks.BEDROCK.getDefaultState());
        }
        for (int[] p : new int[][]{{-3, 0}, {3, 0}, {0, -3}, {0, 3}, {-3, 3}, {3, -3}, {-3, -3}, {3, 3}}) {
            setFast(world, cx + p[0], islandTop + 1, cz + p[1],
                    Blocks.END_STONE_BRICK_SLAB.getDefaultState().with(Properties.HALF, BlockHalf.TOP));
        }

        // Chorus plants
        Random rng = new Random(25779L);
        for (int i = 0; i < 36; i++) {
            int dx = rng.nextInt(42) - 21;
            int dz = rng.nextInt(42) - 21;
            int r2 = dx * dx + dz * dz;
            if (r2 >= 144 && r2 <= 400) {
                int x = cx + dx;
                int z = cz + dz;
                if (x >= -16 && x <= 320 && z >= -64 && z <= 64) {
                    int h = 3 + rng.nextInt(4);
                    for (int dy = 1; dy <= h; dy++) {
                        setFast(world, x, islandTop + dy, z, Blocks.PURPUR_BLOCK.getDefaultState());
                    }
                    setFast(world, x, islandTop + h + 1, z, Blocks.END_ROD.getDefaultState());
                }
            }
        }

        // Endermen
        int[][] aiOff = new int[][]{{-9, 0}, {9, 0}, {0, -9}, {0, 9}, {-7, 7}, {7, -7}};
        for (int[] p : aiOff) {
            spawnPassive(ctx, world, EntityType.ENDERMAN, cx + p[0], islandTop + 1, cz + p[1]);
        }
        int[][] aiOn = new int[][]{{-5, -5}, {5, 5}, {-5, 5}, {5, -5}, {-7, -2}, {7, 2}};
        for (int[] p : aiOn) {
            spawnPassiveSafe(ctx, world, EntityType.ENDERMAN, cx + p[0], cz + p[1], true);
        }

        LOGGER.info("[BaseFps] End built: center=({},{}) islandR={} moatR={} pillars={} outliers={}",
                cx, cz, moatInner, moatOuter, pillarPos.length, outIslands.length);
    }

    private void spawnAmbientAnimals(BenchContext ctx, ServerWorld world) {
        int bx = C_BASE.getX();
        int bz = C_BASE.getZ();
        spawnPassiveSafe(ctx, world, EntityType.CHICKEN, bx - 4, bz - 2, true);
        spawnPassiveSafe(ctx, world, EntityType.CHICKEN, bx - 4, bz + 1, true);
        spawnPassiveSafe(ctx, world, EntityType.CHICKEN, bx - 5, bz - 3, true);
        spawnPassiveSafe(ctx, world, EntityType.CHICKEN, bx - 3, bz + 2, true);
        spawnPassiveSafe(ctx, world, EntityType.COW, bx + 2, bz + 3, true);
        spawnPassiveSafe(ctx, world, EntityType.COW, bx + 4, bz + 3, true);
        spawnPassiveSafe(ctx, world, EntityType.COW, bx + 3, bz - 2, true);
        spawnPassiveSafe(ctx, world, EntityType.COW, bx + 5, bz - 1, true);

        int penCx = C_VILLAGE.getX() + 11;
        int penCz = C_VILLAGE.getZ() + 6;
        BlockState fence = Blocks.OAK_FENCE.getDefaultState();
        BlockState gate = Blocks.OAK_FENCE_GATE.getDefaultState().with(Properties.FACING, Direction.SOUTH).with(Properties.OPEN, false);

        for (int dx = -3; dx <= 3; dx++) {
            set(world, penCx + dx, 71, penCz - 3, fence);
            set(world, penCx + dx, 71, penCz + 3, fence);
        }
        for (int dz = -3; dz <= 3; dz++) {
            set(world, penCx - 3, 71, penCz + dz, fence);
            set(world, penCx + 3, 71, penCz + dz, fence);
        }
        set(world, penCx - 3, 71, penCz, gate);
        set(world, penCx, 71, penCz - 1, Blocks.HAY_BLOCK.getDefaultState());
        set(world, penCx + 1, 70, penCz + 1, Blocks.END_STONE.getDefaultState());
        spawnPassiveSafe(ctx, world, EntityType.SHEEP, penCx - 1, penCz - 1, true);
        spawnPassiveSafe(ctx, world, EntityType.SHEEP, penCx + 1, penCz - 2, true);
        spawnPassiveSafe(ctx, world, EntityType.SHEEP, penCx - 2, penCz + 1, true);
        spawnPassiveSafe(ctx, world, EntityType.SHEEP, penCx + 2, penCz + 1, true);
        spawnPassiveSafe(ctx, world, EntityType.PIG, penCx, penCz + 2, true);
        spawnPassiveSafe(ctx, world, EntityType.PIG, penCx - 1, penCz + 2, true);
        spawnPassiveSafe(ctx, world, EntityType.PIG, penCx + 2, penCz - 1, true);
        spawnPassiveSafe(ctx, world, EntityType.PIG, penCx, penCz - 2, true);
    }

    // ==================== Cinematic Camera Path ====================

    private CameraPath buildCinematicPath() {
        int gy = 70;
        List<CameraPath.NamedSegment> named = new ArrayList<>();

        named.add(new CameraPath.NamedSegment(
                "intro", 160,
                new CameraPath.LinearPath(
                        new Vec3d(C_SPAWN.getX() - 14, gy + 22, C_SPAWN.getZ() + 18),
                        new Vec3d(0.075, -0.04, -0.025), 250.0f, 18.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "plaza_orbit", 120,
                new CameraPath.OrbitPath(
                        new Vec3d(C_SPAWN.getX() + 0.5, gy + 3, C_SPAWN.getZ() + 0.5), 10.0, 6.0, 0.6, 200.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "forest_fly", 200,
                new CameraPath.LinearPath(
                        new Vec3d(C_SPAWN.getX() + 6, gy + 14, C_SPAWN.getZ() + 1),
                        new Vec3d(0.12, 0.03, 0.105), 300.0f, 12.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "forest_orbit", 200,
                new CameraPath.OrbitPath(
                        new Vec3d(C_FOREST.getX() + 0.5, gy + 5, C_FOREST.getZ() + 0.5), 20.0, 18.0, 0.55
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "base_fly", 180,
                new CameraPath.LinearPath(
                        new Vec3d(C_FOREST.getX() + 0.5, gy + 20, C_FOREST.getZ() - 8),
                        new Vec3d(0.155, -0.044, -0.05), 200.0f, 20.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "base_orbit", 220,
                new CameraPath.OrbitPath(
                        new Vec3d(C_BASE.getX() + 0.5, gy + 4, C_BASE.getZ() + 0.5), 14.0, 8.0, 0.55
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "village_fly", 140,
                new CameraPath.LinearPath(
                        new Vec3d(C_BASE.getX() + 8, gy + 10, C_BASE.getZ() - 2),
                        new Vec3d(0.18, 0.0, -0.06), 215.0f, 14.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "village", 200,
                new CameraPath.OrbitPath(
                        new Vec3d(C_VILLAGE.getX() + 0.5, gy + 5, C_VILLAGE.getZ() + 0.5), 18.0, 10.0, 0.45
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "combat_in", 100,
                new CameraPath.LinearPath(
                        new Vec3d(C_COMBAT.getX() - 30, gy + 12, C_COMBAT.getZ() + 8),
                        new Vec3d(0.16, -0.06, -0.085), 245.0f, 18.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "combat_orbit", 260,
                new CameraPath.OrbitPath(
                        new Vec3d(C_COMBAT.getX() + 0.5, gy + 4, C_COMBAT.getZ() + 0.5), 14.0, 6.0, 0.5, 180.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "redstone", 200,
                new CameraPath.LinearPath(
                        new Vec3d(C_REDSTONE.getX() - 10, gy + 7, C_REDSTONE.getZ() - 3),
                        new Vec3d(0.13, 0.0, 0.04), 270.0f, 14.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "cave_fly", 110,
                new CameraPath.LinearPath(
                        new Vec3d(C_CAVE.getX() - 12, gy + 12, C_CAVE.getZ() - 8),
                        new Vec3d(0.091, -0.082, 0.073), 280.0f, 10.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "cave_inside", 200,
                new CameraPath.LinearPath(
                        new Vec3d(C_CAVE.getX() - 2, gy + 3, C_CAVE.getZ() + 0.5),
                        new Vec3d(0.1, 0.0, 0.0), 270.0f, 0.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "cave_pull", 150,
                new CameraPath.LinearPath(
                        new Vec3d(C_CAVE.getX() + 18, gy + 3, C_CAVE.getZ() + 0.5),
                        new Vec3d(-0.18, 0.0, -0.05), 110.0f, 6.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "nether_fly", 160,
                new CameraPath.LinearPath(
                        new Vec3d(C_NETHER.getX() - 25, gy + 3, C_NETHER.getZ()),
                        new Vec3d(0.135, 0.0, 0.0), 270.0f, 0.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "nether_orbit", 240,
                new CameraPath.OrbitPath(
                        new Vec3d(C_NETHER.getX() + 0.5, gy + 3, C_NETHER.getZ() + 0.5), 4.0, 0.0, 0.6
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "end_fly", 160,
                new CameraPath.LinearPath(
                        new Vec3d(C_END.getX() - 50, gy + 20, C_END.getZ() - 4),
                        new Vec3d(0.156, 0.0, 0.025), 270.0f, 6.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "end_orbit", 340,
                new CameraPath.OrbitPath(
                        new Vec3d(C_END.getX() + 0.5, gy + 10, C_END.getZ() + 0.5), 25.0, 10.0, 0.4, 180.0f
                )
        ));
        named.add(new CameraPath.NamedSegment(
                "final", 260,
                new CameraPath.LinearPath(
                        new Vec3d(C_END.getX() - 25, gy + 50, C_END.getZ() - 4),
                        new Vec3d(-0.45, 0.0, -0.07), 250.0f, 25.0f
                )
        ));

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
            LOGGER.warn("[BaseFps] segment-tick total {} != sampleTicks {}", t, this.sampleTicks());
        }

        List<CameraPath.CompositePath.Segment> compSegs = new ArrayList<>(named.size());
        for (CameraPath.NamedSegment ns : named) {
            compSegs.add(new CameraPath.CompositePath.Segment(ns.ticks(), ns.path()));
        }
        return new CameraPath.CompositePath(compSegs);
    }

    private int segmentIndexAtTick(int tick) {
        if (this.segmentStarts.length == 0) return -1;
        for (int i = this.segmentStarts.length - 1; i >= 0; i--) {
            if (tick >= this.segmentStarts[i]) return i;
        }
        return -1;
    }

    // ==================== Camera Corridor Carving ====================

    private void carveCameraCorridor(ServerWorld world, CameraPath path, int totalTicks) {
        if (path != null && totalTicks > 0) {
            int strippedTotal = 0;
            int coreHitTicks = 0;
            int loggedUnsafe = 0;

            for (int t = 0; t < totalTicks; t += 2) {
                CameraPath.Pose pose = path.poseAt(t, 0.0f);
                Vec3d pos = pose.pos();
                double r = carveRadiusForTick(t);
                int[] result = stripUnsafeAround(world, pos.x, pos.y, pos.z, r);
                strippedTotal += result[0];
                if (result[1] > 0) {
                    coreHitTicks++;
                    if (loggedUnsafe < 8) {
                        loggedUnsafe++;
                        int idx = segmentIndexAtTick(t);
                        String name = idx >= 0 ? this.segmentNames[idx] : "?";
                        LOGGER.warn("[BaseFps] camera-corridor segment={} tick={} pos=({}, {}, {}) STRIPPED {} structural block(s) from camera core — path tweak needed",
                                name, t, String.format("%.1f", pos.x), String.format("%.1f", pos.y), String.format("%.1f", pos.z), result[1]);
                    }
                }
            }
            LOGGER.info("[BaseFps] camera-corridor carve done: stripped={} core-hits={}/{} samples",
                    strippedTotal, coreHitTicks, totalTicks / 2);
        }
    }

    private double carveRadiusForTick(int tick) {
        int idx = segmentIndexAtTick(tick);
        if (idx < 0) return 2.5;
        String name = this.segmentNames[idx];
        return switch (name) {
            case "forest_fly", "forest_orbit", "base_fly" -> 3.5;
            case "nether_fly", "nether_orbit" -> 3.5;
            case "end_fly", "end_orbit", "final" -> 3.5;
            case "cave_fly", "cave_inside", "cave_pull" -> 3.0;
            default -> 2.5;
        };
    }

    private int[] stripUnsafeAround(ServerWorld world, double cx, double cy, double cz, double radius) {
        int stripped = 0;
        int structuralCoreHit = 0;
        int r = (int) Math.ceil(radius);
        int icx = (int) Math.floor(cx);
        int icy = (int) Math.floor(cy);
        int icz = (int) Math.floor(cz);
        BlockState air = Blocks.AIR.getDefaultState();
        double r2 = radius * radius;
        double coreR2 = 2.5600000000000005; // 1.6^2

        for (int dx = -r; dx <= r; dx++) {
            for (int dy = -r; dy <= r; dy++) {
                for (int dz = -r; dz <= r; dz++) {
                    double d2 = dx * dx + dy * dy + dz * dz;
                    if (d2 <= r2) {
                        BlockPos p = new BlockPos(icx + dx, icy + dy, icz + dz);
                        BlockState s = world.getBlockState(p);
                        if (!s.isAir()) {
                            boolean inCore = d2 <= coreR2;
                            if (inCore) {
                                if (!isStrippableForCamera(s) && s.isSolidBlock(world, p)) {
                                    structuralCoreHit++;
                                }
                                world.setBlockState(p, air, 2);
                                stripped++;
                            } else if (isStrippableForCamera(s)) {
                                world.setBlockState(p, air, 2);
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
        return s.isOf(Blocks.SHORT_GRASS)
                || s.isOf(Blocks.TALL_GRASS)
                || s.isOf(Blocks.FERN)
                || s.isOf(Blocks.DEAD_BUSH)
                || s.isOf(Blocks.DANDELION)
                || s.isOf(Blocks.POPPY)
                || s.isOf(Blocks.CORNFLOWER)
                || s.isOf(Blocks.LILY_OF_THE_VALLEY)
                || s.isOf(Blocks.SUNFLOWER)
                || s.isOf(Blocks.LILAC)
                || s.isOf(Blocks.ROSE_BUSH)
                || s.isOf(Blocks.PEONY)
                || s.isOf(Blocks.LARGE_FERN)
                || s.isOf(Blocks.SWEET_BERRY_BUSH)
                || s.isOf(Blocks.GLOW_LICHEN)
                || s.isOf(Blocks.AZALEA)
                || s.isOf(Blocks.FLOWERING_AZALEA)
                || s.isOf(Blocks.PURPUR_BLOCK)
                || s.isOf(Blocks.END_ROD)
                || s.isOf(Blocks.END_CRYSTAL)
                || s.isOf(Blocks.SMALL_DRIPLEAF)
                || s.isOf(Blocks.BIG_DRIPLEAF)
                || s.isOf(Blocks.END_STONE)
                || s.isOf(Blocks.STONE_BRICK_SLAB)
                || s.isOf(Blocks.NETHERRACK)
                || s.isOf(Blocks.BASALT)
                || s.isOf(Blocks.SOUL_SAND)
                || s.isOf(Blocks.SOUL_SOIL)
                || s.isOf(Blocks.SOUL_FIRE)
                || s.isOf(Blocks.SOUL_CAMPFIRE)
                || s.isOf(Blocks.LAVA)
                || s.isOf(Blocks.MAGMA_BLOCK);
    }

    // ==================== Entity Spawning Helpers ====================

    private void spawnPassive(BenchContext ctx, ServerWorld world, EntityType<? extends Entity> type, double x, double y, double z) {
        Entity e = type.create(world);
        if (e != null) {
            e.refreshPositionAndAngles(x + 0.5, y, z + 0.5, 0.0f, 0.0f);
            if (e instanceof MobEntity m) {
                m.initialize(world, world.getLocalDifficulty(m.getBlockPos()), net.minecraft.entity.SpawnReason.NATURAL, null, null);
                m.setAiDisabled(false);
                m.initEquipment();
                m.setPersistent(true);
                if (e instanceof LivingEntity le) {
                    le.setNoGravity(true);
                }
            }
            ctx.spawnTracked(e, world);
            this.otherEntitiesSpawned++;
        }
    }

    private void spawnPassiveSafe(BenchContext ctx, ServerWorld world, EntityType<? extends Entity> type, int x, int z, boolean aiEnabled) {
        int[] safeXZ = findSafeSpawn(world, x, z);
        if (safeXZ == null) {
            LOGGER.warn("[BaseFps] spawnPassiveSafe: no safe spawn within r=4 of ({}, {}) for {} — falling back to requested cell with forced air clear",
                    x, z, type);
            safeXZ = new int[]{x, z};
        }

        int sx = safeXZ[0];
        int sz = safeXZ[1];
        int sy = topSolidY(world, sx, sz);
        if (sy < 62) {
            sy = surfaceY(sx, sz);
        }

        BlockState air = Blocks.AIR.getDefaultState();
        for (int dy = 1; dy <= 2; dy++) {
            BlockPos p = new BlockPos(sx, sy + dy, sz);
            BlockState s = world.getBlockState(p);
            if (s.getFluidState().isEmpty() && !s.isAir() && s.isReplaceable()) {
                world.setBlockState(p, air, 2);
            }
        }

        Entity e = type.create(world);
        if (e != null) {
            e.refreshPositionAndAngles(sx + 0.5, sy + 1.01, sz + 0.5, 0.0f, 0.0f);
            if (e instanceof MobEntity m) {
                m.initialize(world, world.getLocalDifficulty(m.getBlockPos()), net.minecraft.entity.SpawnReason.NATURAL, null, null);
                m.setAiDisabled(!aiEnabled);
                m.initEquipment();
                m.setPersistent(true);
            }
            ctx.spawnTracked(e, world);
            this.otherEntitiesSpawned++;
        }
    }

    private int topSolidY(ServerWorld world, int x, int z) {
        for (int y = 84; y >= 62; y--) {
            BlockState s = world.getBlockState(new BlockPos(x, y, z));
            if (!s.isAir()
                    && !s.isReplaceable()
                    && s.getFluidState().isEmpty()
                    && !s.isOf(Blocks.OAK_FENCE)
                    && !s.isOf(Blocks.OAK_FENCE_GATE)
                    && !s.isOf(Blocks.CHAIN)
                    && !s.isOf(Blocks.LANTERN)
                    && !s.isOf(Blocks.SHORT_GRASS)
                    && !s.isOf(Blocks.TALL_GRASS)
                    && !s.isOf(Blocks.FERN)
                    && !s.isOf(Blocks.END_ROD)
                    && s.isSolidBlock(world, new BlockPos(x, y, z))
                    && !s.isOf(Blocks.VINE)
                    && !s.isOf(Blocks.GLOW_LICHEN)
                    && !s.isOf(Blocks.SWEET_BERRY_BUSH)) {
                return y;
            }
        }
        return 61;
    }

    private boolean isSafeSpawn(ServerWorld world, int x, int z) {
        int top = topSolidY(world, x, z);
        if (top < 62) return false;
        BlockState a1 = world.getBlockState(new BlockPos(x, top + 1, z));
        BlockState a2 = world.getBlockState(new BlockPos(x, top + 2, z));
        return (a1.isAir() || a1.isReplaceable()) && (a2.isAir() || a2.isReplaceable());
    }

    private int[] findSafeSpawn(ServerWorld world, int x, int z) {
        if (isSafeSpawn(world, x, z)) return new int[]{x, z};
        int[][] offsets = new int[][]{
                {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                {1, 1}, {-1, 1}, {1, -1}, {-1, -1},
                {2, 0}, {-2, 0}, {0, 2}, {0, -2},
                {2, 1}, {-2, 1}, {2, -1}, {-2, -1},
                {1, 2}, {-1, 2}, {1, -2}, {-1, -2},
                {3, 0}, {-3, 0}, {0, 3}, {0, -3},
                {2, 2}, {-2, 2}, {2, -2}, {-2, -2},
                {4, 0}, {-4, 0}, {0, 4}, {0, -4}
        };
        for (int[] o : offsets) {
            if (isSafeSpawn(world, x + o[0], z + o[1])) {
                return new int[]{x + o[0], z + o[1]};
            }
        }
        return null;
    }

    // ==================== Animation / Tick Helpers ====================

    private void tickCombatArena(BenchContext ctx, ServerWorld world) {
        int cx = C_COMBAT.getX();
        int cz = C_COMBAT.getZ();
        int floorY = 70;

        // Spawn arrows periodically during combat segment
        if (this.animTick >= 1380 && this.animTick <= 1810 && this.animTick % 20 == 0) {
            ArrowEntity arrow = new ArrowEntity(world, cx + 0.5, floorY + 10, cz + 0.5);
            arrow.setVelocity(new Vec3d(0, -0.5, 0));
            arrow.setDamage(6.0);
            ctx.spawnTracked(arrow, world);
            this.combatArrowsSpawned++;

            // Particle effect
            world.addParticle(ParticleTypes.CRIT, cx + 0.5, floorY + 10, cz + 0.5, 0, 0, 0);
        }

        // Spawn experience orbs
        if (this.animTick >= 1400 && this.animTick <= 1790 && this.animTick % 40 == 0) {
            net.minecraft.entity.ExperienceOrbEntity orb = new net.minecraft.entity.ExperienceOrbEntity(world, cx + 0.5, floorY + 2, cz + 0.5, 5);
            ctx.spawnTracked(orb, world);
            this.otherEntitiesSpawned++;
        }
    }

    private void tickZoneParticles(BenchContext ctx, ServerWorld world) {
        // Cave particles
        if (this.animTick % 10 == 0) {
            int cx = C_CAVE.getX();
            int cz = C_CAVE.getZ();
            world.addParticle(ParticleTypes.DRIPPING_DRIPSTONE_WATER, cx + 0.5, 65, cz + 0.5, 0, 0, 0);
            world.addParticle(ParticleTypes.BUBBLE, cx + 0.5, 55, cz + 0.5, 0, 0.1, 0);
            world.addParticle(ParticleTypes.SPLASH, cx + 0.5, 50, cz + 0.5, 0, 0, 0);
            this.zoneParticlesSpawned += 3;
        }

        // Nether particles
        if (this.animTick % 8 == 0) {
            int cx = C_NETHER.getX();
            int cz = C_NETHER.getZ();
            world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, cx + 0.5, 72, cz + 0.5, 0, 0.1, 0);
            world.addParticle(ParticleTypes.FLAME, cx + 0.5, 73, cz + 15, 0, 0.1, 0);
            world.addParticle(ParticleTypes.LAVA, cx + 0.5, 71, cz + 15, 0, 0, 0);
            this.zoneParticlesSpawned += 3;
        }

        // End particles
        if (this.animTick % 12 == 0) {
            int cx = C_END.getX();
            int cz = C_END.getZ();
            world.addParticle(ParticleTypes.END_ROD, cx + 0.5, 85, cz + 0.5, 0, 0.05, 0);
            world.addParticle(ParticleTypes.PORTAL, cx + 0.5, 93, cz + 0.5, 0, 0.1, 0);
            world.addParticle(ParticleTypes.DRAGON_BREATH, cx + 0.5, 90, cz + 0.5, 0, 0, 0);
            this.zoneParticlesSpawned += 3;
        }
    }

    private void cleanupDistantEntities(ServerWorld world) {
        // Remove entities far from camera path to prevent buildup
        // This is a simplified version - the reference does more sophisticated cleanup
    }

    // ==================== Block Placement Helpers ====================

    private void set(ServerWorld world, int x, int y, int z, BlockState state) {
        world.setBlockState(new BlockPos(x, y, z), state, 3);
        this.blocksPlaced++;
    }

    private void setFast(ServerWorld world, int x, int y, int z, BlockState state) {
        world.setBlockState(new BlockPos(x, y, z), state, 2);
        this.blocksPlaced++;
    }

    private int surfaceY(int x, int z) {
        // Simplified surface height - flat at y=70 for most zones
        if (z <= -350 && z >= -450) return 50; // Cave zone lower
        return 70;
    }

    // ==================== Ambient Animal Spawning ====================

    private void spawnAmbientAnimals(BenchContext ctx, ServerWorld world) {
        int bx = C_BASE.getX();
        int bz = C_BASE.getZ();
        this.spawnPassiveSafe(ctx, world, EntityType.COW, bx - 4, bz - 2, true);
        this.spawnPassiveSafe(ctx, world, EntityType.COW, bx - 4, bz + 1, true);
        this.spawnPassiveSafe(ctx, world, EntityType.COW, bx - 5, bz - 3, true);
        this.spawnPassiveSafe(ctx, world, EntityType.COW, bx - 3, bz + 2, true);
        this.spawnPassiveSafe(ctx, world, EntityType.SHEEP, bx + 2, bz + 3, true);
        this.spawnPassiveSafe(ctx, world, EntityType.SHEEP, bx + 4, bz + 3, true);
        this.spawnPassiveSafe(ctx, world, EntityType.SHEEP, bx + 3, bz - 2, true);
        this.spawnPassiveSafe(ctx, world, EntityType.SHEEP, bx + 5, bz - 1, true);
        int penCx = C_VILLAGE.getX() + 11;
        int penCz = C_VILLAGE.getZ() + 6;
        BlockState fence = Blocks.OAK_FENCE.getDefaultState();
        BlockState gate = Blocks.OAK_FENCE_GATE.getDefaultState().with(FenceGateBlock.OPEN, Boolean.TRUE);

        for (int dx = -3; dx <= 3; dx++) {
            this.set(world, penCx + dx, 71, penCz - 3, fence);
            this.set(world, penCx + dx, 71, penCz + 3, fence);
        }

        for (int dz = -3; dz <= 3; dz++) {
            this.set(world, penCx - 3, 71, penCz + dz, fence);
            this.set(world, penCx + 3, 71, penCz + dz, fence);
        }

        this.set(world, penCx - 3, 71, penCz, gate);
        this.set(world, penCx, 71, penCz - 1, Blocks.HAY_BLOCK.getDefaultState());
        this.set(world, penCx + 1, 70, penCz + 1, Blocks.WATER.getDefaultState());
        this.spawnPassiveSafe(ctx, world, EntityType.PIG, penCx - 1, penCz - 1, true);
        this.spawnPassiveSafe(ctx, world, EntityType.PIG, penCx + 1, penCz - 2, true);
        this.spawnPassiveSafe(ctx, world, EntityType.PIG, penCx - 2, penCz + 1, true);
        this.spawnPassiveSafe(ctx, world, EntityType.PIG, penCx + 2, penCz + 1, true);
        this.spawnPassiveSafe(ctx, world, EntityType.CHICKEN, penCx, penCz + 2, true);
        this.spawnPassiveSafe(ctx, world, EntityType.CHICKEN, penCx - 1, penCz + 2, true);
        this.spawnPassiveSafe(ctx, world, EntityType.CHICKEN, penCx + 2, penCz - 1, true);
        this.spawnPassiveSafe(ctx, world, EntityType.CHICKEN, penCx, penCz - 2, true);
    }

    // ==================== Cinematic Camera Path ====================

    private CameraPath buildCinematicPath() {
        int gy = 70;
        List<NamedSegment> named = new ArrayList<>();
        named.add(
            new NamedSegment(
                "intro",
                160,
                new LinearPath(new Vec3d(C_SPAWN.getX() - 14, gy + 22, C_SPAWN.getZ() + 18), new Vec3d(0.075, -0.04, -0.025), 250.0F, 18.0F)
            )
        );
        named.add(
            new NamedSegment(
                "plaza_orbit", 120, new OrbitPath(new Vec3d(C_SPAWN.getX() + 0.5, gy + 3, C_SPAWN.getZ() + 0.5), 10.0, 6.0, 0.6, 200.0F)
            )
        );
        named.add(
            new NamedSegment(
                "forest_fly",
                200,
                new LinearPath(new Vec3d(C_SPAWN.getX() + 6, gy + 14, C_SPAWN.getZ() + 1), new Vec3d(0.12, 0.03, 0.105), 300.0F, 12.0F)
            )
        );
        named.add(
            new NamedSegment(
                "forest_orbit", 200, new OrbitPath(new Vec3d(C_FOREST.getX() + 0.5, gy + 5, C_FOREST.getZ() + 0.5), 20.0, 18.0, 0.55)
            )
        );
        named.add(
            new NamedSegment(
                "base_fly",
                180,
                new LinearPath(
                    new Vec3d(C_FOREST.getX() + 0.5, gy + 20, C_FOREST.getZ() - 8), new Vec3d(0.155, -0.044, -0.05), 200.0F, 20.0F
                )
            )
        );
        named.add(
            new NamedSegment(
                "base_orbit", 220, new OrbitPath(new Vec3d(C_BASE.getX() + 0.5, gy + 4, C_BASE.getZ() + 0.5), 14.0, 8.0, 0.55)
            )
        );
        named.add(
            new NamedSegment(
                "village_fly",
                140,
                new LinearPath(new Vec3d(C_BASE.getX() + 8, gy + 10, C_BASE.getZ() - 2), new Vec3d(0.18, 0.0, -0.06), 215.0F, 14.0F)
            )
        );
        named.add(
            new NamedSegment(
                "village", 200, new OrbitPath(new Vec3d(C_VILLAGE.getX() + 0.5, gy + 5, C_VILLAGE.getZ() + 0.5), 18.0, 10.0, 0.45)
            )
        );
        named.add(
            new NamedSegment(
                "combat_in",
                100,
                new LinearPath(new Vec3d(C_COMBAT.getX() - 30, gy + 12, C_COMBAT.getZ() + 8), new Vec3d(0.16, -0.06, -0.085), 245.0F, 18.0F)
            )
        );
        named.add(
            new NamedSegment(
                "combat_orbit", 260, new OrbitPath(new Vec3d(C_COMBAT.getX() + 0.5, gy + 4, C_COMBAT.getZ() + 0.5), 14.0, 6.0, 0.5, 180.0F)
            )
        );
        named.add(
            new NamedSegment(
                "redstone",
                200,
                new LinearPath(new Vec3d(C_REDSTONE.getX() - 10, gy + 7, C_REDSTONE.getZ() - 3), new Vec3d(0.13, 0.0, 0.04), 270.0F, 14.0F)
            )
        );
        named.add(
            new NamedSegment(
                "cave_fly",
                110,
                new LinearPath(new Vec3d(C_CAVE.getX() - 12, gy + 12, C_CAVE.getZ() - 8), new Vec3d(0.091, -0.082, 0.073), 280.0F, 10.0F)
            )
        );
        named.add(
            new NamedSegment(
                "cave_inside",
                200,
                new LinearPath(new Vec3d(C_CAVE.getX() - 2, gy + 3, C_CAVE.getZ() + 0.5), new Vec3d(0.1, 0.0, 0.0), 270.0F, 0.0F)
            )
        );
        named.add(
            new NamedSegment(
                "cave_pull",
                150,
                new LinearPath(new Vec3d(C_CAVE.getX() + 18, gy + 3, C_CAVE.getZ() + 0.5), new Vec3d(-0.18, 0.0, -0.05), 110.0F, 6.0F)
            )
        );
        named.add(
            new NamedSegment(
                "nether_fly",
                160,
                new LinearPath(new Vec3d(C_NETHER.getX() - 25, gy + 3, C_NETHER.getZ()), new Vec3d(0.135, 0.0, 0.0), 270.0F, 0.0F)
            )
        );
        named.add(
            new NamedSegment(
                "nether_orbit", 240, new OrbitPath(new Vec3d(C_NETHER.getX() + 0.5, gy + 3, C_NETHER.getZ() + 0.5), 4.0, 0.0, 0.6)
            )
        );
        named.add(
            new NamedSegment(
                "end_fly",
                160,
                new LinearPath(new Vec3d(C_END.getX() - 50, gy + 20, C_END.getZ() - 4), new Vec3d(0.156, 0.0, 0.025), 270.0F, 6.0F)
            )
        );
        named.add(
            new NamedSegment(
                "end_orbit", 340, new OrbitPath(new Vec3d(C_END.getX() + 0.5, gy + 10, C_END.getZ() + 0.5), 25.0, 10.0, 0.4, 180.0F)
            )
        );
        named.add(
            new NamedSegment(
                "final",
                260,
                new LinearPath(new Vec3d(C_END.getX() - 25, gy + 50, C_END.getZ() - 4), new Vec3d(-0.45, 0.0, -0.07), 250.0F, 25.0F)
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

        for (NamedSegment ns : named) {
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

    // ==================== Camera Corridor Carving ====================

    private void carveCameraCorridor(ServerWorld world, CameraPath path, int totalTicks) {
        if (path != null && totalTicks > 0) {
            int strippedTotal = 0;
            int coreHitTicks = 0;
            int loggedUnsafe = 0;

            for (int t = 0; t < totalTicks; t += 2) {
                Pose pose = path.poseAt(t, 0.0F);
                Vec3d pos = pose.pos();
                double r = this.carveRadiusForTick(t);
                int[] result = this.stripUnsafeAround(world, pos.x, pos.y, pos.z, r);
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
                                name,
                                t,
                                String.format("%.1f", pos.x),
                                String.format("%.1f", pos.y),
                                String.format("%.1f", pos.z),
                                result[1]
                            );
                    }
                }
            }

            FpsTestClient.LOG
                .info("[BaseFps] camera-corridor carve done: stripped={} core-hits={}/{} samples", strippedTotal, coreHitTicks, totalTicks / 2);
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

    private int[] stripUnsafeAround(ServerWorld world, double cx, double cy, double cz, double radius) {
        int stripped = 0;
        int structuralCoreHit = 0;
        int r = (int) Math.ceil(radius);
        int icx = (int) Math.floor(cx);
        int icy = (int) Math.floor(cy);
        int icz = (int) Math.floor(cz);
        BlockState air = Blocks.AIR.getDefaultState();
        double r2 = radius * radius;
        double coreR2 = 2.5600000000000005;

        for (int dx = -r; dx <= r; dx++) {
            for (int dy = -r; dy <= r; dy++) {
                for (int dz = -r; dz <= r; dz++) {
                    double d2 = dx * dx + dy * dy + dz * dz;
                    if (!(d2 > r2)) {
                        BlockPos p = new BlockPos(icx + dx, icy + dy, icz + dz);
                        BlockState s = world.getBlockState(p);
                        if (!s.isAir()) {
                            boolean inCore = d2 <= coreR2;
                            if (inCore) {
                                if (!this.isStrippableForCamera(s) && s.isSolidBlock(world, p)) {
                                    structuralCoreHit++;
                                }

                                world.setBlockState(p, air, 2);
                                stripped++;
                            } else if (this.isStrippableForCamera(s)) {
                                world.setBlockState(p, air, 2);
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
        return s.isOf(Blocks.GRASS)
            || s.isOf(Blocks.TALL_GRASS)
            || s.isOf(Blocks.FERN)
            || s.isOf(Blocks.LARGE_FERN)
            || s.isOf(Blocks.DANDELION)
            || s.isOf(Blocks.POPPY)
            || s.isOf(Blocks.CORNFLOWER)
            || s.isOf(Blocks.BLUE_ORCHID)
            || s.isOf(Blocks.ALLIUM)
            || s.isOf(Blocks.AZURE_BLUET)
            || s.isOf(Blocks.RED_TULIP)
            || s.isOf(Blocks.ORANGE_TULIP)
            || s.isOf(Blocks.WHITE_TULIP)
            || s.isOf(Blocks.PINK_TULIP)
            || s.isOf(Blocks.OXEYE_DAISY)
            || s.isOf(Blocks.WITHER_ROSE)
            || s.isOf(Blocks.LILY_OF_THE_VALLEY)
            || s.isOf(Blocks.TORCHFLOWER)
            || s.isOf(Blocks.PITCHER_PLANT)
            || s.isOf(Blocks.SHORT_GRASS)
            || s.isOf(Blocks.DEAD_BUSH)
            || s.isOf(Blocks.SEAGRASS)
            || s.isOf(Blocks.TALL_SEAGRASS)
            || s.isOf(Blocks.KELP)
            || s.isOf(Blocks.KELP_PLANT)
            || s.isOf(Blocks.WATER)
            || s.isOf(Blocks.LAVA)
            || s.isOf(Blocks.BUBBLE_COLUMN)
            || s.isOf(Blocks.SUGAR_CANE)
            || s.isOf(Blocks.BAMBOO)
            || s.isOf(Blocks.BAMBOO_SAPLING)
            || s.isOf(Blocks.VINE)
            || s.isOf(Blocks.GLOW_LICHEN)
            || s.isOf(Blocks.HANGING_ROOTS)
            || s.isOf(Blocks.CAVE_VINES)
            || s.isOf(Blocks.CAVE_VINES_PLANT)
            || s.isOf(Blocks.SMALL_DRIPLEAF)
            || s.isOf(Blocks.BIG_DRIPLEAF)
            || s.isOf(Blocks.MOSS_CARPET)
            || s.isOf(Blocks.PINK_PETALS)
            || s.isOf(Blocks.TORCH)
            || s.isOf(Blocks.REDSTONE_TORCH)
            || s.isOf(Blocks.SOUL_TORCH)
            || s.isOf(Blocks.WALL_TORCH)
            || s.isOf(Blocks.REDSTONE_WALL_TORCH)
            || s.isOf(Blocks.SOUL_WALL_TORCH);
    }

    // ==================== Passive Entity Spawning ====================

    private void spawnPassive(BenchContext ctx, ServerWorld world, EntityType<? extends LivingEntity> type, double x, double y, double z) {
        LivingEntity e = type.create(world);
        if (e != null) {
            e.refreshPositionAndAngles(x + 0.5, y, z + 0.5, 0.0F, 0.0F);
            if (e instanceof MobEntity m) {
                m.initialize(world, world.getLocalDifficulty(e.getBlockPos()), SpawnReason.NATURAL, null);
                m.setPersistent(false);
                m.setAiDisabled(false);
                m.setNoGravity(true);
                e.setInvulnerable(true);
            }

            ctx.spawnTracked(e, world);
            this.otherEntitiesSpawned++;
        }
    }

    private void spawnPassiveSafe(BenchContext ctx, ServerWorld world, EntityType<? extends LivingEntity> type, int x, int z, boolean aiEnabled) {
        int[] safeXZ = this.findSafeSpawn(world, x, z);
        if (safeXZ == null) {
            FpsTestClient.LOG
                .warn(
                    "[BaseFps] spawnPassiveSafe: no safe spawn within r=4 of ({}, {}) for {} — falling back to requested cell with forced air clear",
                    x, z, type
                );
            safeXZ = new int[]{x, z};
        }

        int sx = safeXZ[0];
        int sz = safeXZ[1];
        int sy = this.topSolidY(world, sx, sz);
        if (sy < 62) {
            sy = this.surfaceY(sx, sz);
        }

        BlockState air = Blocks.AIR.getDefaultState();

        for (int dy = 1; dy <= 2; dy++) {
            BlockPos p = new BlockPos(sx, sy + dy, sz);
            BlockState s = world.getBlockState(p);
            if (s.getFluidState().isEmpty() && !s.isAir() && s.canMobSpawnInside()) {
                world.setBlockState(p, air, 2);
            }
        }

        LivingEntity e = type.create(world);
        if (e != null) {
            e.refreshPositionAndAngles(sx + 0.5, sy + 1.01, sz + 0.5, 0.0F, 0.0F);
            if (e instanceof MobEntity m) {
                m.initialize(world, world.getLocalDifficulty(e.getBlockPos()), SpawnReason.NATURAL, null);
                m.setPersistent(!aiEnabled);
                m.setAiDisabled(!aiEnabled);
                m.setNoGravity(true);
            }

            ctx.spawnTracked(e, world);
            this.otherEntitiesSpawned++;
        }
    }

    private int topSolidY(ServerWorld world, int x, int z) {
        for (int y = 84; y >= 62; y--) {
            BlockState s = world.getBlockState(new BlockPos(x, y, z));
            if (!s.isAir()
                && !s.canMobSpawnInside()
                && s.getFluidState().isEmpty()
                && !s.isOf(Blocks.OAK_FENCE)
                && !s.isOf(Blocks.OAK_FENCE_GATE)
                && !s.isOf(Blocks.COBBLESTONE_WALL)
                && !s.isOf(Blocks.STONE_BRICK_WALL)
                && !s.isOf(Blocks.GLASS)
                && !s.isOf(Blocks.GRASS)
                && !s.isOf(Blocks.TALL_GRASS)
                && !s.isOf(Blocks.FERN)
                && !s.isOf(Blocks.LARGE_FERN)
                && !s.isOf(Blocks.DANDELION)
                && !s.isOf(Blocks.POPPY)
                && !s.isOf(Blocks.CORNFLOWER)
                && !s.isOf(Blocks.BLUE_ORCHID)
                && !s.isOf(Blocks.ALLIUM)
                && !s.isOf(Blocks.AZURE_BLUET)
                && !s.isOf(Blocks.RED_TULIP)
                && !s.isOf(Blocks.ORANGE_TULIP)
                && !s.isOf(Blocks.WHITE_TULIP)
                && !s.isOf(Blocks.PINK_TULIP)
                && !s.isOf(Blocks.OXEYE_DAISY)
                && !s.isOf(Blocks.WITHER_ROSE)
                && !s.isOf(Blocks.LILY_OF_THE_VALLEY)
                && !s.isOf(Blocks.TORCHFLOWER)
                && !s.isOf(Blocks.PITCHER_PLANT)
                && !s.isOf(Blocks.SHORT_GRASS)
                && !s.isOf(Blocks.DEAD_BUSH)
                && !s.isOf(Blocks.SEAGRASS)
                && !s.isOf(Blocks.TALL_SEAGRASS)
                && !s.isOf(Blocks.KELP)
                && !s.isOf(Blocks.KELP_PLANT)
                && !s.isOf(Blocks.WATER)
                && !s.isOf(Blocks.LAVA)
                && !s.isOf(Blocks.BUBBLE_COLUMN)
                && !s.isOf(Blocks.SUGAR_CANE)
                && !s.isOf(Blocks.BAMBOO)
                && !s.isOf(Blocks.BAMBOO_SAPLING)
                && !s.isOf(Blocks.VINE)
                && !s.isOf(Blocks.GLOW_LICHEN)
                && !s.isOf(Blocks.HANGING_ROOTS)
                && !s.isOf(Blocks.CAVE_VINES)
                && !s.isOf(Blocks.CAVE_VINES_PLANT)
                && !s.isOf(Blocks.SMALL_DRIPLEAF)
                && !s.isOf(Blocks.BIG_DRIPLEAF)
                && !s.isOf(Blocks.MOSS_CARPET)
                && !s.isOf(Blocks.PINK_PETALS)
                && !s.isOf(Blocks.TORCH)
                && !s.isOf(Blocks.REDSTONE_TORCH)
                && !s.isOf(Blocks.SOUL_TORCH)
                && !s.isOf(Blocks.WALL_TORCH)
                && !s.isOf(Blocks.REDSTONE_WALL_TORCH)
                && !s.isOf(Blocks.SOUL_WALL_TORCH)
                && !s.isOf(Blocks.HAY_BLOCK)) {
                return y;
            }
        }

        return 61;
    }

    private boolean isSafeSpawn(ServerWorld world, int x, int z) {
        int top = this.topSolidY(world, x, z);
        if (top < 62) {
            return false;
        } else {
            BlockState a1 = world.getBlockState(new BlockPos(x, top + 1, z));
            BlockState a2 = world.getBlockState(new BlockPos(x, top + 2, z));
            return (a1.isAir() || a1.canMobSpawnInside()) && (a2.isAir() || a2.canMobSpawnInside());
        }
    }

    private int[] findSafeSpawn(ServerWorld world, int x, int z) {
        if (this.isSafeSpawn(world, x, z)) {
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
                if (this.isSafeSpawn(world, x + o[0], z + o[1])) {
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