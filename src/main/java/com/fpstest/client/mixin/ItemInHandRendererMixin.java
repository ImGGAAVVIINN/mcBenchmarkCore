package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.world.item.ItemStack;
import com.mojang.blaze3d.vertex.PoseStack;
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
@Mixin(ItemInHandRenderer.class)
public abstract class ItemInHandRendererMixin {

    @Inject(
        method = "renderHandsWithItems",
        at = @At("HEAD"),
        cancellable = true
    )
    private void fpstest$cancelHandDuringBenchmark(
        float partialTick,
        PoseStack poseStack,
        SubmitNodeCollector submitNodeCollector,
        LocalPlayer localPlayer,
        int packedLight,
        CallbackInfo ci
    ) {
        if (CinematicState.active) {
            ci.cancel();
        }
    }
}
