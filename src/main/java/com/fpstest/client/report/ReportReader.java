package com.fpstest.client.report;

import com.fpstest.client.bench.BenchmarkResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads a session written by {@link ReportWriter} back into a
 * {@code List<BenchmarkResult>} so past sessions can be re-opened in the
 * {@code BenchmarkResultsScreen}. Mirrors the exact report.json schema emitted
 * by {@link ReportWriter#writeResultJson}.
 */
@Environment(EnvType.CLIENT)
public final class ReportReader {
    private static final Logger LOG = LoggerFactory.getLogger("fpstest-report-reader");

    private ReportReader() {
    }

    public static List<BenchmarkResult> read(Path reportDir) throws IOException {
        Path file = reportDir.resolve("report.json");
        if (!Files.isRegularFile(file)) {
            throw new IOException("No report.json in " + reportDir);
        }

        List<BenchmarkResult> out = new ArrayList<>();
        try (Reader r = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            JsonElement root = JsonParser.parseReader(r);
            if (root == null || !root.isJsonObject()) {
                throw new IOException("report.json is not a JSON object");
            }

            JsonObject top = root.getAsJsonObject();
            JsonArray arr = top.getAsJsonArray("results");
            if (arr == null) {
                throw new IOException("report.json has no results array");
            }

            for (JsonElement el : arr) {
                if (el == null || !el.isJsonObject()) {
                    continue;
                }
                out.add(parseResult(el.getAsJsonObject()));
            }
        }
        LOG.info("[FPS Test] loaded {} results from {}", out.size(), reportDir);
        return out;
    }

    private static BenchmarkResult parseResult(JsonObject o) {
        String id = str(o, "id");
        String name = str(o, "display_name");
        String cat = str(o, "category");
        int sampleTicks = intOf(o, "sample_ticks");
        long durationMillis = longOf(o, "duration_ms");
        long ts = longOf(o, "timestamp_ms");
        // fall back to now if a legacy report lacks timestamp_ms
        if (ts == 0L) {
            ts = System.currentTimeMillis() - durationMillis;
        }

        BenchmarkResult.FrameStats fps = parseStats(o.getAsJsonObject("fps"));
        BenchmarkResult.FrameStats frameTime = parseStats(o.getAsJsonObject("frame_time_ms"));
        BenchmarkResult.FrameStats tickTime = parseStats(o.getAsJsonObject("tick_time_ms"));
        long heapStart = longOf(o, "heap_used_start");
        long heapEnd = longOf(o, "heap_used_end");
        long heapPeak = longOf(o, "heap_peak");
        int gcEvents = intOf(o, "gc_events");
        long gcTime = longOf(o, "gc_time_ms");

        Map<String, Double> extras = new LinkedHashMap<>();
        JsonObject eo = o.getAsJsonObject("extras");
        if (eo != null) {
            for (Map.Entry<String, JsonElement> e : eo.entrySet()) {
                JsonElement v = e.getValue();
                if (v.isJsonPrimitive() && ((JsonPrimitive) v).isNumber()) {
                    extras.put(e.getKey(), v.getAsDouble());
                }
            }
        }

        Map<String, String> stringExtras = new LinkedHashMap<>();
        JsonObject so = o.getAsJsonObject("string_extras");
        if (so != null) {
            for (Map.Entry<String, JsonElement> e : so.entrySet()) {
                JsonElement v = e.getValue();
                if (v.isJsonPrimitive()) {
                    stringExtras.put(e.getKey(), v.getAsString());
                }
            }
        }

        JSONResult parsed = new JSONResult(fps, frameTime, tickTime, extras, stringExtras);
        // Wrap timestamp through the builder: Builder sets timestampMillis to
        // System.currentTimeMillis() on construction, so build a record
        // directly to preserve the real timestamps.
        return new BenchmarkResult(
            id,
            name,
            cat,
            ts,
            durationMillis,
            sampleTicks,
            parsed.fps,
            parsed.frameTime,
            parsed.tickTime,
            heapStart,
            heapEnd,
            heapPeak,
            gcEvents,
            gcTime,
            doubleArray(o, "frame_times_ms"),
            doubleArray(o, "tick_times_ms"),
            Map.copyOf(extras),
            Map.copyOf(stringExtras)
        );
    }

    private static BenchmarkResult.FrameStats parseStats(JsonObject s) {
        if (s == null) {
            return BenchmarkResult.FrameStats.EMPTY;
        }
        return new BenchmarkResult.FrameStats(
            num(s, "avg"),
            num(s, "min"),
            num(s, "max"),
            num(s, "p50"),
            num(s, "p95"),
            num(s, "p99"),
            num(s, "p999"),
            num(s, "std_dev"),
            intOf(s, "samples")
        );
    }

    private static double num(JsonObject o, String key) {
        JsonElement e = o.get(key);
        if (e != null && e.isJsonPrimitive() && ((JsonPrimitive) e).isNumber()) {
            return e.getAsDouble();
        }
        return 0.0;
    }

    private static int intOf(JsonObject o, String key) {
        JsonElement e = o.get(key);
        if (e != null && e.isJsonPrimitive() && ((JsonPrimitive) e).isNumber()) {
            return e.getAsInt();
        }
        return 0;
    }

    private static long longOf(JsonObject o, String key) {
        JsonElement e = o.get(key);
        if (e != null && e.isJsonPrimitive() && ((JsonPrimitive) e).isNumber()) {
            return e.getAsLong();
        }
        return 0L;
    }

    private static String str(JsonObject o, String key) {
        JsonElement e = o.get(key);
        if (e != null && e.isJsonPrimitive() && e.getAsJsonPrimitive().isString()) {
            return e.getAsString();
        }
        return "";
    }

    private static double[] doubleArray(JsonObject o, String key) {
        JsonElement e = o.get(key);
        if (e == null || !e.isJsonArray()) {
            return new double[0];
        }
        JsonArray a = e.getAsJsonArray();
        double[] out = new double[a.size()];
        for (int i = 0; i < a.size(); i++) {
            JsonElement v = a.get(i);
            if (v.isJsonPrimitive() && ((JsonPrimitive) v).isNumber()) {
                out[i] = v.getAsDouble();
            }
        }
        return out;
    }

    private record JSONResult(
        BenchmarkResult.FrameStats fps,
        BenchmarkResult.FrameStats frameTime,
        BenchmarkResult.FrameStats tickTime,
        Map<String, Double> extras,
        Map<String, String> stringExtras
    ) {
    }
}