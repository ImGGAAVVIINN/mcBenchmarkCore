package com.fpstest.client.mixin;

import com.fpstest.client.FpsTestClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public abstract class PauseMenuSuppressMixin {
   @Inject(
      method = {"openGameMenu"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void fpstest$blockPause(boolean pauseOnly, CallbackInfo ci) {
      if (FpsTestClient.RUNNER.busy()) {
         ci.cancel();
      }
   }
}
