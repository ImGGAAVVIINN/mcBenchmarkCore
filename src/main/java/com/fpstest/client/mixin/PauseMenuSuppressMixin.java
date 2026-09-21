package com.fpstest.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fpstest.client.FpsTestClient;

@Environment(EnvType.CLIENT)
@Mixin(MinecraftClient.class)
public abstract class PauseMenuSuppressMixin {
	@Inject(
		method = "openGameMenu",
		at = @At("HEAD"),
		cancellable = true
	)
	private void fpstest$blockPause(boolean pauseOnly, CallbackInfo ci) {
		if (FpsTestClient.RUNNER.busy()) {
			ci.cancel();
		}
	}
}