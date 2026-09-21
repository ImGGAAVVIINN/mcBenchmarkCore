package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.scene.Arena;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public final class EntityRingBenchmark implements Benchmark {
   private final String id;
   private final String name;
   private final EntityType<? extends Entity> type;
   private final int count;
   private final double ringRadius;
   private final long seed;
   private final boolean withAi;
   private int spawned = 0;
   private static final Vec3d CENTER = new Vec3d(0.5, 70.0, 0.5);
   private static final List<Item> ITEM_PALETTE = List.of(
      Items.DIAMOND,
      Items.EMERALD,
      Items.REDSTONE,
      Items.GOLD_INGOT,
      Items.IRON_INGOT,
      Items.NETHERITE_INGOT,
      Items.LAPIS_LAZULI,
      Items.QUARTZ,
      Items.AMETHYST_SHARD,
      Items.PRISMARINE_CRYSTALS,
      Items.GLOWSTONE_DUST,
      Items.COAL
   );

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   public EntityRingBenchmark(String id, String name, EntityType<? extends Entity> type, int count, double ringRadius, long seed) {
      this(id, name, type, count, ringRadius, seed, false);
   }

   public EntityRingBenchmark(String id, String name, EntityType<? extends Entity> type, int count, double ringRadius, long seed, boolean withAi) {
      this.id = id;
      this.name = name;
      this.type = type;
      this.count = count;
      this.ringRadius = ringRadius;
      this.seed = seed;
      this.withAi = withAi;
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String displayName() {
      return this.name;
   }

   @Override
   public String category() {
      return "Entities";
   }

   @Override
   public long seed() {
      return this.seed;
   }

   @Override
   public String description() {
      return "Ring of " + this.count + " " + this.type.getTranslationKey() + " around the camera; camera orbits 360°.";
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.spawned = 0;
      ctx.onServer(s -> {
         ServerWorld lvl = (ServerWorld) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 2, 0, (int)this.ringRadius + 6, (int)this.ringRadius + 6);

            for (int i = 0; i < this.count; i++) {
               double angle = (Math.PI * 2) * i / this.count;
               double x = CENTER.x + Math.cos(angle) * this.ringRadius;
               double z = CENTER.z + Math.sin(angle) * this.ringRadius;
               Entity e = this.type.create(lvl, SpawnReason.COMMAND);
               if (e != null) {
                  e.setPos(x, CENTER.y - 1.0, z);
                  if (e instanceof MobEntity m) {
                     m.initialize(lvl, lvl.getLocalDifficulty(e.getBlockPos()), SpawnReason.COMMAND, null);
                     if (!this.withAi) {
                        m.setAiDisabled(true);
                     }

                     m.setPersistent();
                  }

                  if (e instanceof ItemEntity ie) {
                     Item it = ITEM_PALETTE.get(i % ITEM_PALETTE.size());
                     ie.setStack(new ItemStack(it));
                     ie.setPickupDelayInfinite();
                     ie.setNeverDespawn();
                  }

                  e.setInvulnerable(true);
                  ctx.spawnTracked(e, lvl);
                  this.spawned++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      double orbitR = this.withAi ? this.ringRadius + 8.0 : Math.max(4.0, this.ringRadius * 0.4);
      double orbitH = this.withAi ? 6.0 : 1.5;
      double degPerTick = this.withAi ? 1.2 : 1.8;
      ctx.setCameraPath(new OrbitPath(CENTER, orbitR, orbitH, degPerTick));
      Arena.teleport(ctx, CENTER, 0.0F, 0.0F);
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("entities_spawned", this.spawned);
   }
}
