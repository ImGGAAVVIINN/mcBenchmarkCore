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
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public final class HopperGridBenchmark implements Benchmark {
   private static final Vec3d CENTER = new Vec3d(0.5, 70.0, 0.5);
   private static final int GRID = 20;
   private static final int SPACING_Z = 2;
   private static final int RESTOCK_INTERVAL = 20;
   private static final int LATE_CUTOFF = 60;
   private int hoppersBuilt = 0;
   private int restocks = 0;
   private int phaseTicks = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "hopper_grid";
   }

   @Override
   public String displayName() {
      return "Hopper grid 20×20 (transfer storm)";
   }

   @Override
   public String category() {
      return "Block-Entities";
   }

   @Override
   public long seed() {
      return 8011L;
   }

   @Override
   public String description() {
      return "400 hoppers polling/transferring, top row restocked every 2s; primary block-entity stress.";
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
      Arena.freezeDaytime(ctx);
      this.hoppersBuilt = 0;
      this.restocks = 0;
      this.phaseTicks = 0;
      this.instrStart = null;
      ctx.onServer(s -> {
         ServerWorld lvl = (ServerWorld) ctx.serverLevel();
         if (lvl != null) {
            int halfX = 24;
            int halfZ = 44;
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, halfX, halfZ);
            BlockState hopperEast = Blocks.HOPPER.getDefaultState().with(Properties.HOPPER_FACING, Direction.EAST);
            int by = (int)CENTER.y;

            for (int gz = 0; gz < 20; gz++) {
               int bz = (int)CENTER.z + (gz - 10) * 2;
               int rowStartX = (int)CENTER.x - 10;

               for (int gx = 0; gx < 20; gx++) {
                  int bx = rowStartX + gx;
                  BlockPos hopperPos = new BlockPos(bx, by, bz);
                  if (gx == 19) {
                     lvl.setBlockState(new BlockPos(bx + 1, by, bz), Blocks.CHEST.getDefaultState(), 3);
                  }

                  lvl.setBlockState(hopperPos, hopperEast, 3);
                  this.hoppersBuilt++;
               }
            }
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER, 16.0, 14.0, 0.6));
      Arena.teleport(ctx, CENTER.add(0.0, 14.0, 46.0), 180.0F, 30.0F);
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
         if (this.phaseTicks <= sampleEndApprox - 60) {
            ctx.onServer(s -> {
               ServerWorld lvl = (ServerWorld) ctx.serverLevel();
               if (lvl != null) {
                  int by = (int)CENTER.y;
                  int rowStartX = (int)CENTER.x - 10;

                  for (int gz = 0; gz < 20; gz++) {
                     int bz = (int)CENTER.z + (gz - 10) * 2;
                     if (lvl.getBlockEntity(new BlockPos(rowStartX, by, bz)) instanceof HopperBlockEntity h) {
                        h.setStack(0, new ItemStack(Items.COBBLESTONE, 64));
                     }
                  }

                  this.restocks++;
               }
            });
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("hoppers_built", this.hoppersBuilt);
      r.extra("restocks", this.restocks);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}