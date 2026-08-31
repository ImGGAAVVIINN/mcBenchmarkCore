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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ComparatorStorageBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final int GRID = 8;
   private static final int CELL_SPACING = 3;
   private static final int PULSE_PERIOD = 20;
   private static final int LATE_CUTOFF = 60;
   private int chestsBuilt = 0;
   private int comparatorsBuilt = 0;
   private int phaseTicks = 0;
   private int oscillations = 0;
   private boolean fullState = true;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "comparator_storage";
   }

   @Override
   public String displayName() {
      return "Comparator storage (8×8 chests + comparators)";
   }

   @Override
   public String category() {
      return "Block-Entities";
   }

   @Override
   public long seed() {
      return 8053L;
   }

   @Override
   public String description() {
      return "64 chest+comparator pairs; inventory contents oscillate so comparators recompute every 1s.";
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
      this.chestsBuilt = 0;
      this.comparatorsBuilt = 0;
      this.phaseTicks = 0;
      this.oscillations = 0;
      this.fullState = true;
      this.instrStart = null;
      ctx.onServer(s -> {
         ServerLevel lvl = (ServerLevel) ctx.serverLevel();
         if (lvl != null) {
            int half = 28;
            Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, half, half);
            BlockState chest = Blocks.CHEST.defaultBlockState();
            BlockState comparator = (BlockState)Blocks.COMPARATOR.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH);
            BlockState dust = Blocks.REDSTONE_WIRE.defaultBlockState();
            int by = (int)CENTER.y;

            for (int gx = 0; gx < 8; gx++) {
               for (int gz = 0; gz < 8; gz++) {
                  int bx = (int)CENTER.x + (gx - 4) * 3;
                  int bz = (int)CENTER.z + (gz - 4) * 3;
                  lvl.setBlock(new BlockPos(bx, by, bz), chest, 3);
                  lvl.setBlock(new BlockPos(bx, by, bz + 1), comparator, 3);
                  lvl.setBlock(new BlockPos(bx, by, bz + 2), dust, 3);
                  this.chestsBuilt++;
                  this.comparatorsBuilt++;
               }
            }

            this.fillAllChests(lvl, true);
         }
      });
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.add(0.0, 4.0, 0.0), 14.399999999999999, 12.0, 0.5));
      Arena.teleport(ctx, CENTER.add(0.0, 14.0, 30.0), 180.0F, 30.0F);
   }

   private void fillAllChests(ServerLevel lvl, boolean full) {
      int by = (int)CENTER.y;

      for (int gx = 0; gx < 8; gx++) {
         for (int gz = 0; gz < 8; gz++) {
            int bx = (int)CENTER.x + (gx - 4) * 3;
            int bz = (int)CENTER.z + (gz - 4) * 3;
            if (lvl.getBlockEntity(new BlockPos(bx, by, bz)) instanceof ChestBlockEntity chest) {
               if (full) {
                  for (int slot = 0; slot < chest.getContainerSize(); slot++) {
                     chest.setItem(slot, new ItemStack(Items.REDSTONE, 64));
                  }
               } else {
                  for (int slot = 0; slot < chest.getContainerSize(); slot++) {
                     chest.setItem(slot, ItemStack.EMPTY);
                  }

                  chest.setItem(0, new ItemStack(Items.REDSTONE, 1));
               }

               chest.setChanged();
               lvl.updateNeighborsAt(new BlockPos(bx, by, bz), chest.getBlockState().getBlock(), Orientation.of(Direction.NORTH, Direction.UP, Orientation.SideBias.LEFT));
            }
         }
      }
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
               ServerLevel lvl = (ServerLevel) ctx.serverLevel();
               if (lvl != null) {
                  this.fillAllChests(lvl, !this.fullState);
                  this.fullState = !this.fullState;
                  this.oscillations++;
               }
            });
         }
      }
   }

   @Override
   public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
      r.extra("chests_built", this.chestsBuilt);
      r.extra("comparators_built", this.comparatorsBuilt);
      r.extra("oscillations", this.oscillations);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}
