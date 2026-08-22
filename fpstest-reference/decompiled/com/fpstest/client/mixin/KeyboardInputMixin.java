package com.fpstest.client.mixin;

import com.fpstest.client.control.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_743.class})
public abstract class KeyboardInputMixin {
   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void fpstest$lockInput(boolean slowDown, float slowDownFactor, CallbackInfo ci) {
      if (CinematicState.active) {
         class_743 self = (class_743)this;
         self.field_3910 = false;
         self.field_3909 = false;
         self.field_3908 = false;
         self.field_3906 = false;
         self.field_3904 = false;
         self.field_3903 = false;
         self.field_3905 = 0.0F;
         self.field_3907 = 0.0F;
      }
   }
}
