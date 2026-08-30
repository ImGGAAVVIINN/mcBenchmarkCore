package com.dgm.mcbc.bench.world;

import com.dgm.mcbc.FpsTestClient;
import com.dgm.mcbc.bench.WorldType;
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
import net.minecraft.client.MinecraftClient;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.Difficulty;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.LevelSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.storage.LevelStorageSource;
import net.minecraft.world.level.storage.LevelStorageSource.LevelStorageAccess;
import net.fabricmc.fabric.api.client.world.ClientWorldGeneration;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.FlatLevelGeneratorSettings;
import net.minecraft.world.level.levelgen.FlatLevelSource;

@Environment(EnvType.CLIENT)
public final class EphemeralWorld {
    public static final String LEVEL_ID = "fpstest-arena";
    private static volatile String currentLevelId = "fpstest-arena";

    private EphemeralWorld() {
    }

    public static String currentLevelId() {
        return currentLevelId;
    }

    public static void create(long seed, WorldType type) {
        MinecraftClient mc = MinecraftClient.getInstance();
        String levelId = "fpstest-arena";

        try {
            Path existing = mc.getLevelStorage().getLevelPath(levelId).toAbsolutePath();
            if (Files.exists(existing)) {
                levelId = "fpstest-arena-" + System.currentTimeMillis() / 1000L;
                FpsTestClient.LOG.warn("[FPS Test] using fallback arena name: {} (previous save tree still present)", levelId);
            }
        } catch (Exception var9) {
            FpsTestClient.LOG.debug("[FPS Test] could not probe save dir for fallback name: {}", var9.getMessage());
        }

        currentLevelId = levelId;
        GameRules rules = new GameRules();
        rules.getBoolean(GameRules.RULE_DAYLIGHT).set(false, null);
        rules.getBoolean(GameRules.RULE_WEATHER_CYCLE).set(false, null);
        rules.getBoolean(GameRules.RULE_DOMOBSPAWNING).set(false, null);
        rules.getBoolean(GameRules.RULE_DOFIRETICK).set(false, null);
        rules.getBoolean(GameRules.RULE_DOMOBLOOT).set(false, null);
        rules.getBoolean(GameRules.RULE_DOTILEDROPS).set(false, null);
        rules.getBoolean(GameRules.RULE_KEEPINVENTORY).set(true, null);
        rules.getBoolean(GameRules.RULE_DOINSOMNIA).set(false, null);
        rules.getBoolean(GameRules.RULE_NATURAL_REGENERATION).set(false, null);
        rules.getBoolean(GameRules.RULE_REDUCEDDEBUGINFO).set(false, null);
        rules.getBoolean(GameRules.RULE_SPAWN_RADIUS).set(false, null);
        rules.getBoolean(GameRules.RULE_TNT_EXPLODES).set(false, null);
        LevelSettings settings = new LevelSettings("FPS Test Arena", LevelSettings.DEFAULT_GAME_TYPE, false, Difficulty.PEACEFUL, true, rules, null);
        LevelStorageAccess access = mc.getLevelStorage().createAccess(levelId);
        net.minecraft.world.level.WorldData worldData = new net.minecraft.world.level.WorldData(settings, access);
        Function<Registry<DimensionType>, LevelStem> dims = ra -> buildDimensions(ra, type);
        FpsTestClient.LOG.info("[FPS Test] creating ephemeral world seed={}, type={}, levelId={}", new Object[]{seed, type.kind, levelId});
        ClientWorldGeneration.createWorld(mc, worldData, dims, null);
    }

    private static LevelStem buildDimensions(Registry<DimensionType> ra, WorldType type) {
        return switch (type.kind) {
            case OVERWORLD -> ClientWorldGeneration.createOverworldStem(ra);
            case FLAT -> buildFlatDimensions(ra);
            case FIXED_BIOME -> buildFixedBiomeDimensions(ra, type.biome);
        };
    }

    private static LevelStem buildFlatDimensions(Registry<DimensionType> ra) {
        Registry<Biome> biomeRegistry = MinecraftClient.getInstance().registryAccess().registryOrThrow(Registries.BIOME);
        ResourceKey<Biome> biomeKey = Biome.PLAINS_KEY;
        net.minecraft.world.level.biome.BiomeSource biomeSource = new net.minecraft.world.level.biome.FixedBiomeSource(biomeRegistry.getOrThrow(biomeKey));
        List<FlatLevelGeneratorSettings.Layer> layers = List.of(
            new FlatLevelGeneratorSettings.Layer(1, Blocks.BEDROCK),
            new FlatLevelGeneratorSettings.Layer(2, Blocks.DIRT),
            new FlatLevelGeneratorSettings.Layer(1, Blocks.GRASS_BLOCK)
        );
        FlatLevelGeneratorSettings flatSettings = new FlatLevelGeneratorSettings(Optional.of(Blocks.AIR.defaultBlockState()), biomeSource, List.of());
        flatSettings.getLayers().addAll(layers);
        flatSettings.updateLayers();
        FlatLevelSource generator = new FlatLevelSource(flatSettings);
        LevelStem normal = ClientWorldGeneration.createOverworldStem(ra);
        return normal.replaceGenerator(generator);
    }

    private static LevelStem buildFixedBiomeDimensions(Registry<DimensionType> ra, ResourceKey<Biome> biomeKey) {
        Registry<Biome> biomeRegistry = MinecraftClient.getInstance().registryAccess().registryOrThrow(Registries.BIOME);
        Registry<DimensionType> noiseRegistry = MinecraftClient.getInstance().registryAccess().registryOrThrow(Registries.NOISE_SETTINGS);
        net.minecraft.world.level.biome.BiomeSource biomeSource = new net.minecraft.world.level.biome.FixedBiomeSource(biomeRegistry.getOrThrow(biomeKey));
        DimensionType noiseSettings = noiseRegistry.getOrThrow(DimensionType.OVERWORLD);
        net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator generator = new net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator(biomeSource, noiseSettings);
        LevelStem normal = ClientWorldGeneration.createOverworldStem(ra);
        return normal.replaceGenerator(generator);
    }

    public static void deleteSaveQuietly() {
        deleteSaveCore(false);
    }

    public static void deleteSaveBlocking() {
        deleteSaveCore(true);
    }

    private static void deleteSaveCore(boolean blocking) {
        LevelStorageSource src = MinecraftClient.getInstance().getLevelStorage();
        Path saveDir = src.getLevelPath("fpstest-arena").toAbsolutePath();
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
                LevelStorageAccess access = src.createAccess("fpstest-arena");

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
                            EphemeralWorld.deleteWithRetry(file);
                            return FileVisitResult.CONTINUE;
                        }

                        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                            EphemeralWorld.deleteWithRetry(dir);
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
                        saveDir, maxPasses, lastError.getMessage());
            }
        }
    }

    private static void deleteWithRetry(Path path) throws IOException {
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            try {
                Thread.sleep(50L);
                Files.deleteIfExists(path);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                throw new IOException(ie);
            }
        }
    }
}