package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public final class LinearPath implements CameraPath {
   private final class_243 start;
   private final class_243 velocityPerTick;
   private final float yaw;
   private final float pitch;

   public LinearPath(class_243 start, class_243 velocityPerTick, float yaw, float pitch) {
      this.start = start;
      this.velocityPerTick = velocityPerTick;
      this.yaw = yaw;
      this.pitch = pitch;
   }

   @Override
   public Pose poseAt(int tick, float partial) {
      double t = tick + partial;
      class_243 pos = new class_243(
         this.start.field_1352 + this.velocityPerTick.field_1352 * t,
         this.start.field_1351 + this.velocityPerTick.field_1351 * t,
         this.start.field_1350 + this.velocityPerTick.field_1350 * t
      );
      return new Pose(pos, this.yaw, this.pitch);
   }
}
