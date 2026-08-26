package com.fpstest.client.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.LevelStorageSource;
import net.minecraft.resources.ResourceKey;
import java.util.Map;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MinecraftServer.class)
public interface MinecraftServerAccessor {
    @Accessor("levels")
    Map<ResourceKey<Level>, ServerLevel> fpstest$getLevels();

    @Accessor("storageSource")
    LevelStorageSource.LevelStorageAccess fpstest$getStorageSource();

    @Accessor("worldData")
    net.minecraft.world.level.storage.WorldData fpstest$getWorldData();

    @Accessor("registries")
    net.minecraft.core.LayeredRegistryAccess<net.minecraft.server.RegistryLayer> fpstest$getRegistries();
}