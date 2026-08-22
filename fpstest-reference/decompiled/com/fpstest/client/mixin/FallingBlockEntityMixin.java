package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1540;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_1540.class})
public abstract class FallingBlockEntityMixin {
   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void fpstest$onTickEnd(CallbackInfo ci) {
      class_1540 self = (class_1540)this;
      if (self.method_31481()) {
         Instr.fallingBlockLandings.incrementAndGet();
      }
   }
}
