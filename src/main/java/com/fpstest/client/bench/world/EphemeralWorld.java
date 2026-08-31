package com.fpstest.client.bench.world;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.mixin.MinecraftServerAccessor;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.Executor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Difficulty;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.worldselection.WorldOpenFlows;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.levelgen.WorldDimensions;
import net.minecraft.world.level.levelgen.WorldOptions;
import net.minecraft.world.level.levelgen.flat.FlatLayerInfo;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorSettings;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.storage.LevelResource;
import net.minecraft.world.level.storage.LevelStorageSource;
import net.minecraft.world.level.storage.PrimaryLevelData;
import net.minecraft.world.level.storage.DerivedLevelData;
import net.minecraft.world.level.storage.ServerLevelData;
import net.minecraft.world.level.storage.WorldData;
import net.minecraft.world.level.WorldDataConfiguration;
import net.minecraft.world.level.LevelSettings;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.chunk.ChunkGeneratorStructureState;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.RandomSequences;
import net.minecraft.util.random.WeightedRandom;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.CustomSpawner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Supplier;

@Environment(EnvType.CLIENT)
public final class EphemeralWorld {
    public static final String LEVEL_ID = "fpstest-arena";
    private static volatile String currentLevelId = "fpstest-arena";
    private static volatile ResourceKey<Level> currentDimensionKey = null;

    private EphemeralWorld() {
    }

    public static String currentLevelId() {
        return currentLevelId;
    }

    public static ResourceKey<Level> currentDimensionKey() {
        return currentDimensionKey;
    }

    public static void create(long seed, WorldType type) {
        Minecraft mc = Minecraft.getInstance();
        String levelId = "fpstest-arena";

        try {
            Path existing = mc.getLevelSource().getLevelPath(LevelResource.ROOT.getId()).resolve("fpstest-arena");
            if (Files.exists(existing)) {
                levelId = "fpstest-arena-" + System.currentTimeMillis() / 1000L;
                FpsTestClient.LOG.warn("[FPS Test] using fallback arena name: {} (previous save tree still present)", levelId);
            }
        } catch (Exception var9) {
            FpsTestClient.LOG.debug("[FPS Test] could not probe save dir for fallback name: {}", var9.getMessage());
        }

        currentLevelId = levelId;

        FpsTestClient.LOG.info("[FPS Test] creating ephemeral world seed={}, type={}, levelId={}", seed, type.kind, levelId);

        // Create game rules for the ephemeral world
        GameRules rules = new GameRules(FeatureFlagSet.of());
        rules.set(GameRules.ADVANCE_TIME, false, null);
        rules.set(GameRules.ADVANCE_WEATHER, false, null);
        rules.set(GameRules.SPAWN_MOBS, false, null);
        rules.set(GameRules.MOB_DROPS, false, null);
        rules.set(GameRules.BLOCK_DROPS, false, null);
        rules.set(GameRules.ENTITY_DROPS, false, null);
        rules.set(GameRules.FIRE_SPREAD_RADIUS_AROUND_PLAYER, 0, null);
        rules.set(GameRules.MOB_GRIEFING, false, null);
        rules.set(GameRules.SPAWN_PATROLS, false, null);
        rules.set(GameRules.SPAWN_WANDERING_TRADERS, false, null);
        rules.set(GameRules.SPAWN_WARDENS, false, null);

        // Create level settings
        LevelSettings settings = new LevelSettings("FPS Test Arena", GameType.CREATIVE, false, Difficulty.PEACEFUL, true, rules, WorldDataConfiguration.DEFAULT);
        WorldOptions opts = new WorldOptions(seed, false, false);

        // Build the WorldDimensions using a function that takes HolderLookup.Provider
        // This matches the reference implementation's approach using WorldOpenFlows.createFreshLevel
        java.util.function.Function<HolderLookup.Provider, WorldDimensions> dims = provider -> {
            return buildDimensions(provider, type);
        };

        // Use WorldOpenFlows.createFreshLevel() to properly create the level
        // This replaces the manual ServerLevel construction and insertion into levels map
        mc.createWorldOpenFlows().createFreshLevel(levelId, settings, opts, dims, null);

        FpsTestClient.LOG.info("[FPS Test] created ephemeral world seed={}, type={}, levelId={}", seed, type.kind, levelId);
    }

    /**
     * Destroys the ephemeral world by removing it from the server's levels map
     * and cleaning up resources. Must be called on the server thread.
     */
    public static void destroy() {
        Minecraft mc = Minecraft.getInstance();
        MinecraftServer server = mc.getSingleplayerServer();
        if (server == null || currentDimensionKey == null) {
            FpsTestClient.LOG.debug("[FPS Test] No ephemeral world to destroy");
            return;
        }

        // Remove from levels map
        ServerLevel level = ((MinecraftServerAccessor) server).fpstest$getLevels().remove(currentDimensionKey);
        if (level != null) {
            // Close the level resources
            try {
                level.close();
            } catch (IOException e) {
                FpsTestClient.LOG.error("[FPS Test] Failed to close ephemeral world", e);
            }
            FpsTestClient.LOG.info("[FPS Test] destroyed ephemeral world dimensionKey={}", currentDimensionKey);
        } else {
            FpsTestClient.LOG.warn("[FPS Test] Ephemeral world not found in levels map for dimensionKey={}", currentDimensionKey);
        }

        currentDimensionKey = null;
    }

    /**
     * Schedules the destruction of the ephemeral world on the server thread.
     * Use this when calling from the client thread.
     */
    public static void destroyAsync() {
        Minecraft mc = Minecraft.getInstance();
        MinecraftServer server = mc.getSingleplayerServer();
        if (server == null) {
            return;
        }
        server.execute(EphemeralWorld::destroy);
    }

    private static WorldDimensions buildDimensions(HolderLookup.Provider provider, WorldType type) {
        LevelStem stem = switch (type.kind) {
            case OVERWORLD -> buildOverworldDimensions(provider);
            case FLAT -> buildFlatDimensions(provider);
            case FIXED_BIOME -> buildFixedBiomeDimensions(provider, type.biome);
        };
        Map<ResourceKey<LevelStem>, LevelStem> dimMap = new HashMap<>();
        dimMap.put(LevelStem.OVERWORLD, stem);
        return new WorldDimensions(dimMap);
    }

    private static LevelStem buildOverworldDimensions(HolderLookup.Provider provider) {
        // Get the overworld dimension type from BuiltinDimensionTypes
        ResourceKey<DimensionType> overworldDimTypeKey = BuiltinDimensionTypes.OVERWORLD;
        Holder<DimensionType> dimTypeHolder = provider.lookupOrThrow(Registries.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        // Get the overworld noise settings
        ResourceKey<NoiseGeneratorSettings> overworldNoiseKey = NoiseGeneratorSettings.OVERWORLD;
        Holder<NoiseGeneratorSettings> noiseSettings = provider.lookupOrThrow(Registries.NOISE_SETTINGS).getOrThrow(overworldNoiseKey);
        
        // Create the chunk generator
        NoiseBasedChunkGenerator generator = new NoiseBasedChunkGenerator(
            new FixedBiomeSource(provider.lookupOrThrow(Registries.BIOME).getOrThrow(Biomes.PLAINS)),
            noiseSettings
        );
        
        return new LevelStem(dimTypeHolder, generator);
    }

    private static LevelStem buildFlatDimensions(HolderLookup.Provider provider) {
        Holder<Biome> biomeHolder = provider.lookupOrThrow(Registries.BIOME).getOrThrow(Biomes.PLAINS);
        
        // FlatLayerInfo constructor takes (int, Block) not BlockState
        List<FlatLayerInfo> layers = List.of(
            new FlatLayerInfo(1, Blocks.BEDROCK),
            new FlatLayerInfo(2, Blocks.DIRT),
            new FlatLayerInfo(1, Blocks.GRASS_BLOCK)
        );
        
        // FlatLevelGeneratorSettings: use withBiomeAndLayers for layers
        // Constructor: (Optional<HolderSet<StructureSet>>, Holder<Biome>, List<Holder<PlacedFeature>>)
        // Method: withBiomeAndLayers(List<FlatLayerInfo>, Optional<HolderSet<StructureSet>>, Holder<Biome>)
        FlatLevelGeneratorSettings flatSettings = new FlatLevelGeneratorSettings(
            Optional.empty(),
            biomeHolder,
            List.of()
        ).withBiomeAndLayers(layers, Optional.empty(), biomeHolder);
        
        // FlatLevelSource constructor takes only FlatLevelGeneratorSettings
        FlatLevelSource generator = new FlatLevelSource(flatSettings);
        
        // Get the overworld dimension type from BuiltinDimensionTypes
        ResourceKey<DimensionType> overworldDimTypeKey = BuiltinDimensionTypes.OVERWORLD;
        Holder<DimensionType> dimTypeHolder = provider.lookupOrThrow(Registries.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        return new LevelStem(dimTypeHolder, generator);
    }

    private static LevelStem buildFixedBiomeDimensions(HolderLookup.Provider provider, ResourceKey<Biome> biomeKey) {
        Holder<Biome> biomeHolder = provider.lookupOrThrow(Registries.BIOME).getOrThrow(biomeKey);
        
        // Get the overworld noise settings
        ResourceKey<NoiseGeneratorSettings> overworldNoiseKey = NoiseGeneratorSettings.OVERWORLD;
        Holder<NoiseGeneratorSettings> noiseSettings = provider.lookupOrThrow(Registries.NOISE_SETTINGS).getOrThrow(overworldNoiseKey);
        
        FixedBiomeSource source = new FixedBiomeSource(biomeHolder);
        // NoiseGeneratorSettings is a record, use it directly
        NoiseBasedChunkGenerator generator = new NoiseBasedChunkGenerator(source, noiseSettings);
        
        // Get the overworld dimension type from BuiltinDimensionTypes
        ResourceKey<DimensionType> overworldDimTypeKey = BuiltinDimensionTypes.OVERWORLD;
        Holder<DimensionType> dimTypeHolder = provider.lookupOrThrow(Registries.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        return new LevelStem(dimTypeHolder, generator);
    }

    public static void deleteSaveQuietly() {
        deleteSaveCore(false);
    }

    public static void deleteSaveBlocking() {
        deleteSaveCore(true);
    }

    private static void deleteSaveCore(boolean blocking) {
        Minecraft mc = Minecraft.getInstance();
        LevelStorageSource src = mc.getLevelSource();
        Path saveDir = src.getLevelPath(LevelResource.ROOT.getId()).resolve("fpstest-arena");
        if (!Files.exists(saveDir)) {
            FpsTestClient.LOG.debug("[FPS Test] cleanup: no stale arena directory at {}", saveDir);
        } else {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException var12) {
                Thread.currentThread().interrupt();
                return;
            }

            try {
                LevelStorageSource.LevelStorageAccess access = src.createAccess("fpstest-arena");

                try {
                    try {
                        access.close();
                    } catch (IOException var11) {
                    }
                } catch (Throwable var14) {
                    if (access != null) {
                        try {
                            access.close();
                        } catch (Throwable var10) {
                            var14.addSuppressed(var10);
                        }
                    }

                    throw var14;
                }

                if (access != null) {
                    access.close();
                }
            } catch (Exception var15) {
                FpsTestClient.LOG.info("[FPS Test] could not open arena session for cleanup ({})", var15.getMessage());
            }

            int maxPasses = blocking ? 3 : 5;
            long passDelayMs = blocking ? 500L : 750L;
            IOException lastError = null;

            for (int pass = 0; pass < maxPasses; pass++) {
                try {
                    Files.walkFileTree(saveDir, new SimpleFileVisitor<Path>() {
                        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                            deleteWithRetry(file);
                            return FileVisitResult.CONTINUE;
                        }

                        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                            deleteWithRetry(dir);
                            return FileVisitResult.CONTINUE;
                        }
                    });
                    if (!Files.exists(saveDir)) {
                        if (pass > 0) {
                            FpsTestClient.LOG.info("[FPS Test] cleanup succeeded (pass {})", pass + 1);
                        } else {
                            FpsTestClient.LOG.debug("[FPS Test] cleanup succeeded (first pass)");
                        }

                        return;
                    }

                    lastError = null;
                } catch (IOException var9) {
                    lastError = var9;
                }

                try {
                    Thread.sleep(passDelayMs);
                } catch (InterruptedException var13) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }

            if (lastError != null) {
                FpsTestClient.LOG
                    .warn(
                        "[FPS Test] cleanup deferred: failed to delete arena save tree at {} after {} passes ({}). Next run will use a fallback arena name; full retry on next FPS Test launch.",
                        new Object[]{saveDir, maxPasses, lastError.getMessage()}
                    );
            } else if (Files.exists(saveDir)) {
                FpsTestClient.LOG
                    .warn(
                        "[FPS Test] cleanup deferred: arena save tree at {} still present after {} passes. Next run will use a fallback arena name; full retry on next FPS Test launch.",
                        saveDir,
                        maxPasses
                    );
            }
        }
    }

    public static void cleanupStaleOnStartup() {
        try {
            Minecraft mc = Minecraft.getInstance();
            LevelStorageSource src = mc.getLevelSource();
            Path saveDir = src.getLevelPath(LevelResource.ROOT.getId()).resolve("fpstest-arena");
            if (!Files.exists(saveDir)) {
                return;
            }

            FpsTestClient.LOG.info("[FPS Test] startup cleanup: stale arena save tree found at {}, removing on background thread", saveDir);
            Thread t = new Thread(EphemeralWorld::deleteSaveQuietly, "FPS Test-arena-startup-cleanup");
            t.setDaemon(true);
            t.start();
        } catch (Throwable var3) {
            FpsTestClient.LOG.warn("[FPS Test] startup cleanup raised an exception, ignoring: {}", var3.getMessage());
        }
    }

    private static void deleteWithRetry(Path p) throws IOException {
        IOException last = null;

        for (int attempt = 0; attempt < 10; attempt++) {
            try {
                Files.deleteIfExists(p);
                return;
            } catch (IOException var6) {
                last = var6;

                try {
                    Thread.sleep(250L);
                } catch (InterruptedException var5) {
                    Thread.currentThread().interrupt();
                    throw var6;
                }
            }
        }

        if (last != null) {
            throw last;
        }
    }
}