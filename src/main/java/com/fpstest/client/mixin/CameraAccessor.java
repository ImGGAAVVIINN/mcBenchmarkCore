package com.fpstest.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin(Camera.class)
public interface CameraAccessor {
    @Invoker("setRotation")
    void fpstest$setRotation(float yaw, float pitch);

    @Invoker("setPosition")
    void fpstest$setPosition(double x, double y, double z);
}