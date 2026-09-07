package com.fpstest.client.gui;

import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.MasterReportSummary;
import com.fpstest.client.bench.score.ScoreCategory;
import com.fpstest.client.bench.score.ScoreWorkload;
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
    private static final int HERO_H = 64;
    private static final int SEC_GAP = 4;
    private static final int COL_GAP = 6;
    private static final int EDGE = 6;
    private int listScroll = 0;
    private final List<BenchmarkResult> session;
    private final Path reportDir;
    private final String sessionLabel;
    private final String sessionPreset;
    private final Runnable onClose;
    private int focusIndex;
    private final SysSpec sys;
    private float contentScrollY = 0;
    private float maxScroll = 0;
    private int idxLowPlain = -1;
    private int idxLowPbr = -1;
    private int idxHiPlain = -1;
    private int idxHiPbr = -1;
    private final MasterReportSummary masterSummary;

    public BenchmarkResultsScreen(List<BenchmarkResult> session, Path reportDir, String sessionLabel, String sessionPreset, Runnable onClose) {
        super(Component.literal("FPS Test — Results"));
        this.session = session == null ? List.of() : session;
        this.reportDir = reportDir;
        this.sessionLabel = sessionLabel == null ? "" : sessionLabel;
        this.sessionPreset = sessionPreset == null ? "" : sessionPreset;
        this.onClose = onClose;
        this.focusIndex = this.session.size() == 1 ? 0 : -1;
        this.sys = SysSpec.snapshot();
        this.masterSummary = MasterReportSummary.calculate(this.session);
        this.resolveShaderIndices();
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
            int top = HEADER_H + 2;
            int bot = this.height - FOOTER_H - 2;
            int contentH = this.contentHeight();
            this.maxScroll = Math.max(0, contentH - (bot - top));
            this.clampScroll();

            this.beginClip(ctx, top, bot);
            int y = 0;

            if (this.session.size() > 1) {
                int listH = this.detailsListHeight();
                this.renderDetailsList(ctx, mouseX, mouseY, this.cy(y), listH);
                y += listH + SEC_GAP;
            }

            if (this.focusIndex == -1) {
                int scoreH = this.scoreSectionHeight();
                this.renderScoreSection(ctx, mouseX, mouseY, this.cy(y), scoreH);
                y += scoreH + SEC_GAP;
                int gridH = this.gridHeight();
                this.renderSummaryGrid(ctx, mouseX, mouseY, this.cy(y), gridH);
                y += gridH + SEC_GAP;
                this.renderMasterMetaBand(ctx, this.cy(y));
            } else {
                this.renderMetaBand(ctx, this.cy(y), this.focusIndex);
            }

            this.endClip(ctx);
            super.render(ctx, mouseX, mouseY, partialTicks);
        }
    }

    private int detailsListHeight() {
        int maxVisible = Math.min(this.session.size(), 6);
        return LIST_HEADER_H + (maxVisible + 1) * LIST_ROW_H + 2;
    }

    private void renderBackdrop(GuiGraphics ctx) {
        ctx.fill(0, 18, this.width, 19, 1442840575);
        ctx.fill(0, this.height - 28, this.width, this.height - 28 + 1, 1442840575);
    }

    private void renderHeader(GuiGraphics ctx) {
        ctx.drawString(this.font, Component.literal("\u00a7l[FPS Test] " + this.reportTitle()), 8, 5, -1);
    }

    /**
     * Main report title, independent of the benchmark-conditions section label.
     * Master report -> "Master report"; individual test -> that test's display name.
     */
    private String reportTitle() {
        if (this.focusIndex >= 0 && this.focusIndex < this.session.size()) {
            return this.session.get(this.focusIndex).displayName();
        }
        return I18n.tr("fpstest.results.master_report");
    }

    private void renderDetailsList(GuiGraphics ctx, int mouseX, int mouseY, int top, int listH) {
        int leftCol = 6;
        int rightCol = this.width - 6;
        this.drawCard(ctx, leftCol - 2, top, rightCol + 2, top + listH);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.details_title") + " \u00a78(" + this.session.size() + ")"), leftCol + 2, top + 2, -1118482);
        int rowsAvail = Math.min(6, this.session.size());
        int colMaxW = 64;
        int col1pcW = 50;
        int colSumW = 70;
        int colMaxX = rightCol - colSumW - col1pcW - colMaxW;
        int col1pcX = rightCol - colSumW - col1pcW;
        int colSumX = rightCol - colSumW;

        int masterY = top + 12;
        boolean masterFocused = this.focusIndex == -1;
        boolean masterHovered = mouseX >= leftCol - 2 && mouseX <= rightCol + 2 && mouseY >= masterY && mouseY < masterY + 11 && mouseY >= HEADER_H + 2 && mouseY <= this.height - FOOTER_H - 2;
        if (masterFocused) {
            ctx.fill(leftCol - 2, masterY, rightCol + 2, masterY + 11 - 1, -14667718);
            ctx.fill(leftCol - 2, masterY, leftCol, masterY + 11 - 1, -10034945);
        } else if (masterHovered) {
            ctx.fill(leftCol - 2, masterY, rightCol + 2, masterY + 11 - 1, -14011844);
        }
        ctx.drawString(this.font, Component.literal("\u00a7l\u00a7f" + I18n.tr("fpstest.results.master_report")), leftCol + 2, masterY + 1, masterFocused ? -1 : -2039584);

        for (int i = 0; i < rowsAvail; i++) {
            int srcIdx = this.listScroll + i;
            if (srcIdx >= this.session.size()) {
                break;
            }

            BenchmarkResult r = this.session.get(srcIdx);
            int ry = top + 12 + (i + 1) * 11;
            boolean focused = srcIdx == this.focusIndex;
            boolean hovered = mouseX >= leftCol - 2 && mouseX <= rightCol + 2 && mouseY >= ry && mouseY < ry + 11 && mouseY >= HEADER_H + 2 && mouseY <= this.height - FOOTER_H - 2;
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
            String partTag = "";
            if (r.extras().containsKey("part")) {
                partTag = "\u00a78P" + r.extras().get("part").intValue() + " \u00a7r";
            }
            ctx.drawString(this.font, Component.literal(truncate(this.font, partTag + r.displayName(), nameMaxW)), nameX, ry + 1, focused ? -1 : -2039584);
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

    private void renderMetaBand(GuiGraphics ctx, int top, int index) {
        if (index >= 0 && index < this.session.size()) {
            BenchmarkResult r = this.session.get(index);
            int leftL = EDGE;
            int rightR = this.width - EDGE;
            int leftR = this.width / 2 - 2;
            int rightL = this.width / 2 + 2;

            int heroTop = top;
            this.drawCard(ctx, leftL, heroTop, rightR, heroTop + HERO_H);
            ctx.fill(leftL, heroTop, rightR, heroTop + 2, ACCENT);
            this.renderHero(ctx, r, leftL, heroTop, rightR, heroTop + HERO_H);
            int panelH = this.sharedPanelHeight(r);
            int cardTop = heroTop + HERO_H + SEC_GAP;
            int row2Top = cardTop + panelH + 4;
            this.drawCard(ctx, leftL, cardTop, leftR, cardTop + panelH);
            this.beginPanelClip(ctx, leftL + 4, cardTop + 2, leftR - 4, cardTop + panelH - 2);
            this.renderFrameStats(ctx, r, leftL + 4, cardTop + 2, leftR - 4, cardTop + panelH - 2);
            this.endPanelClip(ctx);
            this.drawCard(ctx, leftL, row2Top, leftR, row2Top + panelH);
            this.beginPanelClip(ctx, leftL + 4, row2Top + 2, leftR - 4, row2Top + panelH - 2);
            this.renderExtras(ctx, r, leftL + 4, row2Top + 2, leftR - 4, row2Top + panelH - 2);
            this.endPanelClip(ctx);
            this.drawCard(ctx, rightL, cardTop, rightR, cardTop + panelH);
            this.beginPanelClip(ctx, rightL + 4, cardTop + 2, rightR - 4, cardTop + panelH - 2);
            this.renderSysSpec(ctx, rightL + 4, cardTop + 2, rightR - 4, cardTop + panelH - 2);
            this.endPanelClip(ctx);
            this.drawCard(ctx, rightL, row2Top, rightR, row2Top + panelH);
            this.beginPanelClip(ctx, rightL + 4, row2Top + 2, rightR - 4, row2Top + panelH - 2);
            this.renderSettings(ctx, r, rightL + 4, row2Top + 2, rightR - 4, row2Top + panelH - 2);
            this.endPanelClip(ctx);
        }
    }

    /**
     * Master Report meta band: NO hero, NO individual test identity. Shows only
     * the four averaged panels (Average Frame timing, Average Benchmark stats,
     * Average System specifications, Average Settings).
     */
    private void renderMasterMetaBand(GuiGraphics ctx, int top) {
        int leftL = EDGE;
        int rightR = this.width - EDGE;
        int leftR = this.width / 2 - 2;
        int rightL = this.width / 2 + 2;

        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.selected_header")), leftL, top, -1118482);
        int panelH = this.masterPanelHeight();
        int cardTop = top + 12;
        int row2Top = cardTop + panelH + 4;

        this.drawCard(ctx, leftL, cardTop, leftR, cardTop + panelH);
        this.beginPanelClip(ctx, leftL + 4, cardTop + 2, leftR - 4, cardTop + panelH - 2);
        this.renderMasterFrameStats(ctx, leftL + 4, cardTop + 2, leftR - 4, cardTop + panelH - 2);
        this.endPanelClip(ctx);

        this.drawCard(ctx, leftL, row2Top, leftR, row2Top + panelH);
        this.beginPanelClip(ctx, leftL + 4, row2Top + 2, leftR - 4, row2Top + panelH - 2);
        this.renderMasterExtras(ctx, leftL + 4, row2Top + 2, leftR - 4, row2Top + panelH - 2);
        this.endPanelClip(ctx);

        this.drawCard(ctx, rightL, cardTop, rightR, cardTop + panelH);
        this.beginPanelClip(ctx, rightL + 4, cardTop + 2, rightR - 4, cardTop + panelH - 2);
        this.renderSysSpec(ctx, rightL + 4, cardTop + 2, rightR - 4, cardTop + panelH - 2, "fpstest.results.master_system_spec");
        this.endPanelClip(ctx);

        this.drawCard(ctx, rightL, row2Top, rightR, row2Top + panelH);
        this.beginPanelClip(ctx, rightL + 4, row2Top + 2, rightR - 4, row2Top + panelH - 2);
        this.renderSettings(ctx, rightL + 4, row2Top + 2, rightR - 4, row2Top + panelH - 2, "fpstest.results.master_settings");
        this.endPanelClip(ctx);
    }

    private void renderMasterFrameStats(GuiGraphics ctx, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.master_frame_timing")), x0, y0, -1118482);
        MasterReportSummary.PanelStats p = this.masterSummary.panels;
        int row = y0 + 11;
        int rh = 9;
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_avg", fmtMs(p.frameAvg()), -1);
            row += rh;
            if (row + rh <= y1) {
                this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p95", fmtMs(p.frameP95()), -1);
                row += rh;
                if (row + rh <= y1) {
                    this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p99", fmtMs(p.frameP99()), frameColor(p.frameP99(), 16.7, 33.3));
                    row += rh;
                    if (row + rh <= y1) {
                        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p999", fmtMs(p.frameP999()), frameColor(p.frameP999(), 33.3, 50.0));
                        row += rh;
                        if (row + rh <= y1) {
                            this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_max", fmtMs(p.frameMax()), frameColor(p.frameMax(), 33.3, 50.0));
                            row += rh;
                            if (row + rh <= y1) {
                                this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_min", fmtMs(p.frameMin()), -1);
                                row += rh;
                                if (row + rh <= y1) {
                                    this.drawKV(ctx, x0, row, x1, "fpstest.results.tick_avg", fmtMs(p.tickAvg()), -1);
                                    row += rh;
                                    if (row + rh <= y1) {
                                        this.drawKV(ctx, x0, row, x1, "fpstest.results.tick_p99", fmtMs(p.tickP99()), -1);
                                        row += rh;
                                        if (row + rh <= y1) {
                                            this.drawKV(ctx, x0, row, x1, "fpstest.results.tick_max", fmtMs(p.tickMax()), -1);
                                            row += rh;
                                            if (row + rh <= y1) {
                                                this.drawKV(ctx, x0, row, x1, "fpstest.results.frames_total", String.valueOf(p.totalFrames()), -1);
                                                row += rh;
                                                if (row + rh <= y1) {
                                                    this.drawKV(ctx, x0, row, x1, "fpstest.results.duration", formatDuration(p.totalDurationMs()), -1);
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

    private void renderMasterExtras(GuiGraphics ctx, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.master_bench_stats")), x0, y0, -1118482);
        MasterReportSummary.PanelStats p = this.masterSummary.panels;
        int row = y0 + 11;
        int rh = 9;
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.heap_peak", String.format(Locale.ROOT, "%.0f MB", p.avgHeapPeakBytes() / 1048576.0), -1);
            row += rh;
            if (row + rh <= y1) {
                this.drawKV(ctx, x0, row, x1, "fpstest.results.gc_events", p.totalGcEvents() + " (" + String.format(Locale.ROOT, "%.0f ms", p.totalGcTimeMs()) + ")", -1);
                row += rh;
                if (row + rh <= y1) {
                    int shown = 0;
                    int maxRows = (y1 - row) / rh;

                    for (Entry<String, String> e : p.commonStringExtras().entrySet()) {
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

                    for (Entry<String, Double> e : p.commonNumericExtras().entrySet()) {
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
    }

    // ------------------------------------------------------------------
    // Benchmark Score section (3DMark-style points), above Summary.
    // ------------------------------------------------------------------

    private int scoreSectionHeight() {
        int heroH = 46;
        int catH = 40;
        int wlH = 46;
        return LIST_HEADER_H + heroH + SEC_GAP + catH + SEC_GAP + wlH + SEC_GAP + wlH + SEC_GAP + wlH + SEC_GAP + 12;
    }

    private void renderScoreSection(GuiGraphics ctx, int mouseX, int mouseY, int top, int sectionH) {
        int edge = EDGE;
        int avail = this.width - 2 * edge;
        int y = top;

        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.score_title")), edge, y, -1118482);
        y += LIST_HEADER_H;

        // Overall hero card.
        int heroH = 46;
        this.renderScoreHero(ctx, edge, y, avail, heroH);
        y += heroH + SEC_GAP;

        // Category cards (GPU / CPU / RAM).
        int catH = 40;
        int colW = (avail - 2 * COL_GAP) / 3;
        this.renderScoreCategoryCard(ctx, edge, y, colW, catH, "fpstest.results.score_gpu", this.masterSummary.score.gpuScore, ScoreCategory.GPU);
        this.renderScoreCategoryCard(ctx, edge + colW + COL_GAP, y, colW, catH, "fpstest.results.score_cpu", this.masterSummary.score.cpuScore, ScoreCategory.CPU);
        this.renderScoreCategoryCard(ctx, edge + 2 * (colW + COL_GAP), y, colW, catH, "fpstest.results.score_ram", this.masterSummary.score.ramScore, ScoreCategory.RAM);
        y += catH + SEC_GAP;

        // Workload cards (GPU / CPU / RAM).
        int wlH = 46;
        this.renderWorkloadCard(ctx, edge, y, avail, wlH, "fpstest.results.score_gpu_workloads",
            new ScoreWorkload[] {ScoreWorkload.GPU_RASTER, ScoreWorkload.GPU_SHADER, ScoreWorkload.GPU_PBR, ScoreWorkload.GPU_EFFECTS});
        y += wlH + SEC_GAP;
        this.renderWorkloadCard(ctx, edge, y, avail, wlH, "fpstest.results.score_cpu_workloads",
            new ScoreWorkload[] {ScoreWorkload.CPU_SINGLE_THREAD, ScoreWorkload.CPU_SIMULATION, ScoreWorkload.CPU_WORLD, ScoreWorkload.CPU_PARALLEL});
        y += wlH + SEC_GAP;
        this.renderWorkloadCard(ctx, edge, y, avail, wlH, "fpstest.results.score_ram_workloads",
            new ScoreWorkload[] {ScoreWorkload.RAM_BANDWIDTH, ScoreWorkload.RAM_LATENCY, ScoreWorkload.RAM_ALLOCATION, ScoreWorkload.RAM_JVM_GC});
        y += wlH + SEC_GAP;

        // Baseline note.
        ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.score_baseline")), edge, y, -7696491);
    }

    private void renderScoreHero(GuiGraphics ctx, int x, int y, int w, int h) {
        this.drawCard(ctx, x, y, x + w, y + h);
        ctx.fill(x, y, x + w, y + 2, ACCENT);
        double overall = this.masterSummary.score.overallScore;
        boolean available = !Double.isNaN(overall);
        String scoreStr = available ? fmtScore(overall) : I18n.tr("fpstest.results.na");
        String pointsLabel = I18n.tr("fpstest.results.score_points");
        String overallLabel = I18n.tr("fpstest.results.score_overall");
        String interp = available ? scoreInterpretation(overall) : "";

        int scoreW = this.font.width(scoreStr);
        int overallW = this.font.width(overallLabel);
        int interpW = this.font.width(interp);
        int cx = x + w / 2;

        // Big score number.
        float scale = 2.2F;
        int scaledW = (int) (scoreW * scale);
        ctx.pose().pushMatrix();
        ctx.pose().translate(cx - scaledW / 2.0F, y + 8);
        ctx.pose().scale(scale, scale);
        ctx.drawString(this.font, Component.literal(scoreStr), 0, 0, available ? -1 : DIM);
        ctx.pose().popMatrix();

        // "POINTS" next to the number.
        ctx.drawString(this.font, Component.literal("\u00a7l" + pointsLabel), cx + scaledW / 2 + 4, y + 14, ACCENT);
        // "Overall score" below.
        ctx.drawString(this.font, Component.literal("\u00a78" + overallLabel), cx - overallW / 2, y + h - 12, -7696491);
        // Interpretation on the right.
        if (available && !interp.isEmpty()) {
            ctx.drawString(this.font, Component.literal(interp), x + w - interpW - 6, y + h - 12, scoreColor(overall));
        }
    }

    private void renderScoreCategoryCard(GuiGraphics ctx, int x, int y, int w, int h, String titleKey, double score, ScoreCategory category) {
        this.drawCard(ctx, x, y, x + w, y + h);
        ctx.fill(x, y, x + w, y + 2, ACCENT);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr(titleKey).toUpperCase(Locale.ROOT)), x + 4, y + 4, -1);
        boolean available = !Double.isNaN(score);
        String scoreStr = available ? fmtScore(score) : I18n.tr("fpstest.results.na");
        int weightPct = (int) Math.round(category.overallWeight * 100.0);
        String weightStr = weightPct + "%";
        int weightW = this.font.width(weightStr);
        ctx.drawString(this.font, Component.literal(scoreStr), x + 4, y + h - 14, available ? -1 : DIM);
        ctx.drawString(this.font, Component.literal("\u00a78" + weightStr), x + w - weightW - 4, y + h - 14, -7696491);
    }

    private void renderWorkloadCard(GuiGraphics ctx, int x, int y, int w, int h, String headingKey, ScoreWorkload[] workloads) {
        this.drawCard(ctx, x, y, x + w, y + h);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr(headingKey)), x + 2, y + 2, -1118482);
        int innerX = x + 4;
        int innerW = w - 8;
        int colW = (innerW - COL_GAP) / 2;
        int rowH = 14;
        int rowY = y + 16;
        for (int i = 0; i < workloads.length; i++) {
            int cx = innerX + (i % 2) * (colW + COL_GAP);
            int cy = rowY + (i / 2) * rowH;
            this.renderWorkloadCell(ctx, cx, cy, colW, workloads[i]);
        }
    }

    private void renderWorkloadCell(GuiGraphics ctx, int x, int y, int w, ScoreWorkload workload) {
        double score = this.masterSummary.score.workloadScore(workload);
        boolean available = !Double.isNaN(score);
        String label = workloadLabel(workload);
        String value = available ? fmtScore(score) : I18n.tr("fpstest.results.na");
        int valueW = this.font.width(value);
        int maxLabelW = w - valueW - 6;
        if (maxLabelW < 0) {
            maxLabelW = 0;
        }
        ctx.drawString(this.font, Component.literal(truncate(this.font, label, maxLabelW)), x, y, -5196099);
        ctx.drawString(this.font, Component.literal(value), x + w - valueW, y, available ? -1 : DIM);
    }

    private static String workloadLabel(ScoreWorkload workload) {
        return switch (workload) {
            case GPU_RASTER -> I18n.tr("fpstest.results.wl_raster");
            case GPU_SHADER -> I18n.tr("fpstest.results.wl_shader");
            case GPU_PBR -> I18n.tr("fpstest.results.wl_pbr");
            case GPU_EFFECTS -> I18n.tr("fpstest.results.wl_effects");
            case CPU_SINGLE_THREAD -> I18n.tr("fpstest.results.wl_single_thread");
            case CPU_SIMULATION -> I18n.tr("fpstest.results.wl_simulation");
            case CPU_WORLD -> I18n.tr("fpstest.results.wl_world");
            case CPU_PARALLEL -> I18n.tr("fpstest.results.wl_parallel");
            case RAM_BANDWIDTH -> I18n.tr("fpstest.results.wl_bandwidth");
            case RAM_LATENCY -> I18n.tr("fpstest.results.wl_latency");
            case RAM_ALLOCATION -> I18n.tr("fpstest.results.wl_allocation");
            case RAM_JVM_GC -> I18n.tr("fpstest.results.wl_jvm_gc");
        };
    }

    private static String fmtScore(double v) {
        return !Double.isNaN(v) && !Double.isInfinite(v) ? String.format(Locale.ROOT, "%,.0f", v) : I18n.tr("fpstest.results.na");
    }

    private static String scoreInterpretation(double v) {
        if (Double.isNaN(v) || Double.isInfinite(v)) {
            return "";
        }
        if (v > 10500.0) {
            return I18n.tr("fpstest.results.score_above");
        }
        if (v < 9500.0) {
            return I18n.tr("fpstest.results.score_below");
        }
        return I18n.tr("fpstest.results.score_near");
    }

    private static int scoreColor(double v) {
        if (Double.isNaN(v) || Double.isInfinite(v)) {
            return DIM;
        }
        if (v > 10500.0) {
            return ACCENT_OK;
        }
        if (v < 9500.0) {
            return ACCENT_WARN;
        }
        return -1;
    }

    private int gridHeight() {
        int avail = this.width - 2 * EDGE;
        int colW = (avail - COL_GAP) / 2;
        int rowH = Math.max(52, Math.min(72, colW / 4));
        return LIST_HEADER_H + 3 * rowH + 2 * 4 + 2;
    }

    private void renderSummaryGrid(GuiGraphics ctx, int mouseX, int mouseY, int top, int gridH) {
        int edge = EDGE;
        int avail = this.width - 2 * edge;
        int colW = (avail - COL_GAP) / 2;
        int rowH = Math.max(52, Math.min(72, colW / 4));
        int ax = edge;
        int bx = edge + colW + COL_GAP;

        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.summary_title")), ax, top, -1118482);
        int gy = top + LIST_HEADER_H;

        this.renderAvgFpsCell(ctx, ax, gy, colW, rowH);
        this.renderNavCell(ctx, bx, gy, colW, rowH, mouseX, mouseY);
        gy += rowH + 4;

        this.renderShaderCell(ctx, ax, gy, colW, rowH, "fpstest.results.low_title", this.masterSummary.lowPlain);
        this.renderShaderCell(ctx, bx, gy, colW, rowH, "fpstest.results.low_pbr_title", this.masterSummary.lowPbr);
        gy += rowH + 4;

        this.renderShaderCell(ctx, ax, gy, colW, rowH, "fpstest.results.high_title", this.masterSummary.hiPlain);
        this.renderShaderCell(ctx, bx, gy, colW, rowH, "fpstest.results.high_pbr_title", this.masterSummary.hiPbr);
    }

    private void renderAvgFpsCell(GuiGraphics ctx, int x, int y, int w, int h) {
        this.drawCard(ctx, x, y, x + w, y + h);
        ctx.fill(x, y, x + w, y + 2, ACCENT);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.avg_fps").toUpperCase(Locale.ROOT)), x + 4, y + 4, -1);
        ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.avg_note")), x + 4, y + 14, -7696491);
        if (this.masterSummary.overallTestCount == 0) {
            ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.agg_unavailable")), x + 4, y + 28, DIM);
            return;
        }
        int row = y + 26;
        int rh = 9;
        int x1 = x + w - 4;
        this.drawKV(ctx, x + 4, row, x1, "fpstest.results.avg_fps", fmtFps(this.masterSummary.overallAvgFps), fpsColor(this.masterSummary.overallAvgFps));
        row += rh;
        this.drawKV(ctx, x + 4, row, x1, "fpstest.results.min_fps", fmtFps(this.masterSummary.overallMinFps), fpsColor(this.masterSummary.overallMinFps));
        row += rh;
        this.drawKV(ctx, x + 4, row, x1, "fpstest.results.max_fps", fmtFps(this.masterSummary.overallMaxFps), fpsColor(this.masterSummary.overallMaxFps));
    }

    private void renderNavCell(GuiGraphics ctx, int x, int y, int w, int h, int mouseX, int mouseY) {
        this.drawCard(ctx, x, y, x + w, y + h);
        ctx.fill(x, y, x + w, y + 2, ACCENT);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.main_title").toUpperCase(Locale.ROOT)), x + 4, y + 4, -1);
        ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.main_note")), x + 4, y + 14, -7696491);
        boolean hovered = mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h && mouseY >= HEADER_H + 2 && mouseY <= this.height - FOOTER_H - 2;
        String cta = "\u00a7l\u00a7a" + I18n.tr("fpstest.results.view_detail_cta");
        ctx.drawString(this.font, Component.literal(cta), x + 4, y + h - 12, hovered ? -1 : ACCENT_OK);
    }

    private void renderShaderCell(GuiGraphics ctx, int x, int y, int w, int h, String titleKey, MasterReportSummary.Section section) {
        this.drawCard(ctx, x, y, x + w, y + h);
        ctx.fill(x, y, x + w, y + 2, ACCENT);
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr(titleKey).toUpperCase(Locale.ROOT)), x + 4, y + 4, -1);
        ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.stat_source")), x + 4, y + 14, -7696491);

        if (section == null || section.testCount() == 0) {
            ctx.drawString(this.font, Component.literal("\u00a78" + I18n.tr("fpstest.results.not_run")), x + 4, y + 28, DIM);
            return;
        }

        int row = y + 26;
        int rh = 9;
        int x1 = x + w - 4;
        this.drawKV(ctx, x + 4, row, x1, "fpstest.results.avg_fps", fmtFps(section.avgFps()), fpsColor(section.avgFps()));
        row += rh;
        this.drawKV(ctx, x + 4, row, x1, "fpstest.results.min_fps", fmtFps(section.minFps()), fpsColor(section.minFps()));
        row += rh;
        this.drawKV(ctx, x + 4, row, x1, "fpstest.results.max_fps", fmtFps(section.maxFps()), fpsColor(section.maxFps()));
        row += rh;
        if (row + rh <= y + h) {
            this.drawKV(ctx, x + 4, row, x1, "fpstest.results.fps_1pct", fmtFps(section.fps1pctLow()), fpsColor(section.fps1pctLow()));
            row += rh;
            if (row + rh <= y + h) {
                this.drawKV(ctx, x + 4, row, x1, "fpstest.results.fps_0p1pct", fmtFps(section.fps0p1pctLow()), fpsColor(section.fps0p1pctLow()));
            }
        }
    }

    private void renderHero(GuiGraphics ctx, BenchmarkResult r, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + truncate(this.font, r.displayName(), x1 - x0 - 12)), x0 + 4, y0 + 3, -1);
        String meta;
        if (r.extras().containsKey("part_label")) {
            meta = I18n.tr("fpstest.hud.part") + " " + r.extras().get("part").intValue() + " - " + r.extras().get("part_label");
        } else {
            meta = r.category() + " \u00b7 " + r.sampleTicks() + " " + I18n.tr("fpstest.results.ticks_short");
        }
        ctx.drawString(this.font, Component.literal("\u00a78" + truncate(this.font, meta, x1 - x0 - 12)), x0 + 4, y0 + 13, -7696491);
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
        if (row + rh <= y1) {
            this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_avg", fmtMs(f.avg()), -1);
            row += rh;
            if (row + rh <= y1) {
                this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p95", fmtMs(f.p95()), -1);
                row += rh;
                if (row + rh <= y1) {
                    this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p99", fmtMs(f.p99()), frameColor(f.p99(), 16.7, 33.3));
                    row += rh;
                    if (row + rh <= y1) {
                        this.drawKV(ctx, x0, row, x1, "fpstest.results.frame_p999", fmtMs(f.p999()), frameColor(f.p999(), 33.3, 50.0));
                        row += rh;
                        if (row + rh <= y1) {
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
                    }
                }
            }
        }
    }

    private void renderExtras(GuiGraphics ctx, BenchmarkResult r, int x0, int y0, int x1, int y1) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr("fpstest.results.bench_stats")), x0, y0, -1118482);
        int row = y0 + 11;
        int rh = 9;
        if (row + rh <= y1) {
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
    }

    private void renderSysSpec(GuiGraphics ctx, int x0, int y0, int x1, int y1) {
        this.renderSysSpec(ctx, x0, y0, x1, y1, "fpstest.results.system_spec");
    }

    private void renderSysSpec(GuiGraphics ctx, int x0, int y0, int x1, int y1, String headingKey) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr(headingKey)), x0, y0, -1118482);
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
        this.renderSettings(ctx, x0, y0, x1, y1, "fpstest.results.settings");
    }

    private void renderSettings(GuiGraphics ctx, int x0, int y0, int x1, int y1, String headingKey) {
        ctx.drawString(this.font, Component.literal("\u00a7l" + I18n.tr(headingKey)), x0, y0, -1118482);
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

        int top = HEADER_H + 2;
        int bot = this.height - FOOTER_H - 2;
        boolean inViewport = mouseY >= top && mouseY <= bot;

        if (inViewport && button == 0 && this.session.size() > 1) {
            int leftCol = EDGE;
            int rightCol = this.width - EDGE;
            int rowsAvail = Math.min(6, this.session.size());
            int listScreenY = this.cy(0);

            int masterY = listScreenY + LIST_HEADER_H;
            if (mouseX >= leftCol - 2 && mouseX <= rightCol + 2 && mouseY >= masterY && mouseY < masterY + LIST_ROW_H) {
                this.focusIndex = -1;
                this.contentScrollY = 0;
                return true;
            }

            for (int i = 0; i < rowsAvail; i++) {
                int srcIdx = this.listScroll + i;
                if (srcIdx >= this.session.size()) {
                    break;
                }

                int ry = listScreenY + LIST_HEADER_H + (i + 1) * LIST_ROW_H;
                if (mouseX >= leftCol - 2 && mouseX <= rightCol + 2 && mouseY >= ry && mouseY < ry + LIST_ROW_H) {
                    this.focusIndex = srcIdx;
                    this.contentScrollY = 0;
                    return true;
                }
            }
        }

        if (inViewport && button == 0 && this.focusIndex == -1) {
            int edge = EDGE;
            int avail = this.width - 2 * edge;
            int colW = (avail - COL_GAP) / 2;
            int rowH = Math.max(52, Math.min(72, colW / 4));
            int bx = edge + colW + COL_GAP;

            int gridContentY = 0;
            if (this.session.size() > 1) {
                gridContentY += this.detailsListHeight() + SEC_GAP;
            }
            int gy = this.cy(gridContentY) + LIST_HEADER_H;

            if (mouseY >= gy && mouseY < gy + rowH) {
                if (mouseX >= bx && mouseX <= bx + colW) {
                    this.focusIndex = -1;
                    this.contentScrollY = 0;
                    return true;
                }
            }
            gy += rowH + 4;

            if (mouseY >= gy && mouseY < gy + rowH) {
                if (mouseX >= edge && mouseX <= edge + colW && this.idxLowPlain >= 0) {
                    this.focusIndex = this.idxLowPlain;
                    this.contentScrollY = 0;
                    return true;
                }
                if (mouseX >= bx && mouseX <= bx + colW && this.idxLowPbr >= 0) {
                    this.focusIndex = this.idxLowPbr;
                    this.contentScrollY = 0;
                    return true;
                }
            }
            gy += rowH + 4;

            if (mouseY >= gy && mouseY < gy + rowH) {
                if (mouseX >= edge && mouseX <= edge + colW && this.idxHiPlain >= 0) {
                    this.focusIndex = this.idxHiPlain;
                    this.contentScrollY = 0;
                    return true;
                }
                if (mouseX >= bx && mouseX <= bx + colW && this.idxHiPbr >= 0) {
                    this.focusIndex = this.idxHiPbr;
                    this.contentScrollY = 0;
                    return true;
                }
            }
        }

        return super.mouseClicked(event, flag);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizAmount, double vertAmount) {
        int top = HEADER_H + 2;
        int bot = this.height - FOOTER_H - 2;
        if (mouseY < top || mouseY > bot) {
            return super.mouseScrolled(mouseX, mouseY, horizAmount, vertAmount);
        }

        int listTop = this.cy(0);
        int listBot = listTop + this.detailsListHeight();
        boolean overList = mouseY >= listTop && mouseY <= listBot;

        if (overList && this.session.size() > 6) {
            if (vertAmount < 0.0) {
                this.listScroll = Math.min(this.session.size() - 6, this.listScroll + 1);
            } else if (vertAmount > 0.0) {
                this.listScroll = Math.max(0, this.listScroll - 1);
            }

            return true;
        } else {
            if (vertAmount < 0.0) {
                this.contentScrollY = Math.min(this.maxScroll, this.contentScrollY + (float)(-vertAmount * 12));
            } else if (vertAmount > 0.0) {
                this.contentScrollY = Math.max(0, this.contentScrollY - (float)(vertAmount * 12));
            }

            this.clampScroll();
            return true;
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

    private void resolveShaderIndices() {
        for (int i = 0; i < this.session.size(); i++) {
            BenchmarkResult r = this.session.get(i);
            String shader = this.strExtra(r, "shader_pack");
            String pbr = this.strExtra(r, "resource_pack");
            boolean isLow = "lowEnd.zip".equals(shader);
            boolean isHigh = "highEnd.zip".equals(shader);
            boolean hasPbr = "pbr.zip".equals(pbr);
            if (isLow && !hasPbr) this.idxLowPlain = i;
            if (isLow && hasPbr) this.idxLowPbr = i;
            if (isHigh && !hasPbr) this.idxHiPlain = i;
            if (isHigh && hasPbr) this.idxHiPbr = i;
        }
        if (this.idxLowPlain < 0) this.idxLowPlain = this.findByPart(2);
        if (this.idxLowPbr < 0) this.idxLowPbr = this.findByPart(3);
        if (this.idxHiPlain < 0) this.idxHiPlain = this.findByPart(4);
        if (this.idxHiPbr < 0) this.idxHiPbr = this.findByPart(5);
    }

    private String strExtra(BenchmarkResult r, String key) {
        String v = r.stringExtras().get(key);
        if (v != null) return v;
        Double d = r.extras().get(key);
        return d != null ? String.valueOf(d.longValue()) : null;
    }

    private int findByPart(int part) {
        for (int i = 0; i < this.session.size(); i++) {
            Double p = this.session.get(i).extras().get("part");
            if (p != null && p.intValue() == part) return i;
        }
        return -1;
    }

    private int cy(int contentY) {
        return contentY - (int)this.contentScrollY + HEADER_H + 2;
    }

    private void clampScroll() {
        if (this.contentScrollY < 0) this.contentScrollY = 0;
        if (this.contentScrollY > this.maxScroll) this.contentScrollY = (float)this.maxScroll;
    }

    private int contentHeight() {
        int h = 0;
        if (this.session.size() > 1) {
            h += this.detailsListHeight() + SEC_GAP;
        }
        if (this.focusIndex == -1) {
            h += this.scoreSectionHeight() + SEC_GAP;
            h += this.gridHeight() + SEC_GAP;
            h += this.masterMetaBandHeight();
        } else {
            h += this.metaBandHeight(this.focusIndex);
        }
        return h;
    }

    private int sharedPanelHeight(BenchmarkResult r) {
        int extraCount = 0;
        for (String k : r.stringExtras().keySet()) {
            if (!k.startsWith("preset_")) extraCount++;
        }
        for (String k : r.extras().keySet()) {
            if (!k.startsWith("preset_") && !k.equals("fps_1pct_low") && !k.equals("fps_0p1pct_low")) extraCount++;
        }
        return this.panelHeightForExtras(extraCount);
    }

    private int masterPanelHeight() {
        int extraCount = 0;
        for (String k : this.masterSummary.panels.commonStringExtras().keySet()) {
            if (!k.startsWith("preset_")) extraCount++;
        }
        for (String k : this.masterSummary.panels.commonNumericExtras().keySet()) {
            if (!k.startsWith("preset_") && !k.equals("fps_1pct_low") && !k.equals("fps_0p1pct_low")) extraCount++;
        }
        return this.panelHeightForExtras(extraCount);
    }

    private int panelHeightForExtras(int extraCount) {
        int h = 15 + 11 * 9; // Frame Timing: 11 rows
        h = Math.max(h, 15 + 6 * 9); // System Spec: 6 rows
        h = Math.max(h, 15 + 14 * 9); // Settings: 14 rows
        int extrasRows = 2; // heap_peak, gc_events
        if (extraCount == 0) {
            extrasRows++; // "No additional metrics" line
        } else {
            extrasRows += extraCount;
        }
        h = Math.max(h, 15 + extrasRows * 9); // Benchmark Stats
        return h;
    }

    private int metaBandHeight(int index) {
        if (index < 0 || index >= this.session.size()) {
            return 0;
        }
        int panelH = this.sharedPanelHeight(this.session.get(index));
        return HERO_H + SEC_GAP + panelH + SEC_GAP + panelH;
    }

    private int masterMetaBandHeight() {
        int panelH = this.masterPanelHeight();
        return 12 + panelH + SEC_GAP + panelH;
    }

    private void beginClip(GuiGraphics ctx, int top, int bot) {
        ctx.enableScissor(EDGE, top, this.width - EDGE, bot);
    }

    private void endClip(GuiGraphics ctx) {
        ctx.disableScissor();
    }

    private void beginPanelClip(GuiGraphics ctx, int x0, int y0, int x1, int y1) {
        ctx.enableScissor(x0, y0, x1, y1);
    }

    private void endPanelClip(GuiGraphics ctx) {
        ctx.disableScissor();
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