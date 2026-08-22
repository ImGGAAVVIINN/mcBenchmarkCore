package com.fpstest.client.gui;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_6382;
import net.minecraft.class_7919;
import net.minecraft.class_4185.class_4241;

@Environment(EnvType.CLIENT)
public final class FlatButton extends class_4185 {
   private static final int BG_IDLE = -15065048;
   private static final int BG_HOVER = -14537674;
   private static final int BG_DISABLED = -15723496;
   private static final int OUTLINE = 1090519039;
   private static final int TEXT_IDLE = -2039584;
   private static final int TEXT_HOVER = -1;
   private static final int TEXT_DIS = -9408400;
   private final int accent;

   private FlatButton(int x, int y, int w, int h, class_2561 text, class_4241 onPress, int accent) {
      super(x, y, w, h, text, onPress, class_4185.field_40754);
      this.accent = accent;
   }

   public static FlatButton create(int x, int y, int w, int h, class_2561 text, class_4241 onPress) {
      return new FlatButton(x, y, w, h, text, onPress, -7686401);
   }

   public static FlatButton withAccent(int x, int y, int w, int h, class_2561 text, class_4241 onPress, int accent) {
      return new FlatButton(x, y, w, h, text, onPress, accent);
   }

   protected void method_48579(class_332 ctx, int mouseX, int mouseY, float delta) {
      int x = this.method_46426();
      int y = this.method_46427();
      int w = this.method_25368();
      int h = this.method_25364();
      int bg;
      int textColor;
      if (!this.field_22763) {
         bg = -15723496;
         textColor = -9408400;
      } else if (!this.method_49606() && !this.method_25370()) {
         bg = -15065048;
         textColor = -2039584;
      } else {
         bg = -14537674;
         textColor = -1;
      }

      ctx.method_25294(x, y, x + w, y + h, bg);
      ctx.method_25294(x, y, x + w, y + 1, 1090519039);
      ctx.method_25294(x, y + h - 1, x + w, y + h, 1090519039);
      ctx.method_25294(x, y, x + 1, y + h, 1090519039);
      ctx.method_25294(x + w - 1, y, x + w, y + h, 1090519039);
      ctx.method_25294(x, y, x + 2, y + h, this.accent);
      class_327 tr = class_310.method_1551().field_1772;
      ctx.method_27534(tr, this.method_25369(), x + w / 2, y + (h - 8) / 2, textColor);
   }

   public void method_47399(class_6382 builder) {
      this.method_37021(builder);
   }

   public static FlatButton.Builder flatBuilder(class_2561 text, class_4241 onPress) {
      return new FlatButton.Builder(text, onPress);
   }

   @Environment(EnvType.CLIENT)
   public static final class Builder {
      private final class_2561 text;
      private final class_4241 onPress;
      private int x;
      private int y;
      private int w;
      private int h;
      private int accent = -7686401;
      private class_7919 tooltip;

      Builder(class_2561 text, class_4241 onPress) {
         this.text = text;
         this.onPress = onPress;
      }

      public FlatButton.Builder dimensions(int x, int y, int w, int h) {
         this.x = x;
         this.y = y;
         this.w = w;
         this.h = h;
         return this;
      }

      public FlatButton.Builder tooltip(class_7919 tooltip) {
         this.tooltip = tooltip;
         return this;
      }

      public FlatButton.Builder accent(int rgb) {
         this.accent = rgb;
         return this;
      }

      public FlatButton build() {
         FlatButton fb = new FlatButton(this.x, this.y, this.w, this.h, this.text, this.onPress, this.accent);
         if (this.tooltip != null) {
            fb.method_47400(this.tooltip);
         }

         return fb;
      }
   }
}
