package com.fpstest.client.metrics;

import com.fpstest.client.FpsTestClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Live system usage (CPU / GPU / RAM) for the benchmark testing HUD.
 *
 * <p><b>CPU</b> — whole-system CPU utilization via
 * {@code com.sun.management.OperatingSystemMXBean.getCpuLoad()} (NOT process-only).
 * This returns a value in {@code 0.0..1.0} representing recent utilization for the
 * entire operating environment, not merely Minecraft's JVM.</p>
 *
 * <p><b>GPU</b> — real NVIDIA GPU utilization via {@code nvidia-smi}, parsed from
 * the command output. Falls back to {@code -1} (unavailable) if nvidia-smi is not
 * present or cannot be parsed.</p>
 *
 * <p><b>RAM</b> — the heap usage already tracked by {@link MemoryTracker}
 * (used / max).</p>
 *
 * <p>Each metric is sampled on a slow cadence and smoothed so the HUD values are
 * stable and meaningful. A metric is reported as <em>unavailable</em> while no
 * valid reading has been captured yet; nothing is ever fabricated.</p>
 */
@Environment(EnvType.CLIENT)
public final class SystemUsageTracker {
    private static final Logger LOG = LoggerFactory.getLogger(SystemUsageTracker.class);

    /** Smoothing window for CPU load (%) and GPU load (%). */
    private static final int SMOOTH = 20;

    /** Update cadence: sample about once per second (50ms game ticks -> 20 ticks). */
    private static final int SAMPLE_INTERVAL_TICKS = 20;

    /** Path to nvidia-smi, or null if not found. */
    private static final String NVIDIA_SMI = findNvidiaSmi();

    private com.sun.management.OperatingSystemMXBean osBean;
    private final RingBuffer cpuSamples = new RingBuffer(SMOOTH);
    private final RingBuffer gpuSamples = new RingBuffer(SMOOTH);

    private boolean cpuValid;
    private double cpuPercent;
    private boolean gpuValid;
    private double gpuPercent;

    private int ticksSinceSample;

    public SystemUsageTracker() {
        try {
            this.osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        } catch (Throwable t) {
            this.osBean = null;
            LOG.warn("[HUD] Failed to get OperatingSystemMXBean: {}", t.getMessage());
        }
    }

    /**
     * Called every client tick. CPU / GPU are re-sampled on a slow cadence and
     * smoothed; RAM is read live from {@link MemoryTracker} on every tick.
     */
    public void tick() {
        if (++ticksSinceSample >= SAMPLE_INTERVAL_TICKS) {
            ticksSinceSample = 0;
            sampleCpu();
            sampleGpu();
        }
    }

    /**
     * Sample whole-system CPU utilization using getCpuLoad().
     * DO NOT use getProcessCpuLoad() — that only measures the JVM process.
     */
    private void sampleCpu() {
        if (osBean == null) {
            cpuValid = false;
            cpuPercent = 0.0;
            return;
        }
        try {
            // getCpuLoad() returns whole-system utilization (0.0..1.0), NOT just the JVM process
            double load = osBean.getCpuLoad();
            if (load >= 0.0 && load <= 1.0) {
                double pct = Math.min(100.0, Math.max(0.0, load * 100.0));
                cpuSamples.push(pct);
                cpuValid = true;
                cpuPercent = cpuSamples.average();
                LOG.debug("[HUD] telemetry: CPU raw={:.4f} system={:.1f}% displayed={:.0f}%",
                    load, pct, cpuPercent);
            } else if (!cpuValid) {
                // Still warming up (the first call can return -1); keep --.
                cpuPercent = 0.0;
            }
        } catch (Throwable t) {
            cpuValid = false;
            cpuPercent = 0.0;
            LOG.warn("[HUD] CPU telemetry error: {}", t.getMessage());
        }
    }

    /**
     * Sample GPU utilization from nvidia-smi.
     * Parses the output to extract the GPU utilization percentage.
     * Returns -1 if nvidia-smi is unavailable or cannot be parsed.
     */
    private void sampleGpu() {
        if (NVIDIA_SMI == null) {
            gpuValid = false;
            gpuPercent = 0.0;
            return;
        }
        try {
            double util = parseNvidiaSmi();
            if (util >= 0.0) {
                // Clamp to valid range [0, 100]
                double pct = Math.min(100.0, Math.max(0.0, util));
                gpuSamples.push(pct);
                gpuValid = true;
                gpuPercent = gpuSamples.average();
                LOG.debug("[HUD] telemetry: GPU raw={:.1f}% displayed={:.0f}%", pct, gpuPercent);
            }
        } catch (Throwable t) {
            gpuValid = false;
            gpuPercent = 0.0;
            LOG.warn("[HUD] GPU telemetry error: {}", t.getMessage());
        }
    }

    /**
     * Run nvidia-smi and parse the GPU utilization percentage.
     * Returns -1 if the command fails or output cannot be parsed.
     */
    private static double parseNvidiaSmi() {
        if (NVIDIA_SMI == null) {
            return -1.0;
        }
        try {
            ProcessBuilder pb = new ProcessBuilder(NVIDIA_SMI, "--query-gpu=utilization.gpu", "--format=csv,noheader");
            pb.redirectErrorStream(true);
            Process proc = pb.start();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()))) {
                String line = reader.readLine();
                if (line != null) {
                    // Parse "XX %" format
                    line = line.trim();
                    int percentIdx = line.lastIndexOf('%');
                    if (percentIdx >= 0) {
                        String numStr = line.substring(0, percentIdx).trim();
                        return Double.parseDouble(numStr);
                    }
                }
            }
            proc.waitFor();
        } catch (Exception e) {
            // nvidia-smi failed, will retry next sample
        }
        return -1.0;
    }

    /**
     * Find nvidia-smi in common locations.
     * Returns null if not found.
     */
    private static String findNvidiaSmi() {
        String[] candidates = {
            "/usr/bin/nvidia-smi",
            "/usr/local/bin/nvidia-smi",
            "/bin/nvidia-smi",
            "nvidia-smi"
        };
        for (String path : candidates) {
            try {
                ProcessBuilder pb = new ProcessBuilder(path, "--version");
                pb.redirectErrorStream(true);
                Process proc = pb.start();
                int exit = proc.waitFor();
                if (exit == 0) {
                    LOG.info("[HUD] Found nvidia-smi at: {}", path);
                    return path;
                }
            } catch (Exception e) {
                // Try next candidate
            }
        }
        LOG.warn("[HUD] nvidia-smi not found in standard locations");
        return null;
    }

    /** RAM usage as a percentage of the JVM heap, from {@link MemoryTracker}. */
    public double ramPercent() {
        long max = FpsTestClient.MEMORY.maxBytes();
        if (max <= 0L) {
            return -1.0;
        }
        return FpsTestClient.MEMORY.usedBytes() * 100.0 / max;
    }

    /** Available CPU load in percent (0..100), or {@code -1} if unavailable. */
    public double cpuPercent() {
        return cpuValid ? cpuPercent : -1.0;
    }

    /** Available GPU utilization in percent (0..100), or {@code -1} if unavailable. */
    public double gpuPercent() {
        return gpuValid ? gpuPercent : -1.0;
    }
}