package com.fpstest.client.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class ReportComparator {
   private static final Logger LOG = LoggerFactory.getLogger("fpstest-compare");

   private ReportComparator() {
   }

   public static Path compare(Path a, Path b) throws IOException {
      Map<String, double[]> ra = readCsv(a.resolve("session.csv"));
      Map<String, double[]> rb = readCsv(b.resolve("session.csv"));
      Path outDir = a.getParent().resolve("_compare");
      Files.createDirectories(outDir);
      String tag = a.getFileName().toString() + "_vs_" + b.getFileName().toString();
      Path out = outDir.resolve("compare-" + tag + ".md");
      StringBuilder sb = new StringBuilder();
      sb.append("# FPS Test compare: ").append(a.getFileName()).append(" vs ").append(b.getFileName()).append("\n\n");
      sb.append("| Benchmark | A FPS | B FPS | Δ FPS | A 1% low | B 1% low | A p99 ms | B p99 ms | A tick ms | B tick ms |\n");
      sb.append("|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|\n");
      Set<String> keys = new LinkedHashSet<>();
      keys.addAll(ra.keySet());
      keys.addAll(rb.keySet());

      for (String id : keys) {
         double[] av = ra.get(id);
         double[] bv = rb.get(id);
         sb.append("| ").append(id);
         appendCell(sb, av, 0);
         appendCell(sb, bv, 0);
         sb.append(" | ").append(av != null && bv != null ? fmtSigned(bv[0] - av[0], 1) : "—");
         appendCell(sb, av, 1);
         appendCell(sb, bv, 1);
         appendCell(sb, av, 2);
         appendCell(sb, bv, 2);
         appendCell(sb, av, 3);
         appendCell(sb, bv, 3);
         sb.append(" |\n");
      }

      sb.append("\n## Sources\n\n");
      sb.append("- A: `").append(a).append("`\n");
      sb.append("- B: `").append(b).append("`\n");
      Files.writeString(out, sb.toString());
      LOG.info("[FPS Test] compare written to {}", out);
      return out;
   }

   private static void appendCell(StringBuilder sb, double[] arr, int idx) {
      sb.append(" | ").append(arr == null ? "—" : fmt(arr[idx], 1));
   }

   private static Map<String, double[]> readCsv(Path csv) throws IOException {
      Map<String, double[]> out = new LinkedHashMap<>();
      if (!Files.exists(csv)) {
         return out;
      } else {
         List<String> lines = Files.readAllLines(csv);
         if (lines.size() < 2) {
            return out;
         } else {
            String[] header = parseCsvLine(lines.get(0));
            int idCol = idxOf(header, "id", "benchmark", "Benchmark");
            int fpsCol = idxOf(header, "fps_avg", "fps", "Avg FPS");
            int onePct = idxOf(header, "fps_1pct_low", "1% low");
            int p99 = idxOf(header, "frame_p99_ms", "p99 frame ms", "frame_p99");
            int tick = idxOf(header, "tick_avg_ms", "Tick avg ms", "tick_avg");

            for (int i = 1; i < lines.size(); i++) {
               String[] row = parseCsvLine(lines.get(i));
               if (row.length != 0 && idCol >= 0 && idCol < row.length) {
                  double[] vals = new double[]{col(row, fpsCol), col(row, onePct), col(row, p99), col(row, tick)};
                  out.put(row[idCol], vals);
               }
            }

            return out;
         }
      }
   }

   private static int idxOf(String[] header, String... aliases) {
      for (int i = 0; i < header.length; i++) {
         for (String a : aliases) {
            if (header[i].equalsIgnoreCase(a)) {
               return i;
            }
         }
      }

      return -1;
   }

   private static double col(String[] row, int idx) {
      if (idx >= 0 && idx < row.length) {
         try {
            return Double.parseDouble(row[idx]);
         } catch (NumberFormatException var3) {
            return Double.NaN;
         }
      } else {
         return Double.NaN;
      }
   }

   private static String[] parseCsvLine(String line) {
      List<String> out = new ArrayList<>();
      StringBuilder cur = new StringBuilder();
      boolean inQ = false;

      for (int i = 0; i < line.length(); i++) {
         char c = line.charAt(i);
         if (inQ) {
            if (c == '"') {
               if (i + 1 < line.length() && line.charAt(i + 1) == '"') {
                  cur.append('"');
                  i++;
               } else {
                  inQ = false;
               }
            } else {
               cur.append(c);
            }
         } else if (c == '"') {
            inQ = true;
         } else if (c == ',') {
            out.add(cur.toString());
            cur.setLength(0);
         } else {
            cur.append(c);
         }
      }

      out.add(cur.toString());
      return out.toArray(new String[0]);
   }

   private static String fmt(double d, int prec) {
      return Double.isNaN(d) ? "—" : String.format(Locale.ROOT, "%." + prec + "f", d);
   }

   private static String fmtSigned(double d, int prec) {
      return Double.isNaN(d) ? "—" : (d >= 0.0 ? "+" : "") + String.format(Locale.ROOT, "%." + prec + "f", d);
   }
}
