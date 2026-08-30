package com.dgm.mcbc.bench;

import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface CameraPath {
    Pose poseAt(int tick, float partial);

    @Environment(EnvType.CLIENT)
    record Pose(Vec3 pos, float yaw, float pitch) {
        public static Pose lookAt(Vec3 from, Vec3 target) {
            Vec3 d = target.subtract(from);
            double horiz = Math.sqrt(d.x * d.x + d.z * d.z);
            float yaw = (float) Math.toDegrees(Math.atan2(-d.x, d.z));
            float pitch = (float) Math.toDegrees(-Math.atan2(d.y, horiz));
            return new Pose(from, yaw, pitch);
        }
    }
}