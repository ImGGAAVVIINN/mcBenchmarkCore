package com.fpstest.client.bench.world;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.WorldType;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.Difficulty;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
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
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;

@Environment(EnvType.CLIENT)
public final class EphemeralWorld {
    public static final String LEVEL_ID = "fpstest-arena";
    private static volatile String currentLevelId = "fpstest-arena";

    private EphemeralWorld() {
    }

    public static String currentLevelId() {
        return currentLevelId;
    }

    /**
     * Returns the dimension key of the ephemeral world.
     * Since the world is now created through the normal singleplayer flow,
     * this returns the overworld dimension key.
     */
    public static ResourceKey<Level> currentDimensionKey() {
        // The ephemeral world is the current singleplayer world, which uses the overworld dimension
        return Level.OVERWORLD;
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
        
        // Create game rules for the ephemeral world
        GameRules rules = new GameRules(FeatureFlagSet.of());
        rules.set(GameRules.ADVANCE_TIME, false, mc);
        rules.set(GameRules.ADVANCE_WEATHER, false, mc);
        rules.set(GameRules.SPAWN_MOBS, false, mc);
        rules.set(GameRules.MOB_DROPS, false, mc);
        rules.set(GameRules.BLOCK_DROPS, false, mc);
        rules.set(GameRules.ENTITY_DROPS, false, mc);
        rules.set(GameRules.FIRE_SPREAD_RADIUS_AROUND_PLAYER, 0, mc);
        rules.set(GameRules.MOB_GRIEFING, false, mc);
        rules.set(GameRules.SPAWN_PATROLS, false, mc);
        rules.set(GameRules.SPAWN_WANDERING_TRADERS, false, mc);
        rules.set(GameRules.SPAWN_WARDENS, false, mc);

        // Create level settings
        LevelSettings settings = new LevelSettings("FPS Test Arena", GameType.CREATIVE, false, Difficulty.PEACEFUL, true, rules, WorldDataConfiguration.DEFAULT);
        WorldOptions opts = new WorldOptions(seed, false, false);

        // Build the dimension (LevelStem) using the client's registry access
        Function<RegistryAccess, LevelStem> dims = ra -> buildDimensions(ra, type);
        
        FpsTestClient.LOG.info("[FPS Test] creating ephemeral world seed={}, type={}, levelId={}", seed, type.kind, levelId);
        
        // Use the standard Minecraft world creation flow through LevelStorageSource
        // This properly initializes the world, connects the client, and spawns the player
        mc.getLevelSource().createLevel(levelId, settings, opts, dims, null);
    }

    /**
     * Destroys the ephemeral world by deleting its save directory.
     * Since the world is now created through the normal singleplayer flow,
     * we can't easily remove it from the running server. Instead, we delete
     * the save so it won't persist.
     */
    public static void destroy() {
        Minecraft mc = Minecraft.getInstance();
        LevelStorageSource src = mc.getLevelSource();
        Path saveDir = src.getLevelPath(LevelResource.ROOT.getId()).resolve(currentLevelId);
        
        FpsTestClient.LOG.info("[FPS Test] destroying ephemeral world levelId={}", currentLevelId);
        
        // Close any open access to the save
        try {
            LevelStorageSource.LevelStorageAccess access = src.createAccess(currentLevelId);
            try {
                access.close();
            } catch (IOException e) {
                // Ignore
            }
        } catch (Exception e) {
            FpsTestClient.LOG.debug("[FPS Test] could not open arena session for cleanup: {}", e.getMessage());
        }
        
        // Delete the save directory
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
            FpsTestClient.LOG.info("[FPS Test] destroyed ephemeral world save at {}", saveDir);
        } catch (IOException e) {
            FpsTestClient.LOG.error("[FPS Test] Failed to delete ephemeral world save", e);
        }
    }

    /**
     * Schedules the destruction of the ephemeral world on the server thread.
     * Use this when calling from the client thread.
     */
    public static void destroyAsync() {
        Minecraft mc = Minecraft.getInstance();
        IntegratedServer server = mc.getSingleplayerServer();
        if (server == null) {
            // If no server, run directly
            destroy();
            return;
        }
        server.execute(EphemeralWorld::destroy);
    }

    private static LevelStem buildDimensions(RegistryAccess registries, WorldType type) {
        return switch (type.kind) {
            case OVERWORLD -> buildOverworldDimensions(registries);
            case FLAT -> buildFlatDimensions(registries);
            case FIXED_BIOME -> buildFixedBiomeDimensions(registries, type.biome);
        };
    }

    private static LevelStem buildOverworldDimensions(RegistryAccess registries) {
        // Get the overworld dimension type from BuiltinDimensionTypes
        ResourceKey<DimensionType> overworldDimTypeKey = BuiltinDimensionTypes.OVERWORLD;
        Holder<DimensionType> dimTypeHolder = registries.lookupOrThrow(Registries.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        // Get the overworld noise settings
        ResourceKey<NoiseGeneratorSettings> overworldNoiseKey = NoiseGeneratorSettings.OVERWORLD;
        Holder<NoiseGeneratorSettings> noiseSettings = registries.lookupOrThrow(Registries.NOISE_SETTINGS).getOrThrow(overworldNoiseKey);
        
        // Create the chunk generator
        NoiseBasedChunkGenerator generator = new NoiseBasedChunkGenerator(
            new FixedBiomeSource(registries.lookupOrThrow(Registries.BIOME).getOrThrow(Biomes.PLAINS)),
            noiseSettings
        );
        
        return new LevelStem(dimTypeHolder, generator);
    }

    private static LevelStem buildFlatDimensions(RegistryAccess registries) {
        Holder<Biome> biomeHolder = registries.lookupOrThrow(Registries.BIOME).getOrThrow(Biomes.PLAINS);
        
        // FlatLayerInfo constructor takes (int, Block) not BlockState
        List<FlatLayerInfo> layers = List.of(
            new FlatLayerInfo(1, Blocks.BEDROCK),
            new FlatLayerInfo(2, Blocks.DIRT),
            new FlatLayerInfo(1, Blocks.GRASS_BLOCK)
        );
        
        // FlatLevelGeneratorSettings: use withBiomeAndLayers for layers
        FlatLevelGeneratorSettings flatSettings = new FlatLevelGeneratorSettings(
            Optional.empty(),
            biomeHolder,
            List.of()
        ).withBiomeAndLayers(layers, Optional.empty(), biomeHolder);
        
        // FlatLevelSource constructor takes only FlatLevelGeneratorSettings
        FlatLevelSource generator = new FlatLevelSource(flatSettings);
        
        // Get the overworld dimension type from BuiltinDimensionTypes
        ResourceKey<DimensionType> overworldDimTypeKey = BuiltinDimensionTypes.OVERWORLD;
        Holder<DimensionType> dimTypeHolder = registries.lookupOrThrow(Registries.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
        return new LevelStem(dimTypeHolder, generator);
    }

    private static LevelStem buildFixedBiomeDimensions(RegistryAccess registries, ResourceKey<Biome> biomeKey) {
        Holder<Biome> biomeHolder = registries.lookupOrThrow(Registries.BIOME).getOrThrow(biomeKey);
        
        // Get the overworld noise settings
        ResourceKey<NoiseGeneratorSettings> overworldNoiseKey = NoiseGeneratorSettings.OVERWORLD;
        Holder<NoiseGeneratorSettings> noiseSettings = registries.lookupOrThrow(Registries.NOISE_SETTINGS).getOrThrow(overworldNoiseKey);
        
        FixedBiomeSource source = new FixedBiomeSource(biomeHolder);
        NoiseBasedChunkGenerator generator = new NoiseBasedChunkGenerator(source, noiseSettings);
        
        // Get the overworld dimension type from BuiltinDimensionTypes
        ResourceKey<DimensionType> overworldDimTypeKey = BuiltinDimensionTypes.OVERWORLD;
        Holder<DimensionType> dimTypeHolder = registries.lookupOrThrow(Registries.DIMENSION_TYPE).getOrThrow(overworldDimTypeKey);
        
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