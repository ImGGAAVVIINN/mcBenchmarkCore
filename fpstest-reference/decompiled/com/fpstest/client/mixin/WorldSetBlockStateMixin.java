package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1937.class})
public abstract class WorldSetBlockStateMixin {
   @Inject(
      method = {"setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;II)Z"},
      at = {@At("HEAD")}
   )
   private void fpstest$countSetState(class_2338 pos, class_2680 state, int flags, int maxUpdateDepth, CallbackInfoReturnable<Boolean> cir) {
      if (this instanceof class_3218) {
         Instr.blockStateChanges.incrementAndGet();
      }
   }

   @Inject(
      method = {"updateNeighborsAlways(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V"},
      at = {@At("HEAD")}
   )
   private void fpstest$countNeighborUpdate(class_2338 pos, class_2248 sourceBlock, CallbackInfo ci) {
      if (this instanceof class_3218) {
         Instr.neighbourUpdates.incrementAndGet();
      }
   }
}
