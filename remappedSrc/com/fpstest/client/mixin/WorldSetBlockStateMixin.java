package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(Level.class)
public abstract class WorldSetBlockStateMixin {

    @Inject(
        method = "setBlockAndUpdate(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z",
        at = @At("HEAD")
    )
    private void fpstest$countSetState(
        BlockPos pos,
        BlockState state,
        CallbackInfoReturnable<Boolean> cir
    ) {
        Instr.blockStateChanges.incrementAndGet();
    }

    @Inject(
        method = "updateNeighborsAt",
        at = @At("HEAD")
    )
    private void fpstest$countNeighborUpdate(
        BlockPos pos,
        Block sourceBlock,
        Orientation orientation,
        CallbackInfo ci
    ) {
        Instr.neighbourUpdates.incrementAndGet();
    }
}