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
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ZombieMazeBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
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
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, 22, 22);
            int by = (int)CENTER.y;

            for (int gx = 0; gx < 7; gx++) {
               for (int gz = 0; gz < 7; gz++) {
                  if (gx != 3 || gz != 3) {
                     int bx = (int)CENTER.x + (gx - 3) * 5;
                     int bz = (int)CENTER.z + (gz - 3) * 5;

                     for (int dy = 0; dy < 3; dy++) {
                        for (int dx = 0; dx < 2; dx++) {
                           for (int dz = 0; dz < 2; dz++) {
                              lvl.setBlock(new BlockPos(bx + dx, by + dy, bz + dz), Blocks.STONE.defaultBlockState(), 3);
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
               double x = CENTER.x + Math.cos(angle) * 18.0;
               double z = CENTER.z + Math.sin(angle) * 18.0;
               Zombie z2 = (Zombie) EntityType.ZOMBIE.create(lvl, EntitySpawnReason.COMMAND);
               if (z2 != null) {
                  z2.setPos(x, CENTER.y, z);
                  z2.finalizeSpawn(lvl, lvl.getCurrentDifficultyAt(z2.blockPosition()), EntitySpawnReason.COMMAND, null);
                  z2.setPersistenceRequired();
                  z2.setInvulnerable(true);
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
            ServerLevel lvl = (ServerLevel) ctx.serverLevel();
            ServerPlayer sp = ctx.serverPlayer();
            if (lvl != null && sp != null) {
               LivingEntity target = sp;

               for (Entity e : lvl.getAllEntities()) {
                  if (e instanceof Zombie z && z.isAlive() && z.getTarget() != target) {
                     z.setTarget(target);
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