package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.debug.DebugScreenEntries;
import net.minecraft.client.gui.components.debug.DebugScreenEntryList;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Keeps Minecraft's GPU utilization probe live during benchmark runs.
 *
 * <p>Minecraft computes {@code Minecraft.getGpuUtilization()} only when the
 * {@code gpu_utilization} debug entry is enabled (the F3 GPU % path), an OpenGL
 * timer-query based estimate. During a benchmark the F3 overlay is never shown,
 * so a direct {@code getGpuUtilization()} call would sit at 0.0%. This redirect
 * makes the {@code Minecraft.runTick} gate treat {@code GPU_UTILIZATION} as
 * enabled while a cinematic benchmark is active ({@link CinematicState#active}),
 * letting Minecraft's own code measure the GPU every frame it already renders.
 *
 * <p>There is exactly one {@code isCurrentlyEnabled} call inside
 * {@code Minecraft.runTick}, so redirecting it is precise and has no effect on
 * the rest of the debug-overlay logic. When the benchmark ends
 * ({@code CinematicState.active == false}) the original behaviour returns and
 * Minecraft restores its usual gating.
 */
@Environment(EnvType.CLIENT)
@Mixin(Minecraft.class)
public abstract class MinecraftGpuUtilizationMixin {
    @Redirect(
        method = "runTick",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/debug/DebugScreenEntryList;isCurrentlyEnabled(Lnet/minecraft/resources/Identifier;)Z")
    )
    private boolean fpstest$forceGpuProbeWhileBenchmarking(DebugScreenEntryList instance, Identifier identifier) {
        if (CinematicState.active && DebugScreenEntries.GPU_UTILIZATION.equals(identifier)) {
            return true;
        }
        return instance.isCurrentlyEnabled(identifier);
    }
}