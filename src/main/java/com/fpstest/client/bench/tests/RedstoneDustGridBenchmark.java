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
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public final class RedstoneDustGridBenchmark implements Benchmark {
   private static final Vec3d CENTER = new Vec3d(0.5, 70.0, 0.5);
   private static final int TRAIL_COUNT = 16;
   private static final int TRAIL_LENGTH = 32;
   private static final int TRAIL_SPACING = 3;
   private static final int REPEATER_PERIOD = 4;
   private static final int PULSE_PERIOD = 10;
   private int trailsBuilt = 0;
   private int dustPlaced = 0;
   private int pulses = 0;
   private boolean pulseHigh = false;
   private int phaseTicks = 0;
   private Instr.Snapshot instrStart = null;
   private final List<BlockPos> sourcePositions = new ArrayList<>();

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "redstone_dust_grid";
   }

   @Override
   public String displayName() {
      return "Redstone dust grid (16 trails ×32 + repeaters + lamps)";
   }

   @Override
   public String category() {
      return "Redstone";
   }

   @Override
   public long seed() {
      return 4019L;
   }

   @Override
   public String description() {
      return "16 parallel dust trails fed by tick-toggled redstone-block sources. Repeaters + lamps every 4 blocks.";
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
      Arena.freezeDaytime(ctx);
      this.trailsBuilt = 0;
      this.dustPlaced = 0;
      this.pulses = 0;
      this.pulseHigh = false;
      this.phaseTicks = 0;
      this.instrStart = null;
      this.sourcePositions.clear();
      ctx.onServer(s -> {
         ServerWorld lvl = (ServerWorld) ctx.serverLevel();
         if (lvl != null) {
            int halfX = 38;
            int halfZ = 54;
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 2, 0, halfX, halfZ);
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, halfX, halfZ);
            BlockState dust = Blocks.REDSTONE_WIRE.getDefaultState();
            BlockState lamp = Blocks.REDSTONE_LAMP.getDefaultState();
            BlockState repeaterE = (BlockState)Blocks.REPEATER.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.WEST);
            BlockState stone = Blocks.STONE.getDefaultState();
            int by = (int)CENTER.y;

            for (int t = 0; t < 16; t++) {
               int z = (int)CENTER.z + (t - 8) * 3;
               int startX = (int)CENTER.x - 16;
               BlockPos sourcePos = new BlockPos(startX - 1, by, z);
               lvl.setBlockState(sourcePos, stone, 3);
               this.sourcePositions.add(sourcePos);

               for (int i = 0; i < 32; i++) {
                  int x = startX + i;
                  BlockPos pos = new BlockPos(x, by, z);
                  boolean isRepeater = i > 0 && i % 8 == 0 && i < 31;
                  if (isRepeater) {
                     lvl.setBlockState(pos, repeaterE, 3);
                  } else {
                     lvl.setBlockState(pos, dust, 3);
                     this.dustPlaced++;
                  }

                  if (i > 0 && i % 4 == 0) {
                     BlockPos lampPos = new BlockPos(x, by, z - 1);
                     lvl.setBlockState(lampPos, lamp, 3);
                  }
               }

               BlockPos terminalLamp = new BlockPos(startX + 32, by, z);
               lvl.setBlockState(terminalLamp, lamp, 3);
               this.trailsBuilt++;
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 26.0, 28.0, 0.5));
      Arena.teleport(ctx, CENTER.add(0.0, 28.0, 60.0), 180.0F, 50.0F);
   }

   @Override
   public void tick(BenchContext ctx) {
      this.phaseTicks++;
      CinematicRunner runner = FpsTestClient.RUNNER;
      if (this.instrStart == null && runner.state() == CinematicRunner.State.SAMPLING) {
         this.instrStart = Instr.snapshot();
      }

      if (this.phaseTicks % 10 == 0) {
         this.pulseHigh = !this.pulseHigh;
         BlockState target = this.pulseHigh ? Blocks.REDSTONE_BLOCK.getDefaultState() : Blocks.STONE.getDefaultState();
         ctx.onServer(s -> {
            ServerWorld lvl = (ServerWorld) ctx.serverLevel();
            if (lvl != null) {
               for (BlockPos p : this.sourcePositions) {
                  lvl.setBlockState(p, target, 3);
               }

               this.pulses++;
            }
         });
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("trails_built", this.trailsBuilt);
      r.extra("dust_placed", this.dustPlaced);
      r.extra("repeaters_placed", this.trailsBuilt * 3);
      r.extra("lamps_placed", this.trailsBuilt * 8);
      r.extra("pulses_issued", this.pulses);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}