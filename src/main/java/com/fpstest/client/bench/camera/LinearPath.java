package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public final class LinearPath implements CameraPath {
    private final Vec3d start;
    private final Vec3d velocityPerTick;
    private final float yaw;
    private final float pitch;

    public LinearPath(Vec3d start, Vec3d velocityPerTick, float yaw, float pitch) {
        this.start = start;
        this.velocityPerTick = velocityPerTick;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public Pose poseAt(int tick, float partial) {
        double t = tick + partial;
        Vec3d pos = new Vec3d(
            this.start.x + this.velocityPerTick.x * t,
            this.start.y + this.velocityPerTick.y * t,
            this.start.z + this.velocityPerTick.z * t
        );
        return new Pose(pos, this.yaw, this.pitch);
    }
}