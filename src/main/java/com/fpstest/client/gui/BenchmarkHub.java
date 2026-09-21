package com.fpstest.client.gui;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkRegistry;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.FullBenchmarkConfig;
import com.fpstest.client.bench.RunPlan;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public final class BenchmarkHub extends Screen {
    private final Screen parent;
    private BenchmarkHub.Tab active = HubState.tab;
    private BenchmarkHub.Preset preset;
    private static final int CARD_BG = -938470376;
    private static final int CARD_OUTLINE = 1090519039;
    private static final int ROW_BG = 1073741824;
    private static final int ROW_HL = 1713548031;
    private static final int HEADER_H_BASE = 56;
    private static final int TAB_H = 26;
    private static final int ROW_H = 28;
    /** Set when the hub is opened via the experimental CTRL+ALT+SHIFT+F+J hotkey. */
    public static boolean experimentalMenu = false;
    private int scroll;
    private int headerRightEdge;
    private int tabRows;
    private int[] activeTabRect;
    private FlatButton cancelBtn;
    private boolean lastBusy;
    private final Set<String> customQueue;

    private int headerH() {
        return experimentalMenu ? 78 : 56;
    }

    private static String truncate(TextRenderer font, String s, int pixelWidth) {
        if (s == null) {
            return "\u2014";
        } else if (pixelWidth <= 0) {
            return "";
        } else if (font.getWidth(s) <= pixelWidth) {
            return s;
        } else {
            String suffix = "\u2026";
            int suffixW = font.getWidth(suffix);
            StringBuilder out = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                String candidate = out.toString() + s.charAt(i);
                if (font.getWidth(candidate) + suffixW > pixelWidth) {
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

    public BenchmarkHub(Screen parent) {
        super(Text.literal("MC Benchmark Core"));
        this.preset = HubState.preset;
        this.scroll = 0;
        this.headerRightEdge = Integer.MAX_VALUE;
        this.tabRows = 1;
        this.activeTabRect = null;
        this.cancelBtn = null;
        this.lastBusy = false;
        this.customQueue = HubState.customQueue;
        this.parent = parent;
    }

    @Override
    protected void init() {
        this.rebuildAll();
    }

    private void rebuildAll() {
        this.clearChildren();
        HubState.tab = this.active;
        HubState.preset = this.preset;
        int pad = 8;
        int topRowY = 8;
        int btnGap = 4;
        int closeW = 60;
        int settingsW = 78;
        int reportsW = 78;
        int rx = this.width - pad - closeW;
        this.addDrawableChild(
            FlatButton.flatBuilder(I18n.t("fpstest.button.close"), b -> this.close())
                .dimensions(rx, topRowY, closeW, 20)
                .build()
        );
        rx -= settingsW + btnGap;
        this.addDrawableChild(
            FlatButton.flatBuilder(I18n.t("fpstest.button.settings"), b -> this.client.setScreen(new SettingsScreen(this)))
                .dimensions(rx, topRowY, settingsW, 20)
                .build()
        );
        rx -= reportsW + btnGap;
        this.addDrawableChild(
            FlatButton.flatBuilder(I18n.t("fpstest.tab.reports"), b -> this.client.setScreen(new ReportsScreen(this)))
                .dimensions(rx, topRowY, reportsW, 20)
                .build()
        );
        this.headerRightEdge = rx - btnGap;
        int presetY = experimentalMenu ? 42 : 30;
        int presetX = 8;

        for (BenchmarkHub.Preset p : BenchmarkHub.Preset.values()) {
            boolean selected = p == this.preset;
            String lbl = (selected ? "\u00a7l\u00a7n" : "") + presetLabel(p);
            FlatButton b = FlatButton.flatBuilder(Text.literal(lbl), btn -> {
                    this.preset = p;
                    this.rebuildAll();
                })
                .dimensions(presetX, presetY, 76, 18)
                .accent(selected ? -10040065 : -2139062144)
                .tooltip(Tooltip.of(Text.literal(I18n.trf("fpstest.tab.tooltip", presetDesc(p)))))
                .build();
            this.addDrawableChild(b);
            presetX += 78;
        }

        this.layoutTabs();
        switch (this.active) {
            case OVERVIEW:
                this.buildOverview();
                break;
            case CUSTOM:
                this.buildCustom();
                break;
            default:
                this.buildCategory(this.active);
        }

        boolean busy = FpsTestClient.RUNNER.busy();
        this.lastBusy = busy;
        if (busy) {
            int cancelW = 80;
            int cancelH = 16;
            int cancelX = this.width - 8 - cancelW - 4;
            int cancelY = this.height - 21;
            this.cancelBtn = FlatButton.flatBuilder(I18n.t("fpstest.footer.cancel"), b -> this.cancelRunning())
                .dimensions(cancelX, cancelY, cancelW, cancelH)
                .accent(-34953)
                .tooltip(Tooltip.of(I18n.t("fpstest.footer.cancel.tooltip")))
                .build();
            this.addDrawableChild(this.cancelBtn);
        } else {
            this.cancelBtn = null;
        }
    }

    private void layoutTabs() {
        int tabAreaLeft = 8;
        int tabAreaRight = this.width - 8;
        int tabAreaW = tabAreaRight - tabAreaLeft;
        int tabGap = 2;
        BenchmarkHub.Tab[] tabs = BenchmarkHub.Tab.values();
        int n = tabs.length;
        int[] nat = new int[n];
        int totalNat = 0;

        for (int i = 0; i < n; i++) {
            nat[i] = Math.max(46, this.textRenderer.getWidth(I18n.t(tabTitle(tabs[i]))) + 14);
            totalNat += nat[i];
        }

        int needed = totalNat + tabGap * (n - 1);
        boolean wrap = needed > tabAreaW;
        this.tabRows = wrap ? 2 : 1;
        int tabY1 = this.headerH();
        int tabY2 = tabY1 + 26 + 2;
        if (!wrap) {
            int slack = Math.max(0, tabAreaW - needed);
            int per = slack / n;
            int tx = tabAreaLeft;

            for (int i = 0; i < n; i++) {
                this.addTabButton(tabs[i], tx, tabY1, nat[i] + per);
                tx += nat[i] + per + tabGap;
            }
        } else {
            int row1End = 0;

            for (int i = 0; i < n; i++) {
                int wIfAdded = row1End + (row1End == 0 ? 0 : tabGap) + nat[i];
                if (wIfAdded > tabAreaW) {
                    break;
                }

                row1End = wIfAdded;
            }

            int firstRowCount = 0;
            int cursor = 0;

            for (int i = 0; i < n; i++) {
                int wIfAdded = cursor + (cursor == 0 ? 0 : tabGap) + nat[i];
                if (wIfAdded > tabAreaW) {
                    break;
                }

                cursor = wIfAdded;
                firstRowCount++;
            }

            if (firstRowCount == 0) {
                firstRowCount = 1;
            }

            int tx = tabAreaLeft;

            for (int i = 0; i < firstRowCount; i++) {
                this.addTabButton(tabs[i], tx, tabY1, nat[i]);
                tx += nat[i] + tabGap;
            }

            tx = tabAreaLeft;

            for (int i = firstRowCount; i < n; i++) {
                this.addTabButton(tabs[i], tx, tabY2, nat[i]);
                tx += nat[i] + tabGap;
            }
        }
    }

    private void addTabButton(BenchmarkHub.Tab t, int x, int y, int w) {
        FlatButton b = FlatButton.flatBuilder(I18n.t(tabTitle(t)), btn -> {
                this.active = t;
                this.scroll = 0;
                this.rebuildAll();
            })
            .dimensions(x, y, w, 26)
            .accent(t.accent)
            .tooltip(Tooltip.of(Text.literal(I18n.trf("fpstest.tab.tooltip", tabTitle(t)))))
            .build();
        this.addDrawableChild(b);
        if (t == this.active) {
            this.activeTabRect = new int[]{x, y, w};
        }
    }

    private int contentTop() {
        return this.headerH() + 26 * this.tabRows + (this.tabRows == 2 ? 4 : 8);
    }

    private int contentBottom() {
        return this.height - 44;
    }

    private void buildOverview() {
        int y = this.contentTop() + 28;
        int btnW = 360;
        int x = (this.width - btnW) / 2;
        Benchmark showcase = BenchmarkRegistry.get("base_fps_showcase").orElse(null);
        if (showcase != null) {
            long showcaseEtaMs = (long)(RunPlan.fromBench(showcase).estimatedSeconds() * 1000.0);
            this.addDrawableChild(
                FlatButton.flatBuilder(
                    Text.literal(I18n.trf("fpstest.overview.showcase_button", fmtDuration(showcaseEtaMs))), b -> this.runSingle(showcase))
                .dimensions(x, y, btnW, 30)
                .accent(BenchmarkHub.Tab.SHOWCASE.accent)
                .tooltip(Tooltip.of(I18n.t("fpstest.overview.showcase_tooltip")))
                .build()
            );
            y += 36;
        }

        long fullEtaMs = totalEtaMs(this.fullSuitePlans());
        this.addDrawableChild(
            FlatButton.flatBuilder(
                Text.literal(I18n.trf("fpstest.overview.full_button", presetLabel(this.preset), fmtDuration(fullEtaMs))), b -> this.runFullSuite())
            .dimensions(x, y, btnW, 26)
            .accent(-7686401)
            .tooltip(Tooltip.of(Text.literal(I18n.trf("fpstest.overview.full_tooltip", presetLabel(this.preset).toLowerCase(), fmtDuration(fullEtaMs)))))
            .build()
        );
        y += 32;

        for (String cat : this.orderedCategories()) {
            if (y + 22 > this.contentBottom()) {
                break;
            }

            if (!"Showcase".equals(cat)) {
                List<Benchmark> list = BenchmarkRegistry.byCategory(cat);
                long catEta = totalEtaMs(list.stream().map(this::planFor).toList());
                this.addDrawableChild(
                    FlatButton.flatBuilder(
                        Text.literal(I18n.trf("fpstest.overview.run_all", catLabel(cat), list.size(), fmtDuration(catEta))), b -> this.runCategory(cat))
                    .dimensions(x, y, btnW, 22)
                    .accent(this.accentForCategory(cat))
                    .tooltip(Tooltip.of(Text.literal(I18n.trf("fpstest.overview.run_all_tooltip", list.size(), String.join(", ", list.stream().map(Benchmark::displayName).toList()), fmtDuration(catEta)))))
                    .build()
                );
                y += 26;
            }
        }
    }

    /**
     * The FULL BENCHMARK queue: the original main workload (all non-Showcase
     * benchmarks, Part 1) followed by the shader/resource-pack showcase
     * (Parts 2-5). Used for both the Overview button ETA and the actual run.
     */
    private List<RunPlan> fullSuitePlans() {
        return fullSuitePlansStatic();
    }

    private RunPlan planFor(Benchmark b) {
        return planForStatic(b);
    }

    private static long totalEtaMs(List<RunPlan> plans) {
        double s = 0.0;

        for (RunPlan p : plans) {
            s += p.estimatedSeconds();
        }

        return (long)(s * 1000.0);
    }

    private List<String> orderedCategories() {
        return orderedCategoriesStatic();
    }

    /**
     * Static plan builders shared by the hub's own buttons and the title-screen
     * "Test FPS" direct launcher. They use {@link HubState#preset} so both entry
     * points produce the exact same FULL BENCHMARK queue.
     */
    private static List<String> orderedCategoriesStatic() {
        List<String> ordered = new ArrayList<>();

        for (String want : List.of("Showcase", "Particles", "Entities", "Physics", "Redstone", "Chunks", "Baseline")) {
            if (BenchmarkRegistry.categories().contains(want)) {
                ordered.add(want);
            }
        }

        for (String c : BenchmarkRegistry.categories()) {
            if (!ordered.contains(c)) {
                ordered.add(c);
            }
        }

        return ordered;
    }

    private static RunPlan planForStatic(Benchmark b) {
        return b.fixedDuration() ? RunPlan.fromBench(b) : HubState.preset.factory.apply(b);
    }

    private static List<RunPlan> allPlansStatic() {
        List<RunPlan> out = new ArrayList<>();

        for (String cat : orderedCategoriesStatic()) {
            if (!"Showcase".equals(cat)) {
                for (Benchmark b : BenchmarkRegistry.byCategory(cat)) {
                    out.add(planForStatic(b));
                }
            }
        }

        return out;
    }

    private static List<RunPlan> fullSuitePlansStatic() {
        List<RunPlan> plans = new ArrayList<>(allPlansStatic());
        Benchmark showcase = BenchmarkRegistry.get("pack_shader_showcase").orElse(null);
        if (showcase != null) {
            plans.add(planForStatic(showcase));
        }
        return plans;
    }

    /**
     * Direct FULL BENCHMARK launcher used by the title-screen "Test FPS" button.
     * Starts the exact same queue as the hub's "Run FULL BENCHMARK" button but
     * skips the menu/confirm step entirely. {@code onFinished} is {@code null} so
     * the results screen's Close button returns to the title screen.
     *
     * @return {@code true} if the queue was started, {@code false} if the runner
     *         was already busy.
     */
    public static boolean startFullBenchmark() {
        if (FpsTestClient.RUNNER.busy()) {
            return false;
        }
        List<RunPlan> plans = fullSuitePlansStatic();
        String label = I18n.trf("fpstest.label.full", presetLabel(HubState.preset));
        FullBenchmarkConfig config = new FullBenchmarkConfig();
        FpsTestClient.RUNNER.setMainPartLabel(I18n.tr("fpstest.part.main"));
        FpsTestClient.RUNNER.setSessionHooks(config::saveAndDisable, config::restore);
        return FpsTestClient.RUNNER.startQueue(plans, label, null);
    }

    private void buildCategory(BenchmarkHub.Tab tab) {
        String category = categoryFor(tab);
        List<Benchmark> list = BenchmarkRegistry.byCategory(category);
        int runAllW = 320;
        int runAllX = (this.width - runAllW) / 2;
        int runAllY = this.contentTop() + 22;
        long catEta = totalEtaMs(list.stream().map(this::planFor).toList());
        this.addDrawableChild(
            FlatButton.flatBuilder(
                Text.literal(I18n.trf("fpstest.category.run_all", catLabel(category), list.size(), presetLabel(this.preset), fmtDuration(catEta))), b -> this.runCategory(category))
            .dimensions(runAllX, runAllY, runAllW, 22)
            .accent(tab.accent)
            .tooltip(Tooltip.of(Text.literal(I18n.trf("fpstest.tooltip.eta", fmtDuration(catEta)))))
            .build()
        );
        int listTop = runAllY + 30;
        int avail = this.contentBottom() - listTop;
        int visible = Math.max(1, avail / 28);
        int maxScroll = Math.max(0, list.size() - visible);
        if (this.scroll > maxScroll) {
            this.scroll = maxScroll;
        }

        int right = this.width - 16;

        for (int i = 0; i < Math.min(visible, list.size() - this.scroll); i++) {
            Benchmark b = list.get(this.scroll + i);
            int rowY = listTop + i * 28;
            long etaMs = (long)(this.preset.factory.apply(b).estimatedSeconds() * 1000.0);
            this.addDrawableChild(
                FlatButton.flatBuilder(Text.literal(I18n.trf("fpstest.row.run", fmtDuration(etaMs))), btn -> this.runSingle(b))
                    .dimensions(right - 168, rowY + 3, 80, 20)
                    .accent(tab.accent)
                    .tooltip(Tooltip.of(Text.literal(I18n.trf("fpstest.row.tooltip", b.description(), b.seed(), presetLabel(this.preset), presetDesc(this.preset), fmtDuration(etaMs)))))
                    .build()
            );
            this.addDrawableChild(
                FlatButton.flatBuilder(I18n.t(this.customQueue.contains(b.id()) ? "fpstest.button.queued_check" : "fpstest.button.queue_plus"), btn -> this.toggleQueued(b))
                    .dimensions(right - 84, rowY + 3, 76, 20)
                    .tooltip(Tooltip.of(I18n.t("fpstest.row.queue_tooltip")))
                    .build()
            );
        }
    }

    private void buildCustom() {
        int top = this.contentTop() + 32;
        long queueEta = totalEtaMs(this.customQueuePlans());
        this.addDrawableChild(
            FlatButton.flatBuilder(Text.literal(I18n.trf("fpstest.custom.run_queue", presetLabel(this.preset), this.customQueue.size(), fmtDuration(queueEta))), b -> this.runCustomQueue())
                .dimensions(this.width / 2 - 220, top, 220, 22)
                .accent(-3355444)
                .tooltip(Tooltip.of(this.customQueue.isEmpty() ? I18n.t("fpstest.custom.empty") : Text.literal(I18n.trf("fpstest.tooltip.eta", fmtDuration(queueEta)))))
                .build()
        );
        this.addDrawableChild(
            FlatButton.flatBuilder(I18n.t("fpstest.button.clear_queue"), b -> {
                this.customQueue.clear();
                this.rebuildAll();
            })
            .dimensions(this.width / 2 + 6, top, 110, 22)
            .build()
        );
        int listTop = top + 30;
        int avail = this.contentBottom() - listTop;
        int visible = Math.max(1, avail / 28);
        List<Benchmark> all = new ArrayList<>(BenchmarkRegistry.all().values());
        int maxScroll = Math.max(0, all.size() - visible);
        if (this.scroll > maxScroll) {
            this.scroll = maxScroll;
        }

        int right = this.width - 16;

        for (int i = 0; i < Math.min(visible, all.size() - this.scroll); i++) {
            Benchmark b = all.get(this.scroll + i);
            int rowY = listTop + i * 28;
            this.addDrawableChild(
                FlatButton.flatBuilder(I18n.t(this.customQueue.contains(b.id()) ? "fpstest.button.in_queue" : "fpstest.button.add_to_queue"), btn -> this.toggleQueued(b))
                    .dimensions(right - 88, rowY + 3, 80, 20)
                    .accent(this.accentForCategory(b.category()))
                    .build()
            );
        }
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double deltaX, double deltaY) {
        if (deltaY < 0.0) {
            this.scroll++;
        } else if (deltaY > 0.0) {
            this.scroll = Math.max(0, this.scroll - 1);
        }

        this.rebuildAll();
        return true;
    }

    private void toggleQueued(Benchmark b) {
        if (!this.customQueue.add(b.id())) {
            this.customQueue.remove(b.id());
        }

        this.rebuildAll();
    }

    private void runSingle(Benchmark b) {
        this.startWithConfirm(List.of(this.planFor(b)), b.displayName(), () -> FpsTestClient.RUNNER.startSingle(this.planFor(b), this.backToHub()));
    }

    private void runCategory(String cat) {
        List<RunPlan> plans = BenchmarkRegistry.byCategory(cat).stream().map(this::planFor).toList();
        String label = catLabel(cat) + " (" + presetLabel(this.preset) + ")";
        this.startWithConfirm(plans, label, () -> FpsTestClient.RUNNER.startQueue(plans, label, this.backToHub()));
    }

    private void runFullSuite() {
        List<RunPlan> plans = this.fullSuitePlans();
        String label = I18n.trf("fpstest.label.full", presetLabel(this.preset));
        this.startWithConfirm(plans, label, () -> {
            FullBenchmarkConfig config = new FullBenchmarkConfig();
            FpsTestClient.RUNNER.setMainPartLabel(I18n.tr("fpstest.part.main"));
            FpsTestClient.RUNNER.setSessionHooks(config::saveAndDisable, config::restore);
            FpsTestClient.RUNNER.startQueue(plans, label, this.backToHub());
        });
    }

    private void runCustomQueue() {
        List<RunPlan> plans = this.customQueuePlans();
        if (!plans.isEmpty()) {
            String label = I18n.trf("fpstest.label.custom", presetLabel(this.preset));
            this.startWithConfirm(plans, label, () -> FpsTestClient.RUNNER.startQueue(plans, label, this.backToHub()));
        }
    }

    private void startWithConfirm(List<RunPlan> plans, String label, Runnable launcher) {
        long etaMs = totalEtaMs(plans);
        List<String> heavy = plans.stream().map(p -> p.bench).filter(Benchmark::heavy).map(Benchmark::displayName).distinct().toList();
        boolean longRun = etaMs >= 1800000L;
        if (heavy.isEmpty() && !longRun) {
            launcher.run();
        } else {
            String heavyList = String.join("\n  \u2022 ", heavy);
            String body;
            if (!heavy.isEmpty() && longRun) {
                body = I18n.trf("fpstest.confirm.long_heavy", fmtDuration(etaMs), heavyList);
            } else if (longRun) {
                body = I18n.trf("fpstest.confirm.long_run", fmtDuration(etaMs));
            } else {
                body = I18n.trf("fpstest.confirm.heavy_only", heavyList);
            }

            this.client.setScreen(
                new ConfirmScreen(
                    ok -> {
                        if (ok) {
                            launcher.run();
                        } else {
                            this.client.setScreen(this);
                        }
                    },
                    Text.literal(I18n.trf("fpstest.confirm.title_with", label)),
                    Text.literal(body),
                    I18n.t("fpstest.confirm.run"),
                    I18n.t("fpstest.confirm.cancel")
                )
            );
        }
    }

    private List<RunPlan> customQueuePlans() {
        return this.customQueue.stream().map(id -> BenchmarkRegistry.get(id).orElse(null)).filter(x -> x != null).map(this::planFor).toList();
    }

    private Runnable backToHub() {
        Screen p = this.parent;
        return () -> this.client.setScreen(new BenchmarkHub(p));
    }

    @Override
    public void close() {
        experimentalMenu = false;
        super.close();
    }

    private void cancelRunning() {
        if (FpsTestClient.RUNNER.busy()) {
            FpsTestClient.RUNNER.abortAll("canceled by user (hub)");
            this.rebuildAll();
        }
    }

    @Override
    public void renderBackground(DrawContext ctx, int mouseX, int mouseY, float delta) {
        super.renderBackground(ctx, mouseX, mouseY, delta);
        int cardL = 4;
        int cardR = this.width - 4;
        int contentTop = this.contentTop();
        int contentBot = this.contentBottom() + 6;
        ctx.fill(cardL, contentTop - 4, cardR, contentBot, -938470376);
        ctx.fill(cardL, contentTop - 4, cardR, contentTop - 3, 1090519039);
        ctx.fill(cardL, contentBot - 1, cardR, contentBot, 1090519039);
        ctx.fill(cardL, contentTop - 4, cardL + 1, contentBot, 1090519039);
        ctx.fill(cardR - 1, contentTop - 4, cardR, contentBot, 1090519039);
        this.drawActiveTabAccent(ctx);
    }

    @Override
    public void render(DrawContext ctx, int mouseX, int mouseY, float partialTicks) {
        boolean busyNow = FpsTestClient.RUNNER.busy();
        if (busyNow != this.lastBusy) {
            this.rebuildAll();
        }

        super.render(ctx, mouseX, mouseY, partialTicks);
        String title = "\u00a7l" + I18n.t("fpstest.title") + "\u00a7r \u00a78\u2014 " + I18n.t("fpstest.subtitle");
        int avail = Math.max(40, this.headerRightEdge - 8 - 4);
        if (this.textRenderer.getWidth(title) > avail) {
            title = "\u00a7l" + I18n.t("fpstest.title");
        }

        ctx.drawTextWithShadow(this.textRenderer, Text.literal(title), 8, 10, -1);
        if (experimentalMenu) {
            int warnW = Math.max(40, this.headerRightEdge - 8 - 4);
            ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a7l\u00a7e" + I18n.t("fpstest.hub.experimental")), 8, 20, -1);
            ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a77" + truncate(this.textRenderer, I18n.tr("fpstest.hub.experimental.body"), warnW)), 8, 30, -5592406);
        }
        this.renderContent(ctx, mouseX, mouseY);
        this.renderFooter(ctx);
    }

    private void drawActiveTabAccent(DrawContext ctx) {
        if (this.activeTabRect != null) {
            int x = this.activeTabRect[0];
            int y = this.activeTabRect[1] + 26;
            int w = this.activeTabRect[2];
            ctx.fill(x, y, x + w, y + 2, this.active.accent);
        }
    }

    private void renderContent(DrawContext ctx, int mouseX, int mouseY) {
        switch (this.active) {
            case OVERVIEW:
                ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a7l" + I18n.t("fpstest.tab.overview")), 12, this.contentTop() + 6, -1);
                ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a77" + I18n.t("fpstest.overview.body")), 12, this.contentTop() + 18, -5592406);
                break;
            case CUSTOM:
                ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a7l" + I18n.t("fpstest.tab.custom") + " \u00a78(" + I18n.trf("fpstest.custom.count", this.customQueue.size()) + ")"), 12, this.contentTop() + 6, -1);
                ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a77" + I18n.t("fpstest.custom.body")), 12, this.contentTop() + 18, -5592406);
                this.renderRowsCustom(ctx, mouseX, mouseY);
                break;
            default:
                this.renderCategoryRows(ctx, mouseX, mouseY);
        }
    }

    private void renderCategoryRows(DrawContext ctx, int mouseX, int mouseY) {
        String category = categoryFor(this.active);
        List<Benchmark> list = BenchmarkRegistry.byCategory(category);
        ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a7l" + catLabel(category) + " \u00a78(" + I18n.trf("fpstest.category.heading_meta", list.size(), presetLabel(this.preset)) + ")"), 12, this.contentTop() + 6, -1);
        int listTop = this.contentTop() + 22 + 30;
        int avail = this.contentBottom() - listTop;
        int visible = Math.max(1, avail / 28);
        int left = 12;
        int right = this.width - 16;

        for (int i = 0; i < Math.min(visible, list.size() - this.scroll); i++) {
            Benchmark b = list.get(this.scroll + i);
            int rowY = listTop + i * 28;
            int rowR = right - 172;
            int hovered = mouseY >= rowY && mouseY < rowY + 28 - 2 && mouseX >= left && mouseX < right ? 1 : 0;
            ctx.fill(left, rowY, right, rowY + 28 - 2, hovered == 1 ? 1713548031 : 1073741824);
            ctx.fill(left, rowY, left + 3, rowY + 28 - 2, this.active.accent);
            String label = (b.heavy() ? "\u00a7e\u26a0 \u00a7f" : "\u00a7f") + b.displayName();
            ctx.drawTextWithShadow(this.textRenderer, Text.literal(truncate(this.textRenderer, label, rowR - 4 - (left + 8))), left + 8, rowY + 4, -1);
            String desc = "\u00a78seed " + b.seed() + " \u00b7 " + b.description();
            ctx.drawTextWithShadow(this.textRenderer, Text.literal(truncate(this.textRenderer, desc, rowR - 4 - (left + 8))), left + 8, rowY + 14, -5592406);
        }

        if (list.size() > visible) {
            ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a78" + I18n.trf("fpstest.row.scroll_hint", Math.min(this.scroll + visible, list.size()), list.size())), this.width - 130, this.contentBottom() + 8, -7829368);
        }
    }

    private void renderRowsCustom(DrawContext ctx, int mouseX, int mouseY) {
        List<Benchmark> all = new ArrayList<>(BenchmarkRegistry.all().values());
        int listTop = this.contentTop() + 32 + 30;
        int avail = this.contentBottom() - listTop;
        int visible = Math.max(1, avail / 28);
        int left = 12;
        int right = this.width - 16;

        for (int i = 0; i < Math.min(visible, all.size() - this.scroll); i++) {
            Benchmark b = all.get(this.scroll + i);
            int rowY = listTop + i * 28;
            int hovered = mouseY >= rowY && mouseY < rowY + 28 - 2 && mouseX >= left && mouseX < right ? 1 : 0;
            ctx.fill(left, rowY, right, rowY + 28 - 2, hovered == 1 ? 1713548031 : 1073741824);
            int accent = this.accentForCategory(b.category());
            ctx.fill(left, rowY, left + 3, rowY + 28 - 2, accent);
            String label = (b.heavy() ? "\u00a7e\u26a0 \u00a7f" : "\u00a7f") + b.displayName();
            ctx.drawTextWithShadow(this.textRenderer, Text.literal(truncate(this.textRenderer, label, right - 96 - (left + 8))), left + 8, rowY + 4, -1);
            String desc = "\u00a77" + b.category() + " \u00b7\u00a78 seed " + b.seed();
            ctx.drawTextWithShadow(this.textRenderer, Text.literal(truncate(this.textRenderer, desc, right - 96 - (left + 8))), left + 8, rowY + 14, -5592406);
        }
    }

    private static String categoryFor(BenchmarkHub.Tab tab) {
        return switch (tab) {
            case SHOWCASE -> "Showcase";
            case PARTICLES -> "Particles";
            case ENTITIES -> "Entities";
            case PHYSICS -> "Physics";
            case REDSTONE -> "Redstone";
            case FLUIDS -> "Fluids";
            case LIGHTING -> "Lighting";
            case CHUNKS -> "Chunks";
            case BLOCK_ENTITIES -> "Block-Entities";
            case STRESS -> "Stress";
            default -> "\u2014";
        };
    }

    private static String tabTitle(BenchmarkHub.Tab t) {
        return switch (t) {
         case OVERVIEW -> I18n.tr("fpstest.tab.overview");
         case SHOWCASE -> I18n.tr("fpstest.tab.showcase");
         case PARTICLES -> I18n.tr("fpstest.tab.particles");
         case ENTITIES -> I18n.tr("fpstest.tab.entities");
         case PHYSICS -> I18n.tr("fpstest.tab.physics");
         case REDSTONE -> I18n.tr("fpstest.tab.redstone");
         case FLUIDS -> I18n.tr("fpstest.tab.fluids");
         case LIGHTING -> I18n.tr("fpstest.tab.lighting");
         case CHUNKS -> I18n.tr("fpstest.tab.chunks");
         case BLOCK_ENTITIES -> I18n.tr("fpstest.tab.block_entities");
         case STRESS -> I18n.tr("fpstest.tab.stress");
         case CUSTOM -> I18n.tr("fpstest.tab.custom");
        };
    }

    private static String catLabel(String cat) {
        return switch (cat) {
            case "Showcase" -> I18n.tr("fpstest.tab.showcase");
            case "Particles" -> I18n.tr("fpstest.tab.particles");
            case "Entities" -> I18n.tr("fpstest.tab.entities");
            case "Physics" -> I18n.tr("fpstest.tab.physics");
            case "Redstone" -> I18n.tr("fpstest.tab.redstone");
            case "Fluids" -> I18n.tr("fpstest.tab.fluids");
            case "Lighting" -> I18n.tr("fpstest.tab.lighting");
            case "Chunks" -> I18n.tr("fpstest.tab.chunks");
            case "Block-Entities" -> I18n.tr("fpstest.tab.block_entities");
            case "Stress" -> I18n.tr("fpstest.tab.stress");
            default -> cat;
        };
    }

    private static String presetLabel(BenchmarkHub.Preset p) {
        return switch (p) {
            case QUICK -> I18n.tr("fpstest.preset.quick");
            case FULL -> I18n.tr("fpstest.preset.full");
            case LONG -> I18n.tr("fpstest.preset.long");
        };
    }

    private static String presetDesc(BenchmarkHub.Preset p) {
        return switch (p) {
            case QUICK -> I18n.tr("fpstest.preset.quick.desc");
            case FULL -> I18n.tr("fpstest.preset.full.desc");
            case LONG -> I18n.tr("fpstest.preset.long.desc");
        };
    }

    private int accentForCategory(String c) {
        return switch (c) {
            case "Showcase" -> BenchmarkHub.Tab.SHOWCASE.accent;
            case "Particles" -> BenchmarkHub.Tab.PARTICLES.accent;
            case "Entities" -> BenchmarkHub.Tab.ENTITIES.accent;
            case "Physics" -> BenchmarkHub.Tab.PHYSICS.accent;
            case "Redstone" -> BenchmarkHub.Tab.REDSTONE.accent;
            case "Fluids" -> BenchmarkHub.Tab.FLUIDS.accent;
            case "Lighting" -> BenchmarkHub.Tab.LIGHTING.accent;
            case "Chunks" -> BenchmarkHub.Tab.CHUNKS.accent;
            case "Block-Entities" -> BenchmarkHub.Tab.BLOCK_ENTITIES.accent;
            case "Stress" -> BenchmarkHub.Tab.STRESS.accent;
            default -> -5592406;
        };
    }

    private void renderFooter(DrawContext ctx) {
        CinematicRunner r = FpsTestClient.RUNNER;
        int y = this.height - 22;
        int x = 8;
        int w = this.width - 16;
        ctx.fill(x, y, x + w, y + 18, -1073741824);
        ctx.fill(x, y, x + w, y + 1, 1090519039);
        if (r.busy()) {
            int dot = this.phaseColor(r.state().name());
            ctx.fill(x + 6, y + 6, x + 12, y + 12, dot);
            String label = "\u00a7f"
                + I18n.t("fpstest.footer.running")
                + ": \u00a7b"
                + (r.current() == null ? "\u2014" : r.current().displayName())
                + " \u00a77[\u00a7f"
                + CinematicRunner.stateLabel(r.state())
                + "\u00a77] \u00a77"
                + r.phaseTicks()
                + "t";
            int textMaxW = x + w - 96 - (x + 18);
            ctx.drawTextWithShadow(this.textRenderer, Text.literal(truncate(this.textRenderer, label, Math.max(20, textMaxW))), x + 18, y + 5, 16777215);
        } else {
            ctx.fill(x + 6, y + 6, x + 12, y + 12, -10048769);
            ctx.drawTextWithShadow(this.textRenderer, Text.literal("\u00a77" + I18n.t("fpstest.footer.ready")), x + 18, y + 5, -5592406);
        }
    }

    private int phaseColor(String state) {
        return switch (state) {
            case "WORLD_LOADING", "READY_WAIT" -> -7829368;
            case "PREPARING" -> -3355444;
            case "CHUNK_PRELOAD" -> -10040065;
            case "WARMUP" -> -13244;
            case "SAMPLING" -> -12264124;
            case "COOLDOWN", "DISCONNECTING", "POST_RUN" -> -5601025;
            default -> -5592406;
        };
    }

    private static String fmtDuration(long ms) {
        long s = Math.max(0L, ms / 1000L);
        if (s < 60L) {
            return s + "s";
        } else {
            long m = s / 60L;
            long sec = s % 60L;
            if (m < 60L) {
                return m + "m " + sec + "s";
            } else {
                long h = m / 60L;
                long min = m % 60L;
                return h + "h " + min + "m";
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public static enum Preset {
        QUICK("Quick", "~400 tick sample (fast)", RunPlan::quick),
        FULL("Full", "~1200 tick sample (standard)", RunPlan::full),
        LONG("Long", "~4000 tick sample (deep)", RunPlan::longRun);

        final String label;
        final String desc;
        final Function<Benchmark, RunPlan> factory;

        private Preset(String l, String d, Function<Benchmark, RunPlan> f) {
            this.label = l;
            this.desc = d;
            this.factory = f;
        }
    }

    @Environment(EnvType.CLIENT)
    public static enum Tab {
        OVERVIEW("Overview", -7686401),
        SHOWCASE("Showcase", -10034945),
        PARTICLES("Particles", -19372),
        ENTITIES("Entities", -34953),
        PHYSICS("Physics", -4879105),
        REDSTONE("Redstone", -43691),
        FLUIDS("Fluids", -11162881),
        LIGHTING("Lighting", -4489),
        CHUNKS("Chunks", -8921737),
        BLOCK_ENTITIES("Block-Entities", -1999873),
        STRESS("Stress", -1),
        CUSTOM("Custom", -3355444);

        final String title;
        final int accent;

        private Tab(String t, int a) {
            this.title = t;
            this.accent = a;
        }
    }
}
