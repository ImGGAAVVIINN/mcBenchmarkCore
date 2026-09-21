package com.fpstest.client.bench;

import com.fpstest.client.bench.camera.CameraPath;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.Vec3d;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public final class BenchContext {
    public final MinecraftClient client;
    private final List<UUID> spawned = new ArrayList<>();
    private Vec3d arenaOrigin = Vec3d.ZERO;
    private CameraPath cameraPath;
    private RunPlan plan;

    public BenchContext(MinecraftClient client) {
        this.client = client;
    }

    public RunPlan plan() {
        return plan;
    }

    public void setPlan(RunPlan plan) {
        this.plan = plan;
    }

    public ClientPlayerEntity player() {
        return client.player;
    }

    public ClientWorld clientLevel() {
        return client.world;
    }

    public MinecraftServer server() {
        return client.getServer();
    }

    public net.minecraft.server.network.ServerPlayerEntity serverPlayer() {
        MinecraftServer server = server();
        if (server == null) return null;
        if (client.player == null) return null;
        return server.getPlayerManager().getPlayer(client.player.getUuid());
    }

    public net.minecraft.server.world.ServerWorld serverLevel() {
        net.minecraft.server.network.ServerPlayerEntity serverPlayer = serverPlayer();
        if (serverPlayer != null) {
            return (net.minecraft.server.world.ServerWorld) serverPlayer.getWorld();
        }
        MinecraftServer server = server();
        if (server != null) {
            return server.getOverworld();
        }
        return null;
    }

    public void onServer(java.util.function.Consumer<MinecraftServer> consumer) {
        MinecraftServer server = server();
        if (server == null) return;

        if (Thread.currentThread() == server.getThread()) {
            consumer.accept(server);
        } else {
            server.execute(() -> consumer.accept(server));
        }
    }

    public void spawnTracked(net.minecraft.entity.Entity entity, net.minecraft.server.world.ServerWorld world) {
        world.spawnEntity(entity);
        spawned.add(entity.getUuid());
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
        net.minecraft.server.world.ServerWorld world = server.getOverworld();
        if (world == null) {
            return;
        }
        int batch = 50;
        int end = Math.min(start + batch, uuids.size());

        for (int i = start; i < end; i++) {
            try {
                net.minecraft.entity.Entity entity = world.getEntity(uuids.get(i));
                if (entity != null) {
                    entity.discard();
                }
            } catch (Throwable ignored) {
            }
        }

        if (end < uuids.size()) {
            server.execute(() -> drainBatch(server, uuids, end));
        }
    }

    public void setBlock(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state) {
        world.setBlockState(pos, state, 2);
    }

    public void setArenaOrigin(Vec3d origin) {
        this.arenaOrigin = origin;
    }

    public Vec3d arenaOrigin() {
        return arenaOrigin;
    }

    public void setCameraPath(CameraPath path) {
        this.cameraPath = path;
        com.fpstest.client.bench.camera.CinematicState.path = path;
        com.fpstest.client.bench.camera.CinematicState.pathTick = 0;
    }
}