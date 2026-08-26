package com.fpstest.client.mixin;

import com.fpstest.client.gui.BenchmarkHub;
import com.fpstest.client.gui.I18n;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_442;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_442.class})
public abstract class TitleScreenMixin extends class_437 {
   protected TitleScreenMixin(class_2561 title) {
      super(title);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void fpstest$addBenchmarkButton(CallbackInfo ci) {
      class_4185 btn = class_4185.method_46430(
            class_2561.method_43470("⚡ " + I18n.tr("fpstest.title")), b -> class_310.method_1551().method_1507(new BenchmarkHub((class_442)this))
         )
         .method_46434(this.field_22789 - 110, 4, 100, 20)
         .method_46431();
      this.method_37063(btn);
   }
}
