package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public final class OrbitPath implements CameraPath {
   private final class_243 center;
   private final double radius;
   private final double heightAboveCenter;
   private final double degreesPerTick;
   private final float initialAngleDeg;

   public OrbitPath(class_243 center, double radius, double heightAboveCenter, double degreesPerTick) {
      this(center, radius, heightAboveCenter, degreesPerTick, 0.0F);
   }

   public OrbitPath(class_243 center, double radius, double heightAboveCenter, double degreesPerTick, float initialAngleDeg) {
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
      double x = this.center.field_1352 + Math.cos(rad) * this.radius;
      double z = this.center.field_1350 + Math.sin(rad) * this.radius;
      double y = this.center.field_1351 + this.heightAboveCenter;
      class_243 pos = new class_243(x, y, z);
      return Pose.lookAt(pos, this.center);
   }
}
