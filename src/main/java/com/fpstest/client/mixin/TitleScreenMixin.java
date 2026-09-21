package com.fpstest.client.mixin;

import com.fpstest.client.gui.BenchmarkHub;
import com.fpstest.client.gui.I18n;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen {

    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @Inject(
        method = "init",
        at = @At("TAIL")
    )
    private void fpstest$addBenchmarkButton(CallbackInfo ci) {
        this.fpstest$removeVanillaButtons();
        ButtonWidget btn = ButtonWidget.builder(
                Text.literal(I18n.tr("fpstest.button.run_benchmark")),
                b -> BenchmarkHub.startFullBenchmark()
        )
        .dimensions(this.width - 110, 4, 100, 20)
        .build();

        this.addDrawableChild(btn);
    }

    /**
     * Removes the vanilla Singleplayer / Multiplayer / Realms / Accessibility
     * buttons from the title screen. The benchmark title-screen UI (Test FPS,
     * Language, Options, Quit, copyright) is left untouched.
     */
    private void fpstest$removeVanillaButtons() {
        List<Element> toRemove = new ArrayList<>();
        for (Element child : this.children()) {
            if (child instanceof ClickableWidget widget) {
                Text message = widget.getMessage();
                if (message != null && message.getContent() instanceof TranslatableTextContent contents) {
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
        for (Element child : toRemove) {
            this.remove(child);
        }
    }
}