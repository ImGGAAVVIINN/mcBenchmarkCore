package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_3218;
import net.minecraft.class_3611;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_3218.class})
public abstract class ServerWorldTickBlockMixin {
   @Inject(
      method = {"tickBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V"},
      at = {@At("HEAD")}
   )
   private void fpstest$countBlockTick(class_2338 pos, class_2248 block, CallbackInfo ci) {
      Instr.scheduledBlockTicks.incrementAndGet();
   }

   @Inject(
      method = {"tickFluid(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/fluid/Fluid;)V"},
      at = {@At("HEAD")}
   )
   private void fpstest$countFluidTick(class_2338 pos, class_3611 fluid, CallbackInfo ci) {
      Instr.scheduledFluidTicks.incrementAndGet();
   }
}
