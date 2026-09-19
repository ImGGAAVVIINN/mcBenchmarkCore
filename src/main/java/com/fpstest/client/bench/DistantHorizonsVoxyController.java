package com.fpstest.client.bench;

import com.seibel.distanthorizons.api.DhApi;
import com.seibel.distanthorizons.api.interfaces.config.IDhApiConfig;
import com.seibel.distanthorizons.api.interfaces.config.client.IDhApiGraphicsConfig;
import com.seibel.distanthorizons.api.interfaces.config.client.IDhApiGenericRenderingConfig;
import com.seibel.distanthorizons.api.interfaces.config.IDhApiConfigValue;
import me.cortex.voxy.client.config.VoxyConfig;
import me.cortex.voxy.commonImpl.VoxyCommon;
import me.cortex.voxy.commonImpl.VoxyInstance;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls Distant Horizons and Voxy rendering state during the FULL BENCHMARK session.
 *
 * <p>Lifecycle:
 * <ol>
 *   <li>Session start ({@link #captureAndDisable()}): Capture user's original DH/Voxy config,
 *       disable both mods' rendering.</li>
 *   <li>Before chunk-loading benchmarks ({@link #enableForChunkLoading()}): Enable DH at
 *       4096 chunk render distance and Voxy at 1024 section render distance. Verify
 *       actual state via API reads.</li>
 *   <li>After chunk-loading benchmarks ({@link #disableAfterChunkLoading()}): Disable both
 *       mods' rendering. Verify actual state via API reads.</li>
 *   <li>Session end ({@link #restore()}): Restore user's exact original configuration.
 *       Verify actual state via API reads.</li>
 * </ol>
 *
 * <p>All operations are guarded by mod presence checks ({@link FabricLoader#isModLoaded})
 * so this mod has no hard dependency on DH or Voxy.
 */
@Environment(EnvType.CLIENT)
public final class DistantHorizonsVoxyController {
    private static final Logger LOG = LoggerFactory.getLogger(DistantHorizonsVoxyController.class);

    // Distant Horizons
    private static final String DH_MOD_ID = "distanthorizons";
    private static final String DH_API_MOD_ID = "dh-api";

    // Voxy
    private static final String VOXY_MOD_ID = "voxy";

    // Target values for chunk-loading test
    private static final int DH_TARGET_CHUNK_RENDER_DISTANCE = 4096;
    private static final float VOXY_TARGET_SECTION_RENDER_DISTANCE = 1024.0f;

    // Saved original state
    private boolean dhModPresent;
    private boolean voxyModPresent;

    // DH original state
    private Boolean originalDhRenderingEnabled;
    private Integer originalDhChunkRenderDistance;
    private Boolean originalDhGenericRenderingEnabled;

    // Voxy original state
    private Boolean originalVoxyEnabled;
    private Boolean originalVoxyEnableRendering;
    private Float originalVoxySectionRenderDistance;

    private boolean captured = false;
    private boolean chunkLoadingEnabled = false;

    /** Capture original config and disable both mods' rendering. */
    public void captureAndDisable() {
        if (captured) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: captureAndDisable called twice, ignoring");
            return;
        }

        dhModPresent = FabricLoader.getInstance().isModLoaded(DH_MOD_ID) && FabricLoader.getInstance().isModLoaded(DH_API_MOD_ID);
        voxyModPresent = FabricLoader.getInstance().isModLoaded(VOXY_MOD_ID);

        LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: dhPresent={}, voxyPresent={}", dhModPresent, voxyModPresent);

        if (dhModPresent) {
            captureAndDisableDh();
        }
        if (voxyModPresent) {
            captureAndDisableVoxy();
        }

        captured = true;
        LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: captureAndDisable complete");
    }

    /** Enable DH and Voxy for chunk-loading test with target distances. */
    public void enableForChunkLoading() {
        if (!captured) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: enableForChunkLoading called before captureAndDisable");
            return;
        }
        if (chunkLoadingEnabled) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: already enabled for chunk loading");
            return;
        }

        boolean dhOk = true;
        boolean voxyOk = true;

        if (dhModPresent) {
            dhOk = enableDhForChunkLoading();
        }
        if (voxyModPresent) {
            voxyOk = enableVoxyForChunkLoading();
        }

        chunkLoadingEnabled = dhOk && voxyOk;
        LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: enableForChunkLoading complete, dhOk={}, voxyOk={}", dhOk, voxyOk);
    }

    /** Disable DH and Voxy after chunk-loading test. */
    public void disableAfterChunkLoading() {
        if (!captured) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: disableAfterChunkLoading called before captureAndDisable");
            return;
        }
        if (!chunkLoadingEnabled) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: not enabled for chunk loading, nothing to disable");
            return;
        }

        boolean dhOk = true;
        boolean voxyOk = true;

        if (dhModPresent) {
            dhOk = disableDhAfterChunkLoading();
        }
        if (voxyModPresent) {
            voxyOk = disableVoxyAfterChunkLoading();
        }

        chunkLoadingEnabled = false;
        LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: disableAfterChunkLoading complete, dhOk={}, voxyOk={}", dhOk, voxyOk);
    }

    /** Restore user's original DH/Voxy configuration. */
    public void restore() {
        if (!captured) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: restore called before captureAndDisable");
            return;
        }

        boolean dhOk = true;
        boolean voxyOk = true;

        if (dhModPresent) {
            dhOk = restoreDh();
        }
        if (voxyModPresent) {
            voxyOk = restoreVoxy();
        }

        captured = false;
        chunkLoadingEnabled = false;
        LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restore complete, dhOk={}, voxyOk={}", dhOk, voxyOk);
    }

    // ========== Distant Horizons ==========

    private void captureAndDisableDh() {
        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: DhApi.Delayed.configs is null");
                dhModPresent = false;
                return;
            }

            IDhApiGraphicsConfig graphics = config.graphics();
            if (graphics == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: graphics config is null");
                dhModPresent = false;
                return;
            }

            // Capture original renderingEnabled (main graphics toggle)
            IDhApiConfigValue<Boolean> renderingEnabled = graphics.renderingEnabled();
            if (renderingEnabled != null) {
                originalDhRenderingEnabled = renderingEnabled.getValue();
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: captured original DH renderingEnabled={}", originalDhRenderingEnabled);
            }

            // Capture original chunkRenderDistance
            IDhApiConfigValue<Integer> chunkRenderDistance = graphics.chunkRenderDistance();
            if (chunkRenderDistance != null) {
                originalDhChunkRenderDistance = chunkRenderDistance.getValue();
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: captured original DH chunkRenderDistance={}", originalDhChunkRenderDistance);
            }

            // Capture original genericRendering.renderingEnabled
            IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
            if (genericRendering != null) {
                IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering.renderingEnabled();
                if (genericRenderingEnabled != null) {
                    originalDhGenericRenderingEnabled = genericRenderingEnabled.getValue();
                    LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: captured original DH genericRenderingEnabled={}", originalDhGenericRenderingEnabled);
                }
            }

            // Disable rendering
            if (renderingEnabled != null) {
                boolean set = renderingEnabled.setValue(false);
                Boolean actual = renderingEnabled.getValue();
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: disabled DH renderingEnabled, setResult={}, actual={}", set, actual);
            }
            if (genericRendering != null) {
                IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering.renderingEnabled();
                if (genericRenderingEnabled != null) {
                    boolean set = genericRenderingEnabled.setValue(false);
                    Boolean actual = genericRenderingEnabled.getValue();
                    LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: disabled DH genericRenderingEnabled, setResult={}, actual={}", set, actual);
                }
            }

            // Verify disabled
            verifyDhDisabled();

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: captureAndDisableDh failed", t);
            dhModPresent = false;
        }
    }

    private boolean enableDhForChunkLoading() {
        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: DhApi.Delayed.configs is null during enable");
                return false;
            }

            IDhApiGraphicsConfig graphics = config.graphics();
            if (graphics == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: graphics config is null during enable");
                return false;
            }

            // Enable renderingEnabled
            IDhApiConfigValue<Boolean> renderingEnabled = graphics.renderingEnabled();
            if (renderingEnabled != null) {
                boolean set = renderingEnabled.setValue(true);
                Boolean actual = renderingEnabled.getValue();
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: enabled DH renderingEnabled, setResult={}, actual={}", set, actual);
            }

            // Enable genericRendering.renderingEnabled
            IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
            if (genericRendering != null) {
                IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering.renderingEnabled();
                if (genericRenderingEnabled != null) {
                    boolean set = genericRenderingEnabled.setValue(true);
                    Boolean actual = genericRenderingEnabled.getValue();
                    LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: enabled DH genericRenderingEnabled, setResult={}, actual={}", set, actual);
                }
            }

            // Set chunkRenderDistance to 4096
            IDhApiConfigValue<Integer> chunkRenderDistance = graphics.chunkRenderDistance();
            if (chunkRenderDistance != null) {
                boolean set = chunkRenderDistance.setValue(DH_TARGET_CHUNK_RENDER_DISTANCE);
                Integer actual = chunkRenderDistance.getValue();
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: set DH chunkRenderDistance to {}, setResult={}, actual={}", DH_TARGET_CHUNK_RENDER_DISTANCE, set, actual);
            }

            // Verify enabled
            return verifyDhEnabled();

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: enableDhForChunkLoading failed", t);
            return false;
        }
    }

    private boolean disableDhAfterChunkLoading() {
        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: DhApi.Delayed.configs is null during disable");
                return false;
            }

            IDhApiGraphicsConfig graphics = config.graphics();
            if (graphics == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: graphics config is null during disable");
                return false;
            }

            // Disable renderingEnabled
            IDhApiConfigValue<Boolean> renderingEnabled = graphics.renderingEnabled();
            if (renderingEnabled != null) {
                boolean set = renderingEnabled.setValue(false);
                Boolean actual = renderingEnabled.getValue();
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: disabled DH renderingEnabled, setResult={}, actual={}", set, actual);
            }

            // Disable genericRendering.renderingEnabled
            IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
            if (genericRendering != null) {
                IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering.renderingEnabled();
                if (genericRenderingEnabled != null) {
                    boolean set = genericRenderingEnabled.setValue(false);
                    Boolean actual = genericRenderingEnabled.getValue();
                    LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: disabled DH genericRenderingEnabled, setResult={}, actual={}", set, actual);
                }
            }

            // Verify disabled
            return verifyDhDisabled();

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: disableDhAfterChunkLoading failed", t);
            return false;
        }
    }

    private boolean restoreDh() {
        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: DhApi.Delayed.configs is null during restore");
                return false;
            }

            IDhApiGraphicsConfig graphics = config.graphics();
            if (graphics == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: graphics config is null during restore");
                return false;
            }

            boolean allOk = true;

            // Restore renderingEnabled
            if (originalDhRenderingEnabled != null) {
                IDhApiConfigValue<Boolean> renderingEnabled = graphics.renderingEnabled();
                if (renderingEnabled != null) {
                    boolean set = renderingEnabled.setValue(originalDhRenderingEnabled);
                    Boolean actual = renderingEnabled.getValue();
                    boolean ok = originalDhRenderingEnabled.equals(actual);
                    LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restored DH renderingEnabled to {}, setResult={}, actual={}, ok={}", originalDhRenderingEnabled, set, actual, ok);
                    allOk &= ok;
                }
            }

            // Restore chunkRenderDistance
            if (originalDhChunkRenderDistance != null) {
                IDhApiConfigValue<Integer> chunkRenderDistance = graphics.chunkRenderDistance();
                if (chunkRenderDistance != null) {
                    boolean set = chunkRenderDistance.setValue(originalDhChunkRenderDistance);
                    Integer actual = chunkRenderDistance.getValue();
                    boolean ok = originalDhChunkRenderDistance.equals(actual);
                    LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restored DH chunkRenderDistance to {}, setResult={}, actual={}, ok={}", originalDhChunkRenderDistance, set, actual, ok);
                    allOk &= ok;
                }
            }

            // Restore genericRenderingEnabled
            if (originalDhGenericRenderingEnabled != null) {
                IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
                if (genericRendering != null) {
                    IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering.renderingEnabled();
                    if (genericRenderingEnabled != null) {
                        boolean set = genericRenderingEnabled.setValue(originalDhGenericRenderingEnabled);
                        Boolean actual = genericRenderingEnabled.getValue();
                        boolean ok = originalDhGenericRenderingEnabled.equals(actual);
                        LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restored DH genericRenderingEnabled to {}, setResult={}, actual={}, ok={}", originalDhGenericRenderingEnabled, set, actual, ok);
                        allOk &= ok;
                    }
                }
            }

            return allOk;

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: restoreDh failed", t);
            return false;
        }
    }

    private boolean verifyDhDisabled() {
        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config == null) return false;
            IDhApiGraphicsConfig graphics = config.graphics();
            if (graphics == null) return false;

            IDhApiConfigValue<Boolean> renderingEnabled = graphics.renderingEnabled();
            IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
            IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering != null ? genericRendering.renderingEnabled() : null;

            Boolean re = renderingEnabled != null ? renderingEnabled.getValue() : null;
            Boolean gre = genericRenderingEnabled != null ? genericRenderingEnabled.getValue() : null;

            boolean reOk = Boolean.FALSE.equals(re);
            boolean greOk = Boolean.FALSE.equals(gre);

            LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: verify DH disabled - renderingEnabled={} (ok={}), genericRenderingEnabled={} (ok={})", re, reOk, gre, greOk);
            return reOk && greOk;
        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: verifyDhDisabled failed", t);
            return false;
        }
    }

    private boolean verifyDhEnabled() {
        try {
            IDhApiConfig config = DhApi.Delayed.configs;
            if (config == null) return false;
            IDhApiGraphicsConfig graphics = config.graphics();
            if (graphics == null) return false;

            IDhApiConfigValue<Boolean> renderingEnabled = graphics.renderingEnabled();
            IDhApiGenericRenderingConfig genericRendering = graphics.genericRendering();
            IDhApiConfigValue<Boolean> genericRenderingEnabled = genericRendering != null ? genericRendering.renderingEnabled() : null;
            IDhApiConfigValue<Integer> chunkRenderDistance = graphics.chunkRenderDistance();

            Boolean re = renderingEnabled != null ? renderingEnabled.getValue() : null;
            Boolean gre = genericRenderingEnabled != null ? genericRenderingEnabled.getValue() : null;
            Integer crd = chunkRenderDistance != null ? chunkRenderDistance.getValue() : null;

            boolean reOk = Boolean.TRUE.equals(re);
            boolean greOk = Boolean.TRUE.equals(gre);
            boolean crdOk = DH_TARGET_CHUNK_RENDER_DISTANCE == crd;

            LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: verify DH enabled - renderingEnabled={} (ok={}), genericRenderingEnabled={} (ok={}), chunkRenderDistance={} (ok={}, target={})",
                     re, reOk, gre, greOk, crd, crdOk, DH_TARGET_CHUNK_RENDER_DISTANCE);

            return reOk && greOk && crdOk;

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: verifyDhEnabled failed", t);
            return false;
        }
    }

    // ========== Voxy ==========

    private void captureAndDisableVoxy() {
        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: VoxyConfig.CONFIG is null");
                voxyModPresent = false;
                return;
            }

            // Capture original state
            originalVoxyEnabled = config.enabled;
            originalVoxyEnableRendering = config.enableRendering;
            originalVoxySectionRenderDistance = config.sectionRenderDistance;

            LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: captured original Voxy enabled={}, enableRendering={}, sectionRenderDistance={}",
                     originalVoxyEnabled, originalVoxyEnableRendering, originalVoxySectionRenderDistance);

            // Disable rendering
            config.enabled = false;
            config.enableRendering = false;
            config.save();

            // Verify disabled
            verifyVoxyDisabled();

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: captureAndDisableVoxy failed", t);
            voxyModPresent = false;
        }
    }

    private boolean enableVoxyForChunkLoading() {
        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: VoxyConfig.CONFIG is null during enable");
                return false;
            }

            // Enable
            config.enabled = true;
            config.enableRendering = true;
            config.sectionRenderDistance = VOXY_TARGET_SECTION_RENDER_DISTANCE;
            config.save();

            // Verify enabled
            return verifyVoxyEnabled();

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: enableVoxyForChunkLoading failed", t);
            return false;
        }
    }

    private boolean disableVoxyAfterChunkLoading() {
        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: VoxyConfig.CONFIG is null during disable");
                return false;
            }

            // Disable
            config.enabled = false;
            config.enableRendering = false;
            config.save();

            // Verify disabled
            return verifyVoxyDisabled();

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: disableVoxyAfterChunkLoading failed", t);
            return false;
        }
    }

    private boolean restoreVoxy() {
        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config == null) {
                LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: VoxyConfig.CONFIG is null during restore");
                return false;
            }

            boolean allOk = true;

            if (originalVoxyEnabled != null) {
                config.enabled = originalVoxyEnabled;
                boolean ok = originalVoxyEnabled.equals(config.enabled);
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restored Voxy enabled to {}, actual={}, ok={}", originalVoxyEnabled, config.enabled, ok);
                allOk &= ok;
            }

            if (originalVoxyEnableRendering != null) {
                config.enableRendering = originalVoxyEnableRendering;
                boolean ok = originalVoxyEnableRendering.equals(config.enableRendering);
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restored Voxy enableRendering to {}, actual={}, ok={}", originalVoxyEnableRendering, config.enableRendering, ok);
                allOk &= ok;
            }

            if (originalVoxySectionRenderDistance != null) {
                config.sectionRenderDistance = originalVoxySectionRenderDistance;
                boolean ok = originalVoxySectionRenderDistance.equals(config.sectionRenderDistance);
                LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: restored Voxy sectionRenderDistance to {}, actual={}, ok={}", originalVoxySectionRenderDistance, config.sectionRenderDistance, ok);
                allOk &= ok;
            }

            config.save();
            return allOk;

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: restoreVoxy failed", t);
            return false;
        }
    }

    private boolean verifyVoxyDisabled() {
        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config == null) return false;

            boolean enabledOk = !config.enabled;
            boolean enableRenderingOk = !config.enableRendering;

            LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: verify Voxy disabled - enabled={} (ok={}), enableRendering={} (ok={}), sectionRenderDistance={}",
                     config.enabled, enabledOk, config.enableRendering, enableRenderingOk, config.sectionRenderDistance);
            return enabledOk && enableRenderingOk;
        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: verifyVoxyDisabled failed", t);
            return false;
        }
    }

    private boolean verifyVoxyEnabled() {
        try {
            VoxyConfig config = VoxyConfig.CONFIG;
            if (config == null) return false;

            boolean enabledOk = config.enabled;
            boolean enableRenderingOk = config.enableRendering;
            boolean distanceOk = Math.abs(config.sectionRenderDistance - VOXY_TARGET_SECTION_RENDER_DISTANCE) < 0.001f;

            LOG.info("[Minecraft Benchmark Core] DH/Voxy controller: verify Voxy enabled - enabled={} (ok={}), enableRendering={} (ok={}), sectionRenderDistance={} (ok={}, target={})",
                     config.enabled, enabledOk, config.enableRendering, enableRenderingOk, config.sectionRenderDistance, distanceOk, VOXY_TARGET_SECTION_RENDER_DISTANCE);

            return enabledOk && enableRenderingOk && distanceOk;

        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] DH/Voxy controller: verifyVoxyEnabled failed", t);
            return false;
        }
    }
}