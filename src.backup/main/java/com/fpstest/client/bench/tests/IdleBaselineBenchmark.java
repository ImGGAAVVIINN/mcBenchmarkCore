package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.scene.Arena;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class IdleBaselineBenchmark implements Benchmark {
    private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);

    @Override
    public String id() {
        return "idle_baseline";
    }

    @Override
    public String displayName() {
        return "Idle Baseline";
    }

    @Override
    public String description() {
        return "Flat world, empty arena, camera orbits reference point";
    }

    @Override
    public WorldType worldType() {
        return WorldType.FLAT;
    }

    @Override
    public void prepare(BenchContext ctx) {
        Arena.freezeDaytime(ctx);
        Arena.teleport(ctx, CENTER, 0.0F, 0.0F);
        ctx.setArenaOrigin(CENTER);
        ctx.setCameraPath(new OrbitPath(CENTER, 20.0, 4.0, 1.5));
    }
}