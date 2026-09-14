package com.fpstest.client.mixin;

import com.fpstest.client.gui.BenchmarkHub;
import com.fpstest.client.gui.I18n;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
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
        this.fpstest$removeVanillaButtons();
        Button btn = Button.builder(
                Component.literal(I18n.tr("fpstest.button.run_benchmark")),
                b -> BenchmarkHub.startFullBenchmark()
        )
        .bounds(this.width - 110, 4, 100, 20)
        .build();

        this.addRenderableWidget(btn);
    }

    /**
     * Removes the vanilla Singleplayer / Multiplayer / Realms / Accessibility
     * buttons from the title screen. The benchmark title-screen UI (Test FPS,
     * Language, Options, Quit, copyright) is left untouched.
     */
    private void fpstest$removeVanillaButtons() {
        List<GuiEventListener> toRemove = new ArrayList<>();
        for (GuiEventListener child : this.children()) {
            if (child instanceof AbstractWidget widget) {
                Component message = widget.getMessage();
                if (message != null && message.getContents() instanceof TranslatableContents contents) {
                    String key = contents.getKey();
                    if ("menu.singleplayer".equals(key)
                            || "menu.multiplayer".equals(key)
                            || "menu.online".equals(key)
                            || "options.accessibility".equals(key)
                            || "accessibility.onboarding.accessibility.button".equals(key)) {
                        toRemove.add(child);
                    }
                }
            }
        }
        for (GuiEventListener child : toRemove) {
            this.removeWidget(child);
        }
    }
}