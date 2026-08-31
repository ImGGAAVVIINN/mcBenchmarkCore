package com.fpstest.client.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.Tooltip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class ReportsScreen extends Screen {
    private static final Logger LOG = LoggerFactory.getLogger("fpstest-reports-screen");
    private final Screen parent;
    private final Set<String> selected = new LinkedHashSet<>();
    private List<Path> sessions = List.of();
    private int scroll = 0;

    public ReportsScreen(Screen parent) {
        super(I18n.t("fpstest.reports.title"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        this.sessions = listSessions();
        this.rebuild();
    }

    private void rebuild() {
        this.clearWidgets();
        int pad = 8;
        int top = 30;
        int rowH = 22;
        int rowsAvail = Math.max(1, (this.height - top - 60) / rowH);
        int max = Math.max(0, this.sessions.size() - rowsAvail);
        if (this.scroll > max) {
            this.scroll = max;
        }

        this.addRenderableWidget(
            FlatButton.flatBuilder(I18n.t("fpstest.reports.open_root"), b -> openRootInOs())
                .dimensions(this.width - 330, 4, 100, 20)
                .tooltip(Tooltip.create(I18n.t("fpstest.reports.open_root.tooltip")))
                .build()
        );
        FlatButton compareBtn = FlatButton.flatBuilder(I18n.t("fpstest.reports.compare"), b -> this.doCompare())
            .dimensions(this.width - 220, 4, 100, 20)
            .tooltip(Tooltip.create(this.selected.size() == 2 ? I18n.t("fpstest.reports.compare_pick") : I18n.t("fpstest.reports.compare_pick_hint")))
            .build();
        compareBtn.active = this.selected.size() == 2;
        this.addRenderableWidget(compareBtn);
        this.addRenderableWidget(
            FlatButton.flatBuilder(I18n.t("fpstest.settings.back"), b -> this.onClose()).dimensions(this.width - 110, 4, 100, 20).build()
        );
        if (this.sessions.isEmpty()) {
            // Empty state - render in render() method
        } else {
            for (int i = 0; i < Math.min(rowsAvail, this.sessions.size() - this.scroll); i++) {
                Path p = this.sessions.get(this.scroll + i);
                String name = p.getFileName().toString();
                int rowY = top + i * rowH;
                String btnLbl = (this.selected.contains(name) ? "\u00a7l[ \u2713 ] " : "[   ] ") + name;
                this.addRenderableWidget(
                    FlatButton.flatBuilder(Component.literal(btnLbl), b -> this.toggleSelection(name))
                        .dimensions(pad, rowY, this.width - 240, 20)
                        .build()
                );
                this.addRenderableWidget(
                    FlatButton.flatBuilder(I18n.t("fpstest.reports.open"), b -> openInOs(p)).dimensions(this.width - 220, rowY, 100, 20).build()
                );
            }
        }
    }

    private void toggleSelection(String name) {
        if (this.selected.contains(name)) {
            this.selected.remove(name);
        } else {
            if (this.selected.size() >= 2) {
                String oldest = this.selected.iterator().next();
                this.selected.remove(oldest);
            }

            this.selected.add(name);
        }

        this.rebuild();
    }

    private void doCompare() {
        if (this.selected.size() == 2) {
            List<Path> picks = new ArrayList<>();

            for (String name : this.selected) {
                for (Path p : this.sessions) {
                    if (p.getFileName().toString().equals(name)) {
                        picks.add(p);
                    }
                }
            }

            if (picks.size() == 2) {
                try {
                    Path out = ReportComparator.compare(picks.get(0), picks.get(1));
                    this.minecraft.setScreen(new Screen(Component.literal(String.format(I18n.tr("fpstest.reports.compare_done"), out.toString()))) {
                        @Override
                        protected void init() {}
                        @Override
                        public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
                            super.render(guiGraphics, mouseX, mouseY, partialTick);
                        }
                    });
                    new Thread(() -> {
                        try {
                            Thread.sleep(1200L);
                        } catch (InterruptedException var2) {
                        }

                        this.minecraft.execute(() -> this.minecraft.setScreen(new ReportsScreen(this.parent)));
                    }, "fpstest-reports-compare-bounce").start();
                } catch (Throwable var6) {
                    LOG.error("[FPS Test] compare failed", var6);
                }
            }
        }
    }

    private static void openInOs(Path p) {
        try {
            Files.createDirectories(p);
        } catch (IOException var2) {
        }

        try {
            java.awt.Desktop.getDesktop().open(p.toFile());
        } catch (IOException e) {
        }
    }

    private static void openRootInOs() {
        Path root = Minecraft.getInstance().gameDirectory.toPath().resolve("fpstest-reports");

        try {
            Files.createDirectories(root);
        } catch (IOException var2) {
        }

        try {
            java.awt.Desktop.getDesktop().open(root.toFile());
        } catch (IOException e) {
        }
    }

    private static List<Path> listSessions() {
        Path root = Minecraft.getInstance().gameDirectory.toPath().resolve("fpstest-reports");
        if (!Files.isDirectory(root)) {
            return List.of();
        } else {
            try {
                List var2;
                try (Stream<Path> stream = Files.list(root)) {
                    var2 = stream.filter(x$0 -> Files.isDirectory(x$0)).sorted(Comparator.<Path, Instant>comparing(p -> {
                        try {
                            return Files.getLastModifiedTime(p).toInstant();
                        } catch (IOException var2x) {
                            return Instant.EPOCH;
                        }
                    }).reversed()).toList();
                }

                return var2;
            } catch (IOException var6) {
                LOG.warn("[FPS Test] listSessions failed", var6);
                return List.of();
            }
        }
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double deltaX, double deltaY) {
        if (deltaY < 0.0) {
            this.scroll++;
        } else if (deltaY > 0.0) {
            this.scroll = Math.max(0, this.scroll - 1);
        }

        this.rebuild();
        return true;
    }

    @Override
    public void onClose() {
        this.minecraft.setScreen(this.parent);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        if (this.sessions.isEmpty()) {
            guiGraphics.drawString(this.font, Component.literal(I18n.tr("fpstest.reports.empty")), this.width / 2, this.height / 2, -5592406);
        }
    }
}