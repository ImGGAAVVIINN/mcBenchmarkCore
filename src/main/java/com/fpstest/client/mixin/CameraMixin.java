package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.camera.Pose;
import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class CameraMixin {

    @Inject(
        method = "setup",
        at = @At("TAIL")
    )
    private void fpstest$cameraSetup(
        net.minecraft.world.level.Level level,
        net.minecraft.world.entity.Entity entity,
        boolean detached,
        boolean thirdPerson,
        float partialTick,
        CallbackInfo ci
    ) {
        if (CinematicState.active) {
            Pose pose = CinematicState.currentPose(partialTick);

            if (pose != null) {
                CameraAccessor self = (CameraAccessor) (Object) this;

                self.fpstest$setPosition(
                    pose.pos().x(),
                    pose.pos().y(),
                    pose.pos().z()
                );

                self.fpstest$setRotation(
                    pose.yaw(),
                    pose.pitch()
                );
            }
        }
    }
}
