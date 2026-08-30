package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.chunk.SectionCompiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(SectionCompiler.class)
public abstract class SectionBuilderMixin {
    @Inject(
        method = "compile",
        at = @At("HEAD")
    )
    private void fpstest$onBuild(CallbackInfoReturnable<SectionCompiler.Results> cir) {
        Instr.sectionRebuilds.incrementAndGet();
    }
}