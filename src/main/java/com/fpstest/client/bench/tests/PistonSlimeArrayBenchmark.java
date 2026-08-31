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
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class PistonSlimeArrayBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final int GRID = 8;
   private static final int CELL_SPACING = 4;
   private static final int PULSE_PERIOD = 8;
   private static final int SLIME_STACK = 3;
   private int pistonsBuilt = 0;
   private int phaseTicks = 0;
   private int powerToggles = 0;
   private boolean poweredHigh = false;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "piston_slime_array";
   }

   @Override
   public String displayName() {
      return "Piston/slime array (8×8 toggled every 8t)";
   }

   @Override
   public String category() {
      return "Redstone";
   }

   @Override
   public long seed() {
      return 4027L;
   }

   @Override
   public String description() {
      return "64 sticky pistons + 3-slime stacks; redstone-block toggle pulses produce continuous piston events.";
   }

   @Override
   public int warmupTicks() {
      return 40;
   }

   @Override
   public int sampleTicks() {
      return 500;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.pistonsBuilt = 0;
      this.phaseTicks = 0;
      this.powerToggles = 0;
      this.poweredHigh = false;
      this.instrStart = null;
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            int half = 36;
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 2, 0, half, half);
            BlockState pistonUp = Blocks.STICKY_PISTON.defaultBlockState().setValue(BlockStateProperties.FACING, Direction.UP);
            BlockState slime = Blocks.SLIME_BLOCK.defaultBlockState();
            BlockState stone = Blocks.STONE.defaultBlockState();
            int by = (int)CENTER.y;

            for (int gx = 0; gx < 8; gx++) {
               for (int gz = 0; gz < 8; gz++) {
                  int bx = (int)CENTER.x + (gx - 4) * 4;
                  int bz = (int)CENTER.z + (gz - 4) * 4;
                  lvl.setBlock(new BlockPos(bx, by, bz), pistonUp, 3);

                  for (int k = 0; k < 3; k++) {
                     lvl.setBlock(new BlockPos(bx, by + 1 + k, bz), slime, 3);
                  }

                  lvl.setBlock(new BlockPos(bx + 1, by, bz), stone, 3);
                  this.pistonsBuilt++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.add(0.0, 4.0, 0.0), 22.4, 14.0, 0.5));
      Arena.teleport(ctx, CENTER.add(0.0, 14.0, 38.0), 180.0F, 30.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (runner.state() == CinematicRunner.State.SAMPLING && this.instrStart == null) {
         this.instrStart = Instr.snapshot();
      }

      if (this.phaseTicks % 8 == 0) {
         ctx.onServer(s -> {
            ServerLevel lvl = (ServerLevel) ctx.serverLevel();
            if (lvl != null) {
               BlockState power = this.poweredHigh ? Blocks.STONE.defaultBlockState() : Blocks.REDSTONE_BLOCK.defaultBlockState();
               int by = (int)CENTER.y;

               for (int gx = 0; gx < 8; gx++) {
                  for (int gz = 0; gz < 8; gz++) {
                     int bx = (int)CENTER.x + (gx - 4) * 4;
                     int bz = (int)CENTER.z + (gz - 4) * 4;
                     lvl.setBlock(new BlockPos(bx + 1, by, bz), power, 3);
                  }
               }

               this.poweredHigh = !this.poweredHigh;
               this.powerToggles++;
            }
         });
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("pistons_built", this.pistonsBuilt);
      r.extra("power_toggles", this.powerToggles);
      r.extra("slime_blocks", this.pistonsBuilt * 3);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
