package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.block.WireOrientation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(World.class)
public abstract class WorldSetBlockStateMixin {

    @Inject(
        method = "setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;II)Z",
        at = @At("HEAD")
    )
    private void fpstest$countSetState(
        BlockPos pos,
        BlockState state,
        int flags,
        int maxUpdateDepth,
        CallbackInfoReturnable<Boolean> cir
    ) {
        if ((Object) this instanceof net.minecraft.server.world.ServerWorld) {
            Instr.blockStateChanges.incrementAndGet();
        }
    }

    @Inject(
        method = "updateNeighborsAlways(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V",
        at = @At("HEAD")
    )
    private void fpstest$countNeighborUpdate(
        BlockPos pos,
        Block sourceBlock,
        CallbackInfo ci
    ) {
        if ((Object) this instanceof net.minecraft.server.world.ServerWorld) {
            Instr.neighbourUpdates.incrementAndGet();
        }
    }
}