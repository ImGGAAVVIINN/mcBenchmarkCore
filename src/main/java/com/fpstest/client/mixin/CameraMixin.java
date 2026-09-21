package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.camera.Pose;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class CameraMixin {

    @Inject(
        method = "update",
        at = @At("TAIL")
    )
    private void fpstest$cameraSetup(
        net.minecraft.world.BlockView level,
        net.minecraft.entity.Entity entity,
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
                    pose.pos().getX(),
                    pose.pos().getY(),
                    pose.pos().getZ()
                );

                self.fpstest$setRotation(
                    pose.yaw(),
                    pose.pitch()
                );
            }
        }
    }
}
