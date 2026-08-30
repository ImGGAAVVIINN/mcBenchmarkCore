package com.fpstest.client.mixin;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.gui.BenchmarkHub;
import com.fpstest.client.gui.I18n;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen {

    protected TitleScreenMixin(Component title) {
        super(title);
    }

    @Inject(
        method = "init",
        at = @At("TAIL")
    )
    private void fpstest$addBenchmarkButton(CallbackInfo ci) {
        Button btn = Button.builder(
                Component.literal("⚡ " + I18n.tr("fpstest.title")),
                b -> {
                    Minecraft mc = Minecraft.getInstance();
                    mc.setScreen(new BenchmarkHub(this));
                }
        )
        .bounds(this.width - 110, 4, 100, 20)
        .build();

        this.addRenderableWidget(btn);
    }
}