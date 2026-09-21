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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.world.block.WireOrientation;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public final class RedstoneClockBenchmark implements Benchmark {
   private static final Vec3d CENTER = new Vec3d(0.5, 70.0, 0.5);
   private static final int GRID = 6;
   private static final int SPACING = 3;
   private static final int PLACE_FLAGS = 3;
   private int clocksBuilt = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "redstone_clocks";
   }

   @Override
   public String displayName() {
      return "Redstone clocks (6×6)";
   }

   @Override
   public String category() {
      return "Redstone";
   }

   @Override
   public long seed() {
      return 4001L;
   }

   @Override
   public String description() {
      return "36 observer-pair clocks producing a continuous block-update storm.";
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.clocksBuilt = 0;
      this.instrStart = null;
      ctx.onServer(s -> {
         ServerWorld lvl = (ServerWorld) ctx.serverLevel();
         if (lvl != null) {
            int half = 22;
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, half, half);
            BlockState observerEast = (BlockState)Blocks.OBSERVER.getDefaultState().with(Properties.FACING, Direction.EAST);
            BlockState observerWest = (BlockState)Blocks.OBSERVER.getDefaultState().with(Properties.FACING, Direction.WEST);
            int by = (int)CENTER.y;

            for (int gx = 0; gx < 6; gx++) {
               for (int gz = 0; gz < 6; gz++) {
                  int bx = (int)CENTER.x + (gx - 3) * 3;
                  int bz = (int)CENTER.z + (gz - 3) * 3;
                  BlockPos posA = new BlockPos(bx, by, bz);
                  BlockPos posB = new BlockPos(bx + 1, by, bz);
                  lvl.setBlockState(posA, observerEast, 3);
                  lvl.setBlockState(posB, observerWest, 3);
                  lvl.updateNeighborsAlways(posA, Blocks.OBSERVER, WireOrientation.of(Direction.EAST, Direction.UP, WireOrientation.SideBias.LEFT));
                  this.clocksBuilt++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 16.0, 6.0, 1.1));
      Arena.teleport(ctx, CENTER.add(0.0, 8.0, 0.0), 0.0F, 30.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (this.instrStart == null && runner.state() == CinematicRunner.State.SAMPLING) {
         this.instrStart = Instr.snapshot();
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("clocks_built", this.clocksBuilt);
      r.extra("observers_placed", this.clocksBuilt * 2);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
