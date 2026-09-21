package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.registry.RegistryKey;

@Environment(EnvType.CLIENT)
public final class WorldType {
   public final WorldType.Kind kind;
   public final RegistryKey<Biome> biome;
   public static final WorldType OVERWORLD = new WorldType(WorldType.Kind.OVERWORLD, null);
   public static final WorldType FLAT = new WorldType(WorldType.Kind.FLAT, null);

   private WorldType(WorldType.Kind kind, RegistryKey<Biome> biome) {
      this.kind = kind;
      this.biome = biome;
   }

   public static WorldType fixedBiome(RegistryKey<Biome> biome) {
      return new WorldType(WorldType.Kind.FIXED_BIOME, biome);
   }

   public static WorldType jungle() {
      return fixedBiome(BiomeKeys.JUNGLE);
   }

   public static WorldType desert() {
      return fixedBiome(BiomeKeys.DESERT);
   }

   public static WorldType plains() {
      return fixedBiome(BiomeKeys.PLAINS);
   }

   public static WorldType taiga() {
      return fixedBiome(BiomeKeys.TAIGA);
   }

   public static WorldType snowy() {
      return fixedBiome(BiomeKeys.SNOWY_PLAINS);
   }

   public static WorldType forest() {
      return fixedBiome(BiomeKeys.FOREST);
   }

   public static WorldType savanna() {
      return fixedBiome(BiomeKeys.SAVANNA);
   }

   public static WorldType swamp() {
      return fixedBiome(BiomeKeys.SWAMP);
   }

   public static WorldType cherry() {
      return fixedBiome(BiomeKeys.CHERRY_GROVE);
   }

   public static WorldType badlands() {
      return fixedBiome(BiomeKeys.BADLANDS);
   }

   public static WorldType mushroom() {
      return fixedBiome(BiomeKeys.MUSHROOM_FIELDS);
   }

   public static WorldType mountain() {
      return fixedBiome(BiomeKeys.JAGGED_PEAKS);
   }

   @Environment(EnvType.CLIENT)
   public static enum Kind {
      OVERWORLD,
      FLAT,
      FIXED_BIOME;
   }
}
