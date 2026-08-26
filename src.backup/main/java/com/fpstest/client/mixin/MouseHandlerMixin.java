package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(MouseHandler.class)
public abstract class MouseHandlerMixin {
    @Inject(
        method = "handleAccumulatedMovement",
        at = @At("HEAD"),
        cancellable = true
    )
    private void fpstest$blockTurn(CallbackInfo ci) {
        if (CinematicState.active) {
            ci.cancel();
        }
    }
}