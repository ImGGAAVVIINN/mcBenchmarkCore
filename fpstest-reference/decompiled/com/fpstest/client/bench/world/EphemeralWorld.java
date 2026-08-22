package com.fpstest.client.bench.world;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.WorldType;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1267;
import net.minecraft.class_1928;
import net.minecraft.class_1934;
import net.minecraft.class_1940;
import net.minecraft.class_1959;
import net.minecraft.class_1972;
import net.minecraft.class_1992;
import net.minecraft.class_2246;
import net.minecraft.class_2378;
import net.minecraft.class_2897;
import net.minecraft.class_310;
import net.minecraft.class_32;
import net.minecraft.class_3229;
import net.minecraft.class_3232;
import net.minecraft.class_3754;
import net.minecraft.class_5284;
import net.minecraft.class_5285;
import net.minecraft.class_5317;
import net.minecraft.class_5321;
import net.minecraft.class_5455;
import net.minecraft.class_6880;
import net.minecraft.class_6885;
import net.minecraft.class_7712;
import net.minecraft.class_7723;
import net.minecraft.class_7924;
import net.minecraft.class_1928.class_4310;
import net.minecraft.class_32.class_5143;
import net.minecraft.class_6880.class_6883;

@Environment(EnvType.CLIENT)
public final class EphemeralWorld {
   public static final String LEVEL_ID = "fpstest-arena";
   private static volatile String currentLevelId = "fpstest-arena";

   private EphemeralWorld() {
   }

   public static String currentLevelId() {
      return currentLevelId;
   }

   public static void create(long seed, WorldType type) {
      class_310 mc = class_310.method_1551();
      String levelId = "fpstest-arena";

      try {
         Path existing = mc.method_1586().method_19636().resolve("fpstest-arena");
         if (Files.exists(existing)) {
            levelId = "fpstest-arena-" + System.currentTimeMillis() / 1000L;
            FpsTestClient.LOG.warn("[FPS Test] using fallback arena name: {} (previous save tree still present)", levelId);
         }
      } catch (Exception var9) {
         FpsTestClient.LOG.debug("[FPS Test] could not probe save dir for fallback name: {}", var9.getMessage());
      }

      currentLevelId = levelId;
      class_1928 rules = new class_1928();
      ((class_4310)rules.method_20746(class_1928.field_19396)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19406)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19388)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19390)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_21832)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_21831)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_20637)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_20634)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_20635)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_20636)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_28044)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19389)).method_20758(true, null);
      ((class_4310)rules.method_20746(class_1928.field_19409)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19400)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19394)).method_20758(false, null);
      ((class_4310)rules.method_20746(class_1928.field_19398)).method_20758(false, null);
      class_1940 settings = new class_1940("FPS Test Arena", class_1934.field_9220, false, class_1267.field_5802, true, rules, class_7712.field_40260);
      class_5285 opts = new class_5285(seed, false, false);
      Function<class_5455, class_7723> dims = ra -> buildDimensions(ra, type);
      FpsTestClient.LOG.info("[FPS Test] creating ephemeral world seed={}, type={}, levelId={}", new Object[]{seed, type.kind, levelId});
      mc.method_41735().method_41895(levelId, settings, opts, dims, null);
   }

   private static class_7723 buildDimensions(class_5455 ra, WorldType type) {
      return switch (type.kind) {
         case OVERWORLD -> class_5317.method_41598(ra);
         case FLAT -> buildFlatDimensions(ra);
         case FIXED_BIOME -> buildFixedBiomeDimensions(ra, type.biome);
      };
   }

   private static class_7723 buildFlatDimensions(class_5455 ra) {
      class_2378<class_1959> biomeRegistry = ra.method_30530(class_7924.field_41236);
      class_6883<class_1959> biomeHolder = biomeRegistry.method_40290(class_1972.field_9451);
      List<class_3229> layers = List.of(
         new class_3229(1, class_2246.field_9987), new class_3229(2, class_2246.field_10566), new class_3229(1, class_2246.field_10219)
      );
      class_3232 flatSettings = new class_3232(Optional.of(class_6885.method_40246(new class_6880[0])), biomeHolder, List.of());
      flatSettings.method_14327().addAll(layers);
      flatSettings.method_14330();
      class_2897 generator = new class_2897(flatSettings);
      class_7723 normal = class_5317.method_41598(ra);
      return normal.method_45522(ra, generator);
   }

   private static class_7723 buildFixedBiomeDimensions(class_5455 ra, class_5321<class_1959> biomeKey) {
      class_2378<class_1959> biomeRegistry = ra.method_30530(class_7924.field_41236);
      class_2378<class_5284> noiseRegistry = ra.method_30530(class_7924.field_41243);
      class_6880<class_1959> biomeHolder = biomeRegistry.method_40290(biomeKey);
      class_6880<class_5284> noiseSettings = noiseRegistry.method_40290(class_5284.field_26355);
      class_1992 source = new class_1992(biomeHolder);
      class_3754 generator = new class_3754(source, noiseSettings);
      class_7723 normal = class_5317.method_41598(ra);
      return normal.method_45522(ra, generator);
   }

   public static void deleteSaveQuietly() {
      deleteSaveCore(false);
   }

   public static void deleteSaveBlocking() {
      deleteSaveCore(true);
   }

   private static void deleteSaveCore(boolean blocking) {
      class_32 src = class_310.method_1551().method_1586();
      Path saveDir = src.method_19636().resolve("fpstest-arena");
      if (!Files.exists(saveDir)) {
         FpsTestClient.LOG.debug("[FPS Test] cleanup: no stale arena directory at {}", saveDir);
      } else {
         try {
            Thread.sleep(200L);
         } catch (InterruptedException var12) {
            Thread.currentThread().interrupt();
            return;
         }

         try {
            class_5143 access = src.method_27002("fpstest-arena");

            try {
               try {
                  access.method_27015();
               } catch (IOException var11) {
               }
            } catch (Throwable var14) {
               if (access != null) {
                  try {
                     access.close();
                  } catch (Throwable var10) {
                     var14.addSuppressed(var10);
                  }
               }

               throw var14;
            }

            if (access != null) {
               access.close();
            }
         } catch (Exception var15) {
            FpsTestClient.LOG.info("[FPS Test] could not open arena session for cleanup ({})", var15.getMessage());
         }

         int maxPasses = blocking ? 3 : 5;
         long passDelayMs = blocking ? 500L : 750L;
         IOException lastError = null;

         for (int pass = 0; pass < maxPasses; pass++) {
            try {
               Files.walkFileTree(saveDir, new SimpleFileVisitor<Path>() {
                  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                     EphemeralWorld.deleteWithRetry(file);
                     return FileVisitResult.CONTINUE;
                  }

                  public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                     EphemeralWorld.deleteWithRetry(dir);
                     return FileVisitResult.CONTINUE;
                  }
               });
               if (!Files.exists(saveDir)) {
                  if (pass > 0) {
                     FpsTestClient.LOG.info("[FPS Test] cleanup succeeded (pass {})", pass + 1);
                  } else {
                     FpsTestClient.LOG.debug("[FPS Test] cleanup succeeded (first pass)");
                  }

                  return;
               }

               lastError = null;
            } catch (IOException var9) {
               lastError = var9;
            }

            try {
               Thread.sleep(passDelayMs);
            } catch (InterruptedException var13) {
               Thread.currentThread().interrupt();
               break;
            }
         }

         if (lastError != null) {
            FpsTestClient.LOG
               .warn(
                  "[FPS Test] cleanup deferred: failed to delete arena save tree at {} after {} passes ({}). Next run will use a fallback arena name; full retry on next FPS Test launch.",
                  new Object[]{saveDir, maxPasses, lastError.getMessage()}
               );
         } else if (Files.exists(saveDir)) {
            FpsTestClient.LOG
               .warn(
                  "[FPS Test] cleanup deferred: arena save tree at {} still present after {} passes. Next run will use a fallback arena name; full retry on next FPS Test launch.",
                  saveDir,
                  maxPasses
               );
         }
      }
   }

   public static void cleanupStaleOnStartup() {
      try {
         class_32 src = class_310.method_1551().method_1586();
         Path saveDir = src.method_19636().resolve("fpstest-arena");
         if (!Files.exists(saveDir)) {
            return;
         }

         FpsTestClient.LOG.info("[FPS Test] startup cleanup: stale arena save tree found at {}, removing on background thread", saveDir);
         Thread t = new Thread(EphemeralWorld::deleteSaveQuietly, "FPS Test-arena-startup-cleanup");
         t.setDaemon(true);
         t.start();
      } catch (Throwable var3) {
         FpsTestClient.LOG.warn("[FPS Test] startup cleanup raised an exception, ignoring: {}", var3.getMessage());
      }
   }

   private static void deleteWithRetry(Path p) throws IOException {
      IOException last = null;

      for (int attempt = 0; attempt < 10; attempt++) {
         try {
            Files.deleteIfExists(p);
            return;
         } catch (IOException var6) {
            last = var6;

            try {
               Thread.sleep(250L);
            } catch (InterruptedException var5) {
               Thread.currentThread().interrupt();
               throw var6;
            }
         }
      }

      if (last != null) {
         throw last;
      }
   }
}
