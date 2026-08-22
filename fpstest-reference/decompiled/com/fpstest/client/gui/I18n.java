package com.fpstest.client.gui;

import com.fpstest.client.config.FpsTestConfig;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_5250;

@Environment(EnvType.CLIENT)
public final class I18n {
   private static String currentLocale;
   private static Map<String, String> currentMap = new HashMap<>();

   private I18n() {
   }

   public static String tr(String key) {
      ensureLoaded();
      String v = currentMap.get(key);
      return v != null ? v : key;
   }

   public static String trf(String key, Object... args) {
      String v = tr(key);

      try {
         return String.format(v, args);
      } catch (IllegalFormatException var4) {
         return v;
      }
   }

   public static class_5250 t(String key) {
      return class_2561.method_43470(tr(key));
   }

   private static synchronized void ensureLoaded() {
      String want = pickLocale();
      if (!want.equals(currentLocale)) {
         currentLocale = want;
         currentMap = LangAssets.read(want);
         if (!"en_us".equals(want)) {
            Map<String, String> en = LangAssets.read("en_us");

            for (Entry<String, String> e : en.entrySet()) {
               currentMap.putIfAbsent(e.getKey(), e.getValue());
            }
         }
      }
   }

   private static String pickLocale() {
      FpsTestConfig cfg = FpsTestConfig.get();
      if (cfg.locale != null && !cfg.locale.isBlank()) {
         return aliasIso(cfg.locale).toLowerCase(Locale.ROOT);
      } else {
         try {
            String code = class_310.method_1551().method_1526().method_4669();
            if (code != null && !code.isEmpty()) {
               return code.toLowerCase(Locale.ROOT);
            }
         } catch (Throwable var2) {
         }

         return "en_us";
      }
   }

   private static String aliasIso(String code) {
      String var1 = code.toLowerCase(Locale.ROOT);

      return switch (var1) {
         case "en" -> "en_us";
         case "ru" -> "ru_ru";
         case "uk" -> "uk_ua";
         case "es" -> "es_es";
         case "fr" -> "fr_fr";
         case "de" -> "de_de";
         case "zh" -> "zh_cn";
         case "ja" -> "ja_jp";
         default -> code;
      };
   }
}
