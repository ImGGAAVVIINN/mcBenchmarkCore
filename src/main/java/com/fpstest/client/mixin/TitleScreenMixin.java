package com.fpstest.client.mixin;

import com.fpstest.client.gui.BenchmarkHub;
import com.fpstest.client.gui.I18n;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
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
        this.fpstest$replaceCopyrightText();
        this.fpstest$addBenchmarkVersionWidget();
        this.fpstest$addRunBenchmarkWidget();
    }

    /**
     * Adds the "Run Benchmark" button as a PlainTextButton at the top-right
     * so FancyMenu can discover and customize it (Button widgets are skipped by FancyMenu).
     */
    private void fpstest$addRunBenchmarkWidget() {
        String buttonText = I18n.tr("fpstest.button.run_benchmark");
        int width = this.font.width(buttonText) + 20; // add padding
        int height = this.font.lineHeight + 4; // add padding
        int x = this.width - width - 4;
        int y = 4;
        
        PlainTextButton benchmarkWidget = new PlainTextButton(
            x, y, width, height,
            Component.literal(buttonText),
            b -> BenchmarkHub.startFullBenchmark(),
            this.font
        );
        this.addRenderableWidget(benchmarkWidget);
    }

    /**
     * Replaces the vanilla copyright text with the diagnostic text.
     */
    private void fpstest$replaceCopyrightText() {
        for (GuiEventListener child : this.children()) {
            if (child instanceof PlainTextButton button) {
                Component message = button.getMessage();
                if (message != null && message.getString().contains("Mojang")) {
                    // Replace the copyright text with our diagnostic text
                    // We need to create a new PlainTextButton with the new text
                    // Since we can't easily modify the existing button's message,
                    // we remove it and add a new one with the same position
                    int y = button.getY();
                    int height = button.getHeight();
                    // Calculate width needed for the longer diagnostic text
                    String diagnosticText = "Internal diagnostic tool, provided as-is, no warranty or support!";
                    int width = this.font.width(diagnosticText) + 10; // add some padding
                    // Position from right edge - adjusted right by ~1.5 char widths (9px) to fix left offset without clipping
                    int x = this.width - width + 9;
                    this.removeWidget(button);
                    
                    PlainTextButton newButton = new PlainTextButton(
                        x, y, width, height,
                        Component.literal(diagnosticText),
                        b -> {}, // no-op onPress
                        this.font
                    );
                    this.addRenderableWidget(newButton);
                    break;
                }
            }
        }
    }

    /**
     * Removes the vanilla Singleplayer / Multiplayer / Realms / Accessibility
     * buttons from the title screen. Also removes the "Create Test World" button
     * that appears in development environments (IS_RUNNING_IN_IDE).
     * The benchmark title-screen UI (Test FPS, Language, Options, Quit, copyright) is left untouched.
     */
    private void fpstest$removeVanillaButtons() {
        List<GuiEventListener> toRemove = new ArrayList<>();
        for (GuiEventListener child : this.children()) {
            if (child instanceof AbstractWidget widget) {
                Component message = widget.getMessage();
                if (message != null) {
                    // Check for translation keys (vanilla buttons)
                    if (message.getContents() instanceof TranslatableContents contents) {
                        String key = contents.getKey();
                        if ("menu.singleplayer".equals(key)
                                || "menu.multiplayer".equals(key)
                                || "menu.online".equals(key)
                                || "options.accessibility".equals(key)
                                || "accessibility.onboarding.accessibility.button".equals(key)) {
                            toRemove.add(child);
                        }
                    }
                    // Check for literal "Create Test World" button (vanilla IDE-only button)
                    else if (message.getString().equals("Create Test World")) {
                        toRemove.add(child);
                    }
                }
            }
        }
        for (GuiEventListener child : toRemove) {
            this.removeWidget(child);
        }
    }

    /**
     * Adds the "MC Benchmark Core V1.0.0" text as a widget at the bottom-left
     * so FancyMenu can discover and customize it.
     * Position is chosen to avoid overlap with vanilla version text
     * (drawn at y=height-10 by vanilla TitleScreen).
     */
    private void fpstest$addBenchmarkVersionWidget() {
        String benchmarkText = "MC Benchmark Core V1.0.0";
        int width = this.font.width(benchmarkText) + 10; // add some padding
        int height = this.font.lineHeight;
        // Position at bottom-left, just above the vanilla version text
        // Vanilla text is at y=height-10, so we place our widget just above it with a small gap
        int x = 2;
        int y = this.height - height - 12;
        
        PlainTextButton benchmarkWidget = new PlainTextButton(
            x, y, width, height,
            Component.literal(benchmarkText),
            b -> {}, // no-op onPress
            this.font
        );
        this.addRenderableWidget(benchmarkWidget);
    }
}