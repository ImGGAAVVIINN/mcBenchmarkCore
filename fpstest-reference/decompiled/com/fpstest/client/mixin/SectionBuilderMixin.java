package com.fpstest.client.mixin;

import com.fpstest.client.bench.instrumentation.Instr;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_9810;
import net.minecraft.class_9810.class_9811;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_9810.class})
public abstract class SectionBuilderMixin {
   @Inject(
      method = {"build"},
      at = {@At("HEAD")}
   )
   private void fpstest$onBuild(CallbackInfoReturnable<class_9811> cir) {
      Instr.sectionRebuilds.incrementAndGet();
   }
}
