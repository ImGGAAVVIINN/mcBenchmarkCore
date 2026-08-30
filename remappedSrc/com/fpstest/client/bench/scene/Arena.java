package com.fpstest.client.bench.scene;

import com.fpstest.client.bench.BenchContext;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Relative;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import java.util.Set;

@Environment(EnvType.CLIENT)
public final class Arena {
    private Arena() {
    }

    public static void teleport(BenchContext ctx, net.minecraft.world.phys.Vec3 pos, float yaw, float pitch) {
        ctx.onServer(server -> {
            ServerPlayer player = ctx.serverPlayer();
            ServerLevel level = (ServerLevel) ctx.serverLevel();
            if (player != null && level != null) {
                player.teleportTo(level, pos.x, pos.y, pos.z, Set.of(), yaw, pitch, true);
                player.resetFallDistance();
                player.setNoGravity(true);
                player.setInvulnerable(true);
            }
        });
    }

    public static void stoneSlab(ServerLevel level, int cx, int cy, int cz, int halfX, int halfZ) {
        fillSlab(level, cx, cy, cz, halfX, halfZ, Blocks.STONE_SLAB.defaultBlockState());
    }

    public static void bedrockSlab(ServerLevel level, int cx, int cy, int cz, int halfX, int halfZ) {
        fillSlab(level, cx, cy, cz, halfX, halfZ, Blocks.BEDROCK.defaultBlockState());
    }

    private static void fillSlab(ServerLevel level, int cx, int cy, int cz, int halfX, int halfZ, BlockState block) {
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        for (int x = -halfX; x <= halfX; x++) {
            for (int z = -halfZ; z <= halfZ; z++) {
                pos.set(cx + x, cy, cz + z);
                level.setBlock(pos, block, 2);
            }
        }
    }

    public static void carveBox(ServerLevel level, int cx, int cy, int cz, int halfX, int height, int halfZ) {
        BlockState air = Blocks.AIR.defaultBlockState();
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        for (int y = 1; y <= height; y++) {
            for (int x = -halfX; x <= halfX; x++) {
                for (int z = -halfZ; z <= halfZ; z++) {
                    pos.set(cx + x, cy + y, cz + z);
                    level.setBlock(pos, air, 2);
                }
            }
        }
    }

    public static void freezeDaytime(BenchContext ctx) {
        ctx.onServer(server -> {
            ServerLevel level = (ServerLevel) ctx.serverLevel();
            if (level != null) {
                level.setDayTime(6000L);
            }
        });
    }

    public static void freezeMidnight(BenchContext ctx) {
        ctx.onServer(server -> {
            ServerLevel level = (ServerLevel) ctx.serverLevel();
            if (level != null) {
                level.setDayTime(18000L);
            }
        });
    }
}