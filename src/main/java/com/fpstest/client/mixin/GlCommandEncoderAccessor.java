package com.fpstest.client.mixin;

import com.mojang.blaze3d.opengl.GlCommandEncoder;
import com.mojang.blaze3d.opengl.GlRenderPass;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import java.util.Collection;

@Environment(EnvType.CLIENT)
@Mixin(GlCommandEncoder.class)
public interface GlCommandEncoderAccessor {
    @Invoker("trySetup")
    boolean fpstest$trySetup(GlRenderPass pass, Collection<String> samplers);
}
