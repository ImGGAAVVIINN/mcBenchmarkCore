package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class LinearPath implements CameraPath {
    private final Vec3 start;
    private final Vec3 velocityPerTick;
    private final float yaw;
    private final float pitch;

    public LinearPath(Vec3 start, Vec3 velocityPerTick, float yaw, float pitch) {
        this.start = start;
        this.velocityPerTick = velocityPerTick;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public Pose poseAt(int tick, float partial) {
        double t = tick + partial;
        Vec3 pos = new Vec3(
            this.start.x + this.velocityPerTick.x * t,
            this.start.y + this.velocityPerTick.y * t,
            this.start.z + this.velocityPerTick.z * t
        );
        return new Pose(pos, this.yaw, this.pitch);
    }
}