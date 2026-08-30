package com.dgm.mcbc.bench;

import com.dgm.mcbc.bench.camera.CameraPath;
import com.dgm.mcbc.control.CinematicState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public final class BenchContext {
    public final MinecraftClient client;
    private final List<UUID> spawned = new ArrayList<>();
    private BlockPos arenaOrigin = BlockPos.ZERO;
    private RunPlan plan;

    public BenchContext(MinecraftClient client) {
        this.client = client;
    }

    public RunPlan plan() {
        return this.plan;
    }

    public void setPlan(RunPlan plan) {
        this.plan = plan;
    }

    @Nullable
    public LocalPlayer player() {
        return this.client.player;
    }

    @Nullable
    public ClientLevel clientLevel() {
        return this.client.level;
    }

    @Nullable
    public MinecraftServer server() {
        return this.client.getServer();
    }

    @Nullable
    public ServerPlayer serverPlayer() {
        MinecraftServer s = this.server();
        return s != null && this.client.player != null ? s.getPlayerList().getPlayer(this.client.player.getUUID()) : null;
    }

    @Nullable
    public ServerLevel serverLevel() {
        ServerPlayer sp = this.serverPlayer();
        if (sp != null) {
            return sp.serverLevel();
        } else {
            MinecraftServer s = this.server();
            return s != null ? s.overworld() : null;
        }
    }

    public void onServer(Consumer<MinecraftServer> action) {
        MinecraftServer s = this.server();
        if (s != null) {
            if (s.isSameThread()) {
                action.accept(s);
            } else {
                s.execute(() -> action.accept(s));
            }
        }
    }

    public void spawnTracked(Entity entity, ServerLevel world) {
        world.addFreshEntity(entity);
        this.spawned.add(entity.getUUID());
    }

    public int trackedCount() {
        return this.spawned.size();
    }

    public void removeTracked() {
        if (!this.spawned.isEmpty()) {
            MinecraftServer s = this.server();
            if (s == null) {
                this.spawned.clear();
            } else {
                List<UUID> snapshot = new ArrayList<>(this.spawned);
                this.spawned.clear();
                s.execute(() -> this.drainBatch(s, snapshot, 0));
            }
        }
    }

    private void drainBatch(MinecraftServer s, List<UUID> ids, int from) {
        ServerLevel lvl = s.overworld();
        if (lvl != null) {
            int batch = 50;
            int end = Math.min(from + batch, ids.size());

            for (int i = from; i < end; i++) {
                try {
                    Entity e = lvl.getEntity(ids.get(i));
                    if (e != null) {
                        e.discard();
                    }
                } catch (Throwable var9) {
                }
            }

            if (end < ids.size()) {
                s.execute(() -> this.drainBatch(s, ids, end));
            }
        }
    }

    public void setBlock(ServerLevel world, BlockPos pos, BlockState state) {
        world.setBlock(pos, state, 2);
    }

    public void setArenaOrigin(BlockPos origin) {
        this.arenaOrigin = origin;
    }

    public BlockPos arenaOrigin() {
        return this.arenaOrigin;
    }

    public void setCameraPath(@Nullable CameraPath path) {
        CinematicState.path = path;
        CinematicState.pathTick = 0;
    }
}