package com.fpstest.client.report;

import com.fpstest.client.bench.BenchmarkResult;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_155;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;

@Environment(EnvType.CLIENT)
public final class ReportWriter {
   private ReportWriter() {
   }

   public static Path write(List<BenchmarkResult> results, String sessionId) throws IOException {
      Path base = class_310.method_1551().field_1697.toPath().resolve("fpstest-reports").resolve(sanitize(sessionId));
      Files.createDirectories(base);
      writeJson(base.resolve("report.json"), results);
      writeMarkdown(base.resolve("report.md"), results);
      writeCsv(base.resolve("fps.csv"), results);
      writeSummaryCsv(base.resolve("session.csv"), results);
      writeSystemInfo(base.resolve("system.json"));
      return base;
   }

   private static void writeSummaryCsv(Path file, List<BenchmarkResult> results) throws IOException {
      StringBuilder sb = new StringBuilder();
      sb.append("id,display_name,category,fps_avg,fps_1pct_low,frame_p99_ms,tick_avg_ms,gc_count,heap_delta_mb\n");

      for (BenchmarkResult r : results) {
         double onePct = r.extras().getOrDefault("fps_1pct_low", 0.0);
         long heapDelta = (r.heapPeak() - r.heapUsedStart()) / 1048576L;
         sb.append(r.id())
            .append(',')
            .append(csvQuote(r.displayName()))
            .append(',')
            .append(csvQuote(r.category()))
            .append(',')
            .append(fmt(r.fps().avg(), 3))
            .append(',')
            .append(fmt(onePct, 3))
            .append(',')
            .append(fmt(r.frameTimeMs().p99(), 3))
            .append(',')
            .append(fmt(r.tickTimeMs().avg(), 3))
            .append(',')
            .append(r.gcEvents())
            .append(',')
            .append(heapDelta)
            .append('\n');
      }

      Files.writeString(file, sb.toString(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   }

   private static String csvQuote(String s) {
      if (s == null) {
         return "";
      } else {
         return s.indexOf(44) < 0 && s.indexOf(34) < 0 && s.indexOf(10) < 0 ? s : "\"" + s.replace("\"", "\"\"") + "\"";
      }
   }

   private static String sanitize(String s) {
      return s.replaceAll("[^a-zA-Z0-9._-]", "_");
   }

   private static void writeJson(Path file, List<BenchmarkResult> results) throws IOException {
      try (Writer w = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
         w.write("{\n");
         w.write("  \"generated_at\": \"" + nowIso() + "\",\n");
         w.write("  \"system\": " + systemJson() + ",\n");
         w.write("  \"results\": [\n");

         for (int i = 0; i < results.size(); i++) {
            writeResultJson(w, results.get(i), "    ");
            if (i < results.size() - 1) {
               w.write(",");
            }

            w.write("\n");
         }

         w.write("  ]\n");
         w.write("}\n");
      }
   }

   private static void writeResultJson(Writer w, BenchmarkResult r, String indent) throws IOException {
      w.write(indent + "{\n");
      w.write(indent + "  \"id\": " + jsonStr(r.id()) + ",\n");
      w.write(indent + "  \"display_name\": " + jsonStr(r.displayName()) + ",\n");
      w.write(indent + "  \"category\": " + jsonStr(r.category()) + ",\n");
      w.write(indent + "  \"duration_ms\": " + r.durationMillis() + ",\n");
      w.write(indent + "  \"sample_ticks\": " + r.sampleTicks() + ",\n");
      w.write(indent + "  \"fps\": " + statsJson(r.fps()) + ",\n");
      w.write(indent + "  \"frame_time_ms\": " + statsJson(r.frameTimeMs()) + ",\n");
      w.write(indent + "  \"tick_time_ms\": " + statsJson(r.tickTimeMs()) + ",\n");
      w.write(indent + "  \"heap_used_start\": " + r.heapUsedStart() + ",\n");
      w.write(indent + "  \"heap_used_end\": " + r.heapUsedEnd() + ",\n");
      w.write(indent + "  \"heap_peak\": " + r.heapPeak() + ",\n");
      w.write(indent + "  \"gc_events\": " + r.gcEvents() + ",\n");
      w.write(indent + "  \"gc_time_ms\": " + r.gcTimeMs() + ",\n");
      w.write(indent + "  \"extras\": " + mapJson(r.extras()) + ",\n");
      w.write(indent + "  \"string_extras\": " + stringMapJson(r.stringExtras()) + ",\n");
      w.write(indent + "  \"frame_time_histogram\": " + histogramJson(r.frameTimesMs()) + ",\n");
      w.write(indent + "  \"frame_times_ms\": " + arrayJson(r.frameTimesMs()) + ",\n");
      w.write(indent + "  \"tick_times_ms\": " + arrayJson(r.tickTimesMs()) + "\n");
      w.write(indent + "}");
   }

   private static String statsJson(BenchmarkResult.FrameStats s) {
      return "{\"avg\":"
         + num(s.avg())
         + ",\"min\":"
         + num(s.min())
         + ",\"max\":"
         + num(s.max())
         + ",\"p50\":"
         + num(s.p50())
         + ",\"p95\":"
         + num(s.p95())
         + ",\"p99\":"
         + num(s.p99())
         + ",\"p999\":"
         + num(s.p999())
         + ",\"std_dev\":"
         + num(s.stdDev())
         + ",\"samples\":"
         + s.samples()
         + "}";
   }

   private static String mapJson(Map<String, Double> m) {
      StringBuilder sb = new StringBuilder("{");
      boolean first = true;

      for (Entry<String, Double> e : m.entrySet()) {
         if (!first) {
            sb.append(",");
         }

         first = false;
         sb.append(jsonStr(e.getKey())).append(":").append(num(e.getValue()));
      }

      sb.append("}");
      return sb.toString();
   }

   private static String stringMapJson(Map<String, String> m) {
      StringBuilder sb = new StringBuilder("{");
      boolean first = true;

      for (Entry<String, String> e : m.entrySet()) {
         if (!first) {
            sb.append(",");
         }

         first = false;
         sb.append(jsonStr(e.getKey())).append(":").append(jsonStr(e.getValue()));
      }

      sb.append("}");
      return sb.toString();
   }

   private static String arrayJson(double[] a) {
      StringBuilder sb = new StringBuilder("[");

      for (int i = 0; i < a.length; i++) {
         if (i > 0) {
            sb.append(",");
         }

         sb.append(num(a[i]));
      }

      sb.append("]");
      return sb.toString();
   }

   private static String histogramJson(double[] frames) {
      TreeMap<Integer, Integer> buckets = new TreeMap<>();

      for (double f : frames) {
         int bucket = (int)Math.floor(f);
         buckets.merge(bucket, 1, Integer::sum);
      }

      StringBuilder sb = new StringBuilder("{");
      boolean first = true;

      for (Entry<Integer, Integer> e : buckets.entrySet()) {
         if (!first) {
            sb.append(",");
         }

         first = false;
         sb.append("\"").append(e.getKey()).append("ms\":").append(e.getValue());
      }

      sb.append("}");
      return sb.toString();
   }

   private static String num(double d) {
      return !Double.isNaN(d) && !Double.isInfinite(d) ? String.format(Locale.ROOT, "%.4f", d) : "null";
   }

   private static String jsonStr(String s) {
      StringBuilder sb = new StringBuilder("\"");

      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         switch (c) {
            case '\t':
               sb.append("\\t");
               break;
            case '\n':
               sb.append("\\n");
               break;
            case '\r':
               sb.append("\\r");
               break;
            case '"':
               sb.append("\\\"");
               break;
            case '\\':
               sb.append("\\\\");
               break;
            default:
               if (c < ' ') {
                  sb.append(String.format("\\u%04x", Integer.valueOf(c)));
               } else {
                  sb.append(c);
               }
         }
      }

      sb.append("\"");
      return sb.toString();
   }

   private static void writeMarkdown(Path file, List<BenchmarkResult> results) throws IOException {
      StringBuilder sb = new StringBuilder();
      sb.append("# FPS Test session — ").append(nowIso()).append("\n\n");
      sb.append(systemMarkdown()).append("\n\n");
      sb.append("## Summary\n\n");
      sb.append("| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |\n");
      sb.append("|---:|---|---|---:|---:|---:|---:|---:|---:|---:|\n");

      for (int i = 0; i < results.size(); i++) {
         BenchmarkResult r = results.get(i);
         double onePct = r.extras().getOrDefault("fps_1pct_low", 0.0);
         double p1 = r.extras().getOrDefault("fps_0p1pct_low", 0.0);
         long heapDelta = (r.heapPeak() - r.heapUsedStart()) / 1048576L;
         sb.append("| ")
            .append(i + 1)
            .append(" | [")
            .append(r.displayName())
            .append("](#")
            .append(mdAnchor(r.displayName()))
            .append(")")
            .append(" | ")
            .append(r.category())
            .append(" | ")
            .append(fmt(r.fps().avg(), 1))
            .append(" | ")
            .append(fmt(onePct, 1))
            .append(" | ")
            .append(fmt(p1, 1))
            .append(" | ")
            .append(fmt(r.frameTimeMs().p99(), 2))
            .append(" | ")
            .append(fmt(r.tickTimeMs().avg(), 2))
            .append(" | ")
            .append(r.gcEvents())
            .append(" | ")
            .append(heapDelta)
            .append(" |\n");
      }

      if (results.size() > 5) {
         sb.append("\n## Table of contents\n\n");

         for (BenchmarkResult r : results) {
            sb.append("- [").append(r.displayName()).append("](#").append(mdAnchor(r.displayName())).append(")\n");
         }
      }

      sb.append("\n## Details\n\n");

      for (BenchmarkResult r : results) {
         sb.append("### ").append(r.displayName()).append(" (`").append(r.id()).append("`)\n\n");
         sb.append("Category: **").append(r.category()).append("**  |  ");
         sb.append("Duration: ").append(r.durationMillis()).append(" ms  |  ");
         sb.append("Sample ticks: ").append(r.sampleTicks()).append("\n\n");
         sb.append("**FPS**  avg `").append(fmt(r.fps().avg(), 2)).append("`, ");
         sb.append("min `").append(fmt(r.fps().min(), 2)).append("`, ");
         sb.append("p50 `").append(fmt(r.fps().p50(), 2)).append("`, ");
         sb.append("p95 `").append(fmt(r.fps().p95(), 2)).append("`, ");
         sb.append("p99 `").append(fmt(r.fps().p99(), 2)).append("`, ");
         sb.append("1%low `").append(fmt(r.extras().getOrDefault("fps_1pct_low", 0.0), 2)).append("`, ");
         sb.append("0.1%low `").append(fmt(r.extras().getOrDefault("fps_0p1pct_low", 0.0), 2)).append("`, ");
         sb.append("std `").append(fmt(r.fps().stdDev(), 2)).append("`\n\n");
         sb.append("**Frame time (ms)**  avg `").append(fmt(r.frameTimeMs().avg(), 2)).append("`, ");
         sb.append("p50 `").append(fmt(r.frameTimeMs().p50(), 2)).append("`, ");
         sb.append("p95 `").append(fmt(r.frameTimeMs().p95(), 2)).append("`, ");
         sb.append("p99 `").append(fmt(r.frameTimeMs().p99(), 2)).append("`, ");
         sb.append("p99.9 `").append(fmt(r.frameTimeMs().p999(), 2)).append("`, ");
         sb.append("max `").append(fmt(r.frameTimeMs().max(), 2)).append("`\n\n");
         sb.append("**Client tick (ms)**  avg `").append(fmt(r.tickTimeMs().avg(), 2)).append("`, ");
         sb.append("p95 `").append(fmt(r.tickTimeMs().p95(), 2)).append("`, ");
         sb.append("max `").append(fmt(r.tickTimeMs().max(), 2)).append("`\n\n");
         sb.append("**Memory**  start `").append(r.heapUsedStart() / 1048576L).append(" MB`, ");
         sb.append("end `").append(r.heapUsedEnd() / 1048576L).append(" MB`, ");
         sb.append("peak `").append(r.heapPeak() / 1048576L).append(" MB`, ");
         sb.append("GC `").append(r.gcEvents()).append(" events / ").append(r.gcTimeMs()).append(" ms`\n\n");
         sb.append("**FPS over sampling window (ASCII):**\n\n```\n");
         sb.append(asciiFpsGraph(r.frameTimesMs(), 80, 12));
         sb.append("```\n\n");
         sb.append("**Frame-time histogram (ms bucket → count):**\n\n```\n");
         sb.append(asciiHistogram(r.frameTimesMs(), 40));
         sb.append("```\n\n");
         appendParticleStageTable(sb, r);
         if (!r.extras().isEmpty() || !r.stringExtras().isEmpty()) {
            sb.append("**Extras:**\n\n");

            for (Entry<String, String> e : r.stringExtras().entrySet()) {
               sb.append("- `").append(e.getKey()).append("` = `").append(e.getValue()).append("`\n");
            }

            for (Entry<String, Double> e : r.extras().entrySet()) {
               sb.append("- `").append(e.getKey()).append("` = `").append(fmt(e.getValue(), 2)).append("`\n");
            }

            sb.append("\n");
         }
      }

      Files.writeString(file, sb.toString(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   }

   private static void appendParticleStageTable(StringBuilder sb, BenchmarkResult r) {
      int stageCount = (int)r.extras().getOrDefault("particle_stage_count", 0.0).doubleValue();
      int stageTicks = (int)r.extras().getOrDefault("particle_stage_ticks", 0.0).doubleValue();
      if (stageCount > 0 && stageTicks > 0) {
         List<String> labels = new ArrayList<>();

         for (String k : r.extras().keySet()) {
            if (k.startsWith("particles_stage_")) {
               labels.add(k.substring("particles_stage_".length()));
            }
         }

         if (!labels.isEmpty()) {
            double[] frames = r.frameTimesMs();
            int framesPerStage = Math.max(1, frames.length / stageCount);
            sb.append("**Per-particle stage breakdown:**\n\n");
            sb.append(
               "> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._\n\n"
            );
            sb.append("| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |\n");
            sb.append("|---|---:|---:|---:|---:|\n");

            for (int i = 0; i < labels.size(); i++) {
               int from = i * framesPerStage;
               int to = Math.min(frames.length, from + framesPerStage);
               if (from >= frames.length) {
                  break;
               }

               double[] slice = new double[to - from];
               System.arraycopy(frames, from, slice, 0, slice.length);
               double[] fpsArr = new double[slice.length];

               for (int j = 0; j < slice.length; j++) {
                  fpsArr[j] = slice[j] > 0.0 ? 1000.0 / slice[j] : 0.0;
               }

               double avgFps = average(fpsArr);
               double p99 = percentile(slice, 0.99);
               int spawned = (int)r.extras().getOrDefault("particles_stage_" + labels.get(i), 0.0).doubleValue();
               sb.append("| `")
                  .append(labels.get(i))
                  .append("` | ")
                  .append(spawned)
                  .append(" | ")
                  .append(slice.length)
                  .append(" | ")
                  .append(fmt(avgFps, 1))
                  .append(" | ")
                  .append(fmt(p99, 2))
                  .append(" |\n");
            }

            sb.append("\n");
         }
      }
   }

   private static double average(double[] a) {
      if (a.length == 0) {
         return 0.0;
      } else {
         double s = 0.0;

         for (double v : a) {
            s += v;
         }

         return s / a.length;
      }
   }

   private static double percentile(double[] a, double p) {
      if (a.length == 0) {
         return 0.0;
      } else {
         double[] copy = (double[])a.clone();
         Arrays.sort(copy);
         int idx = (int)Math.min((double)(copy.length - 1), Math.floor(p * (copy.length - 1)));
         return copy[idx];
      }
   }

   static String asciiFpsGraph(double[] frames, int width, int height) {
      if (frames.length == 0) {
         return "(no frames)\n";
      } else {
         double[] fps = new double[frames.length];

         for (int i = 0; i < frames.length; i++) {
            fps[i] = frames[i] > 0.0 ? 1000.0 / frames[i] : 0.0;
         }

         double[] cols = new double[Math.min(width, fps.length)];
         int per = Math.max(1, fps.length / cols.length);

         for (int c = 0; c < cols.length; c++) {
            int from = c * per;
            int to = Math.min(fps.length, from + per);
            double s = 0.0;
            int n = 0;

            for (int i = from; i < to; i++) {
               s += fps[i];
               n++;
            }

            cols[c] = n > 0 ? s / n : 0.0;
         }

         double min = Double.POSITIVE_INFINITY;
         double max = 0.0;

         for (double v : cols) {
            if (v < min) {
               min = v;
            }

            if (v > max) {
               max = v;
            }
         }

         if (max <= min) {
            max = min + 1.0;
         }

         char[][] grid = new char[height][cols.length];

         for (char[] row : grid) {
            Arrays.fill(row, ' ');
         }

         for (int c = 0; c < cols.length; c++) {
            int h = (int)Math.round((cols[c] - min) / (max - min) * (height - 1));

            for (int row = 0; row <= h; row++) {
               grid[height - 1 - row][c] = 9608;
            }
         }

         StringBuilder sb = new StringBuilder();

         for (int row = 0; row < height; row++) {
            double fpsAt = max - (double)row / (height - 1) * (max - min);
            sb.append(String.format(Locale.ROOT, "%5.1f |", fpsAt));
            sb.append(new String(grid[row])).append('\n');
         }

         sb.append("       ").append("-".repeat(cols.length)).append("\n");
         sb.append("       start").append(" ".repeat(Math.max(0, cols.length - 10))).append("end\n");
         return sb.toString();
      }
   }

   static String asciiHistogram(double[] frames, int width) {
      if (frames.length == 0) {
         return "(no frames)\n";
      } else {
         TreeMap<Integer, Integer> buckets = new TreeMap<>();

         for (double f : frames) {
            int b = (int)Math.floor(f);
            buckets.merge(b, 1, Integer::sum);
         }

         int maxCount = 1;

         for (int c : buckets.values()) {
            if (c > maxCount) {
               maxCount = c;
            }
         }

         StringBuilder sb = new StringBuilder();

         for (Entry<Integer, Integer> e : buckets.entrySet()) {
            int bars = (int)Math.round((double)e.getValue().intValue() / maxCount * width);
            sb.append(String.format(Locale.ROOT, "%4d ms | %s  %d\n", e.getKey(), "█".repeat(bars), e.getValue()));
         }

         return sb.toString();
      }
   }

   private static String fmt(double d, int precision) {
      return !Double.isNaN(d) && !Double.isInfinite(d) ? String.format(Locale.ROOT, "%." + precision + "f", d) : "n/a";
   }

   private static String mdAnchor(String displayName) {
      return displayName.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9 -]", "").replace(' ', '-');
   }

   private static void writeCsv(Path file, List<BenchmarkResult> results) throws IOException {
      StringBuilder sb = new StringBuilder();
      sb.append("benchmark,sample_index,frame_time_ms,fps\n");

      for (BenchmarkResult r : results) {
         double[] frames = r.frameTimesMs();

         for (int i = 0; i < frames.length; i++) {
            double fps = frames[i] > 0.0 ? 1000.0 / frames[i] : 0.0;
            sb.append(r.id()).append(',').append(i).append(',').append(fmt(frames[i], 4)).append(',').append(fmt(fps, 4)).append('\n');
         }
      }

      Files.writeString(file, sb.toString(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   }

   private static void writeSystemInfo(Path file) throws IOException {
      Files.writeString(file, systemJson(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   }

   private static String systemJson() {
      OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
      Runtime rt = Runtime.getRuntime();
      String gpuVendor = safeGl(() -> GL11.glGetString(7936));
      String gpuRenderer = safeGl(() -> GL11.glGetString(7937));
      String gpuVersion = safeGl(() -> GL11.glGetString(7938));
      return "{\"minecraft\":"
         + jsonStr(class_155.method_16673().method_48019())
         + ",\"os\":"
         + jsonStr(os.getName() + " " + os.getVersion() + " (" + os.getArch() + ")")
         + ",\"cpu_cores\":"
         + os.getAvailableProcessors()
         + ",\"java_version\":"
         + jsonStr(System.getProperty("java.version"))
         + ",\"java_vm\":"
         + jsonStr(System.getProperty("java.vm.name"))
         + ",\"max_heap_mb\":"
         + rt.maxMemory() / 1048576L
         + ",\"total_memory_mb\":"
         + rt.totalMemory() / 1048576L
         + ",\"free_memory_mb\":"
         + rt.freeMemory() / 1048576L
         + ",\"gpu_vendor\":"
         + jsonStr(gpuVendor)
         + ",\"gpu_renderer\":"
         + jsonStr(gpuRenderer)
         + ",\"gpu_version\":"
         + jsonStr(gpuVersion)
         + "}";
   }

   private static String safeGl(Supplier<String> q) {
      try {
         String s = q.get();
         return s == null ? "unknown" : s;
      } catch (Throwable var2) {
         return "unknown";
      }
   }

   private static String systemMarkdown() {
      OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
      Runtime rt = Runtime.getRuntime();
      String gpu = safeGl(() -> GL11.glGetString(7937)) + " / " + safeGl(() -> GL11.glGetString(7938));
      return "- Minecraft: `"
         + class_155.method_16673().method_48019()
         + "`\n- OS: `"
         + os.getName()
         + " "
         + os.getVersion()
         + " ("
         + os.getArch()
         + ")`\n- CPU cores: `"
         + os.getAvailableProcessors()
         + "`\n- Java: `"
         + System.getProperty("java.version")
         + "` ("
         + System.getProperty("java.vm.name")
         + ")\n- Max heap: `"
         + rt.maxMemory() / 1048576L
         + " MB`\n- GPU: `"
         + gpu
         + "`";
   }

   private static String nowIso() {
      return ZonedDateTime.now(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
   }
}
