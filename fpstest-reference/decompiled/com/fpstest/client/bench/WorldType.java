package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1959;
import net.minecraft.class_1972;
import net.minecraft.class_5321;

@Environment(EnvType.CLIENT)
public final class WorldType {
   public final WorldType.Kind kind;
   public final class_5321<class_1959> biome;
   public static final WorldType OVERWORLD = new WorldType(WorldType.Kind.OVERWORLD, null);
   public static final WorldType FLAT = new WorldType(WorldType.Kind.FLAT, null);

   private WorldType(WorldType.Kind kind, class_5321<class_1959> biome) {
      this.kind = kind;
      this.biome = biome;
   }

   public static WorldType fixedBiome(class_5321<class_1959> biome) {
      return new WorldType(WorldType.Kind.FIXED_BIOME, biome);
   }

   public static WorldType jungle() {
      return fixedBiome(class_1972.field_9417);
   }

   public static WorldType desert() {
      return fixedBiome(class_1972.field_9424);
   }

   public static WorldType plains() {
      return fixedBiome(class_1972.field_9451);
   }

   public static WorldType taiga() {
      return fixedBiome(class_1972.field_9420);
   }

   public static WorldType snowy() {
      return fixedBiome(class_1972.field_35117);
   }

   public static WorldType forest() {
      return fixedBiome(class_1972.field_9409);
   }

   public static WorldType savanna() {
      return fixedBiome(class_1972.field_9449);
   }

   public static WorldType swamp() {
      return fixedBiome(class_1972.field_9471);
   }

   public static WorldType cherry() {
      return fixedBiome(class_1972.field_42720);
   }

   public static WorldType badlands() {
      return fixedBiome(class_1972.field_9415);
   }

   public static WorldType mushroom() {
      return fixedBiome(class_1972.field_9462);
   }

   public static WorldType mountain() {
      return fixedBiome(class_1972.field_35116);
   }

   @Environment(EnvType.CLIENT)
   public static enum Kind {
      OVERWORLD,
      FLAT,
      FIXED_BIOME;
   }
}
