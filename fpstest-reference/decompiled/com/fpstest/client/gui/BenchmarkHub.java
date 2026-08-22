package com.fpstest.client.gui;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkRegistry;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.RunPlan;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_410;
import net.minecraft.class_437;
import net.minecraft.class_7919;

@Environment(EnvType.CLIENT)
public final class BenchmarkHub extends class_437 {
   private final class_437 parent;
   private BenchmarkHub.Tab active = HubState.tab;
   private BenchmarkHub.Preset preset;
   private static final int CARD_BG = -938470376;
   private static final int CARD_OUTLINE = 1090519039;
   private static final int ROW_BG = 1073741824;
   private static final int ROW_HL = 1713548031;
   private static final int HEADER_H_BASE = 56;
   private static final int TAB_H = 26;
   private static final int ROW_H = 28;
   private int scroll;
   private int headerRightEdge;
   private int tabRows;
   private int[] activeTabRect;
   private FlatButton cancelBtn;
   private boolean lastBusy;
   private final Set<String> customQueue;

   private int headerH() {
      return 56;
   }

   public BenchmarkHub(class_437 parent) {
      super(class_2561.method_43470("FPS Test"));
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

   protected void method_25426() {
      this.rebuildAll();
   }

   private void rebuildAll() {
      this.method_37067();
      HubState.tab = this.active;
      HubState.preset = this.preset;
      int pad = 8;
      int topRowY = 8;
      int btnGap = 4;
      int closeW = 60;
      int settingsW = 78;
      int reportsW = 78;
      int rx = this.field_22789 - pad - closeW;
      this.method_37063(FlatButton.flatBuilder(I18n.t("fpstest.button.close"), bx -> this.method_25419()).dimensions(rx, topRowY, closeW, 20).build());
      rx -= settingsW + btnGap;
      this.method_37063(
         FlatButton.flatBuilder(I18n.t("fpstest.button.settings"), bx -> this.field_22787.method_1507(new SettingsScreen(this)))
            .dimensions(rx, topRowY, settingsW, 20)
            .build()
      );
      rx -= reportsW + btnGap;
      this.method_37063(
         FlatButton.flatBuilder(I18n.t("fpstest.tab.reports"), bx -> this.field_22787.method_1507(new ReportsScreen(this)))
            .dimensions(rx, topRowY, reportsW, 20)
            .build()
      );
      this.headerRightEdge = rx - btnGap;
      int presetY = 30;
      int presetX = 8;

      for (BenchmarkHub.Preset p : BenchmarkHub.Preset.values()) {
         boolean selected = p == this.preset;
         String lbl = (selected ? "§l§n" : "") + presetLabel(p);
         FlatButton b = FlatButton.flatBuilder(class_2561.method_43470(lbl), btn -> {
               this.preset = p;
               this.rebuildAll();
            })
            .dimensions(presetX, presetY, 76, 18)
            .accent(selected ? -10040065 : -2139062144)
            .tooltip(class_7919.method_47407(class_2561.method_43470(presetDesc(p))))
            .build();
         this.method_37063(b);
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
         int cancelX = this.field_22789 - 8 - cancelW - 4;
         int cancelY = this.field_22790 - 21;
         this.cancelBtn = FlatButton.flatBuilder(I18n.t("fpstest.footer.cancel"), bx -> this.cancelRunning())
            .dimensions(cancelX, cancelY, cancelW, cancelH)
            .accent(-34953)
            .tooltip(class_7919.method_47407(I18n.t("fpstest.footer.cancel.tooltip")))
            .build();
         this.method_37063(this.cancelBtn);
      } else {
         this.cancelBtn = null;
      }
   }

   private void layoutTabs() {
      int tabAreaLeft = 8;
      int tabAreaRight = this.field_22789 - 8;
      int tabAreaW = tabAreaRight - tabAreaLeft;
      int tabGap = 2;
      BenchmarkHub.Tab[] tabs = BenchmarkHub.Tab.values();
      int n = tabs.length;
      int[] nat = new int[n];
      int totalNat = 0;

      for (int i = 0; i < n; i++) {
         nat[i] = Math.max(46, this.field_22793.method_1727(tabTitle(tabs[i])) + 14);
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
      FlatButton b = FlatButton.flatBuilder(class_2561.method_43470(tabTitle(t)), btn -> {
            this.active = t;
            this.scroll = 0;
            this.rebuildAll();
         })
         .dimensions(x, y, w, 26)
         .accent(t.accent)
         .tooltip(class_7919.method_47407(class_2561.method_43470(I18n.trf("fpstest.tab.tooltip", tabTitle(t)))))
         .build();
      this.method_37063(b);
      if (t == this.active) {
         this.activeTabRect = new int[]{x, y, w};
      }
   }

   private int contentTop() {
      return this.headerH() + 26 * this.tabRows + (this.tabRows == 2 ? 4 : 8);
   }

   private int contentBottom() {
      return this.field_22790 - 44;
   }

   private void buildOverview() {
      int y = this.contentTop() + 28;
      int btnW = 360;
      int x = (this.field_22789 - btnW) / 2;
      Benchmark showcase = BenchmarkRegistry.get("base_fps_showcase").orElse(null);
      if (showcase != null) {
         long showcaseEtaMs = (long)(RunPlan.fromBench(showcase).estimatedSeconds() * 1000.0);
         this.method_37063(
            FlatButton.flatBuilder(
                  class_2561.method_43470(I18n.trf("fpstest.overview.showcase_button", fmtDuration(showcaseEtaMs))), b -> this.runSingle(showcase)
               )
               .dimensions(x, y, btnW, 30)
               .accent(BenchmarkHub.Tab.SHOWCASE.accent)
               .tooltip(class_7919.method_47407(class_2561.method_43470(I18n.tr("fpstest.overview.showcase_tooltip"))))
               .build()
         );
         y += 36;
      }

      long fullEtaMs = totalEtaMs(this.allPlans());
      this.method_37063(
         FlatButton.flatBuilder(
               class_2561.method_43470(I18n.trf("fpstest.overview.full_button", presetLabel(this.preset), fmtDuration(fullEtaMs))), b -> this.runFullSuite()
            )
            .dimensions(x, y, btnW, 26)
            .accent(-7686401)
            .tooltip(
               class_7919.method_47407(
                  class_2561.method_43470(I18n.trf("fpstest.overview.full_tooltip", presetLabel(this.preset).toLowerCase(), fmtDuration(fullEtaMs)))
               )
            )
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
            this.method_37063(
               FlatButton.flatBuilder(
                     class_2561.method_43470(I18n.trf("fpstest.overview.run_all", catLabel(cat), list.size(), fmtDuration(catEta))), b -> this.runCategory(cat)
                  )
                  .dimensions(x, y, btnW, 22)
                  .accent(this.accentForCategory(cat))
                  .tooltip(
                     class_7919.method_47407(
                        class_2561.method_43470(
                           I18n.trf(
                              "fpstest.overview.run_all_tooltip",
                              list.size(),
                              String.join(", ", list.stream().map(Benchmark::displayName).toList()),
                              fmtDuration(catEta)
                           )
                        )
                     )
                  )
                  .build()
            );
            y += 26;
         }
      }
   }

   private List<RunPlan> allPlans() {
      List<RunPlan> out = new ArrayList<>();

      for (String cat : this.orderedCategories()) {
         if (!"Showcase".equals(cat)) {
            for (Benchmark b : BenchmarkRegistry.byCategory(cat)) {
               out.add(this.planFor(b));
            }
         }
      }

      return out;
   }

   private RunPlan planFor(Benchmark b) {
      return b.fixedDuration() ? RunPlan.fromBench(b) : this.preset.factory.apply(b);
   }

   private static long totalEtaMs(List<RunPlan> plans) {
      double s = 0.0;

      for (RunPlan p : plans) {
         s += p.estimatedSeconds();
      }

      return (long)(s * 1000.0);
   }

   static String fmtDuration(long ms) {
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

   private List<String> orderedCategories() {
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

   private void buildCategory(BenchmarkHub.Tab tab) {
      String category = categoryFor(tab);
      List<Benchmark> list = BenchmarkRegistry.byCategory(category);
      int runAllW = 320;
      int runAllX = (this.field_22789 - runAllW) / 2;
      int runAllY = this.contentTop() + 22;
      long catEta = totalEtaMs(list.stream().map(this::planFor).toList());
      this.method_37063(
         FlatButton.flatBuilder(
               class_2561.method_43470(I18n.trf("fpstest.category.run_all", catLabel(category), list.size(), presetLabel(this.preset), fmtDuration(catEta))),
               bx -> this.runCategory(category)
            )
            .dimensions(runAllX, runAllY, runAllW, 22)
            .accent(tab.accent)
            .tooltip(class_7919.method_47407(class_2561.method_43470(I18n.trf("fpstest.tooltip.eta", fmtDuration(catEta)))))
            .build()
      );
      int listTop = runAllY + 30;
      int avail = this.contentBottom() - listTop;
      int visible = Math.max(1, avail / 28);
      int maxScroll = Math.max(0, list.size() - visible);
      if (this.scroll > maxScroll) {
         this.scroll = maxScroll;
      }

      int right = this.field_22789 - 16;

      for (int i = 0; i < Math.min(visible, list.size() - this.scroll); i++) {
         Benchmark b = list.get(this.scroll + i);
         int rowY = listTop + i * 28;
         long etaMs = (long)(this.preset.factory.apply(b).estimatedSeconds() * 1000.0);
         this.method_37063(
            FlatButton.flatBuilder(class_2561.method_43470(I18n.trf("fpstest.row.run", fmtDuration(etaMs))), btn -> this.runSingle(b))
               .dimensions(right - 168, rowY + 3, 80, 20)
               .accent(tab.accent)
               .tooltip(
                  class_7919.method_47407(
                     class_2561.method_43470(
                        I18n.trf("fpstest.row.tooltip", b.description(), b.seed(), presetLabel(this.preset), presetDesc(this.preset), fmtDuration(etaMs))
                     )
                  )
               )
               .build()
         );
         this.method_37063(
            FlatButton.flatBuilder(
                  I18n.t(this.customQueue.contains(b.id()) ? "fpstest.button.queued_check" : "fpstest.button.queue_plus"), btn -> this.toggleQueued(b)
               )
               .dimensions(right - 84, rowY + 3, 76, 20)
               .tooltip(class_7919.method_47407(I18n.t("fpstest.row.queue_tooltip")))
               .build()
         );
      }
   }

   private void buildCustom() {
      int top = this.contentTop() + 32;
      long queueEta = totalEtaMs(this.customQueuePlans());
      this.method_37063(
         FlatButton.flatBuilder(
               class_2561.method_43470(I18n.trf("fpstest.custom.run_queue", presetLabel(this.preset), this.customQueue.size(), fmtDuration(queueEta))),
               bx -> this.runCustomQueue()
            )
            .dimensions(this.field_22789 / 2 - 220, top, 220, 22)
            .accent(-3355444)
            .tooltip(
               class_7919.method_47407(
                  class_2561.method_43470(this.customQueue.isEmpty() ? I18n.tr("fpstest.custom.empty") : I18n.trf("fpstest.tooltip.eta", fmtDuration(queueEta)))
               )
            )
            .build()
      );
      this.method_37063(FlatButton.flatBuilder(I18n.t("fpstest.button.clear_queue"), bx -> {
         this.customQueue.clear();
         this.rebuildAll();
      }).dimensions(this.field_22789 / 2 + 6, top, 110, 22).build());
      int listTop = top + 30;
      int avail = this.contentBottom() - listTop;
      int visible = Math.max(1, avail / 28);
      List<Benchmark> all = new ArrayList<>(BenchmarkRegistry.all().values());
      int maxScroll = Math.max(0, all.size() - visible);
      if (this.scroll > maxScroll) {
         this.scroll = maxScroll;
      }

      int right = this.field_22789 - 16;

      for (int i = 0; i < Math.min(visible, all.size() - this.scroll); i++) {
         Benchmark b = all.get(this.scroll + i);
         int rowY = listTop + i * 28;
         this.method_37063(
            FlatButton.flatBuilder(
                  I18n.t(this.customQueue.contains(b.id()) ? "fpstest.button.in_queue" : "fpstest.button.add_to_queue"), btn -> this.toggleQueued(b)
               )
               .dimensions(right - 88, rowY + 3, 80, 20)
               .accent(this.accentForCategory(b.category()))
               .build()
         );
      }
   }

   public boolean method_25401(double mouseX, double mouseY, double deltaX, double deltaY) {
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
      class_310 mc = class_310.method_1551();
      this.startWithConfirm(mc, List.of(this.planFor(b)), b.displayName(), () -> FpsTestClient.RUNNER.startSingle(this.planFor(b), this.backToHub(mc)));
   }

   private void runCategory(String cat) {
      class_310 mc = class_310.method_1551();
      List<RunPlan> plans = BenchmarkRegistry.byCategory(cat).stream().map(this::planFor).toList();
      String label = catLabel(cat) + " (" + presetLabel(this.preset) + ")";
      this.startWithConfirm(mc, plans, label, () -> FpsTestClient.RUNNER.startQueue(plans, label, this.backToHub(mc)));
   }

   private void runFullSuite() {
      class_310 mc = class_310.method_1551();
      List<RunPlan> plans = this.allPlans();
      String label = I18n.trf("fpstest.label.full", presetLabel(this.preset));
      this.startWithConfirm(mc, plans, label, () -> FpsTestClient.RUNNER.startQueue(plans, label, this.backToHub(mc)));
   }

   private void runCustomQueue() {
      class_310 mc = class_310.method_1551();
      List<RunPlan> plans = this.customQueuePlans();
      if (!plans.isEmpty()) {
         String label = I18n.trf("fpstest.label.custom", presetLabel(this.preset));
         this.startWithConfirm(mc, plans, label, () -> FpsTestClient.RUNNER.startQueue(plans, label, this.backToHub(mc)));
      }
   }

   private void startWithConfirm(class_310 mc, List<RunPlan> plans, String label, Runnable launcher) {
      long etaMs = totalEtaMs(plans);
      List<String> heavy = plans.stream().map(p -> p.bench).filter(Benchmark::heavy).map(Benchmark::displayName).distinct().toList();
      boolean longRun = etaMs >= 1800000L;
      if (heavy.isEmpty() && !longRun) {
         launcher.run();
      } else {
         String heavyList = String.join("\n  • ", heavy);
         String body;
         if (!heavy.isEmpty() && longRun) {
            body = I18n.trf("fpstest.confirm.long_heavy", fmtDuration(etaMs), heavyList);
         } else if (longRun) {
            body = I18n.trf("fpstest.confirm.long_run", fmtDuration(etaMs));
         } else {
            body = I18n.trf("fpstest.confirm.heavy_only", heavyList);
         }

         mc.method_1507(
            new class_410(
               ok -> {
                  if (ok) {
                     launcher.run();
                  } else {
                     mc.method_1507(this);
                  }
               },
               class_2561.method_43470(I18n.trf("fpstest.confirm.title_with", label)),
               class_2561.method_43470(body),
               I18n.t("fpstest.confirm.run"),
               I18n.t("fpstest.confirm.cancel")
            )
         );
      }
   }

   private List<RunPlan> customQueuePlans() {
      return this.customQueue.stream().map(id -> BenchmarkRegistry.get(id).orElse(null)).filter(x -> x != null).map(this::planFor).toList();
   }

   private Runnable backToHub(class_310 mc) {
      class_437 p = this.parent;
      return () -> mc.method_1507(new BenchmarkHub(p));
   }

   private void cancelRunning() {
      if (FpsTestClient.RUNNER.busy()) {
         FpsTestClient.RUNNER.abortAll("canceled by user (hub)");
         this.rebuildAll();
      }
   }

   public void method_25394(class_332 ctx, int mouseX, int mouseY, float partialTicks) {
      boolean busyNow = FpsTestClient.RUNNER.busy();
      if (busyNow != this.lastBusy) {
         this.rebuildAll();
      }

      this.method_25420(ctx, mouseX, mouseY, partialTicks);
      int cardL = 4;
      int cardR = this.field_22789 - 4;
      int contentTop = this.contentTop();
      int contentBot = this.contentBottom() + 6;
      ctx.method_25294(cardL, contentTop - 4, cardR, contentBot, -938470376);
      ctx.method_25294(cardL, contentTop - 4, cardR, contentTop - 3, 1090519039);
      ctx.method_25294(cardL, contentBot - 1, cardR, contentBot, 1090519039);
      ctx.method_25294(cardL, contentTop - 4, cardL + 1, contentBot, 1090519039);
      ctx.method_25294(cardR - 1, contentTop - 4, cardR, contentBot, 1090519039);
      this.drawActiveTabAccent(ctx);
      super.method_25394(ctx, mouseX, mouseY, partialTicks);
      String title = "§l" + I18n.tr("fpstest.title") + "§r §8— " + I18n.tr("fpstest.subtitle");
      int avail = Math.max(40, this.headerRightEdge - 8 - 4);
      if (this.field_22793.method_1727(title) > avail) {
         title = "§l" + I18n.tr("fpstest.title");
      }

      ctx.method_25303(this.field_22793, title, 8, 10, -1);
      this.renderContent(ctx, mouseX, mouseY);
      this.renderFooter(ctx);
   }

   private void drawActiveTabAccent(class_332 ctx) {
      if (this.activeTabRect != null) {
         int x = this.activeTabRect[0];
         int y = this.activeTabRect[1] + 26;
         int w = this.activeTabRect[2];
         ctx.method_25294(x, y, x + w, y + 2, this.active.accent);
      }
   }

   private void renderContent(class_332 ctx, int mouseX, int mouseY) {
      switch (this.active) {
         case OVERVIEW:
            ctx.method_25303(this.field_22793, "§l" + I18n.tr("fpstest.tab.overview"), 12, this.contentTop() + 6, -1);
            ctx.method_25303(this.field_22793, "§7" + I18n.tr("fpstest.overview.body"), 12, this.contentTop() + 18, -5592406);
            break;
         case CUSTOM:
            ctx.method_25303(
               this.field_22793,
               "§l" + I18n.tr("fpstest.tab.custom") + " §8(" + I18n.trf("fpstest.custom.count", this.customQueue.size()) + ")",
               12,
               this.contentTop() + 6,
               -1
            );
            ctx.method_25303(this.field_22793, "§7" + I18n.tr("fpstest.custom.body"), 12, this.contentTop() + 18, -5592406);
            this.renderRowsCustom(ctx, mouseX, mouseY);
            break;
         default:
            this.renderCategoryRows(ctx, mouseX, mouseY);
      }
   }

   private void renderCategoryRows(class_332 ctx, int mouseX, int mouseY) {
      String category = categoryFor(this.active);
      List<Benchmark> list = BenchmarkRegistry.byCategory(category);
      ctx.method_25303(
         this.field_22793,
         "§l" + catLabel(category) + " §8(" + I18n.trf("fpstest.category.heading_meta", list.size(), presetLabel(this.preset)) + ")",
         12,
         this.contentTop() + 6,
         -1
      );
      int listTop = this.contentTop() + 22 + 30;
      int avail = this.contentBottom() - listTop;
      int visible = Math.max(1, avail / 28);
      int left = 12;
      int right = this.field_22789 - 16;

      for (int i = 0; i < Math.min(visible, list.size() - this.scroll); i++) {
         Benchmark b = list.get(this.scroll + i);
         int rowY = listTop + i * 28;
         int rowR = right - 172;
         int hovered = mouseY >= rowY && mouseY < rowY + 28 - 2 && mouseX >= left && mouseX < right ? 1 : 0;
         ctx.method_25294(left, rowY, right, rowY + 28 - 2, hovered == 1 ? 1713548031 : 1073741824);
         ctx.method_25294(left, rowY, left + 3, rowY + 28 - 2, this.active.accent);
         int textMaxW = right - 176 - (left + 8);
         String label = (b.heavy() ? "§e⚠ §f" : "§f") + b.displayName();
         ctx.method_25303(this.field_22793, this.field_22793.method_27523(label, textMaxW), left + 8, rowY + 4, -1);
         String desc = "§8seed " + b.seed() + " · " + b.description();
         ctx.method_25303(this.field_22793, this.field_22793.method_27523(desc, textMaxW), left + 8, rowY + 14, -5592406);
      }

      if (list.size() > visible) {
         ctx.method_25303(
            this.field_22793,
            "§8" + I18n.trf("fpstest.row.scroll_hint", Math.min(this.scroll + visible, list.size()), list.size()),
            this.field_22789 - 130,
            this.contentBottom() + 8,
            -7829368
         );
      }
   }

   private void renderRowsCustom(class_332 ctx, int mouseX, int mouseY) {
      List<Benchmark> all = new ArrayList<>(BenchmarkRegistry.all().values());
      int listTop = this.contentTop() + 32 + 30;
      int avail = this.contentBottom() - listTop;
      int visible = Math.max(1, avail / 28);
      int left = 12;
      int right = this.field_22789 - 16;

      for (int i = 0; i < Math.min(visible, all.size() - this.scroll); i++) {
         Benchmark b = all.get(this.scroll + i);
         int rowY = listTop + i * 28;
         int hovered = mouseY >= rowY && mouseY < rowY + 28 - 2 && mouseX >= left && mouseX < right ? 1 : 0;
         ctx.method_25294(left, rowY, right, rowY + 28 - 2, hovered == 1 ? 1713548031 : 1073741824);
         int accent = this.accentForCategory(b.category());
         ctx.method_25294(left, rowY, left + 3, rowY + 28 - 2, accent);
         int textMaxW = right - 96 - (left + 8);
         String label = (b.heavy() ? "§e⚠ §f" : "§f") + b.displayName();
         ctx.method_25303(this.field_22793, this.field_22793.method_27523(label, textMaxW), left + 8, rowY + 4, -1);
         String desc = "§7" + b.category() + " §8· seed " + b.seed();
         ctx.method_25303(this.field_22793, this.field_22793.method_27523(desc, textMaxW), left + 8, rowY + 14, -5592406);
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
         default -> "—";
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

   private void renderFooter(class_332 ctx) {
      CinematicRunner r = FpsTestClient.RUNNER;
      int y = this.field_22790 - 22;
      int x = 8;
      int w = this.field_22789 - 16;
      ctx.method_25294(x, y, x + w, y + 18, -1073741824);
      ctx.method_25294(x, y, x + w, y + 1, 1090519039);
      if (r.busy()) {
         int dot = this.phaseColor(r.state().name());
         ctx.method_25294(x + 6, y + 6, x + 12, y + 12, dot);
         String label = "§f"
            + I18n.tr("fpstest.footer.running")
            + ": §b"
            + (r.current() == null ? "—" : r.current().displayName())
            + " §7[§f"
            + CinematicRunner.stateLabel(r.state())
            + "§7] §7"
            + r.phaseTicks()
            + "t";
         int textMaxW = x + w - 96 - (x + 18);
         ctx.method_25303(this.field_22793, this.field_22793.method_27523(label, Math.max(20, textMaxW)), x + 18, y + 5, 16777215);
      } else {
         ctx.method_25294(x + 6, y + 6, x + 12, y + 12, -10048769);
         ctx.method_25303(this.field_22793, "§7" + I18n.tr("fpstest.footer.ready"), x + 18, y + 5, -5592406);
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
