package com.fpstest.client.hud;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.RunPlan;
import com.fpstest.client.config.FpsTestConfig;
import com.fpstest.client.gui.I18n;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Formatting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

@Environment(EnvType.CLIENT)
public final class PerfHud {
   private long lastUsageLogMs = 0L;

   public void render(DrawContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.busy()) {
         MinecraftClient mc = MinecraftClient.getInstance();
         if (!mc.options.hudHidden) {
            TextRenderer font = mc.textRenderer;
            FpsTestConfig cfg = FpsTestConfig.get();
            boolean compact = cfg.hudCompact;
            double fps = FpsTestClient.FPS.smoothedFps();
            double frameMs = FpsTestClient.FPS.lastFrameMs();
            double tickMs = FpsTestClient.TICKS.smoothedTickMs();
            long usedMb = FpsTestClient.MEMORY.usedBytes() / 1048576L;
            long maxMb = Math.max(1L, FpsTestClient.MEMORY.maxBytes() / 1048576L);
            int gcCount = FpsTestClient.MEMORY.gcCount();
            int lineH = 10;
            int minWidth = compact ? 180 : 240;
            List<String> lines = new ArrayList<>();
            Formatting fpsColor = fps >= 60.0 ? Formatting.GREEN : (fps >= 30.0 ? Formatting.YELLOW : Formatting.RED);
            Benchmark cur = runner.current();
            RunPlan plan = runner.currentPlan();
            CinematicRunner.State st = runner.state();
            if (!compact) {
               lines.add("§r§l" + I18n.tr("fpstest.hud.title"));
            }

            if (runner.hasParts()) {
                lines.add("§b▶ " + I18n.tr("fpstest.hud.part") + " " + runner.currentPartNumber() + " - " + runner.currentPartLabel());
                if (!compact) {
                    lines.add("§7  " + (cur == null ? "—" : cur.displayName()));
                }
            } else {
                lines.add("§b▶ " + (cur == null ? "—" : cur.displayName()));
            }
            if (runner.totalQueued() > 1 && !compact) {
               lines.add(
                  "§7" + I18n.tr("fpstest.hud.queue") + ": " + (runner.completedInQueue() + 1) + " / " + runner.totalQueued() + "   " + runner.sessionLabel()
               );
            }

            int totalTicks = this.phaseTotal(st, plan, cur);
            int curTick = runner.phaseTicks();
            long elapsedMs = curTick * 50L;
            String eta = totalTicks > 0 ? "  " + fmtMmSs(elapsedMs) + " / " + fmtMmSs(totalTicks * 50L) : "";
            lines.add("§3" + CinematicRunner.stateLabel(st) + "   " + curTick + " / " + totalTicks + eta);
            lines.add("__bar__");
            lines.add(fpsColor + String.format("FPS %.1f   frame %.2f ms", fps, frameMs));
            if (!compact) {
               lines.add(String.format("§7tick %.2f ms (client)", tickMs));
               lines.add(String.format("§7heap %d / %d MB   GC %d", usedMb, maxMb, gcCount));
               if (mc.world != null) {
                  String chunkPart = st == CinematicRunner.State.CHUNK_PRELOAD
                     ? "   " + I18n.tr("fpstest.hud.loading_chunks") + " " + runner.preloadedChunks()
                     : "";
                  lines.add("§7" + I18n.tr("fpstest.hud.entities") + " " + mc.world.getRegularEntityCount() + chunkPart);
               }

               lines.add("§8" + I18n.tr("fpstest.hud.abort_hint"));
            } else {
               lines.add("§8ESC = " + I18n.tr("fpstest.hud.abort_short") + "  §8· Shift+ESC = " + I18n.tr("fpstest.hud.abort_all_short"));
            }

            int width = minWidth;

            for (String line : lines) {
               if (!"__bar__".equals(line)) {
                  int w = font.getWidth(line) + 6;
                  if (w > width) {
                     width = w;
                  }
               }
            }

            // Reserve room inside the box for the live CPU / GPU / RAM usage
            // column (non-compact HUDs only, and only while a world is loaded
            // so the entities row exists to align against).
            boolean drawUsage = !compact && mc.world != null;
            int usageColW = drawUsage ? this.usageColumnWidth(font) : 0;
            if (drawUsage) {
               width += 6 + usageColW;
            }

            int totalH = lineH * lines.size() + 4;
            int sw = ctx.getScaledWindowWidth();
            int sh = ctx.getScaledWindowHeight();
            int topMargin = 4;
            int bottomMargin = 26;
            int sideMargin = 4;
            int x;
            int y;
            boolean rightAlign;
            switch (cfg.hudAnchor) {
               case TOP_RIGHT:
                  x = sw - width - sideMargin;
                  y = topMargin;
                  rightAlign = true;
                  break;
               case BOTTOM_LEFT:
                  x = sideMargin;
                  y = sh - totalH - bottomMargin;
                  rightAlign = false;
                  break;
               case BOTTOM_RIGHT:
                  x = sw - width - sideMargin;
                  y = sh - totalH - bottomMargin;
                  rightAlign = true;
                  break;
               default:
                  x = sideMargin;
                  y = topMargin;
                  rightAlign = false;
            }

            ctx.fill(x - 2, y - 2, x + width, y + totalH, -1879048192);
            int yy = y;
            int contentLeft = x;
            int contentRight = x + width - 2;

            // Live system usage column (non-compact only): CPU / GPU / RAM
            // percentages, drawn just outside the box to the right (or to the
            // left for right-anchored HUDs). The three values are aligned with
            // the tick, heap/GC and entities rows respectively.
            int usageYyTick = -1;
            int usageYyHeap = -1;
            int usageYyEntities = -1;

            for (String linex : lines) {
               if ("__bar__".equals(linex)) {
                  int barW = width - 10;
                  int barH = 6;
                  int barX = rightAlign ? contentRight - barW : contentLeft;
                  ctx.fill(barX, yy + 1, barX + barW, yy + 1 + barH, -14540254);
                  int filled = totalTicks <= 0 ? 0 : Math.min(barW, (int)((long)barW * curTick / totalTicks));
                  int barColor = st == CinematicRunner.State.SAMPLING
                     ? -11141291
                     : (st == CinematicRunner.State.WARMUP ? -17613 : (st == CinematicRunner.State.CHUNK_PRELOAD ? -11162881 : -5592406));
                  int filledX0 = rightAlign ? barX + barW - filled : barX;
                  ctx.fill(filledX0, yy + 1, filledX0 + filled, yy + 1 + barH, barColor);
                  yy += barH + 4;
               } else {
                  int textX = rightAlign ? contentRight - font.getWidth(linex) : contentLeft;
                  ctx.drawTextWithShadow(font, linex, textX, yy, -1);
                  // Track the vertical row positions of the usage-aligned lines.
                  if (!compact) {
                     if (linex.startsWith("§7tick ")) {
                        usageYyTick = yy;
                     } else if (linex.startsWith("§7heap ")) {
                        usageYyHeap = yy;
                     } else if (linex.startsWith("§7") && linex.contains(I18n.tr("fpstest.hud.entities") + " ")) {
                        usageYyEntities = yy;
                     }
                  }
                  yy += lineH;
               }
            }

            // Draw the CPU / GPU / RAM usage column at the exact row heights of
            // tick / heap / entities, right-aligned INSIDE the box so the
            // values never spill outside the HUD. The values are real
            // in-process measurements ("--" when a metric reports itself
            // unavailable); nothing is ever fabricated.
            if (drawUsage && usageYyTick >= 0 && usageYyHeap >= 0 && usageYyEntities >= 0) {
               int colRight = contentRight - 4;
               this.drawUsageLine(ctx, font, I18n.tr("fpstest.hud.cpu"), FpsTestClient.SYSTEM_USAGE.cpuPercent(), colRight, usageYyTick);
               this.drawUsageLine(ctx, font, I18n.tr("fpstest.hud.gpu"), FpsTestClient.SYSTEM_USAGE.gpuPercent(), colRight, usageYyHeap);
               this.drawUsageLine(ctx, font, I18n.tr("fpstest.hud.ram"), FpsTestClient.SYSTEM_USAGE.ramPercent(), colRight, usageYyEntities);
               this.logUsageOnce(usageYyTick, usageYyHeap, usageYyEntities);
            }
         }
      }
   }

   /**
    * Width of the whole usage column (label + value), used to reserve space so
    * the column never overlaps the box.
    */
   private int usageColumnWidth(TextRenderer font) {
      int w = 0;
      for (String label : new String[]{"CPU", "GPU", "RAM"}) {
         w = Math.max(w, font.getWidth(label + " 100%"));
      }
      return w + 2;
   }

   private void drawUsageLine(DrawContext ctx, TextRenderer font, String label, double value, int columnRightX, int yy) {
      String text;
      if (value < 0.0) {
         text = label + " --";
      } else {
         text = label + " " + usageColor(value) + (int)Math.round(value) + "%";
      }
      ctx.drawTextWithShadow(font, text, columnRightX - font.getWidth(text), yy, -1);
   }

   /**
    * Color for a live usage percentage: green below 60%, yellow at 60-79%,
    * gold at 80-89%, red at 90-95%, dark red above 95%. The gray "--"
    * placeholder (metric unavailable) stays gray.
    */
   private Formatting usageColor(double value) {
      if (value > 95.0) {
         return Formatting.DARK_RED;
      } else if (value >= 90.0) {
         return Formatting.RED;
      } else if (value >= 80.0) {
         return Formatting.GOLD;
      } else if (value >= 60.0) {
         return Formatting.YELLOW;
      } else {
         return Formatting.GREEN;
      }
   }

   /**
    * Best-effort, throttled log of the exact values being drawn in the usage
    * column (about once every 10 seconds while the HUD is rendering). This is
    * used to verify the live sampled values from the running client without
    * relying on screen scraping.
    */
   private void logUsageOnce(int tickYy, int heapYy, int entitiesYy) {
      long now = System.currentTimeMillis();
      if (now - this.lastUsageLogMs < 10000L) {
         return;
      }
      this.lastUsageLogMs = now;
      double cpu = FpsTestClient.SYSTEM_USAGE.cpuPercent();
      double gpu = FpsTestClient.SYSTEM_USAGE.gpuPercent();
      double ram = FpsTestClient.SYSTEM_USAGE.ramPercent();
      String cpuS = cpu < 0.0 ? "--" : String.valueOf((int)Math.round(cpu));
      String gpuS = gpu < 0.0 ? "--" : String.valueOf((int)Math.round(gpu));
      String ramS = ram < 0.0 ? "--" : String.valueOf((int)Math.round(ram));
      FpsTestClient.LOG.info(
         "[HUD] usage column — CPU {}% GPU {}% RAM {}% (tickY={} heapY={} entitiesY={})",
         cpuS, gpuS, ramS, tickYy, heapYy, entitiesYy
      );
   }

   private int phaseTotal(CinematicRunner.State state, RunPlan plan, Benchmark cur) {
      if (plan == null) {
         if (cur == null) {
            return 0;
         } else {
            return switch (state) {
               case WARMUP -> cur.warmupTicks();
               case SAMPLING -> cur.sampleTicks();
               case COOLDOWN -> cur.cooldownTicks();
               case CHUNK_PRELOAD -> cur.preloadTicks();
               default -> 0;
            };
         }
      } else {
         return switch (state) {
            case WARMUP -> plan.warmupTicks;
            case SAMPLING -> plan.sampleTicks;
            case COOLDOWN -> plan.cooldownTicks;
            case CHUNK_PRELOAD -> plan.preloadTicks;
            default -> 0;
         };
      }
   }

   private static String fmtMmSs(long ms) {
      long s = Math.max(0L, ms / 1000L);
      return String.format("%d:%02d", s / 60L, s % 60L);
   }
}
