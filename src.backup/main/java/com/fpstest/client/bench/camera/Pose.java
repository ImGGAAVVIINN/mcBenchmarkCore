package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public record Pose(Vec3 pos, float yaw, float pitch) {
    public static Pose lookAt(Vec3 from, Vec3 target) {
        Vec3 d = target.subtract(from);
        double horiz = Math.sqrt(d.z * d.z + d.x * d.x);
        float yaw = (float) Math.toDegrees(Math.atan2(-d.z, d.x));
        float pitch = (float) Math.toDegrees(-Math.atan2(d.y, horiz));
        return new Pose(from, yaw, pitch);
    }
}