package com.fpstest.client.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fpstest.client.FpsTestClient;

@Environment(EnvType.CLIENT)
@Mixin(Minecraft.class)
public abstract class PauseMenuSuppressMixin {
	@Inject(
		method = "pauseGame",
		at = @At("HEAD"),
		cancellable = true
	)
	private void fpstest$blockPause(boolean pauseOnly, CallbackInfo ci) {
		if (FpsTestClient.RUNNER.busy()) {
			ci.cancel();
		}
	}
}