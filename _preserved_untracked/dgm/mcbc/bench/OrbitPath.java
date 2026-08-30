package com.dgm.mcbc.bench;

import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class OrbitPath implements CameraPath {
    private final BlockPos center;
    private final double radius;
    private final double heightAboveCenter;
    private final double degreesPerTick;
    private final float initialAngleDeg;

    public OrbitPath(BlockPos center, double radius, double heightAboveCenter, double degreesPerTick) {
        this(center, radius, heightAboveCenter, degreesPerTick, 0.0F);
    }

    public OrbitPath(BlockPos center, double radius, double heightAboveCenter, double degreesPerTick, float initialAngleDeg) {
        this.center = center;
        this.radius = radius;
        this.heightAboveCenter = heightAboveCenter;
        this.degreesPerTick = degreesPerTick;
        this.initialAngleDeg = initialAngleDeg;
    }

    @Override
    public CameraPath.Pose poseAt(int tick, float partial) {
        double t = tick + partial;
        double deg = this.initialAngleDeg + this.degreesPerTick * t;
        double rad = Math.toRadians(deg);
        double x = this.center.getX() + Math.cos(rad) * this.radius;
        double z = this.center.getZ() + Math.sin(rad) * this.radius;
        double y = this.center.getY() + this.heightAboveCenter;
        Vec3 pos = new Vec3(x, y, z);
        return CameraPath.Pose.lookAt(pos, Vec3.atCenterOf(this.center));
    }
}