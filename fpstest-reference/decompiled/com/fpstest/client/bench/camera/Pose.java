package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record Pose(class_243 pos, float yaw, float pitch) {
   public static Pose lookAt(class_243 from, class_243 target) {
      class_243 d = target.method_1020(from);
      double horiz = Math.sqrt(d.field_1352 * d.field_1352 + d.field_1350 * d.field_1350);
      float yaw = (float)Math.toDegrees(Math.atan2(-d.field_1352, d.field_1350));
      float pitch = (float)Math.toDegrees(-Math.atan2(d.field_1351, horiz));
      return new Pose(from, yaw, pitch);
   }
}
