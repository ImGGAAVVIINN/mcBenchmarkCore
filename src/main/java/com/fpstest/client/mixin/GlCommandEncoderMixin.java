package com.fpstest.client.mixin;

import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.mixin.GlCommandEncoderAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import com.mojang.blaze3d.opengl.GlCommandEncoder;
import com.mojang.blaze3d.opengl.GlRenderPass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import java.util.Collection;

/**
 * Intercepts GlCommandEncoder.trySetup to gracefully handle "Missing sampler" errors
 * that occur when Iris shader packs reference samplers not present in the compiled
 * shader program. This is a pre-existing Iris bug that causes crashes during shader
 * benchmark phases.
 *
 * <p>By redirecting the trySetup call from executeDraw, we can catch the
 * IllegalStateException and return false instead, which causes executeDraw to skip
 * rendering for that batch rather than crashing the game.</p>
 */
@Environment(EnvType.CLIENT)
@Mixin(GlCommandEncoder.class)
public abstract class GlCommandEncoderMixin {
    private static final Logger LOG = LoggerFactory.getLogger(GlCommandEncoderMixin.class);

    /**
     * Redirects the trySetup call in executeDraw to a safe wrapper that catches
     * IllegalStateException (the "Missing sampler" error) and returns false instead.
     */
    @Redirect(
        method = {"executeDraw", "executeDrawMultiple"},
        at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/opengl/GlCommandEncoder;trySetup(Lcom/mojang/blaze3d/opengl/GlRenderPass;Ljava/util/Collection;)Z")
    )
    private boolean fpstest$safeTrySetup(
        GlCommandEncoder encoder,
        GlRenderPass pass,
        Collection<String> samplers
    ) {
        GlCommandEncoderAccessor accessor = (GlCommandEncoderAccessor) encoder;
        try {
            return accessor.fpstest$trySetup(pass, samplers);
        } catch (IllegalStateException e) {
            if (CinematicState.active && e.getMessage() != null && e.getMessage().startsWith("Missing sampler")) {
                LOG.warn("[Minecraft Benchmark Core] Skipping render batch due to missing sampler in shader: {}", e.getMessage());
                return false;
            }
            // Re-throw if it's not a sampler issue or we're not in a benchmark
            throw e;
        }
    }
}
