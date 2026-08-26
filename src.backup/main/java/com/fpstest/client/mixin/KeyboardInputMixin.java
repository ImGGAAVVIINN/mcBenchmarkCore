package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.ClientInput;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.phys.Vec2;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin(ClientInput.class)
public abstract class KeyboardInputMixin {
    // ClientInput already has getMoveVector(), only need setter accessor for the protected field
    @Accessor("moveVector")
    protected abstract void setMoveVector(Vec2 value);

    @Inject(
        method = "tick",
        at = @At("TAIL")
    )
    private void fpstest$lockInput(CallbackInfo ci) {
        if (CinematicState.active) {
            ClientInput self = (ClientInput) (Object) this;
            // Create new Input with all false values (record is immutable)
            self.keyPresses = new Input(false, false, false, false, false, false, false);
            // Set moveVector to zero via accessor
            setMoveVector(new Vec2(0.0f, 0.0f));
        }
    }
}