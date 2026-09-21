package com.fpstest.client.gui;

import com.fpstest.client.config.FpsTestConfig;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.client.gui.tooltip.Tooltip;

@Environment(EnvType.CLIENT)
public final class SettingsScreen extends Screen {
    private static final String[] LOCALE_OPTIONS = new String[]{null, "en_us", "ru_ru", "uk_ua", "es_es", "fr_fr", "de_de", "zh_cn", "ja_jp"};
    private final Screen parent;

    public SettingsScreen(Screen parent) {
        super(I18n.t("fpstest.settings.title"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        this.rebuild();
    }

    private void rebuild() {
        this.clearChildren();
        FpsTestConfig cfg = FpsTestConfig.get();
        int w = 280;
        int x = (this.width - w) / 2;
        int y = Math.max(48, this.height / 2 - 80);
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
        this.addDrawableChild(FlatButton.flatBuilder(I18n.t("fpstest.settings.back"), b -> this.close()).dimensions(x, y, w, 22).build());
    }

    private void addRow(int x, int y, int w, String label, String value, Runnable onClick) {
        int btnW = 110;
        int labelW = w - btnW - 4;
        FlatButton btn = FlatButton.flatBuilder(Text.literal(value), b -> onClick.run())
            .dimensions(x + labelW + 4, y, btnW, 22)
            .tooltip(Tooltip.of(Text.literal(label)))
            .build();
        this.addDrawableChild(btn);
        this.addDrawable((ctx, mx, my, dt) -> ctx.drawTextWithShadow(this.textRenderer, Text.literal(label), x, y + 7, -3355444));
    }

    private static String nextLocale(String cur) {
        for (int i = 0; i < LOCALE_OPTIONS.length; i++) {
            if (Objects.equals(LOCALE_OPTIONS[i], cur)) {
                return LOCALE_OPTIONS[(i + 1) % LOCALE_OPTIONS.length];
            }
        }

        return null;
    }

    @Override
    public void close() {
        this.client.setScreen(this.parent);
    }

    @Override
    public void render(DrawContext guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        // The widgets handle their own rendering
    }
}