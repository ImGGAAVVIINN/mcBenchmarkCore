package com.fpstest.client.gui;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchmarkRegistry;
import com.fpstest.client.bench.RunPlan;
import com.fpstest.client.gui.I18n;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class BenchmarkHub extends Screen {
    private final Screen parent;

    public BenchmarkHub(Screen parent) {
        super(Component.literal("FPS Test Benchmark Hub"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        // Run Showcase button - starts the showcase benchmark
        this.addRenderableWidget(Button.builder(
                Component.literal("Run Showcase"),
                b -> {
                    BenchmarkRegistry.bootstrap();
                    FpsTestClient.RUNNER.startSingle(
                        RunPlan.fromBench(BenchmarkRegistry.get("idle_baseline").orElseThrow()),
                        () -> {}
                    );
                    this.onClose();
                })
                .bounds(centerX - 100, centerY - 30, 200, 20)
                .build());

        // Back button - returns to parent screen
        this.addRenderableWidget(Button.builder(
                Component.literal("Back"),
                b -> this.onClose())
                .bounds(centerX - 100, centerY + 10, 200, 20)
                .build());
    }

    @Override
    public void render(net.minecraft.client.gui.GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        
        // Draw title
        guiGraphics.drawCenteredString(this.font, this.title, this.width / 2, 40, 0xFFFFFF);
    }

    @Override
    public void onClose() {
        Minecraft.getInstance().setScreen(this.parent);
    }
}
