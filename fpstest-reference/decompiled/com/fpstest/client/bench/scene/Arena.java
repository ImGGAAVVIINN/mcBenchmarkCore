package com.fpstest.client.bench.scene;

import com.fpstest.client.bench.BenchContext;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2246;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_2338.class_2339;

@Environment(EnvType.CLIENT)
public final class Arena {
   private Arena() {
   }

   public static void teleport(BenchContext ctx, class_243 pos, float yaw, float pitch) {
      ctx.onServer(s -> {
         class_3222 p = ctx.serverPlayer();
         class_3218 lvl = ctx.serverLevel();
         if (p != null && lvl != null) {
            p.method_14251(lvl, pos.field_1352, pos.field_1351, pos.field_1350, yaw, pitch);
            p.method_24830(false);
            p.method_5684(true);
            p.method_5648(true);
         }
      });
   }

   public static void stoneSlab(class_3218 lvl, int cx, int cy, int cz, int halfX, int halfZ) {
      fillSlab(lvl, cx, cy, cz, halfX, halfZ, class_2246.field_10340.method_9564());
   }

   public static void bedrockSlab(class_3218 lvl, int cx, int cy, int cz, int halfX, int halfZ) {
      fillSlab(lvl, cx, cy, cz, halfX, halfZ, class_2246.field_9987.method_9564());
   }

   private static void fillSlab(class_3218 lvl, int cx, int cy, int cz, int halfX, int halfZ, class_2680 block) {
      class_2339 p = new class_2339();

      for (int x = -halfX; x <= halfX; x++) {
         for (int z = -halfZ; z <= halfZ; z++) {
            p.method_10103(cx + x, cy, cz + z);
            lvl.method_8652(p, block, 2);
         }
      }
   }

   public static void carveBox(class_3218 lvl, int cx, int cy, int cz, int halfX, int height, int halfZ) {
      class_2680 air = class_2246.field_10124.method_9564();
      class_2339 p = new class_2339();

      for (int y = 1; y <= height; y++) {
         for (int x = -halfX; x <= halfX; x++) {
            for (int z = -halfZ; z <= halfZ; z++) {
               p.method_10103(cx + x, cy + y, cz + z);
               lvl.method_8652(p, air, 2);
            }
         }
      }
   }

   public static void freezeDaytime(BenchContext ctx) {
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            lvl.method_29199(6000L);
         }
      });
   }

   public static void freezeMidnight(BenchContext ctx) {
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            lvl.method_29199(18000L);
         }
      });
   }
}
