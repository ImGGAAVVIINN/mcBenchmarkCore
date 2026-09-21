package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Hides the first-person hand/item rendering while a benchmark is running.
 * Without this, the player's hand and held item are drawn over the cinematic view
 * whenever the camera type is FIRST_PERSON.
 */
@Environment(EnvType.CLIENT)
@Mixin(HeldItemRenderer.class)
public abstract class ItemInHandRendererMixin {

    @Inject(
        method = "renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V",
        at = @At("HEAD"),
        cancellable = true
    )
    private void fpstest$cancelHandDuringBenchmark(
        float partialTick,
        MatrixStack matrixStack,
        VertexConsumerProvider.Immediate vertexConsumers,
        ClientPlayerEntity localPlayer,
        int packedLight,
        CallbackInfo ci
    ) {
        if (CinematicState.active) {
            ci.cancel();
        }
    }
}
