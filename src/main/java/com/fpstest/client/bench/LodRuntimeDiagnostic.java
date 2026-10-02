package com.fpstest.client.bench;

import com.seibel.distanthorizons.api.DhApi;
import com.seibel.distanthorizons.api.interfaces.config.IDhApiConfig;
import com.seibel.distanthorizons.api.interfaces.config.IDhApiConfigValue;
import com.seibel.distanthorizons.api.interfaces.config.client.IDhApiGraphicsConfig;
import com.seibel.distanthorizons.api.interfaces.config.client.IDhApiGenericRenderingConfig;
import com.seibel.distanthorizons.api.interfaces.render.IDhApiRenderProxy;
import com.seibel.distanthorizons.api.methods.events.DhApiEventRegister;
import com.seibel.distanthorizons.api.methods.events.abstractEvents.DhApiBeforeRenderPassEvent;
import com.seibel.distanthorizons.api.methods.events.interfaces.IDhApiEvent;
import com.seibel.distanthorizons.api.methods.events.sharedParameterObjects.DhApiEventParam;
import com.seibel.distanthorizons.api.methods.events.sharedParameterObjects.DhApiRenderParam;
import com.seibel.distanthorizons.api.objects.DhApiResult;
import com.seibel.distanthorizons.api.enums.config.EDhApiRenderingApi;
import com.seibel.distanthorizons.api.enums.config.EDhApiRenderingEngine;
import com.seibel.distanthorizons.api.enums.rendering.EDhApiRendererMode;
import me.cortex.voxy.client.config.VoxyConfig;
import me.cortex.voxy.client.core.IGetVoxyRenderSystem;
import me.cortex.voxy.client.core.VoxyRenderSystem;
import me.cortex.voxy.commonImpl.VoxyCommon;
import me.cortex.voxy.commonImpl.VoxyInstance;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Independent runtime diagnostic for Distant Horizons and Voxy LOD rendering state.
 *
 * <p>This class samples DH and Voxy renderer state at configurable intervals during
 * the chunk-loading benchmark phase, producing concrete evidence of whether
 * LOD terrain is actually being rendered — not merely whether the benchmark
 * controller requested it.</p>
 *
 * <p>Evidence collected:</p>
 * <ul>
 *   <li><b>DH config state:</b> renderingEnabled, renderingMode, genericRenderingEnabled,
 *       chunkRenderDistance, lodOnlyMode</li>
 *   <li><b>DH runtime state:</b> renderProxy availability, renderingApi, renderingEngine,
 *       isNativeRenderer</li>
 *   <li><b>DH render evidence:</b> count of DhApiBeforeRenderPassEvent firings</li>
 *   <li><b>Voxy config state:</b> enabled, enableRendering, sectionRenderDistance,
 *       isRenderingEnabled()</li>
 *   <li><b>Voxy runtime state:</b> instance exists, instance running, renderSystem exists</li>
 * </ul>
 */
@Environment(EnvType.CLIENT)
public final class LodRuntimeDiagnostic {
    private static final Logger LOG = LoggerFactory.getLogger(LodRuntimeDiagnostic.class);

    // Sampling configuration
    private static final int SAMPLING_INTERVAL_TICKS = 20; // once per second at 20 TPS
    private static final int MAX_SAMPLES = 3600; // safety cap (1 hour max)

    // Internal state
    private static volatile int sampleCount = 0;
    private static volatile int dhRenderCallbackCount = 0;
    private static volatile boolean dhRenderObserved = false;
    private static volatile boolean voxyRenderObserved = false;
    private static volatile String currentPhase = "UNKNOWN";
    private static volatile long startTimeNanos = 0;
    private static volatile long lastSampleTick = 0;

    // State transition tracking
    private static volatile Boolean lastDhRenderingEnabled = null;
    private static volatile Boolean lastVoxyIsRenderingEnabled = null;
    private static final List<String> dhTransitions = new ArrayList<>();
    private static final List<String> voxyTransitions = new ArrayList<>();

    // DH render pass event listener (registered once)
    private static final AtomicBoolean dhEventListenerRegistered = new AtomicBoolean(false);

    // Sample results for final report
    private static final List<DhSample> dhSamples = new ArrayList<>();
    private static final List<VoxySample> voxySamples = new ArrayList<>();

    private LodRuntimeDiagnostic() {}

    // ========== Public API ==========

    /**
     * Called at the start of a benchmark session to reset all diagnostic state.
     */
    public static void resetObservations() {
        sampleCount = 0;
        dhRenderCallbackCount = 0;
        dhRenderObserved = false;
        voxyRenderObserved = false;
        currentPhase = "UNKNOWN";
        startTimeNanos = System.nanoTime();
        lastSampleTick = 0;
        lastDhRenderingEnabled = null;
        lastVoxyIsRenderingEnabled = null;
        dhTransitions.clear();
        voxyTransitions.clear();
        dhSamples.clear();
        voxySamples.clear();
        if (!dhEventListenerRegistered.get()) {
            registerDhRenderEventListener();
        }
        LOG.info("[LOX DIAG] Reset diagnostic state, DH render callback count: {}", dhRenderCallbackCount);
    }

    /**
     * Called each tick during benchmarks. Samples DH and Voxy state when in the
     * chunk-loading phase (SAMPLING state in CinematicRunner).
     */
    public static void takeObservation(String phase, int tickCount) {
        if (tickCount != lastSampleTick) {
            lastSampleTick = tickCount;
        }
        
        // Sample every SAMPLING_INTERVAL_TICKS ticks
        if (tickCount % SAMPLING_INTERVAL_TICKS == 0 || sampleCount == 0) {
            currentPhase = phase;
            try {
                DhObservation dh = observeDistantHorizons();
                VoxyObservation voxy = observeVoxy();
                
                // Track transitions
                trackTransition(dh, voxy);
                
                dhSamples.add(new DhSample(dh, tickCount));
                voxySamples.add(new VoxySample(voxy, tickCount));
                
                // Check for render evidence
                if (dh.allConditionsMet()) {
                    dhRenderObserved = true;
                }
                if (voxy.allConditionsMet()) {
                    voxyRenderObserved = true;
                }
                
                sampleCount++;
                
                // Log every sample during chunk-loading phase
                if (phase.contains("Chunks") || phase.contains("chunk")) {
                    logObservation(phase, sampleCount, dh, voxy);
                }
                
            } catch (Throwable t) {
                LOG.warn("[LOX DIAG] Observation failed at phase={}", phase, t);
            }
        }
    }

    /**
     * Called when a chunk-loading benchmark completes. Logs the final diagnostic summary.
     */
    public static void printFinalResult() {
        LOG.info("================================================================");
        LOG.info("=== LOD RUNTIME VERIFICATION COMPLETE ===");
        LOG.info("================================================================");
        LOG.info("Benchmark phase: {}", currentPhase);
        LOG.info("Total samples collected: {}", sampleCount);
        LOG.info("DH render callbacks observed: {}", dhRenderCallbackCount);
        LOG.info("DH render observed: {}", dhRenderObserved);
        LOG.info("Voxy render observed: {}", voxyRenderObserved);
        LOG.info("DH state transitions: {}", dhTransitions.size());
        LOG.info("Voxy state transitions: {}", voxyTransitions.size());
        LOG.info("================================================================");
        
        if (!dhSamples.isEmpty()) {
            logDhFinalReport();
        }
        if (!voxySamples.isEmpty()) {
            logVoxyFinalReport();
        }
        
        LOG.info("================================================================");
        LOG.info("=== FINAL DETERMINATIONS ===");
        LOG.info("================================================================");
        
        // DH determination
        String dhVerdict = determineDhVerdict();
        LOG.info("Distant Horizons: {}", dhVerdict);
        
        // Voxy determination
        String voxyVerdict = determineVoxyVerdict();
        LOG.info("Voxy: {}", voxyVerdict);
        
        LOG.info("================================================================");
    }

    /**
     * Returns the current DH render callback count (evidence of actual rendering).
     */
    public static int getDhRenderCallbackCount() {
        return dhRenderCallbackCount;
    }

    /**
     * Returns whether any DH render pass was observed during sampling.
     */
    public static boolean isDhRenderObserved() {
        return dhRenderObserved;
    }

    /**
     * Returns whether any Voxy render activity was observed during sampling.
     */
    public static boolean isVoxyRenderObserved() {
        return voxyRenderObserved;
    }

    // ========== DH Observation ==========

    private static DhObservation observeDistantHorizons() {
        boolean configsReady = false;
        Boolean renderingEnabled = null;
        Boolean genericRenderingEnabled = null;
        EDhApiRendererMode rendererMode = null;
        Integer chunkRenderDistance = null;
        Boolean lodOnlyMode = null;
        boolean rendererExists = false;
        boolean rendererDisabledByException = false;
        boolean initialized = false;
        EDhApiRenderingApi renderingApi = null;
        EDhApiRenderingEngine renderingEngine = null;
        boolean nativeRenderer = false;

        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config != null) {
                configsReady = true;
                IDhApiGraphicsConfig graphics = config.graphics();
                if (graphics != null) {
                    // renderingEnabled
                    IDhApiConfigValue<Boolean> re = graphics.renderingEnabled();
                    if (re != null) {
                        try {
                            renderingEnabled = re.getValue();
                        } catch (Exception e) {
                            renderingEnabled = null;
                        }
                    }
                    
                    // genericRenderingEnabled
                    IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
                    if (genericRendering != null) {
                        IDhApiConfigValue<Boolean> gre = genericRendering.renderingEnabled();
                        if (gre != null) {
                            try {
                                genericRenderingEnabled = gre.getValue();
                            } catch (Exception e) {
                                genericRenderingEnabled = null;
                            }
                        }
                    }
                    
                    // renderingMode
                    IDhApiConfigValue<EDhApiRendererMode> rm = graphics.renderingMode();
                    if (rm != null) {
                        try {
                            rendererMode = rm.getValue();
                        } catch (Exception e) {
                            rendererMode = null;
                        }
                    }
                    
                    // chunkRenderDistance
                    IDhApiConfigValue<Integer> crd = graphics.chunkRenderDistance();
                    if (crd != null) {
                        try {
                            chunkRenderDistance = crd.getValue();
                        } catch (Exception e) {
                            chunkRenderDistance = null;
                        }
                    }
                    
                    // lodOnlyMode
                    IDhApiConfigValue<Boolean> lom = graphics.lodOnlyMode();
                    if (lom != null) {
                        try {
                            lodOnlyMode = lom.getValue();
                        } catch (Exception e) {
                            lodOnlyMode = null;
                        }
                    }
                }
            }
            
            // Runtime state from render proxy
            IDhApiRenderProxy proxy = DhApi.Delayed.renderProxy;
            if (proxy != null) {
                rendererExists = true;
                initialized = true;
                
                try {
                    renderingApi = proxy.getRenderingApi();
                } catch (IllegalStateException e) {
                    rendererDisabledByException = true;
                }
                
                try {
                    renderingEngine = proxy.getRenderingEngine();
                } catch (IllegalStateException e) {
                    rendererDisabledByException = true;
                }
                
                try {
                    nativeRenderer = proxy.isNativeRenderer();
                } catch (IllegalStateException e) {
                    rendererDisabledByException = true;
                }
            }
            
        } catch (Throwable t) {
            rendererDisabledByException = true;
            LOG.warn("[LOX DIAG] DH observation failed", t);
        }

        return new DhObservation(
            configsReady, renderingEnabled, genericRenderingEnabled,
            rendererMode, chunkRenderDistance, lodOnlyMode,
            rendererExists, rendererDisabledByException, initialized,
            renderingApi, renderingEngine, nativeRenderer
        );
    }

    // ========== Voxy Observation ==========

    private static VoxyObservation observeVoxy() {
        boolean configReady = false;
        Boolean enabled = null;
        Boolean enableRendering = null;
        Float sectionRenderDistance = null;
        Boolean isRenderingEnabled = null;
        boolean instanceExists = false;
        boolean instanceRunning = false;
        boolean isClientInstance = false;
        boolean renderSystemExists = false;
        boolean renderDistanceSet = false;

        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config != null) {
                configReady = true;
                enabled = config.enabled;
                enableRendering = config.enableRendering;
                sectionRenderDistance = config.sectionRenderDistance;
                isRenderingEnabled = config.isRenderingEnabled();
            }
            
            VoxyInstance instance = (VoxyInstance) VoxyCommon.getInstance();
            if (instance != null) {
                instanceExists = true;
                instanceRunning = instance.isRunning();
                
                // Check if we're on the client
                isClientInstance = !VoxyCommon.IS_DEDICATED_SERVER && VoxyCommon.IS_IN_MINECRAFT;
                
                // Check render system through reflection-like access
                // The MixinLevelRenderer implements IGetVoxyRenderSystem
                try {
                    net.minecraft.client.Minecraft mc = net.minecraft.client.Minecraft.getInstance();
                    if (mc != null && mc.levelRenderer instanceof IGetVoxyRenderSystem) {
                        IGetVoxyRenderSystem renderSys = 
                            (IGetVoxyRenderSystem) mc.levelRenderer;
                        VoxyRenderSystem vs = renderSys.voxy$getRenderSystem();
                        if (vs != null) {
                            renderSystemExists = true;
                            float targetedDist = VoxyRenderSystem.getRenderDistance();
                            renderDistanceSet = Math.abs(targetedDist - (sectionRenderDistance != null ? sectionRenderDistance : 0f)) < 0.1f;
                        }
                    }
                } catch (Throwable t) {
                    LOG.warn("[LOX DIAG] Voxy render system check failed", t);
                }
            }
            
        } catch (Throwable t) {
            LOG.warn("[LOX DIAG] Voxy observation failed", t);
        }

        return new VoxyObservation(
            configReady, enabled, enableRendering, sectionRenderDistance,
            isRenderingEnabled, instanceExists, instanceRunning,
            isClientInstance, renderSystemExists, renderDistanceSet
        );
    }

    // ========== Event Listener ==========

    private static void registerDhRenderEventListener() {
        try {
            DhApiResult<Void> result = DhApiEventRegister.on(
                DhApiBeforeRenderPassEvent.class,
                new DhApiBeforeRenderPassEvent() {
                    @Override
                    public void beforeRender(DhApiEventParam<DhApiRenderParam> event) {
                        dhRenderCallbackCount++;
                    }
                }
            );
            if (result != null && result.success) {
                dhEventListenerRegistered.set(true);
                LOG.info("[LOX DIAG] Registered DH render pass event listener");
            } else {
                LOG.warn("[LOX DIAG] Failed to register DH render event listener: {}", 
                    result != null ? result.message : "null result");
            }
        } catch (Throwable t) {
            LOG.warn("[LOX DIAG] Failed to register DH render event listener", t);
        }
    }

    // ========== State Tracking ==========

    private static void trackTransition(DhObservation dh, VoxyObservation voxy) {
        // DH transitions
        if (dh.renderingEnabled != null && !dh.renderingEnabled.equals(lastDhRenderingEnabled)) {
            String transition = "DH renderingEnabled: " + lastDhRenderingEnabled + " -> " + dh.renderingEnabled;
            dhTransitions.add(transition);
            LOG.info("[LOX DIAG] STATE TRANSITION: {}", transition);
            lastDhRenderingEnabled = dh.renderingEnabled;
        }
        
        // Voxy transitions
        if (voxy.isRenderingEnabled != null && !voxy.isRenderingEnabled.equals(lastVoxyIsRenderingEnabled)) {
            String transition = "Voxy isRenderingEnabled: " + lastVoxyIsRenderingEnabled + " -> " + voxy.isRenderingEnabled;
            voxyTransitions.add(transition);
            LOG.info("[LOX DIAG] STATE TRANSITION: {}", transition);
            lastVoxyIsRenderingEnabled = voxy.isRenderingEnabled;
        }
    }

    // ========== Logging ==========

    private static void logObservation(String phase, int sampleNum, DhObservation dh, VoxyObservation voxy) {
        LOG.info("[LOX DIAG] Phase={}, Sample={} | DH: configsReady={}, renderingEnabled={}, genericRenderingEnabled={}, " +
                 "rendererMode={}, chunkRenderDistance={}, rendererExists={}, rendererDisabledByException={}, " +
                 "initialized={}, renderApi={}, renderEngine={}, nativeRenderer={}",
            phase, sampleNum,
            dh.configsReady,
            dh.renderingEnabled,
            dh.genericRenderingEnabled,
            dh.rendererMode,
            dh.chunkRenderDistance,
            dh.rendererExists,
            dh.rendererDisabledByException,
            dh.initialized,
            dh.renderingApi,
            dh.renderingEngine,
            dh.nativeRenderer
        );
        
        LOG.info("[LOX DIAG] Phase={}, Sample={} | VOXY: configReady={}, enabled={}, enableRendering={}, " +
                 "sectionRenderDistance={}, instanceExists={}, instanceRunning={}, isClientInstance={}, " +
                 "renderSystemExists={}, renderDistanceSet={}",
            phase, sampleNum,
            voxy.configReady,
            voxy.enabled,
            voxy.enableRendering,
            voxy.sectionRenderDistance,
            voxy.instanceExists,
            voxy.instanceRunning,
            voxy.isClientInstance,
            voxy.renderSystemExists,
            voxy.renderDistanceSet
        );
    }

    private static void logDhFinalReport() {
        int onCount = 0;
        int offCount = 0;
        int unavailableCount = 0;
        int renderProxyAvailable = 0;
        int rendererInitialized = 0;
        
        for (DhSample s : dhSamples) {
            if (s.observation.renderingEnabled == null) {
                unavailableCount++;
            } else if (s.observation.renderingEnabled) {
                onCount++;
            } else {
                offCount++;
            }
            if (s.observation.rendererExists) {
                renderProxyAvailable++;
            }
            if (s.observation.initialized) {
                rendererInitialized++;
            }
        }
        
        LOG.info("[LOX DIAG] DH Final Report:");
        LOG.info("[LOX DIAG]   Samples: {}", dhSamples.size());
        LOG.info("[LOX DIAG]   renderingEnabled=true: {}", onCount);
        LOG.info("[LOX DIAG]   renderingEnabled=false: {}", offCount);
        LOG.info("[LOX DIAG]   renderingEnabled=null (UNAVAILABLE): {}", unavailableCount);
        LOG.info("[LOX DIAG]   renderProxy available: {}", renderProxyAvailable);
        LOG.info("[LOX DIAG]   renderer initialized: {}", rendererInitialized);
        LOG.info("[LOX DIAG]   render callbacks: {}", dhRenderCallbackCount);
    }

    private static void logVoxyFinalReport() {
        int onCount = 0;
        int offCount = 0;
        int unavailableCount = 0;
        int renderSystemExists = 0;
        
        for (VoxySample s : voxySamples) {
            if (s.observation.isRenderingEnabled == null) {
                unavailableCount++;
            } else if (s.observation.isRenderingEnabled) {
                onCount++;
            } else {
                offCount++;
            }
            if (s.observation.renderSystemExists) {
                renderSystemExists++;
            }
        }
        
        LOG.info("[LOX DIAG] Voxy Final Report:");
        LOG.info("[LOX DIAG]   Samples: {}", voxySamples.size());
        LOG.info("[LOX DIAG]   isRenderingEnabled=true: {}", onCount);
        LOG.info("[LOX DIAG]   isRenderingEnabled=false: {}", offCount);
        LOG.info("[LOX DIAG]   isRenderingEnabled=null (UNAVAILABLE): {}", unavailableCount);
        LOG.info("[LOX DIAG]   renderSystem exists: {}", renderSystemExists);
    }

    // ========== Verdicts ==========

    private static String determineDhVerdict() {
        if (dhSamples.isEmpty()) {
            return "INCONCLUSIVE (no samples collected)";
        }
        
        int onCount = 0;
        int offCount = 0;
        int unavailableCount = 0;
        int renderProxyAvailable = 0;
        int rendererCallbacks = dhRenderCallbackCount;
        
        for (DhSample s : dhSamples) {
            if (s.observation.renderingEnabled == null) {
                unavailableCount++;
            } else if (s.observation.renderingEnabled) {
                onCount++;
            } else {
                offCount++;
            }
            if (s.observation.rendererExists) {
                renderProxyAvailable++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Config ON=%d, OFF=%d, UNAVAILABLE=%d, RenderProxyAvailable=%d/%d", 
            onCount, offCount, unavailableCount, renderProxyAvailable, dhSamples.size()));
        sb.append(String.format(", RenderCallbacks=%d", rendererCallbacks));
        
        // Definitive ON: render proxy available AND render callbacks observed
        if (renderProxyAvailable > 0 && rendererCallbacks > 0) {
            sb.append(" -> DETERMINATION: ON");
        } else if (renderProxyAvailable > 0 && onCount > dhSamples.size() / 2) {
            sb.append(" -> DETERMINATION: LIKELY ON (but no render callbacks observed - may be misconfigured)");
        } else if (onCount == 0) {
            sb.append(" -> DETERMINATION: OFF");
        } else {
            sb.append(" -> DETERMINATION: INCONCLUSIVE");
        }
        
        return sb.toString();
    }

    private static String determineVoxyVerdict() {
        if (voxySamples.isEmpty()) {
            return "INCONCLUSIVE (no samples collected)";
        }
        
        int onCount = 0;
        int offCount = 0;
        int unavailableCount = 0;
        int renderSystemExists = 0;
        
        for (VoxySample s : voxySamples) {
            if (s.observation.isRenderingEnabled == null) {
                unavailableCount++;
            } else if (s.observation.isRenderingEnabled) {
                onCount++;
            } else {
                offCount++;
            }
            if (s.observation.renderSystemExists) {
                renderSystemExists++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Config ON=%d, OFF=%d, UNAVAILABLE=%d, RenderSystemExists=%d/%d", 
            onCount, offCount, unavailableCount, renderSystemExists, voxySamples.size()));
        
        // Definitive ON: render system exists AND config says ON
        if (renderSystemExists > 0 && onCount > voxySamples.size() / 2) {
            sb.append(" -> DETERMINATION: ON");
        } else if (renderSystemExists > 0 && onCount > 0) {
            sb.append(" -> DETERMINATION: LIKELY ON (config partially met)");
        } else if (onCount == 0) {
            sb.append(" -> DETERMINATION: OFF");
        } else {
            sb.append(" -> DETERMINATION: INCONCLUSIVE");
        }
        
        return sb.toString();
    }

    // ========== Inner Classes ==========

    public static class DhObservation {
        public final boolean configsReady;
        public final Boolean renderingEnabled;
        public final Boolean genericRenderingEnabled;
        public final EDhApiRendererMode rendererMode;
        public final Integer chunkRenderDistance;
        public final Boolean lodOnlyMode;
        public final boolean rendererExists;
        public final boolean rendererDisabledByException;
        public final boolean initialized;
        public final EDhApiRenderingApi renderingApi;
        public final EDhApiRenderingEngine renderingEngine;
        public final boolean nativeRenderer;

        public DhObservation(boolean configsReady, Boolean renderingEnabled, Boolean genericRenderingEnabled,
                           EDhApiRendererMode rendererMode, Integer chunkRenderDistance, Boolean lodOnlyMode,
                           boolean rendererExists, boolean rendererDisabledByException, boolean initialized,
                           EDhApiRenderingApi renderingApi, EDhApiRenderingEngine renderingEngine, boolean nativeRenderer) {
            this.configsReady = configsReady;
            this.renderingEnabled = renderingEnabled;
            this.genericRenderingEnabled = genericRenderingEnabled;
            this.rendererMode = rendererMode;
            this.chunkRenderDistance = chunkRenderDistance;
            this.lodOnlyMode = lodOnlyMode;
            this.rendererExists = rendererExists;
            this.rendererDisabledByException = rendererDisabledByException;
            this.initialized = initialized;
            this.renderingApi = renderingApi;
            this.renderingEngine = renderingEngine;
            this.nativeRenderer = nativeRenderer;
        }

        /**
         * Returns true if all critical conditions for active DH rendering are met.
         */
        public boolean allConditionsMet() {
            return configsReady 
                && Boolean.TRUE.equals(renderingEnabled)
                && rendererExists
                && initialized
                && !rendererDisabledByException;
        }
    }

    public static class VoxyObservation {
        public final boolean configReady;
        public final Boolean enabled;
        public final Boolean enableRendering;
        public final Float sectionRenderDistance;
        public final Boolean isRenderingEnabled;
        public final boolean instanceExists;
        public final boolean instanceRunning;
        public final boolean isClientInstance;
        public final boolean renderSystemExists;
        public final boolean renderDistanceSet;

        public VoxyObservation(boolean configReady, Boolean enabled, Boolean enableRendering,
                             Float sectionRenderDistance, Boolean isRenderingEnabled,
                             boolean instanceExists, boolean instanceRunning, boolean isClientInstance,
                             boolean renderSystemExists, boolean renderDistanceSet) {
            this.configReady = configReady;
            this.enabled = enabled;
            this.enableRendering = enableRendering;
            this.sectionRenderDistance = sectionRenderDistance;
            this.isRenderingEnabled = isRenderingEnabled;
            this.instanceExists = instanceExists;
            this.instanceRunning = instanceRunning;
            this.isClientInstance = isClientInstance;
            this.renderSystemExists = renderSystemExists;
            this.renderDistanceSet = renderDistanceSet;
        }

        /**
         * Returns true if all critical conditions for active Voxy rendering are met.
         */
        public boolean allConditionsMet() {
            return configReady
                && Boolean.TRUE.equals(isRenderingEnabled)
                && instanceExists
                && renderSystemExists;
        }
    }

    public static class DhSample {
        public final DhObservation observation;
        public final int tickCount;

        public DhSample(DhObservation observation, int tickCount) {
            this.observation = observation;
            this.tickCount = tickCount;
        }
    }

    public static class VoxySample {
        public final VoxyObservation observation;
        public final int tickCount;

        public VoxySample(VoxyObservation observation, int tickCount) {
            this.observation = observation;
            this.tickCount = tickCount;
        }
    }
}
