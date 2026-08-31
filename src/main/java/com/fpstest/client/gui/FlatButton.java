package com.fpstest.client.gui;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.narration.NarrationElementOutput;

@Environment(EnvType.CLIENT)
public final class FlatButton extends Button {
    private static final int BG_IDLE = -15065048;
    private static final int BG_HOVER = -14537674;
    private static final int BG_DISABLED = -15723496;
    private static final int OUTLINE = 1090519039;
    private static final int TEXT_IDLE = -2039584;
    private static final int TEXT_HOVER = -1;
    private static final int TEXT_DIS = -9408400;
    private final int accent;

    private FlatButton(int x, int y, int w, int h, Component text, OnPress onPress, int accent) {
        super(x, y, w, h, text, onPress, DEFAULT_NARRATION);
        this.accent = accent;
    }

    public static FlatButton create(int x, int y, int w, int h, Component text, OnPress onPress) {
        return new FlatButton(x, y, w, h, text, onPress, -7686401);
    }

    public static FlatButton withAccent(int x, int y, int w, int h, Component text, OnPress onPress, int accent) {
        return new FlatButton(x, y, w, h, text, onPress, accent);
    }

    @Override
    public void renderContents(GuiGraphics ctx, int mouseX, int mouseY, float delta) {
        int x = this.getX();
        int y = this.getY();
        int w = this.getWidth();
        int h = this.getHeight();
        int bg;
        int textColor;
        if (!this.active) {
            bg = BG_DISABLED;
            textColor = TEXT_DIS;
        } else if (!this.isHovered() && !this.isFocused()) {
            bg = BG_IDLE;
            textColor = TEXT_IDLE;
        } else {
            bg = BG_HOVER;
            textColor = TEXT_HOVER;
        }

        ctx.fill(x, y, x + w, y + h, bg);
        ctx.fill(x, y, x + w, y + 1, OUTLINE);
        ctx.fill(x, y + h - 1, x + w, y + h, OUTLINE);
        ctx.fill(x, y, x + 1, y + h, OUTLINE);
        ctx.fill(x + w - 1, y, x + w, y + h, OUTLINE);
        ctx.fill(x, y, x + 2, y + h, this.accent);
        Font tr = Minecraft.getInstance().font;
        ctx.drawString(tr, this.getMessage(), x + w / 2 - tr.width(this.getMessage()) / 2, y + (h - 8) / 2, textColor);
    }

    @Override
    public void updateWidgetNarration(NarrationElementOutput narrationElementOutput) {
        super.updateWidgetNarration(narrationElementOutput);
    }

    public static Builder flatBuilder(Component text, OnPress onPress) {
        return new Builder(text, onPress);
    }

    @Environment(EnvType.CLIENT)
    public static final class Builder {
        private final Component text;
        private final OnPress onPress;
        private int x;
        private int y;
        private int w;
        private int h;
        private int accent = -7686401;
        private Tooltip tooltip;

        Builder(Component text, OnPress onPress) {
            this.text = text;
            this.onPress = onPress;
        }

        public Builder dimensions(int x, int y, int w, int h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            return this;
        }

        public Builder tooltip(Tooltip tooltip) {
            this.tooltip = tooltip;
            return this;
        }

        public Builder accent(int rgb) {
            this.accent = rgb;
            return this;
        }

        public FlatButton build() {
            FlatButton fb = new FlatButton(this.x, this.y, this.w, this.h, this.text, this.onPress, this.accent);
            if (this.tooltip != null) {
                fb.setTooltip(this.tooltip);
            }
            return fb;
        }
    }
}
