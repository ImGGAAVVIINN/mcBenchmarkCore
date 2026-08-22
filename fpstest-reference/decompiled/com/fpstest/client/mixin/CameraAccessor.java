package com.fpstest.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_4184.class})
public interface CameraAccessor {
   @Invoker("setRotation")
   void fpstest$setRotation(float var1, float var2);

   @Invoker("setPos")
   void fpstest$setPosition(double var1, double var3, double var5);
}
