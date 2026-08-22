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
import net.minecraft.class_124;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class PerfHud {
   public void render(class_332 ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.busy()) {
         class_310 mc = class_310.method_1551();
         if (!mc.field_1690.field_1842) {
            class_327 font = mc.field_1772;
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
            class_124 fpsColor = fps >= 60.0 ? class_124.field_1060 : (fps >= 30.0 ? class_124.field_1054 : class_124.field_1061);
            Benchmark cur = runner.current();
            RunPlan plan = runner.currentPlan();
            CinematicRunner.State st = runner.state();
            if (!compact) {
               lines.add("§r§l[" + I18n.tr("fpstest.hud.title") + "]");
            }

            lines.add("§b▶ " + (cur == null ? "—" : cur.displayName()));
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
               if (mc.field_1687 != null) {
                  String chunkPart = st == CinematicRunner.State.CHUNK_PRELOAD
                     ? "   " + I18n.tr("fpstest.hud.loading_chunks") + " " + runner.preloadedChunks()
                     : "";
                  lines.add("§7" + I18n.tr("fpstest.hud.entities") + " " + mc.field_1687.method_18120() + chunkPart);
               }

               lines.add("§8" + I18n.tr("fpstest.hud.abort_hint"));
            } else {
               lines.add("§8ESC = " + I18n.tr("fpstest.hud.abort_short") + "  §8· Shift+ESC = " + I18n.tr("fpstest.hud.abort_all_short"));
            }

            int width = minWidth;

            for (String line : lines) {
               if (!"__bar__".equals(line)) {
                  int w = font.method_1727(line) + 6;
                  if (w > width) {
                     width = w;
                  }
               }
            }

            int totalH = lineH * lines.size() + 4;
            int sw = ctx.method_51421();
            int sh = ctx.method_51443();
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

            ctx.method_25294(x - 2, y - 2, x + width, y + totalH, -1879048192);
            int yy = y;
            int contentLeft = x;
            int contentRight = x + width - 2;

            for (String linex : lines) {
               if ("__bar__".equals(linex)) {
                  int barW = width - 10;
                  int barH = 6;
                  int barX = rightAlign ? contentRight - barW : contentLeft;
                  ctx.method_25294(barX, yy + 1, barX + barW, yy + 1 + barH, -14540254);
                  int filled = totalTicks <= 0 ? 0 : Math.min(barW, (int)((long)barW * curTick / totalTicks));
                  int barColor = st == CinematicRunner.State.SAMPLING
                     ? -11141291
                     : (st == CinematicRunner.State.WARMUP ? -17613 : (st == CinematicRunner.State.CHUNK_PRELOAD ? -11162881 : -5592406));
                  int filledX0 = rightAlign ? barX + barW - filled : barX;
                  ctx.method_25294(filledX0, yy + 1, filledX0 + filled, yy + 1 + barH, barColor);
                  yy += barH + 4;
               } else {
                  int textX = rightAlign ? contentRight - font.method_1727(linex) : contentLeft;
                  ctx.method_25303(font, linex, textX, yy, -1);
                  yy += lineH;
               }
            }
         }
      }
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
