package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(ServerLevel.class)
public abstract class ServerWorldTickBlockMixin {
   @Inject(
      method = "tickBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;)V",
      at = @At("HEAD")
   )
   private void fpstest$onTickBlock(BlockPos pos, Block block, CallbackInfo ci) {
      Instr.scheduledBlockTicks.incrementAndGet();
   }

   @Inject(
      method = "tickFluid(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;)V",
      at = @At("HEAD")
   )
   private void fpstest$onTickFluid(BlockPos pos, Fluid fluid, CallbackInfo ci) {
      Instr.scheduledFluidTicks.incrementAndGet();
   }
}