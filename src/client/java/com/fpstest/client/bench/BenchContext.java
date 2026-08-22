package com.fpstest.client.bench;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public final class BenchContext {
    public final Minecraft client;
    private final List<UUID> spawned = new ArrayList<>();
    private BlockPos arenaOrigin = BlockPos.ZERO;
    private RunPlan plan;

    public BenchContext(Minecraft client) {
        this.client = client;
    }

    public RunPlan plan() {
        return plan;
    }

    public void setPlan(RunPlan plan) {
        this.plan = plan;
    }

    public LocalPlayer player() {
        return client.player;
    }

    public ClientLevel clientLevel() {
        return client.level;
    }

    public MinecraftServer server() {
        return client.getSingleplayerServer();
    }

    public net.minecraft.server.level.ServerPlayer serverPlayer() {
        MinecraftServer server = server();
        if (server == null) return null;
        if (client.player == null) return null;
        return server.getPlayerList().getPlayer(client.player.getUUID());
    }

    public net.minecraft.world.level.Level serverLevel() {
        net.minecraft.server.level.ServerPlayer serverPlayer = serverPlayer();
        if (serverPlayer != null) {
            return serverPlayer.level();
        }
        MinecraftServer server = server();
        if (server != null) {
            return server.overworld();
        }
        return null;
    }

    public void onServer(java.util.function.Consumer<MinecraftServer> consumer) {
        MinecraftServer server = server();
        if (server == null) return;

        if (Thread.currentThread() == server.getRunningThread()) {
            consumer.accept(server);
        } else {
            server.execute(() -> consumer.accept(server));
        }
    }

    public void spawnTracked(net.minecraft.world.entity.Entity entity, net.minecraft.world.level.Level world) {
        world.addFreshEntity(entity);
        spawned.add(entity.getUUID());
    }

    public int trackedCount() {
        return spawned.size();
    }

    public void removeTracked() {
        if (spawned.isEmpty()) return;
        MinecraftServer server = server();
        if (server == null) {
            spawned.clear();
            return;
        }
        List<UUID> toRemove = new ArrayList<>(spawned);
        spawned.clear();
        server.execute(() -> drainBatch(server, toRemove, 0));
    }

    private void drainBatch(MinecraftServer server, List<UUID> uuids, int start) {
        net.minecraft.server.level.ServerLevel world = server.overworld();
        if (world == null) {
            return;
        }
        if (start < uuids.size()) {
            net.minecraft.world.entity.Entity entity = world.getEntity(uuids.get(start));
                if (entity != null) {
                    entity.discard();
                }
            drainBatch(server, uuids, start + 1);
        }
    }

    public void setBlock(net.minecraft.world.level.Level world, net.minecraft.core.BlockPos pos, net.minecraft.world.level.block.state.BlockState state) {
        world.setBlock(pos, state, 2);
    }

    public void setArenaOrigin(net.minecraft.core.BlockPos pos) {
        this.arenaOrigin = pos;
    }

    public net.minecraft.core.BlockPos arenaOrigin() {
        return arenaOrigin;
    }
}