package com.fpstest.client.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_424;
import net.minecraft.class_437;
import net.minecraft.class_7919;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class ReportsScreen extends class_437 {
   private static final Logger LOG = LoggerFactory.getLogger("fpstest-reports-screen");
   private final class_437 parent;
   private final Set<String> selected = new LinkedHashSet<>();
   private List<Path> sessions = List.of();
   private int scroll = 0;

   public ReportsScreen(class_437 parent) {
      super(I18n.t("fpstest.reports.title"));
      this.parent = parent;
   }

   protected void method_25426() {
      this.sessions = listSessions();
      this.rebuild();
   }

   private void rebuild() {
      this.method_37067();
      int pad = 8;
      int top = 30;
      int rowH = 22;
      int rowsAvail = Math.max(1, (this.field_22790 - top - 60) / rowH);
      int max = Math.max(0, this.sessions.size() - rowsAvail);
      if (this.scroll > max) {
         this.scroll = max;
      }

      this.method_37063(
         FlatButton.flatBuilder(I18n.t("fpstest.reports.open_root"), b -> openRootInOs())
            .dimensions(this.field_22789 - 330, 4, 100, 20)
            .tooltip(class_7919.method_47407(I18n.t("fpstest.reports.open_root.tooltip")))
            .build()
      );
      FlatButton compareBtn = FlatButton.flatBuilder(I18n.t("fpstest.reports.compare"), b -> this.doCompare())
         .dimensions(this.field_22789 - 220, 4, 100, 20)
         .tooltip(class_7919.method_47407(this.selected.size() == 2 ? I18n.t("fpstest.reports.compare_pick") : I18n.t("fpstest.reports.compare_pick_hint")))
         .build();
      compareBtn.field_22763 = this.selected.size() == 2;
      this.method_37063(compareBtn);
      this.method_37063(
         FlatButton.flatBuilder(I18n.t("fpstest.settings.back"), b -> this.method_25419()).dimensions(this.field_22789 - 110, 4, 100, 20).build()
      );
      if (this.sessions.isEmpty()) {
         this.method_37060(
            (ctx, mx, my, dt) -> ctx.method_25300(this.field_22793, I18n.tr("fpstest.reports.empty"), this.field_22789 / 2, this.field_22790 / 2, -5592406)
         );
      } else {
         for (int i = 0; i < Math.min(rowsAvail, this.sessions.size() - this.scroll); i++) {
            Path p = this.sessions.get(this.scroll + i);
            String name = p.getFileName().toString();
            int rowY = top + i * rowH;
            String btnLbl = (this.selected.contains(name) ? "§l[ ✓ ] " : "[   ] ") + name;
            this.method_37063(
               FlatButton.flatBuilder(class_2561.method_43470(btnLbl), b -> this.toggleSelection(name))
                  .dimensions(pad, rowY, this.field_22789 - 240, 20)
                  .build()
            );
            this.method_37063(
               FlatButton.flatBuilder(I18n.t("fpstest.reports.open"), b -> openInOs(p)).dimensions(this.field_22789 - 220, rowY, 100, 20).build()
            );
         }
      }
   }

   private void toggleSelection(String name) {
      if (this.selected.contains(name)) {
         this.selected.remove(name);
      } else {
         if (this.selected.size() >= 2) {
            String oldest = this.selected.iterator().next();
            this.selected.remove(oldest);
         }

         this.selected.add(name);
      }

      this.rebuild();
   }

   private void doCompare() {
      if (this.selected.size() == 2) {
         List<Path> picks = new ArrayList<>();

         for (String name : this.selected) {
            for (Path p : this.sessions) {
               if (p.getFileName().toString().equals(name)) {
                  picks.add(p);
               }
            }
         }

         if (picks.size() == 2) {
            try {
               Path out = ReportComparator.compare(picks.get(0), picks.get(1));
               this.field_22787.method_1507(new class_424(class_2561.method_43470(String.format(I18n.tr("fpstest.reports.compare_done"), out.toString()))));
               new Thread(() -> {
                  try {
                     Thread.sleep(1200L);
                  } catch (InterruptedException var2) {
                  }

                  this.field_22787.execute(() -> this.field_22787.method_1507(new ReportsScreen(this.parent)));
               }, "fpstest-reports-compare-bounce").start();
            } catch (Throwable var6) {
               LOG.error("[FPS Test] compare failed", var6);
            }
         }
      }
   }

   private static void openInOs(Path p) {
      try {
         Files.createDirectories(p);
      } catch (IOException var2) {
      }

      class_156.method_668().method_672(p.toFile());
   }

   private static void openRootInOs() {
      Path root = class_310.method_1551().field_1697.toPath().resolve("fpstest-reports");

      try {
         Files.createDirectories(root);
      } catch (IOException var2) {
      }

      class_156.method_668().method_672(root.toFile());
   }

   private static List<Path> listSessions() {
      Path root = class_310.method_1551().field_1697.toPath().resolve("fpstest-reports");
      if (!Files.isDirectory(root)) {
         return List.of();
      } else {
         try {
            List var2;
            try (Stream<Path> stream = Files.list(root)) {
               var2 = stream.filter(x$0 -> Files.isDirectory(x$0)).sorted(Comparator.<Path, Instant>comparing(p -> {
                  try {
                     return Files.getLastModifiedTime(p).toInstant();
                  } catch (IOException var2x) {
                     return Instant.EPOCH;
                  }
               }).reversed()).toList();
            }

            return var2;
         } catch (IOException var6) {
            LOG.warn("[FPS Test] listSessions failed", var6);
            return List.of();
         }
      }
   }

   public boolean method_25401(double mx, double my, double dx, double dy) {
      if (dy < 0.0) {
         this.scroll++;
      } else if (dy > 0.0) {
         this.scroll = Math.max(0, this.scroll - 1);
      }

      this.rebuild();
      return true;
   }

   public void method_25419() {
      this.field_22787.method_1507(this.parent);
   }
}
