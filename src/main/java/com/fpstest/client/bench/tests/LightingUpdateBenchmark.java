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
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class LightingUpdateBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final int GRID = 16;
   private static final int PULSE_PERIOD = 20;
   private static final int LATE_CUTOFF = 10;
   private int phaseTicks = 0;
   private int toggles = 0;
   private boolean glowing = false;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "lighting_update";
   }

   @Override
   public String displayName() {
      return "Lighting update (16×16 glowstone reveal/hide)";
   }

   @Override
   public String category() {
      return "Lighting";
   }

   @Override
   public long seed() {
      return 9007L;
   }

   @Override
   public String description() {
      return "256 glowstone blocks alternating with stone every 1s; saturates the lighting queue.";
   }

   @Override
   public int warmupTicks() {
      return 60;
   }

   @Override
   public int sampleTicks() {
      return 600;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeMidnight(ctx);
      this.phaseTicks = 0;
      this.toggles = 0;
      this.glowing = false;
      this.instrStart = null;
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            int half = 20;
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, half, half);
            int by = (int)CENTER.y;

            for (int dx = -8; dx < 8; dx++) {
               for (int dz = -8; dz < 8; dz++) {
                  lvl.setBlock(new BlockPos((int)CENTER.x + dx, by, (int)CENTER.z + dz), Blocks.GLOWSTONE.defaultBlockState(), 3);
               }
            }

            this.glowing = true;
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.add(0.0, 6.0, 0.0), 11.2, 14.0, 0.5));
      Arena.teleport(ctx, CENTER.add(0.0, 14.0, 20.0), 180.0F, 45.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING && this.instrStart == null) {
         this.instrStart = Instr.snapshot();
      }

      if (this.phaseTicks % 20 == 0) {
         int sampleEndApprox = ctx.plan() != null ? ctx.plan().warmupTicks + ctx.plan().sampleTicks : this.warmupTicks() + this.sampleTicks();
         if (this.phaseTicks <= sampleEndApprox - 10) {
            ctx.onServer(s -> {
               ServerLevel lvl = (ServerLevel) ctx.serverLevel();
               if (lvl != null) {
                  BlockState newState = this.glowing ? Blocks.STONE.defaultBlockState() : Blocks.GLOWSTONE.defaultBlockState();
                  int by = (int)CENTER.y;

                  for (int dx = -8; dx < 8; dx++) {
                     for (int dz = -8; dz < 8; dz++) {
                        lvl.setBlock(new BlockPos((int)CENTER.x + dx, by, (int)CENTER.z + dz), newState, 3);
                     }
                  }

                  this.glowing = !this.glowing;
                  this.toggles++;
               }
            });
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("toggles", this.toggles);
      r.extra("blocks_per_toggle", 256);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
      }
   }
}
