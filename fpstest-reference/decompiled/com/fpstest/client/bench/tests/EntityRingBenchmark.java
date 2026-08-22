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
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1542;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_3218;
import net.minecraft.class_3730;

@Environment(EnvType.CLIENT)
public final class EntityRingBenchmark implements Benchmark {
   private final String id;
   private final String name;
   private final class_1299<? extends class_1297> type;
   private final int count;
   private final double ringRadius;
   private final long seed;
   private final boolean withAi;
   private int spawned = 0;
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final List<class_1792> ITEM_PALETTE = List.of(
      class_1802.field_8477,
      class_1802.field_8687,
      class_1802.field_8725,
      class_1802.field_8695,
      class_1802.field_8620,
      class_1802.field_22020,
      class_1802.field_8759,
      class_1802.field_8155,
      class_1802.field_27063,
      class_1802.field_8434,
      class_1802.field_8601,
      class_1802.field_8713
   );

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   public EntityRingBenchmark(String id, String name, class_1299<? extends class_1297> type, int count, double ringRadius, long seed) {
      this(id, name, type, count, ringRadius, seed, false);
   }

   public EntityRingBenchmark(String id, String name, class_1299<? extends class_1297> type, int count, double ringRadius, long seed, boolean withAi) {
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
      return "Ring of " + this.count + " " + this.type.method_35050() + " around the camera; camera orbits 360°.";
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.spawned = 0;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 2, 0, (int)this.ringRadius + 6, (int)this.ringRadius + 6);

            for (int i = 0; i < this.count; i++) {
               double angle = (Math.PI * 2) * i / this.count;
               double x = CENTER.field_1352 + Math.cos(angle) * this.ringRadius;
               double z = CENTER.field_1350 + Math.sin(angle) * this.ringRadius;
               class_1297 e = this.type.method_5883(lvl);
               if (e != null) {
                  e.method_5814(x, CENTER.field_1351 - 1.0, z);
                  if (e instanceof class_1308 m) {
                     m.method_5943(lvl, lvl.method_8404(e.method_24515()), class_3730.field_16462, null);
                     if (!this.withAi) {
                        m.method_5977(true);
                     }

                     m.method_5971();
                  }

                  if (e instanceof class_1542 ie) {
                     class_1792 it = ITEM_PALETTE.get(i % ITEM_PALETTE.size());
                     ie.method_6979(new class_1799(it));
                     ie.method_6989();
                     ie.method_35190();
                  }

                  e.method_5684(true);
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
