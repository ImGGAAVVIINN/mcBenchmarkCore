package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.DeltaTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Hides the vanilla in-game hotbar and its attached decorations (health bar,
 * vehicle health, selected-item name) during benchmark runs, without disrupting
 * the rest of the HUD pipeline.
 *
 * <p>We intentionally cancel {@link Gui#renderHotbarAndDecorations} rather than the
 * whole {@link Gui#render} method: the Fabric {@code HudRenderCallback} (which drives
 * the Perf-HUD overlay) is invoked from a Fabric-API mixin inside {@code Gui.render}.
 * Cancelling that method at its head would also skip the Perf-HUD, so we only suppress
 * the hotbar layer itself. Hand hiding is handled separately in
 * {@link ItemInHandRendererMixin}.
 */
@Environment(EnvType.CLIENT)
@Mixin(Gui.class)
public abstract class GuiMixin {
    @Inject(method = "renderHotbarAndDecorations", at = @At("HEAD"), cancellable = true)
    private void fpstest$cancelHotbarDuringBenchmark(GuiGraphics guiGraphics, DeltaTracker deltaTracker, CallbackInfo ci) {
        if (CinematicState.active) {
            ci.cancel();
        }
    }
}
