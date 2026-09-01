package com.fpstest.client.gui;

import com.fpstest.client.bench.BenchmarkResult;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.Tooltip;
import org.lwjgl.opengl.GL11;

@Environment(EnvType.CLIENT)
public final class BenchmarkResultsScreen extends Screen {
    private static final int CARD_BG = -15525340;
    private static final int CARD_OUTLINE = 1442840575;
    private static final int PANEL_BG = -16315890;
    private static final int PANEL_BG_TOP = -15656410;
    private static final int PANEL_BG_BOT = -16447472;
    private static final int VIGNETTE = Integer.MIN_VALUE;
    private static final int LABEL = -5196099;
    private static final int VALUE = -1;
    private static final int DIM = -7696491;
    private static final int ACCENT = -10034945;
    private static final int ACCENT_OK = -11141291;
    private static final int ACCENT_WARN = -17613;
    private static final int ACCENT_BAD = -43691;
    private static final int ROW_HOVER = -14011844;
    private static final int ROW_ACTIVE = -14667718;
    private static final int HEADER_H = 18;
    private static final int FOOTER_H = 28;
    private static final int LIST_ROW_H = 11;
    private static final int LIST_HEADER_H = 12;
    private int listScroll = 0;
    private final List<BenchmarkResult> session;
    private final Path reportDir;
    private final String sessionLabel;
    private final String sessionPreset;
    private final Runnable onClose;
    private int focusIndex;
    private final SysSpec sys;

    public BenchmarkResultsScreen(List<BenchmarkResult> session, Path reportDir, String sessionLabel, String sessionPreset, Runnable onClose) {
        super(Component.literal("FPS Test — Results"));
        this.session = session == null ? List.of() : session;
        this.reportDir = reportDir;
        this.sessionLabel = sessionLabel == null ? "" : sessionLabel;
        this.sessionPreset = sessionPreset == null ? "" : sessionPreset;
        this.onClose = onClose;
        this.focusIndex = 0;
        this.sys = SysSpec.snapshot();
    }

    @Override
    protected void init() {
        this.rebuild();
    }

    private void rebuild() {
        this.clearWidgets();
        int btnY = this.height - 28 + 3;
        int btnH = 18;
        int gap = 4;
        int rightPad = 6;
        int btnW = Math.min(110, (this.width - 12 - 2 * gap) / 3);
        int x = this.width - rightPad - btnW;
        this.addRenderableWidget(
            FlatButton.flatBuilder(I18n.t("fpstest.results.close"), b -> this.onClose()).dimensions(x, btnY, btnW, btnH).accent(-34953).build()
        );
        x -= btnW + gap;
        this.addRenderableWidget(
            FlatButton.flatBuilder(I18n.t("fpstest.results.past_sessions"), b -> this.minecraft.setScreen(new ReportsScreen(this)))
                .dimensions(x, btnY, btnW, btnH)
                .accent(-7686401)
                .build()
        );
        x -= btnW + gap;
        FlatButton openBtn = FlatButton.flatBuilder(I18n.t("fpstest.results.open_folder"), b -> this.openReportFolder())
            .dimensions(x, btnY, btnW, btnH)
            .accent(-10034945)
            .tooltip(Tooltip.create(I18n.t("fpstest.results.open_folder.tooltip")))
            .build();
        openBtn.active = this.reportDir != null;
        this.addRenderableWidget(openBtn);
    }

    @Override
    public void renderBackground(GuiGraphics ctx, int mouseX, int mouseY, float delta) {
        super.renderBackground(ctx, mouseX, mouseY, delta);
        ctx.fill(0, 0, this.width, this.height, 1610612736);
    }

    @Override
    public void tick() {
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return true;
    }

    @Override
    public void render(GuiGraphics ctx, int mouseX, int mouseY, float partialTicks) {
        this.renderBackdrop(ctx);
        this.renderHeader(ctx);
        if (this.session.isEmpty()) {
            ctx.drawCenteredString(this.font, Component.literal(I18n.tr("fpstest.results.empty")), this.width / 2, this.height / 2, -5592406);
            super.render(ctx, mouseX, mouseY, partialTicks);
        } else {
            int contentTop = 20;
            int contentBot = this.height - 28 - 2;
            if (this.session.size() > 1) {
                int listH = this.listHeight();
                this.renderSessionList(ctx, mouseX, mouseY, contentTop, listH);
                contentTop += listH + 4;
            }

            this.renderFocused(ctx, contentTop, contentBot);
            super.render(ctx, mouseX, mouseY, partialTicks);
        }
    }

    private int listHeight() {
        int maxVisible = Math.min(this.session.size(), 6);
        return 12 + maxVisible * 11 + 2;
    }

    private void renderBackdrop(GuiGraphics ctx) {
        ctx.fill(0, 18, this.width, 19, 1442840575);
        ctx.fill(0, this.height - 28, this.width, this.height - 28 + 1, 1442840575);
    }

    private void renderHeader(GuiGraphics ctx) {
        ctx.drawString(this.font, Component.literal("\u00a7l[FPS Test] " + I18n.tr("fpstest.results.title")), 8, 5, -1);
        StringBuilder right = new StringBuilder();
        if (!this.sessionLabel.isEmpty()) {
            String label = this.sessionLabel;
            if (label.length() > 30) {
                label = label.substring(0, 29) + "\u2026";
            }

            right.append("\u00a77").append(label).append("  \u00a78|  ");
        }

        right.append("\u00a77").append(I18n.tr("fpstest.results.preset")).append(": \u00a7f").append(presetLabel(this.sessionPreset));
        int rw = this.font.width(right.toString());
        ctx.drawString(this.font, Component.literal(right.toString()), this.width - rw - 8, 5, -5196099);
    }

    private void renderSessionList(GuiGraphics ctx, int mouseX, int mouseY, int top, int listH) {
        int leftCol = 6;
        int rightCol = this.width - 6;
        this.drawCard(ctx, leftCol - 2, top, rightCol + 2, top + listH);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.session_overview") + " \u00a78(" + this.session.size() + ")"), leftCol + 2, top + 2, -1118482);
        int rowsAvail = Math.min(6, this.session.size());
        int colMaxW = 64;
        int col1pcW = 50;
        int colSumW = 70;
        int colMaxX = rightCol - colSumW - col1pcW - colMaxW;
        int col1pcX = rightCol - colSumW - col1pcW;
        int colSumX = rightCol - colSumW;

        for (int i = 0; i < rowsAvail; i++) {
            int srcIdx = this.listScroll + i;
            if (srcIdx >= this.session.size()) {
                break;
            }

            BenchmarkResult r = this.session.get(srcIdx);
            int ry = top + 12 + i * 11;
            boolean focused = srcIdx == this.focusIndex;
            boolean hovered = mouseX >= leftCol - 2 && mouseX <= rightCol + 2 && mouseY >= ry && mouseY < ry + 11;
            if (focused) {
                ctx.fill(leftCol - 2, ry, rightCol + 2, ry + 11 - 1, -14667718);
                ctx.fill(leftCol - 2, ry, leftCol, ry + 11 - 1, -10034945);
            } else if (hovered) {
                ctx.fill(leftCol - 2, ry, rightCol + 2, ry + 11 - 1, -14011844);
            }

            String idxStr = srcIdx + 1 + ".";
            ctx.drawString(this.font, Component.literal("\u00a77" + idxStr), leftCol + 2, ry + 1, -7696491);
            int nameX = leftCol + 4 + this.font.width("99.");
            int nameMaxW = colMaxX - nameX - 6;
            ctx.drawString(this.font, Component.literal(truncate(this.font, r.displayName(), nameMaxW)), nameX, ry + 1, focused ? -1 : -2039584);
            String maxFrame = Double.isNaN(r.frameTimeMs().max()) ? I18n.tr("fpstest.results.na") : String.format(Locale.ROOT, "%.1fms", r.frameTimeMs().max());
            String onePct = String.format(Locale.ROOT, "%.0f", r.extras().getOrDefault("fps_1pct_low", 0.0));
            String avgFps = fmtFps(r.fps().avg());
            ctx.drawString(this.font, Component.literal("\u00a77max \u00a7f" + maxFrame), colMaxX, ry + 1, frameColor(r.frameTimeMs().max(), 16.7, 33.3));
            ctx.drawString(this.font, Component.literal("\u00a771% \u00a7f" + onePct), col1pcX, ry + 1, fpsColor(r.extras().getOrDefault("fps_1pct_low", 0.0)));
            String sumStr = "\u00a7l\u00a7f" + avgFps + " \u00a7rfps";
            int sumW = this.font.width(sumStr);
            ctx.drawString(this.font, Component.literal(sumStr), rightCol - sumW - 2, ry + 1, fpsColor(r.fps().avg()));
        }
    }

    private void renderFocused(GuiGraphics ctx, int top, int bot) {
        if (this.focusIndex >= 0 && this.focusIndex < this.session.size()) {
            BenchmarkResult r = this.session.get(this.focusIndex);
            int leftL = 6;
            int rightR = this.width - 6;
            int leftR = this.width / 2 - 2;
            int rightL = this.width / 2 + 2;
            int avail = bot - top;
            int heroH = Math.max(50, Math.min(75, (int)(avail * 0.38)));
            int heroBot = top + heroH;
            this.drawCard(ctx, leftL, top, rightR, heroBot);
            ctx.fill(leftL, top, rightR, top + 2, -10034945);
            this.renderHero(ctx, r, leftL, top, rightR, heroBot);
            int cardTop = heroBot + 4;
            int colMid = (cardTop + bot) / 2 - 1;
            this.drawCard(ctx, leftL, cardTop, leftR, colMid);
            this.renderFrameStats(ctx, r, leftL + 4, cardTop + 2, leftR - 4, colMid - 2);
            this.drawCard(ctx, leftL, colMid + 2, leftR, bot);
            this.renderExtras(ctx, r, leftL + 4, colMid + 4, leftR - 4, bot - 2);
            this.drawCard(ctx, rightL, cardTop, rightR, colMid);
            this.renderSysSpec(ctx, rightL + 4, cardTop + 2, rightR - 4, colMid - 2);
            this.drawCard(ctx, rightL, colMid + 2, rightR, bot);
            this.renderSettings(ctx, r, rightL + 4, colMid + 4, rightR - 4, bot - 2);
        }
    }

    private void renderHero(GuiGraphics ctx, BenchmarkResult r, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + truncate(this.font, r.displayName(), x1 - x0 - 12)), x0 + 4, y0 + 3, -1);
        ctx.drawString(this.font, Component.literal("\u00a78" + r.category() + " \u00b7 " + r.sampleTicks() + " " + I18n.tr("fpstest.results.ticks_short")), x0 + 4, y0 + 13, -7696491);
        double avg = r.fps().avg();
        String avgStr = fmtFps(avg);
        int avgColor = fpsColor(avg);
        int heroH = y1 - y0;
        float bigScale = Math.max(2.0F, Math.min(3.5F, heroH * 0.55F / 8.0F));
        int heroNumX = x0 + 6;
        int heroNumY = y0 + 24;
        ctx.pose().pushMatrix();
        ctx.pose().translate(heroNumX, heroNumY);
        ctx.pose().scale(bigScale, bigScale);
        ctx.drawString(this.font, Component.literal(avgStr), 0, 0, avgColor);
        ctx.pose().popMatrix();
        int bigBottom = heroNumY + (int)(8.0F * bigScale) + 1;
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.avg_fps").toUpperCase(Locale.ROOT)), heroNumX, bigBottom, avgColor);
        int miniBlockX = (x0 + x1) / 2;
        int miniW = (x1 - miniBlockX - 8) / 2;
        int miniH = (heroH - 6) / 2;
        if (miniW < 40) {
            miniW = 40;
        }

        if (miniH < 18) {
            miniH = 18;
        }

        int mxA = miniBlockX + 2;
        int mxB = miniBlockX + 4 + miniW;
        int myA = y0 + 3;
        int myB = y0 + 5 + miniH;
        double low1 = r.extras().getOrDefault("fps_1pct_low", Double.NaN);
        double low0p1 = r.extras().getOrDefault("fps_0p1pct_low", Double.NaN);
        this.drawMiniTile(ctx, mxA, myA, miniW, miniH, "fpstest.results.min_fps", fmtFps(r.fps().min()), fpsColor(r.fps().min()));
        this.drawMiniTile(ctx, mxB, myA, miniW, miniH, "fpstest.results.max_fps", fmtFps(r.fps().max()), -1);
        this.drawMiniTile(ctx, mxA, myB, miniW, miniH, "fpstest.results.fps_1pct", fmtFps(low1), fpsColor(low1));
        this.drawMiniTile(ctx, mxB, myB, miniW, miniH, "fpstest.results.fps_0p1pct", fmtFps(low0p1), fpsColor(low0p1));
    }

    private void drawMiniTile(GuiGraphics ctx, int x, int y, int w, int h, String labelKey, String value, int valueColor) {
        ctx.fill(x, y, x + w, y + h, -15855080);
        ctx.fill(x, y, x + 1, y + h, -10034945);
        ctx.drawString(this.font, Component.literal("\u00a77" + I18n.tr(labelKey).toUpperCase(Locale.ROOT)), x + 4, y + 2, -5196099);
        ctx.drawString(this.font, Component.literal("\u00a7l" + value), x + 4, y + h - 9, valueColor);
    }

    private void renderFrameStats(GuiGraphics ctx, BenchmarkResult r, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.frame_timing")), x0, y0, -1118482);
        BenchmarkResult.FrameStats f = r.frameTimeMs();
        BenchmarkResult.FrameStats t = r.tickTimeMs();
        int row = y0 + 11;
        int rh = 9;
        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_avg", fmtMs(f.avg()), -1);
        row += rh;
        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p95", fmtMs(f.p95()), -1);
        row += rh;
        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p99", fmtMs(f.p99()), frameColor(f.p99(), 16.7, 33.3));
        row += rh;
        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p999", fmtMs(f.p999()), frameColor(f.p999(), 33.3, 50.0));
        row += rh;
        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_max", fmtMs(f.max()), frameColor(f.max(), 33.3, 50.0));
        row += rh;
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_min", fmtMs(f.min()), -1);
            row += rh;
            if (row + rh <= y1) {
                this.drawKV(ctx, x0, row, x1, "fpstest.results.tick_avg", fmtMs(t.avg()), -1);
                row += rh;
                if (row + rh <= y1) {
                    this.drawKV(ctx, x0, row, x1, "fpstest.results.tick_p99", fmtMs(t.p99()), -1);
                    row += rh;
                    if (row + rh <= y1) {
                        this.drawKV(ctx, x0, row, x1, "fpstest.results.tick_max", fmtMs(t.max()), -1);
                        row += rh;
                        if (row + rh <= y1) {
                            this.drawKV(ctx, x0, row, x1, "fpstest.results.frames_total", String.valueOf(r.frameTimesMs().length), -1);
                            row += rh;
                            if (row + rh <= y1) {
                                this.drawKV(ctx, x0, row, x1, "fpstest.results.duration", formatDuration(r.durationMillis()), -1);
                            }
                        }
                    }
                }
            }
        }
    }

    private void renderExtras(GuiGraphics ctx, BenchmarkResult r, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.bench_stats")), x0, y0, -1118482);
        int row = y0 + 11;
        int rh = 9;
        this.drawKV(ctx, x0, row, x1, "fpstest.results.heap_peak", r.heapPeak() / 1048576L + " MB", -1);
        row += rh;
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.gc_events", r.gcEvents() + " (" + r.gcTimeMs() + " ms)", -1);
            row += rh;
            if (row + rh <= y1) {
                int shown = 0;
                int maxRows = (y1 - row) / rh;

                for (Entry<String, String> e : r.stringExtras().entrySet()) {
                    if (shown >= maxRows) {
                        break;
                    }

                    String k = e.getKey();
                    if (!k.startsWith("preset_")) {
                        this.drawKV(ctx, x0, row, x1, "fpstest.results.extra." + k, e.getValue(), -1, prettifyKey(k));
                        row += rh;
                        shown++;
                    }
                }

                for (Entry<String, Double> e : r.extras().entrySet()) {
                    if (shown >= maxRows) {
                        break;
                    }

                    String k = e.getKey();
                    if (!k.startsWith("preset_") && !k.equals("fps_1pct_low") && !k.equals("fps_0p1pct_low")) {
                        double v = e.getValue();
                        String val;
                        if (v == Math.floor(v) && Math.abs(v) < 1.0E15) {
                            val = String.valueOf((long)v);
                        } else {
                            val = String.format(Locale.ROOT, "%.2f", v);
                        }

                        this.drawKV(ctx, x0, row, x1, "fpstest.results.extra." + k, val, -1, prettifyKey(k));
                        row += rh;
                        shown++;
                    }
                }

                if (shown == 0) {
                    ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.no_extras")), x0, row, -7696491);
                }
            }
        }
    }

    private void renderSysSpec(GuiGraphics ctx, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.system_spec")), x0, y0, -1118482);
        int row = y0 + 11;
        int rh = 9;
        int avail = x1 - x0 - 60;
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.gpu", truncate(this.font, this.sys.gpu, avail), -1);
            row += rh;
            if (row + rh <= y1) {
                this.drawKV(ctx, x0, row, x1, "fpstest.results.gpu_driver", truncate(this.font, this.sys.gpuVersion, avail), -7696491);
                row += rh;
                if (row + rh <= y1) {
                    this.drawKV(ctx, x0, row, x1, "fpstest.results.cpu", this.sys.cpuCores + "\u00d7 " + I18n.tr("fpstest.results.cpu_cores"), -1);
                    row += rh;
                    if (row + rh <= y1) {
                        this.drawKV(ctx, x0, row, x1, "fpstest.results.os", truncate(this.font, this.sys.osName, avail), -1);
                        row += rh;
                        if (row + rh <= y1) {
                            this.drawKV(ctx, x0, row, x1, "fpstest.results.java", truncate(this.font, this.sys.javaVersion, avail), -1);
                            row += rh;
                            if (row + rh <= y1) {
                                this.drawKV(ctx, x0, row, x1, "fpstest.results.max_heap", this.sys.maxHeapMb + " MB", -1);
                            }
                        }
                    }
                }
            }
        }
    }

    private void renderSettings(GuiGraphics ctx, BenchmarkResult r, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.settings")), x0, y0, -1118482);
        int row = y0 + 11;
        int rh = 9;
        Minecraft mc = Minecraft.getInstance();
        int rd = mc.options.renderDistance().get();
        int sd = mc.options.simulationDistance().get();
        boolean vsync = mc.options.enableVsync().get();
        boolean fullscreen = mc.options.fullscreen().get();
        String mcVer = Minecraft.getInstance().getLaunchedVersion();
        int maxFps = mc.options.framerateLimit().get();
        String maxFpsStr = maxFps >= 260 ? I18n.tr("fpstest.results.unlimited") : String.valueOf(maxFps);
        String graphicsKey = mc.options.graphicsPreset().get().name().toLowerCase(Locale.ROOT);
        boolean smoothLighting = mc.options.ambientOcclusion().get();
        String particlesKey = mc.options.particles().get().name().toLowerCase(Locale.ROOT);
        String cloudsKey = mc.options.cloudStatus().get().name().toLowerCase(Locale.ROOT);
        int biomeBlend = mc.options.biomeBlendRadius().get();
        int mipmap = mc.options.mipmapLevels().get();
        int fov = mc.options.fov().get();
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.preset", presetLabel(this.sessionPreset), -1);
            row += rh;
            if (row + rh <= y1) {
                this.drawKV(ctx, x0, row, x1, "fpstest.results.render_distance", rd + " " + I18n.tr("fpstest.results.chunks"), -1);
                row += rh;
                if (row + rh <= y1) {
                    this.drawKV(ctx, x0, row, x1, "fpstest.results.simulation_distance", sd + " " + I18n.tr("fpstest.results.chunks"), -1);
                    row += rh;
                    if (row + rh <= y1) {
                        this.drawKV(ctx, x0, row, x1, "fpstest.results.max_fps_cap", maxFpsStr, -1);
                        row += rh;
                        if (row + rh <= y1) {
                            this.drawKV(
                                ctx,
                                x0,
                                row,
                                x1,
                                "fpstest.results.vsync",
                                vsync ? I18n.tr("fpstest.settings.on") : I18n.tr("fpstest.settings.off"),
                                vsync ? -17613 : -1
                            );
                            row += rh;
                            if (row + rh <= y1) {
                                this.drawKV(ctx, x0, row, x1, "fpstest.results.graphics", I18n.tr("fpstest.results.graphics." + graphicsKey), -1);
                                row += rh;
                                if (row + rh <= y1) {
                                    this.drawKV(ctx, x0, row, x1, "fpstest.results.mc_version", mcVer, -1);
                                    row += rh;
                                    if (row + rh <= y1) {
                                        this.drawKV(
                                            ctx,
                                            x0,
                                            row,
                                            x1,
                                            "fpstest.results.smooth_lighting",
                                            smoothLighting ? I18n.tr("fpstest.settings.on") : I18n.tr("fpstest.settings.off"),
                                            -1
                                        );
                                        row += rh;
                                        if (row + rh <= y1) {
                                            this.drawKV(ctx, x0, row, x1, "fpstest.results.particles", I18n.tr("fpstest.results.particles." + particlesKey), -1);
                                            row += rh;
                                            if (row + rh <= y1) {
                                                this.drawKV(ctx, x0, row, x1, "fpstest.results.clouds", I18n.tr("fpstest.results.clouds." + cloudsKey), -1);
                                                row += rh;
                                                if (row + rh <= y1) {
                                                    this.drawKV(ctx, x0, row, x1, "fpstest.results.biome_blend", String.valueOf(biomeBlend), -1);
                                                    row += rh;
                                                    if (row + rh <= y1) {
                                                        this.drawKV(ctx, x0, row, x1, "fpstest.results.mipmap", String.valueOf(mipmap), -1);
                                                        row += rh;
                                                        if (row + rh <= y1) {
                                                            this.drawKV(ctx, x0, row, x1, "fpstest.results.fov", fov + "\u00b0", -1);
                                                            row += rh;
                                                            if (row + rh <= y1) {
                                                                this.drawKV(
                                                                    ctx,
                                                                    x0,
                                                                    row,
                                                                    x1,
                                                                    "fpstest.results.fullscreen",
                                                                    fullscreen ? I18n.tr("fpstest.settings.on") : I18n.tr("fpstest.settings.off"),
                                                                    -1
                                                                );
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void drawKV(GuiGraphics ctx, int x0, int y, int x1, String labelKey, String value, int valueColor) {
        this.drawKV(ctx, x0, y, x1, labelKey, value, valueColor, null);
    }

    private void drawKV(GuiGraphics ctx, int x0, int y, int x1, String labelKey, String value, int valueColor, String labelOverride) {
        String label = labelOverride != null ? labelOverride : I18n.tr(labelKey);
        int valueW = this.font.width(value);
        int maxLabelW = x1 - x0 - valueW - 6;
        if (maxLabelW < 0) {
            maxLabelW = 0;
        }

        ctx.drawString(this.font, Component.literal(truncate(this.font, label, maxLabelW)), x0, y, -5196099);
        ctx.drawString(this.font, Component.literal(value), x1 - valueW, y, valueColor);
    }

    private void drawCard(GuiGraphics ctx, int x0, int y0, int x1, int y1) {
        ctx.fill(x0, y0, x1, y1, -15525340);
        ctx.fill(x0, y0, x1, y0 + 1, 1442840575);
        ctx.fill(x0, y1 - 1, x1, y1, 1442840575);
        ctx.fill(x0, y0, x0 + 1, y1, 1442840575);
        ctx.fill(x1 - 1, y0, x1, y1, 1442840575);
    }

    private static String truncate(Font tr, String s, int pixelWidth) {
        if (s == null) {
            return "\u2014";
        } else if (pixelWidth <= 0) {
            return "";
        } else if (tr.width(s) <= pixelWidth) {
            return s;
        } else {
            String suffix = "\u2026";
            int suffixW = tr.width(suffix);
            StringBuilder out = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                String candidate = out.toString() + s.charAt(i) + suffix;
                if (tr.width(candidate) > pixelWidth) {
                    if (out.length() == 0) {
                        return suffix;
                    }

                    return out.toString() + suffix;
                }

                out.append(s.charAt(i));
            }

            return out.toString();
        }
    }

    @Override
    public boolean mouseClicked(net.minecraft.client.input.MouseButtonEvent event, boolean flag) {
        double mouseX = event.x();
        double mouseY = event.y();
        int button = event.button();

        if (button == 0 && this.session.size() > 1) {
            int top = 20;
            int rowsAvail = Math.min(6, this.session.size());
            int leftCol = 6;
            int rightCol = this.width - 6;

            for (int i = 0; i < rowsAvail; i++) {
                int srcIdx = this.listScroll + i;
                if (srcIdx >= this.session.size()) {
                    break;
                }

                int ry = top + 12 + i * 11;
                if (mouseX >= leftCol - 2 && mouseX <= rightCol + 2 && mouseY >= ry && mouseY < ry + 11) {
                    this.focusIndex = srcIdx;
                    return true;
                }
            }
        }

        return super.mouseClicked(event, flag);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizAmount, double vertAmount) {
        if (this.session.size() > 6) {
            if (vertAmount < 0.0) {
                this.listScroll = Math.min(this.session.size() - 6, this.listScroll + 1);
            } else if (vertAmount > 0.0) {
                this.listScroll = Math.max(0, this.listScroll - 1);
            }

            return true;
        } else {
            return super.mouseScrolled(mouseX, mouseY, horizAmount, vertAmount);
        }
    }

    private static String prettifyKey(String k) {
        if (k.isEmpty()) {
            return k;
        } else {
            StringBuilder out = new StringBuilder();
            boolean cap = true;

            for (char c : k.toCharArray()) {
                if (c == '_') {
                    out.append(' ');
                    cap = false;
                } else if (cap) {
                    out.append(Character.toUpperCase(c));
                    cap = false;
                } else {
                    out.append(c);
                }
            }

            return out.toString();
        }
    }

    private static String formatDuration(long ms) {
        long s = ms / 1000L;
        return String.format(Locale.ROOT, "%d:%02d", s / 60L, s % 60L);
    }

    private static int fpsColor(double fps) {
        if (Double.isNaN(fps) || Double.isInfinite(fps)) {
            return -7696491;
        } else if (fps >= 60.0) {
            return -11141291;
        } else {
            return fps >= 30.0 ? -17613 : -43691;
        }
    }

    private static int frameColor(double ms, double good, double bad) {
        if (Double.isNaN(ms) || Double.isInfinite(ms)) {
            return -7696491;
        } else if (ms <= good) {
            return -11141291;
        } else {
            return ms <= bad ? -17613 : -43691;
        }
    }

    private static String fmtFps(double v) {
        return !Double.isNaN(v) && !Double.isInfinite(v) ? String.format(Locale.ROOT, "%.1f", v) : I18n.tr("fpstest.results.na");
    }

    private static String fmtMs(double v) {
        return !Double.isNaN(v) && !Double.isInfinite(v) ? String.format(Locale.ROOT, "%.2fms", v) : I18n.tr("fpstest.results.na");
    }

    private static String presetLabel(String preset) {
        if (preset != null && !preset.isEmpty()) {
            String var1 = preset.toLowerCase(Locale.ROOT);

            return switch (var1) {
                case "quick" -> I18n.tr("fpstest.preset.quick");
                case "full" -> I18n.tr("fpstest.preset.full");
                case "long" -> I18n.tr("fpstest.preset.long");
                default -> preset;
            };
        } else {
            return "\u2014";
        }
    }

    private void openReportFolder() {
        if (this.reportDir != null) {
            try {
                Files.createDirectories(this.reportDir);
            } catch (IOException var2) {
            }

            try {
                java.awt.Desktop.getDesktop().open(this.reportDir.toFile());
            } catch (IOException e) {
            }
        }
    }

    @Override
    public void onClose() {
        if (this.onClose != null) {
            this.onClose.run();
        } else {
            this.minecraft.setScreen(new TitleScreen());
        }
    }

    @Override
    public boolean isPauseScreen() {
        return true;
    }

    @Environment(EnvType.CLIENT)
    private static final class SysSpec {
        final String gpu;
        final String gpuVersion;
        final int cpuCores;
        final String osName;
        final String javaVersion;
        final long maxHeapMb;

        private SysSpec(String gpu, String ver, int cores, String os, String java, long maxMb) {
            this.gpu = gpu;
            this.gpuVersion = ver;
            this.cpuCores = cores;
            this.osName = os;
            this.javaVersion = java;
            this.maxHeapMb = maxMb;
        }

        static SysSpec snapshot() {
            OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
            Runtime rt = Runtime.getRuntime();
            return new SysSpec(
                safeGl(7937),
                safeGl(7938),
                os.getAvailableProcessors(),
                os.getName() + " " + os.getVersion(),
                System.getProperty("java.version", "?"),
                rt.maxMemory() / 1048576L
            );
        }

        private static String safeGl(int id) {
            try {
                String s = GL11.glGetString(id);
                return s == null ? "unknown" : s;
            } catch (Throwable var2) {
                return "unknown";
            }
        }
    }
}