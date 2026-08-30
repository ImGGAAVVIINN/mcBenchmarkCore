package com.dgm.mcbc.bench;

import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class LinearPath implements CameraPath {
    private final BlockPos start;
    private final BlockPos velocityPerTick;
    private final float yaw;
    private final float pitch;

    public LinearPath(BlockPos start, BlockPos velocityPerTick, float yaw, float pitch) {
        this.start = start;
        this.velocityPerTick = velocityPerTick;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public CameraPath.Pose poseAt(int tick, float partial) {
        double t = tick + partial;
        Vec3 pos = new Vec3(
            this.start.getX() + this.velocityPerTick.getX() * t,
            this.start.getY() + this.velocityPerTick.getY() * t,
            this.start.getZ() + this.velocityPerTick.getZ() * t
        );
        return new CameraPath.Pose(pos, this.yaw, this.pitch);
    }
}