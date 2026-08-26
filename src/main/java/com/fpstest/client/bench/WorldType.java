package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.resources.ResourceKey;

@Environment(EnvType.CLIENT)
public final class WorldType {
   public final WorldType.Kind kind;
   public final ResourceKey<Biome> biome;
   public static final WorldType OVERWORLD = new WorldType(WorldType.Kind.OVERWORLD, null);
   public static final WorldType FLAT = new WorldType(WorldType.Kind.FLAT, null);

   private WorldType(WorldType.Kind kind, ResourceKey<Biome> biome) {
      this.kind = kind;
      this.biome = biome;
   }

   public static WorldType fixedBiome(ResourceKey<Biome> biome) {
      return new WorldType(WorldType.Kind.FIXED_BIOME, biome);
   }

   public static WorldType jungle() {
      return fixedBiome(Biomes.JUNGLE);
   }

   public static WorldType desert() {
      return fixedBiome(Biomes.DESERT);
   }

   public static WorldType plains() {
      return fixedBiome(Biomes.PLAINS);
   }

   public static WorldType taiga() {
      return fixedBiome(Biomes.TAIGA);
   }

   public static WorldType snowy() {
      return fixedBiome(Biomes.SNOWY_PLAINS);
   }

   public static WorldType forest() {
      return fixedBiome(Biomes.FOREST);
   }

   public static WorldType savanna() {
      return fixedBiome(Biomes.SAVANNA);
   }

   public static WorldType swamp() {
      return fixedBiome(Biomes.SWAMP);
   }

   public static WorldType cherry() {
      return fixedBiome(Biomes.CHERRY_GROVE);
   }

   public static WorldType badlands() {
      return fixedBiome(Biomes.BADLANDS);
   }

   public static WorldType mushroom() {
      return fixedBiome(Biomes.MUSHROOM_FIELDS);
   }

   public static WorldType mountain() {
      return fixedBiome(Biomes.JAGGED_PEAKS);
   }

   @Environment(EnvType.CLIENT)
   public static enum Kind {
      OVERWORLD,
      FLAT,
      FIXED_BIOME;
   }
}
