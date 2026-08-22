package com.fpstest.client.bench.tests;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.OrbitPath;
import com.fpstest.client.bench.instrumentation.Instr;
import com.fpstest.client.bench.scene.Arena;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1642;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3730;

@Environment(EnvType.CLIENT)
public final class ZombieMazeBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
   private static final int ZOMBIE_COUNT = 150;
   private static final double SPAWN_RADIUS = 18.0;
   private static final int PILLAR_GRID = 7;
   private static final int PILLAR_SPACING = 5;
   private static final int PILLAR_HEIGHT = 3;
   private static final int FLOOR_HALF = 22;
   private int zombiesSpawned = 0;
   private int pillarsBuilt = 0;
   private Instr.Snapshot instrStart = null;
   private int phaseTicks = 0;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "entity_zombies_obstacle_pathfinding";
   }

   @Override
   public String displayName() {
      return "Zombies obstacle pathfinding (150 + pillar maze)";
   }

   @Override
   public String category() {
      return "Entities";
   }

   @Override
   public long seed() {
      return 6271L;
   }

   @Override
   public String description() {
      return "150 zombies + 7×7 pillar maze; AI must constantly recompute paths around obstacles.";
   }

   @Override
   public int warmupTicks() {
      return 60;
   }

   @Override
   public int sampleTicks() {
      return 500;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeMidnight(ctx);
      this.zombiesSpawned = 0;
      this.pillarsBuilt = 0;
      this.instrStart = null;
      this.phaseTicks = 0;
      ctx.onServer(s -> {
         class_3218 lvl = ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 1, 0, 22, 22);
            int by = (int)CENTER.field_1351;

            for (int gx = 0; gx < 7; gx++) {
               for (int gz = 0; gz < 7; gz++) {
                  if (gx != 3 || gz != 3) {
                     int bx = (int)CENTER.field_1352 + (gx - 3) * 5;
                     int bz = (int)CENTER.field_1350 + (gz - 3) * 5;

                     for (int dy = 0; dy < 3; dy++) {
                        for (int dx = 0; dx < 2; dx++) {
                           for (int dz = 0; dz < 2; dz++) {
                              lvl.method_8652(new class_2338(bx + dx, by + dy, bz + dz), class_2246.field_10340.method_9564(), 3);
                           }
                        }
                     }

                     this.pillarsBuilt++;
                  }
               }
            }

            Random rng = new Random(this.seed());

            for (int i = 0; i < 150; i++) {
               double angle = i * (Math.PI * 2) / 150.0 + (rng.nextDouble() - 0.5) * 0.05;
               double x = CENTER.field_1352 + Math.cos(angle) * 18.0;
               double z = CENTER.field_1350 + Math.sin(angle) * 18.0;
               class_1642 z2 = (class_1642)class_1299.field_6051.method_5883(lvl);
               if (z2 != null) {
                  z2.method_5814(x, CENTER.field_1351, z);
                  z2.method_5943(lvl, lvl.method_8404(z2.method_24515()), class_3730.field_16462, null);
                  z2.method_5971();
                  z2.method_5684(true);
                  ctx.spawnTracked(z2, lvl);
                  this.zombiesSpawned++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 22.0, 12.0, 0.6));
      Arena.teleport(ctx, CENTER, 0.0F, 0.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (this.instrStart == null && runner.state() == CinematicRunner.State.SAMPLING) {
         this.instrStart = Instr.snapshot();
      }

      this.phaseTicks++;
      if (this.phaseTicks % 20 == 0) {
         ctx.onServer(s -> {
            class_3218 lvl = ctx.serverLevel();
            class_3222 sp = ctx.serverPlayer();
            if (lvl != null && sp != null) {
               class_1309 target = sp;

               for (class_1297 e : lvl.method_27909()) {
                  if (e instanceof class_1642 z && z.method_5805() && z.method_5968() != target) {
                     z.method_5980(target);
                  }
               }
            }
         });
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("zombies_spawned", this.zombiesSpawned);
      r.extra("pillars_built", this.pillarsBuilt);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
