package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.Pose;
import com.fpstest.client.control.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_4184.class})
public abstract class CameraMixin {
   @Inject(
      method = {"update"},
      at = {@At("TAIL")}
   )
   private void fpstest$applyCinematicPose(
      class_1922 level, class_1297 entity, boolean detached, boolean thirdPersonReverse, float partialTick, CallbackInfo ci
   ) {
      if (CinematicState.active) {
         Pose pose = CinematicState.currentPose(partialTick);
         if (pose != null) {
            CameraAccessor self = (CameraAccessor)this;
            self.fpstest$setRotation(pose.yaw(), pose.pitch());
            self.fpstest$setPosition(pose.pos().field_1352, pose.pos().field_1351, pose.pos().field_1350);
         }
      }
   }
}
