package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Hides the vanilla in-game hotbar and its attached decorations (health bar,
 * vehicle health, selected-item name) during benchmark runs, without disrupting
 * the rest of the HUD pipeline.
 *
 * <p>We intentionally cancel {@link InGameHud#renderHotbarAndDecorations} rather than the
 * whole {@link InGameHud#render} method: the Fabric {@code HudRenderCallback} (which drives
 * the Perf-HUD overlay) is invoked from a Fabric-API mixin inside {@code InGameHud.render}.
 * Cancelling that method at its head would also skip the Perf-HUD, so we only suppress
 * the hotbar layer itself. Hand hiding is handled separately in
 * {@link ItemInHandRendererMixin}.
 */
@Environment(EnvType.CLIENT)
@Mixin(InGameHud.class)
public abstract class GuiMixin {
    @Inject(method = "renderHotbar", at = @At("HEAD"), cancellable = true)
    private void fpstest$cancelHotbarDuringBenchmark(DrawContext guiGraphics, RenderTickCounter deltaTracker, CallbackInfo ci) {
        if (CinematicState.active) {
            ci.cancel();
        }
    }
}
