package com.fpstest.client.metrics;

import com.fpstest.client.FpsTestClient;
import java.lang.management.ManagementFactory;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;

/**
 * Live system usage (CPU / GPU / RAM) for the benchmark testing HUD.
 *
 * <p>Every value comes from a portable, in-process API — no external operating
 * system commands, no vendor-specific tools, no hardware look-up tables:</p>
 * <ul>
 *   <li><b>CPU</b> — the Java HotSpot JVM's own process CPU load,
 *       {@code com.sun.management.OperatingSystemMXBean.getProcessCpuLoad()}.</li>
 *   <li><b>GPU</b> — MinecraftClient's existing GPU utilization probe,
 *       {@code MinecraftClient.getGpuUtilization()} (an OpenGL timer-query estimate).</li>
 *   <li><b>RAM</b> — the heap usage already tracked by {@link MemoryTracker}
 *       (used / max).</li>
 * </ul>
 *
 * <p>Each metric is sampled on a slow cadence and smoothed so the HUD values are
 * stable and meaningful. A metric is reported as <em>unavailable</em> while no
 * valid reading has been captured yet; nothing is ever fabricated.</p>
 */
@Environment(EnvType.CLIENT)
public final class SystemUsageTracker {
    /** Smoothing window for CPU load (%) and GPU load (%). */
    private static final int SMOOTH = 20;

    /** Update cadence: sample about once per second (50ms game ticks -> 20 ticks). */
    private static final int SAMPLE_INTERVAL_TICKS = 20;

    private com.sun.management.OperatingSystemMXBean osBean;
    private final RingBuffer cpuSamples = new RingBuffer(SMOOTH);
    private final RingBuffer gpuSamples = new RingBuffer(SMOOTH);

    private boolean cpuValid;
    private double cpuPercent;
    private boolean gpuValid;
    private double gpuPercent;
    private boolean gpuSupported;

    private int ticksSinceSample;

    public SystemUsageTracker() {
        try {
            this.osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        } catch (Throwable t) {
            this.osBean = null;
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

    private void sampleCpu() {
        if (osBean == null) {
            cpuValid = false;
            cpuPercent = 0.0;
            return;
        }
        try {
            double load = osBean.getProcessCpuLoad();
            if (load >= 0.0 && load <= 1.0) {
                double pct = load * 100.0;
                cpuSamples.push(pct);
                cpuValid = true;
                cpuPercent = cpuSamples.average();
            } else if (!cpuValid) {
                // Still warming up (the first call can return -1); keep --.
                cpuPercent = 0.0;
            }
        } catch (Throwable t) {
            cpuValid = false;
            cpuPercent = 0.0;
        }
    }

    private void sampleGpu() {
        MinecraftClient mc = MinecraftClient.getInstance();
        try {
            double util = mc.getGpuUtilizationPercentage();
            // MinecraftClient's timer-query based probe. When the underlying GPU timing
            // API is unavailable it reports 0.0. A 0.0 is only treated as a real
            // reading once we have seen a single non-zero value (proving the probe
            // is live); otherwise the metric stays unavailable ('--'). Once live,
            // a subsequent 0.0 is a genuine low-utilization reading and is kept.
            if (gpuSupported || util > 0.0) {
                gpuSamples.push(util);
                if (util > 0.0) {
                    gpuSupported = true;
                }
                gpuValid = true;
                gpuPercent = gpuSamples.average();
            }
        } catch (Throwable t) {
            gpuValid = false;
            gpuPercent = 0.0;
        }
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