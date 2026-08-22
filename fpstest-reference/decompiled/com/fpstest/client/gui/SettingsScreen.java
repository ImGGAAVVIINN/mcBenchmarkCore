package com.fpstest.client.gui;

import com.fpstest.client.config.FpsTestConfig;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_437;
import net.minecraft.class_7919;

@Environment(EnvType.CLIENT)
public final class SettingsScreen extends class_437 {
   private static final String[] LOCALE_OPTIONS = new String[]{null, "en_us", "ru_ru", "uk_ua", "es_es", "fr_fr", "de_de", "zh_cn", "ja_jp"};
   private final class_437 parent;

   public SettingsScreen(class_437 parent) {
      super(I18n.t("fpstest.settings.title"));
      this.parent = parent;
   }

   protected void method_25426() {
      this.rebuild();
   }

   private void rebuild() {
      this.method_37067();
      FpsTestConfig cfg = FpsTestConfig.get();
      int w = 280;
      int x = (this.field_22789 - w) / 2;
      int y = Math.max(48, this.field_22790 / 2 - 80);
      int rowH = 28;
      this.addRow(x, y, w, I18n.tr("fpstest.settings.hud_anchor"), I18n.tr(cfg.hudAnchor.labelKey()), () -> {
         cfg.hudAnchor = cfg.hudAnchor.next();
         cfg.save();
         this.rebuild();
      });
      y += rowH;
      this.addRow(x, y, w, I18n.tr("fpstest.settings.hud_compact"), cfg.hudCompact ? I18n.tr("fpstest.settings.on") : I18n.tr("fpstest.settings.off"), () -> {
         cfg.hudCompact = !cfg.hudCompact;
         cfg.save();
         this.rebuild();
      });
      y += rowH;
      this.addRow(
         x, y, w, I18n.tr("fpstest.settings.completion_sound"), cfg.completionSound ? I18n.tr("fpstest.settings.on") : I18n.tr("fpstest.settings.off"), () -> {
            cfg.completionSound = !cfg.completionSound;
            cfg.save();
            this.rebuild();
         }
      );
      y += rowH;
      this.addRow(x, y, w, I18n.tr("fpstest.settings.locale"), cfg.locale == null ? I18n.tr("fpstest.settings.locale.auto") : cfg.locale, () -> {
         cfg.locale = nextLocale(cfg.locale);
         cfg.save();
         this.rebuild();
      });
      y += rowH + 8;
      this.method_37063(FlatButton.flatBuilder(I18n.t("fpstest.settings.back"), b -> this.method_25419()).dimensions(x, y, w, 22).build());
   }

   private void addRow(int x, int y, int w, String label, String value, Runnable onClick) {
      int btnW = 110;
      int labelW = w - btnW - 4;
      FlatButton btn = FlatButton.flatBuilder(class_2561.method_43470(value), b -> onClick.run())
         .dimensions(x + labelW + 4, y, btnW, 22)
         .tooltip(class_7919.method_47407(class_2561.method_43470(label)))
         .build();
      this.method_37063(btn);
      this.method_37060((ctx, mx, my, dt) -> ctx.method_27535(this.field_22793, class_2561.method_43470(label), x, y + 7, -3355444));
   }

   private static String nextLocale(String cur) {
      for (int i = 0; i < LOCALE_OPTIONS.length; i++) {
         if (Objects.equals(LOCALE_OPTIONS[i], cur)) {
            return LOCALE_OPTIONS[(i + 1) % LOCALE_OPTIONS.length];
         }
      }

      return null;
   }

   public void method_25419() {
      this.field_22787.method_1507(this.parent);
   }
}
