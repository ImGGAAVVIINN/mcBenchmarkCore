package com.fpstest.client.bench.scene;

import com.fpstest.client.bench.BenchContext;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

@Environment(EnvType.CLIENT)
public final class Arena {
    private Arena() {
    }

    public static void teleport(BenchContext ctx, net.minecraft.util.math.Vec3d pos, float yaw, float pitch) {
        ctx.onServer(server -> {
            ServerPlayerEntity player = ctx.serverPlayer();
            ServerWorld level = (ServerWorld) ctx.serverLevel();
            if (player != null && level != null) {
                player.teleportTo(new net.minecraft.world.TeleportTarget(level, new net.minecraft.util.math.Vec3d(pos.x, pos.y, pos.z), net.minecraft.util.math.Vec3d.ZERO, yaw, pitch, net.minecraft.world.TeleportTarget.NO_OP));
                player.fallDistance = 0;
                player.setNoGravity(true);
                player.setInvulnerable(true);
            }
        });
    }

    public static void stoneSlab(ServerWorld level, int cx, int cy, int cz, int halfX, int halfZ) {
        fillSlab(level, cx, cy, cz, halfX, halfZ, Blocks.STONE.getDefaultState());
    }

    public static void bedrockSlab(ServerWorld level, int cx, int cy, int cz, int halfX, int halfZ) {
        fillSlab(level, cx, cy, cz, halfX, halfZ, Blocks.BEDROCK.getDefaultState());
    }

    private static void fillSlab(ServerWorld level, int cx, int cy, int cz, int halfX, int halfZ, BlockState block) {
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int x = -halfX; x <= halfX; x++) {
            for (int z = -halfZ; z <= halfZ; z++) {
                pos.set(cx + x, cy, cz + z);
                level.setBlockState(pos, block, 2);
            }
        }
    }

    public static void carveBox(ServerWorld level, int cx, int cy, int cz, int halfX, int height, int halfZ) {
        BlockState air = Blocks.AIR.getDefaultState();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int y = 1; y <= height; y++) {
            for (int x = -halfX; x <= halfX; x++) {
                for (int z = -halfZ; z <= halfZ; z++) {
                    pos.set(cx + x, cy + y, cz + z);
                    level.setBlockState(pos, air, 2);
                }
            }
        }
    }

    public static void freezeDaytime(BenchContext ctx) {
        ctx.onServer(server -> {
            ServerWorld level = (ServerWorld) ctx.serverLevel();
            if (level != null) {
                level.setTimeOfDay(6000L);
            }
        });
    }

    public static void freezeMidnight(BenchContext ctx) {
        ctx.onServer(server -> {
            ServerWorld level = (ServerWorld) ctx.serverLevel();
            if (level != null) {
                level.setTimeOfDay(18000L);
            }
        });
    }
}