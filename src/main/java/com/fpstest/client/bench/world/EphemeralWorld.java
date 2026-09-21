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
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.FixedBiomeSource;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.GameRules;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.server.integrated.IntegratedServerLoader;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.dimension.DimensionOptionsRegistryHolder;
import net.minecraft.world.gen.GeneratorOptions;
import net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer;
import net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig;
import net.minecraft.world.gen.chunk.FlatChunkGenerator;
import net.minecraft.util.WorldSavePath;
import net.minecraft.world.level.storage.LevelStorage;
import net.minecraft.world.level.LevelProperties;
import net.minecraft.world.level.UnmodifiableLevelProperties;
import net.minecraft.world.level.ServerWorldProperties;
import net.minecraft.world.SaveProperties;
import net.minecraft.resource.DataConfiguration;
import net.minecraft.world.level.LevelInfo;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.dimension.DimensionTypes;
import net.minecraft.structure.StructureSet;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.placement.StructurePlacementCalculator;
import net.minecraft.world.gen.noise.NoiseConfig;
import net.minecraft.util.math.random.RandomSequencesState;
import net.minecraft.util.collection.Weighting;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.spawner.SpecialSpawner;
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
    private static volatile RegistryKey<World> currentDimensionKey = null;

    private EphemeralWorld() {
    }

    public static String currentLevelId() {
        return currentLevelId;
    }

    public static RegistryKey<World> currentDimensionKey() {
        return currentDimensionKey;
    }

    public static void create(long seed, WorldType type) {
        MinecraftClient mc = MinecraftClient.getInstance();
        String levelId = "fpstest-arena";

        try {
            Path existing = LevelStorage.create(mc.runDirectory.toPath().resolve("saves")).resolve("fpstest-arena");
            if (Files.exists(existing)) {
                levelId = "fpstest-arena-" + System.currentTimeMillis() / 1000L;
                FpsTestClient.LOG.warn("[MC Benchmark Core] using fallback arena name: {} (previous save tree still present)", levelId);
            }
        } catch (Exception var9) {
            FpsTestClient.LOG.debug("[MC Benchmark Core] could not probe save dir for fallback name: {}", var9.getMessage());
        }

        currentLevelId = levelId;

        FpsTestClient.LOG.info("[MC Benchmark Core] creating ephemeral world seed={}, type={}, levelId={}", seed, type.kind, levelId);

        // Create game rules for the ephemeral world
        GameRules rules = new GameRules(FeatureSet.empty());
        rules.get(GameRules.DO_DAYLIGHT_CYCLE).set(false, null);
        rules.get(GameRules.DO_WEATHER_CYCLE).set(false, null);
        rules.get(GameRules.DO_MOB_SPAWNING).set(false, null);
        rules.get(GameRules.DO_MOB_LOOT).set(false, null);
        rules.get(GameRules.DO_TILE_DROPS).set(false, null);
        rules.get(GameRules.DO_ENTITY_DROPS).set(false, null);
        rules.get(GameRules.DO_FIRE_TICK).set(false, null);
        rules.get(GameRules.DO_MOB_GRIEFING).set(false, null);
        rules.get(GameRules.DO_PATROL_SPAWNING).set(false, null);
        rules.get(GameRules.DO_TRADER_SPAWNING).set(false, null);
        rules.get(GameRules.DO_WARDEN_SPAWNING).set(false, null);

        // Create level settings
        LevelInfo settings = new LevelInfo("MC Benchmark Core Arena", GameMode.CREATIVE, false, Difficulty.NORMAL, true, rules, DataConfiguration.SAFE_MODE);
        GeneratorOptions opts = new GeneratorOptions(seed, false, false);

        // Build the DimensionOptionsRegistryHolder using a function that takes RegistryWrapper.WrapperLookup
        // This matches the reference implementation's approach using IntegratedServerLoader.createAndStart
        java.util.function.Function<RegistryWrapper.WrapperLookup, DimensionOptionsRegistryHolder> dims = provider -> {
            return buildDimensions(provider, type);
        };

        // Use IntegratedServerLoader.createAndStart() to properly create the level
        // This replaces the manual ServerWorld construction and insertion into levels map
        mc.createIntegratedServerLoader().createAndStart(levelId, settings, opts, dims, null);

        FpsTestClient.LOG.info("[MC Benchmark Core] created ephemeral world seed={}, type={}, levelId={}", seed, type.kind, levelId);
    }

    /**
     * Destroys the ephemeral world by removing it from the server's levels map
     * and cleaning up resources. Must be called on the server thread.
     */
    public static void destroy() {
        MinecraftClient mc = MinecraftClient.getInstance();
        MinecraftServer server = mc.getServer();
        if (server == null || currentDimensionKey == null) {
            FpsTestClient.LOG.debug("[MC Benchmark Core] No ephemeral world to destroy");
            return;
        }

        // Remove from levels map
        ServerWorld level = ((MinecraftServerAccessor) server).fpstest$getLevels().remove(currentDimensionKey);
        if (level != null) {
            // Close the level resources
            try {
                level.close();
            } catch (IOException e) {
                FpsTestClient.LOG.error("[MC Benchmark Core] Failed to close ephemeral world", e);
            }
            FpsTestClient.LOG.info("[MC Benchmark Core] destroyed ephemeral world dimensionKey={}", currentDimensionKey);
        } else {
            FpsTestClient.LOG.warn("[MC Benchmark Core] Ephemeral world not found in levels map for dimensionKey={}", currentDimensionKey);
        }

        currentDimensionKey = null;
    }

    /**
     * Schedules the destruction of the ephemeral world on the server thread.
     * Use this when calling from the client thread.
     */
    public static void destroyAsync() {
        MinecraftClient mc = MinecraftClient.getInstance();
        MinecraftServer server = mc.getServer();
        if (server == null) {
            return;
        }
        server.execute(EphemeralWorld::destroy);
    }

    private static DimensionOptionsRegistryHolder buildDimensions(RegistryWrapper.WrapperLookup provider, WorldType type) {
        DimensionOptions stem = switch (type.kind) {
            case OVERWORLD -> buildOverworldDimensions(provider);
            case FLAT -> buildFlatDimensions(provider);
            case FIXED_BIOME -> buildFixedBiomeDimensions(provider, type.biome);
        };
        Map<RegistryKey<DimensionOptions>, DimensionOptions> dimMap = new HashMap<>();
        dimMap.put(DimensionOptions.OVERWORLD, stem);
        return new DimensionOptionsRegistryHolder(dimMap);
    }

    private static DimensionOptions buildOverworldDimensions(RegistryWrapper.WrapperLookup provider) {
        // Get the overworld dimension type from DimensionTypes
        RegistryKey<DimensionType> overworldDimTypeKey = DimensionTypes.OVERWORLD;
        RegistryEntry<DimensionType> dimTypeHolder = provider.getOrThrow(RegistryKeys.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        // Get the overworld noise settings
        RegistryKey<ChunkGeneratorSettings> overworldNoiseKey = ChunkGeneratorSettings.OVERWORLD;
        RegistryEntry<ChunkGeneratorSettings> noiseSettings = provider.getOrThrow(RegistryKeys.CHUNK_GENERATOR_SETTINGS).getOrThrow(overworldNoiseKey);
        
        // Create the chunk generator
        NoiseChunkGenerator generator = new NoiseChunkGenerator(
            new FixedBiomeSource(provider.getOrThrow(RegistryKeys.BIOME).getOrThrow(BiomeKeys.PLAINS)),
            noiseSettings
        );
        
        return new DimensionOptions(dimTypeHolder, generator);
    }

    private static DimensionOptions buildFlatDimensions(RegistryWrapper.WrapperLookup provider) {
        RegistryEntry<Biome> biomeHolder = provider.getOrThrow(RegistryKeys.BIOME).getOrThrow(BiomeKeys.PLAINS);
        
        // FlatChunkGeneratorLayer constructor takes (int, Block) not BlockState
        List<FlatChunkGeneratorLayer> layers = List.of(
            new FlatChunkGeneratorLayer(1, Blocks.BEDROCK),
            new FlatChunkGeneratorLayer(2, Blocks.DIRT),
            new FlatChunkGeneratorLayer(1, Blocks.GRASS_BLOCK)
        );
        
        // FlatChunkGeneratorConfig: use with() for layers
        // Constructor: (Optional<RegistryEntryList<StructureSet>>, RegistryEntry<Biome>, List<RegistryEntry<PlacedFeature>>)
        // Method: with(List<FlatChunkGeneratorLayer>, Optional<RegistryEntryList<StructureSet>>, RegistryEntry<Biome>)
        FlatChunkGeneratorConfig flatSettings = new FlatChunkGeneratorConfig(
            Optional.empty(),
            biomeHolder,
            List.of()
        ).with(layers, Optional.empty(), biomeHolder);
        
        // FlatChunkGenerator constructor takes only FlatChunkGeneratorConfig
        FlatChunkGenerator generator = new FlatChunkGenerator(flatSettings);
        
        // Get the overworld dimension type from DimensionTypes
        RegistryKey<DimensionType> overworldDimTypeKey = DimensionTypes.OVERWORLD;
        RegistryEntry<DimensionType> dimTypeHolder = provider.getOrThrow(RegistryKeys.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        return new DimensionOptions(dimTypeHolder, generator);
    }

    private static DimensionOptions buildFixedBiomeDimensions(RegistryWrapper.WrapperLookup provider, RegistryKey<Biome> biomeKey) {
        RegistryEntry<Biome> biomeHolder = provider.getOrThrow(RegistryKeys.BIOME).getOrThrow(biomeKey);
        
        // Get the overworld noise settings
        RegistryKey<ChunkGeneratorSettings> overworldNoiseKey = ChunkGeneratorSettings.OVERWORLD;
        RegistryEntry<ChunkGeneratorSettings> noiseSettings = provider.getOrThrow(RegistryKeys.CHUNK_GENERATOR_SETTINGS).getOrThrow(overworldNoiseKey);
        
        FixedBiomeSource source = new FixedBiomeSource(biomeHolder);
        // ChunkGeneratorSettings is a record, use it directly
        NoiseChunkGenerator generator = new NoiseChunkGenerator(source, noiseSettings);
        
        // Get the overworld dimension type from DimensionTypes
        RegistryKey<DimensionType> overworldDimTypeKey = DimensionTypes.OVERWORLD;
        RegistryEntry<DimensionType> dimTypeHolder = provider.getOrThrow(RegistryKeys.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        return new DimensionOptions(dimTypeHolder, generator);
    }

    public static void deleteSaveQuietly() {
        deleteSaveCore(false);
    }

    public static void deleteSaveBlocking() {
        deleteSaveCore(true);
    }

    private static void deleteSaveCore(boolean blocking) {
        MinecraftClient mc = MinecraftClient.getInstance();
        LevelStorage src = LevelStorage.create(mc.runDirectory.toPath().resolve("saves"));
        Path saveDir = src.resolve("fpstest-arena");
        if (!Files.exists(saveDir)) {
            FpsTestClient.LOG.debug("[MC Benchmark Core] cleanup: no stale arena directory at {}", saveDir);
        } else {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException var12) {
                Thread.currentThread().interrupt();
                return;
            }

            try {
                LevelStorage.Session access = src.createSession("fpstest-arena");
                if (access != null) {
                    access.tryClose();
                }
            } catch (Exception var15) {
                FpsTestClient.LOG.info("[MC Benchmark Core] could not open arena session for cleanup ({})", var15.getMessage());
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
                            FpsTestClient.LOG.info("[MC Benchmark Core] cleanup succeeded (pass {})", pass + 1);
                        } else {
                            FpsTestClient.LOG.debug("[MC Benchmark Core] cleanup succeeded (first pass)");
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
                        "[MC Benchmark Core] cleanup deferred: failed to delete arena save tree at {} after {} passes ({}). Next run will use a fallback arena name; full retry on next MC Benchmark Core launch.",
                        new Object[]{saveDir, maxPasses, lastError.getMessage()}
                    );
            } else if (Files.exists(saveDir)) {
                FpsTestClient.LOG
                    .warn(
                        "[MC Benchmark Core] cleanup deferred: arena save tree at {} still present after {} passes. Next run will use a fallback arena name; full retry on next MC Benchmark Core launch.",
                        saveDir,
                        maxPasses
                    );
            }
        }
    }

    public static void cleanupStaleOnStartup() {
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            LevelStorage src = LevelStorage.create(mc.runDirectory.toPath().resolve("saves"));
            Path saveDir = src.resolve("fpstest-arena");
            if (!Files.exists(saveDir)) {
                return;
            }

            FpsTestClient.LOG.info("[MC Benchmark Core] startup cleanup: stale arena save tree found at {}, removing on background thread", saveDir);
            Thread t = new Thread(EphemeralWorld::deleteSaveQuietly, "MC Benchmark Core-arena-startup-cleanup");
            t.setDaemon(true);
            t.start();
        } catch (Throwable var3) {
            FpsTestClient.LOG.warn("[MC Benchmark Core] startup cleanup raised an exception, ignoring: {}", var3.getMessage());
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