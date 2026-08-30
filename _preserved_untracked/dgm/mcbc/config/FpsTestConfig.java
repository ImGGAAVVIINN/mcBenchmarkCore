package com.dgm.mcbc.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.client.MinecraftClient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FpsTestConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static FpsTestConfig instance;

    public int warmupTicks = 100;
    public int sampleTicks = 600;
    public int cooldownTicks = 20;
    public int chunkPreloadRadius = 8;
    public boolean enableCinematicCamera = true;
    public boolean enablePerfHud = true;
    public boolean autoRunOnJoin = false;
    public String lastBenchmarkId = "";
    public int renderDistance = 12;
    public boolean vsync = true;
    public int maxFps = 60;

    private FpsTestConfig() {}

    public static FpsTestConfig getInstance() {
        if (instance == null) {
            instance = load();
        }
        return instance;
    }

    public static FpsTestConfig load() {
        Path configPath = getConfigPath();
        if (Files.exists(configPath)) {
            try {
                String json = Files.readString(configPath);
                FpsTestConfig config = GSON.fromJson(json, FpsTestConfig.class);
                if (config != null) {
                    return config;
                }
            } catch (IOException e) {
                // Ignore and use defaults
            }
        }
        return new FpsTestConfig();
    }

    public void save() {
        Path configPath = getConfigPath();
        try {
            Files.createDirectories(configPath.getParent());
            String json = GSON.toJson(this);
            Files.writeString(configPath, json);
        } catch (IOException e) {
            // Ignore
        }
    }

    private static Path getConfigPath() {
        return MinecraftClient.getInstance().runDirectory.toPath().resolve("config/mcbenchmarkcore.json");
    }

    public void setDefaults() {
        this.warmupTicks = 100;
        this.sampleTicks = 600;
        this.cooldownTicks = 20;
        this.chunkPreloadRadius = 8;
        this.enableCinematicCamera = true;
        this.enablePerfHud = true;
        this.autoRunOnJoin = false;
        this.lastBenchmarkId = "";
        this.renderDistance = 12;
        this.vsync = true;
        this.maxFps = 60;
        save();
    }
}