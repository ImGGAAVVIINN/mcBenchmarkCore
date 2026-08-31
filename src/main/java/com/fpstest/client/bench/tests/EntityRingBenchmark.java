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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

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
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
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
      return "Ring of " + this.count + " " + this.type.getDescriptionId() + " around the camera; camera orbits 360°.";
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.spawned = 0;
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 2, 0, (int)this.ringRadius + 6, (int)this.ringRadius + 6);

            for (int i = 0; i < this.count; i++) {
               double angle = (Math.PI * 2) * i / this.count;
               double x = CENTER.x + Math.cos(angle) * this.ringRadius;
               double z = CENTER.z + Math.sin(angle) * this.ringRadius;
               Entity e = this.type.create(lvl, EntitySpawnReason.COMMAND);
               if (e != null) {
                  e.setPos(x, CENTER.y - 1.0, z);
                  if (e instanceof Mob m) {
                     m.finalizeSpawn(lvl, lvl.getCurrentDifficultyAt(e.blockPosition()), EntitySpawnReason.COMMAND, null);
                     if (!this.withAi) {
                        m.setNoAi(true);
                     }

                     m.setPersistenceRequired();
                  }

                  if (e instanceof ItemEntity ie) {
                     Item it = ITEM_PALETTE.get(i % ITEM_PALETTE.size());
                     ie.setItem(new ItemStack(it));
                     ie.setNeverPickUp();
                     ie.setUnlimitedLifetime();
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
