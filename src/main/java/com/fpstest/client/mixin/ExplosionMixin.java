package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.explosion.ExplosionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(ExplosionImpl.class)
public abstract class ExplosionMixin {
   @Inject(
      method = "explode",
      at = @At("HEAD")
   )
   private void fpstest$onExplode(CallbackInfoReturnable<Integer> cir) {
      Instr.explosions.incrementAndGet();
   }
}