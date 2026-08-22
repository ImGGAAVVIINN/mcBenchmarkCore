package com.fpstest.client.mixin;

import com.fpstest.client.control.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class MouseHandlerMixin {
   @Inject(
      method = {"updateMouse"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void fpstest$blockTurn(double deltaTime, CallbackInfo ci) {
      if (CinematicState.active) {
         ci.cancel();
      }
   }
}
