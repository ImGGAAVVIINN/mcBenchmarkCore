package com.fpstest.client.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.registry.CombinedDynamicRegistries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.ServerDynamicRegistryType;
import net.minecraft.world.SaveProperties;
import net.minecraft.world.level.storage.LevelStorage;
import java.util.Map;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MinecraftServer.class)
public interface MinecraftServerAccessor {
    @Accessor("worlds")
    Map<RegistryKey<World>, ServerWorld> fpstest$getLevels();

    @Accessor("session")
    LevelStorage.Session fpstest$getStorageSource();

    @Accessor("saveProperties")
    SaveProperties fpstest$getWorldData();

    @Accessor("combinedDynamicRegistries")
    CombinedDynamicRegistries<ServerDynamicRegistryType> fpstest$getRegistries();
}