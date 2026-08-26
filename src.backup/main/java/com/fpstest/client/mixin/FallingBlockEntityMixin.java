package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.entity.item.FallingBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(FallingBlockEntity.class)
public abstract class FallingBlockEntityMixin {
   @Inject(
      method = "tick",
      at = @At("TAIL")
   )
   private void fpstest$onTickEnd(CallbackInfo ci) {
      FallingBlockEntity self = (FallingBlockEntity)(Object)this;
      if (self.onGround()) {
         Instr.fallingBlockLandings.incrementAndGet();
      }
   }
}