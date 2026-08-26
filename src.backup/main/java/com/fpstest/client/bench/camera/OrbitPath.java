package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class OrbitPath implements CameraPath {
    private final Vec3 center;
    private final double radius;
    private final double heightAboveCenter;
    private final double degreesPerTick;
    private final float initialAngleDeg;

    public OrbitPath(Vec3 center, double radius, double heightAboveCenter, double degreesPerTick) {
        this(center, radius, heightAboveCenter, degreesPerTick, 0.0F);
    }

    public OrbitPath(Vec3 center, double radius, double heightAboveCenter, double degreesPerTick, float initialAngleDeg) {
        this.center = center;
        this.radius = radius;
        this.heightAboveCenter = heightAboveCenter;
        this.degreesPerTick = degreesPerTick;
        this.initialAngleDeg = initialAngleDeg;
    }

    @Override
    public Pose poseAt(int tick, float partial) {
        double t = tick + partial;
        double deg = this.initialAngleDeg + this.degreesPerTick * t;
        double rad = Math.toRadians(deg);
        double x = this.center.x + Math.cos(rad) * this.radius;
        double z = this.center.z + Math.sin(rad) * this.radius;
        double y = this.center.y + this.heightAboveCenter;
        Vec3 pos = new Vec3(x, y, z);
        return Pose.lookAt(pos, this.center);
    }
}