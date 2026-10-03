package com.fpstest.client.metrics;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.GpuStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Live system usage (CPU / GPU / RAM) for the benchmark testing HUD.
 *
 * <p><b>CPU</b> — whole-system CPU utilization via OSHI
 * {@link CentralProcessor#getSystemCpuLoad()}, returning 0.0..100.0.
 * This measures the entire OS, not just the JVM process.</p>
 *
 * <p><b>GPU</b> — hardware GPU utilization via OSHI
 * {@link GraphicsCard#createStatsSession()} -> {@link GpuStats#getGpuUtilization()},
 * returning 0.0..100.0 or -1.0 if unavailable on this platform/driver.</p>
 *
 * <p><b>RAM</b> — physical memory usage via OSHI {@link GlobalMemory},
 * returning used / total as a percentage.</p>
 *
 * <p>Each metric is sampled on a slow cadence and smoothed so the HUD values
 * are stable and meaningful. A metric is reported as <em>unavailable</em>
 * (displayed as "--") while no valid reading has been captured yet; nothing
 * is ever fabricated.</p>
 */
@Environment(EnvType.CLIENT)
public final class SystemUsageTracker {
    private static final Logger LOG = LoggerFactory.getLogger(SystemUsageTracker.class);

    /** Smoothing window size for CPU, GPU, and RAM samples. */
    private static final int SMOOTH = 20;

    /** Update cadence: sample about once per second (50ms game ticks -> 20 ticks). */
    private static final int SAMPLE_INTERVAL_TICKS = 20;

    private final SystemInfo systemInfo;
    private final HardwareAbstractionLayer hal;
    private final CentralProcessor processor;
    private final GlobalMemory memory;
    private final List<GraphicsCard> graphicsCards;

    private final RingBuffer cpuSamples = new RingBuffer(SMOOTH);
    private final RingBuffer gpuSamples = new RingBuffer(SMOOTH);
    private final RingBuffer ramSamples = new RingBuffer(SMOOTH);

    private boolean cpuValid;
    private double cpuPercent;
    private boolean gpuValid;
    private double gpuPercent;
    private boolean ramValid;
    private double ramPercent;

    /** Previous tick snapshot for delta-based CPU utilization. */
    private long[] prevTickTicks;

    /** Persistent GPU stats session for the active graphics card, if any. */
    private GpuStats gpuStats;

    private int ticksSinceSample = 0;

    public SystemUsageTracker() {
        SystemInfo si = null;
        HardwareAbstractionLayer h = null;
        CentralProcessor p = null;
        GlobalMemory m = null;
        List<GraphicsCard> gc = null;
        try {
            si = new SystemInfo();
            h = si.getHardware();
            p = h.getProcessor();
            m = h.getMemory();
            gc = h.getGraphicsCards();

            LOG.info("[HUD] Detected {} graphics card(s): {}",
                    gc.size(),
                    gc.stream()
                            .map(GraphicsCard::getName)
                            .reduce((a, b) -> a + ", " + b)
                            .orElse("none"));

            // Try to open a persistent GPU stats session on the first (primary) card.
            primeGpuSession(gc);

        } catch (Throwable t) {
            LOG.warn("[HUD] Failed to initialise SystemInfo: {}", t.getMessage());
        }
        this.systemInfo = si;
        this.hal = h;
        this.processor = p;
        this.memory = m;
        this.graphicsCards = gc;
    }

    /**
     * Called every client tick. CPU / GPU / RAM are re-sampled on a slow cadence
     * and smoothed; invalid values stay at -1.0 until a valid reading arrives.
     */
    public void tick() {
        if (++ticksSinceSample >= SAMPLE_INTERVAL_TICKS) {
            ticksSinceSample = 0;
            sampleCpu();
            sampleGpu();
            sampleRam();
        }
    }

    /**
     * Sample whole-system CPU utilization via OSHI CentralProcessor.
     * Uses delta-based tick counters (getSystemCpuLoadBetweenTicks) for accurate
     * per-interval measurements. Returns 0.0..100.0 or -1.0 if unavailable.
     */
    private void sampleCpu() {
        if (processor == null) {
            cpuValid = false;
            cpuPercent = 0.0;
            return;
        }
        try {
            // getSystemCpuLoadBetweenTicks returns CPU load as a fraction 0.0..1.0
            // between the previous and current tick snapshot.
            long[] tickTicks = processor.getSystemCpuLoadTicks();

            // First call: prevTickTicks is null, so we can't compute delta yet.
            // Just store the ticks for next time.
            if (prevTickTicks != null) {
                double load = processor.getSystemCpuLoadBetweenTicks(prevTickTicks, tickTicks);

                if (load >= 0.0 && load <= 1.0) {
                    double pct = Math.min(100.0, Math.max(0.0, load * 100.0));
                    cpuSamples.push(pct);
                    cpuValid = true;
                    cpuPercent = cpuSamples.average();
                    LOG.debug("[HUD] telemetry: CPU raw={} displayed={}%{}",
                            load, cpuPercent, "%");
                } else if (!cpuValid) {
                    // Still warming up - first call can return -1.
                    cpuPercent = 0.0;
                }
            }
            prevTickTicks = tickTicks.clone();
        } catch (Throwable t) {
            cpuValid = false;
            cpuPercent = 0.0;
            LOG.warn("[HUD] CPU telemetry error: {}", t.getMessage());
        }
    }

    /**
     * Sample GPU utilization via OSHI GpuStats session.
     * On Linux/NVIDIA this uses nvidia-smi under the hood via JNA (no direct invocation).
     * On Windows this uses WMI/PerfMon. On Mac this uses IOGraphics.
     * Returns -1.0 if the platform/driver does not support GPU stats.
     */
    private void sampleGpu() {
        if (graphicsCards == null || graphicsCards.isEmpty()) {
            gpuValid = false;
            gpuPercent = 0.0;
            return;
        }
        try {
            // Ensure we have a valid session; recreate if closed.
            if (gpuStats == null || gpuStats.isClosed()) {
                primeGpuSession(graphicsCards);
            }
            if (gpuStats == null) {
                gpuValid = false;
                gpuPercent = 0.0;
                return;
            }

            // Get GPU utilization via the persistent stats session.
            double util = gpuStats.getGpuUtilization(); // returns 0.0..100.0 or -1.0

            if (util >= 0.0) {
                double pct = Math.min(100.0, Math.max(0.0, util));
                gpuSamples.push(pct);
                gpuValid = true;
                gpuPercent = gpuSamples.average();
                LOG.debug("[HUD] telemetry: GPU raw={} displayed={}",
                        util, gpuPercent);
            } else if (!gpuValid) {
                gpuPercent = 0.0;
            }
        } catch (Throwable t) {
            gpuValid = false;
            gpuPercent = 0.0;
            // Try to recover on next tick
            LOG.warn("[HUD] GPU telemetry error: {}", t.getMessage());
            if (gpuStats != null) {
                try { gpuStats.close(); } catch (Throwable ignored) {}
                gpuStats = null;
            }
        }
    }

    /**
     * Open a persistent GpuStats session on the primary (first) graphics card.
     * Returns true if successful.
     */
    private boolean primeGpuSession(List<GraphicsCard> cards) {
        try {
            // Close any existing session first.
            if (gpuStats != null) {
                try { gpuStats.close(); } catch (Throwable ignored) {}
            }
            // Prefer NVIDIA cards (they support NVML for utilization).
            // AMD/Intel cards often return -1 for utilization.
            GraphicsCard card = null;
            for (GraphicsCard c : cards) {
                String vendor = c.getVendor();
                if (vendor != null && vendor.toLowerCase().contains("nvidia")) {
                    card = c;
                    break;
                }
            }
            if (card == null) {
                // Fall back to first card.
                card = cards.get(0);
            }
            gpuStats = card.createStatsSession();
            LOG.info("[HUD] GPU stats session opened for: {} (vendor: {})",
                    card.getName(), card.getVendor());
            return gpuStats != null;
        } catch (Throwable t) {
            LOG.warn("[HUD] Failed to open GPU stats session: {}", t.getMessage());
            gpuStats = null;
            return false;
        }
    }

    /**
     * Sample physical RAM usage via OSHI GlobalMemory.
     * Returns the percentage of physical memory currently in use.
     */
    private void sampleRam() {
        if (memory == null) {
            ramValid = false;
            ramPercent = 0.0;
            return;
        }
        try {
            long total = memory.getTotal();
            long available = memory.getAvailable();
            long used = total - available;

            if (total > 0) {
                double pct = Math.min(100.0, Math.max(0.0, (double) used / total * 100.0));
                ramSamples.push(pct);
                ramValid = true;
                ramPercent = ramSamples.average();
                LOG.debug("[HUD] telemetry: RAM used={}MB total={}MB displayed={}%",
                        used / 1024 / 1024, total / 1024 / 1024, ramPercent);
            }
        } catch (Throwable t) {
            ramValid = false;
            ramPercent = 0.0;
            LOG.warn("[HUD] RAM telemetry error: {}", t.getMessage());
        }
    }

    /**
     * Available CPU load in percent (0..100), or -1.0 if unavailable.
     */
    public double cpuPercent() {
        return cpuValid ? cpuPercent : -1.0;
    }

    /**
     * Available GPU utilization in percent (0..100), or -1.0 if unavailable.
     */
    public double gpuPercent() {
        return gpuValid ? gpuPercent : -1.0;
    }

    /**
     * Available physical RAM usage in percent (0..100), or -1.0 if unavailable.
     */
    public double ramPercent() {
        return ramValid ? ramPercent : -1.0;
    }

    /**
     * Release resources on shutdown.
     */
    public void close() {
        if (gpuStats != null) {
            try { gpuStats.close(); } catch (Throwable ignored) {}
        }
    }
}
