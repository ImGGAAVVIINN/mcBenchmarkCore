package com.dgm.mcbc.bench;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameRules;

import java.util.List;
import java.util.function.Predicate;

public final class Arena {
    private Arena() {}

    public static void freezeTime(ClientWorld world) {
        world.getGameRules().getBoolean(GameRules.DO_DAYLIGHT_CYCLE).set(false, world.getServer());
        world.getGameRules().getBoolean(GameRules.DO_WEATHER_CYCLE).set(false, world.getServer());
        world.getGameRules().getBoolean(GameRules.DO_MOB_SPAWNING).set(false, world.getServer());
        world.getGameRules().getBoolean(GameRules.DO_FIRE_TICK).set(false, world.getServer());
        world.setTime(6000);
    }

    public static void teleport(PlayerEntity player, double x, double y, double z, float yaw, float pitch) {
        player.teleport(x, y, z, yaw, pitch);
    }

    public static void teleport(PlayerEntity player, BlockPos pos, float yaw, float pitch) {
        teleport(player, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, yaw, pitch);
    }

    public static void placeSlabFloor(ClientWorld world, BlockPos center, int radius, BlockState state) {
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                BlockPos pos = center.add(dx, 0, dz);
                world.setBlockState(pos, state, 3);
            }
        }
    }

    public static void carveSphere(ClientWorld world, BlockPos center, int radius, Predicate<BlockState> filter) {
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) {
                for (int dz = -radius; dz <= radius; dz++) {
                    if (dx * dx + dy * dy + dz * dz <= radius * radius) {
                        BlockPos pos = center.add(dx, dy, dz);
                        BlockState state = world.getBlockState(pos);
                        if (filter.test(state)) {
                            world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                        }
                    }
                }
            }
        }
    }

    public static void carveCylinder(ClientWorld world, BlockPos center, int radius, int height, Predicate<BlockState> filter) {
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                if (dx * dx + dz * dz <= radius * radius) {
                    for (int dy = 0; dy < height; dy++) {
                        BlockPos pos = center.add(dx, dy, dz);
                        BlockState state = world.getBlockState(pos);
                        if (filter.test(state)) {
                            world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                        }
                    }
                }
            }
        }
    }

    public static void clearEntities(ClientWorld world, Box box, Predicate<Entity> filter) {
        List<Entity> entities = world.getOtherEntities(null, box, filter);
        for (Entity entity : entities) {
            entity.discard();
        }
    }

    public static void clearAllEntities(ClientWorld world, Box box) {
        clearEntities(world, box, e -> true);
    }

    public static void setBlockFast(ClientWorld world, BlockPos pos, BlockState state) {
        world.setBlockState(pos, state, 2);
    }

    public static void setBlock(ClientWorld world, BlockPos pos, BlockState state) {
        world.setBlockState(pos, state, 3);
    }

    public static int topSolidY(ClientWorld world, int x, int z) {
        for (int y = world.getTopY(); y >= world.getBottomY(); y--) {
            BlockState state = world.getBlockState(new BlockPos(x, y, z));
            if (state.isSolid()) {
                return y + 1;
            }
        }
        return world.getSeaLevel();
    }

    public static boolean isSafeSpawn(ClientWorld world, BlockPos pos) {
        BlockState below = world.getBlockState(pos.down());
        if (!below.isSolid() || below.isAir()) {
            return false;
        }
        BlockState at = world.getBlockState(pos);
        BlockState above = world.getBlockState(pos.up());
        return at.isAir() && above.isAir();
    }

    public static BlockPos findSafeSpawn(ClientWorld world, BlockPos center, int radius) {
        for (int r = 0; r <= radius; r++) {
            for (int dx = -r; dx <= r; dx++) {
                for (int dz = -r; dz <= r; dz++) {
                    if (dx * dx + dz * dz <= r * r) {
                        BlockPos pos = center.add(dx, 0, dz);
                        int y = topSolidY(world, pos.getX(), pos.getZ());
                        BlockPos spawnPos = new BlockPos(pos.getX(), y, pos.getZ());
                        if (isSafeSpawn(world, spawnPos)) {
                            return spawnPos;
                        }
                    }
                }
            }
        }
        return null;
    }
}