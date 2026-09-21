package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public record Pose(Vec3d pos, float yaw, float pitch) {
    public static Pose lookAt(Vec3d from, Vec3d target) {
        Vec3d d = target.subtract(from);
        double horiz = Math.sqrt(d.z * d.z + d.x * d.x);
        float yaw = (float) Math.toDegrees(Math.atan2(-d.x, d.z));
        float pitch = (float) Math.toDegrees(-Math.atan2(d.y, horiz));
        return new Pose(from, yaw, pitch);
    }
}