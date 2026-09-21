package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.util.PlayerInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(KeyboardInput.class)
public abstract class KeyboardInputMixin {
    @Inject(
        method = "tick",
        at = @At("TAIL")
    )
    private void fpstest$lockInput(CallbackInfo ci) {
        if (CinematicState.active) {
            KeyboardInput self = (KeyboardInput) (Object) this;
            // Neutralize movement during cinematic benchmark runs
            self.movementForward = 0.0f;
            self.movementSideways = 0.0f;
            self.playerInput = new PlayerInput(false, false, false, false, false, false, false);
        }
    }
}