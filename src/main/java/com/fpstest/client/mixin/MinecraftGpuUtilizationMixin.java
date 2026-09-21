package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Keeps MinecraftClient's GPU utilization probe live during benchmark runs.
 *
 * <p>MinecraftClient computes {@code MinecraftClient.getGpuUtilizationPercentage()}
 * only when the F3 debug HUD would be shown (or the profiler recorder is active) —
 * the OpenGL timer-query based estimate. During a benchmark the F3 overlay is never
 * shown, so a direct {@code getGpuUtilizationPercentage()} call would sit at 0.0%.
 * This redirect makes the {@code MinecraftClient.render} gate treat the debug HUD as
 * shown while a cinematic benchmark is active ({@link CinematicState#active}),
 * letting MinecraftClient's own code measure the GPU every frame it already renders.
 *
 * <p>There is exactly one {@code shouldShowDebugHud} call inside
 * {@code MinecraftClient.render} (the GPU probe gate); the only other call is in
 * {@code MinecraftClient.tick} where it guards a debug-chunk reset and is never
 * touched by this redirect. When the benchmark ends
 * ({@code CinematicState.active == false}) the original behaviour returns and
 * MinecraftClient restores its usual gating.
 */
@Environment(EnvType.CLIENT)
@Mixin(MinecraftClient.class)
public abstract class MinecraftGpuUtilizationMixin {
    @Redirect(
        method = "render",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/DebugHud;shouldShowDebugHud()Z")
    )
    private boolean fpstest$forceGpuProbeWhileBenchmarking(DebugHud instance) {
        if (CinematicState.active) {
            return true;
        }
        return instance.shouldShowDebugHud();
    }
}