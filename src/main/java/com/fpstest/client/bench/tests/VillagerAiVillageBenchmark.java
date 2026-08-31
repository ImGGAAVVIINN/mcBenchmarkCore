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
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.npc.villager.VillagerData;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.entity.npc.villager.VillagerType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class VillagerAiVillageBenchmark implements Benchmark {
   private static final Vec3 CENTER = new Vec3(0.5, 70.0, 0.5);
   private static final int VILLAGE_RADIUS = 24;
   private static final int VILLAGER_COUNT = 80;
   private int villagersSpawned = 0;
   private int workstationsPlaced = 0;
   private int bedsPlaced = 0;
   private int doorsPlaced = 0;
   private Instr.Snapshot instrStart = null;

   @Override
   public WorldType worldType() {
      return WorldType.FLAT;
   }

   @Override
   public String id() {
      return "villager_ai_village";
   }

   @Override
   public String displayName() {
      return "Villager AI village (80, brain on)";
   }

   @Override
   public String category() {
      return "Entities";
   }

   @Override
   public long seed() {
      return 6299L;
   }

   @Override
   public String description() {
      return "80 villagers with profession + POI workstations + beds + doors; brain & pathfinding active.";
   }

   @Override
   public int warmupTicks() {
      return 200;
   }

   @Override
   public int sampleTicks() {
      return 600;
   }

   @Override
   public void prepare(BenchContext ctx) {
      Arena.freezeDaytime(ctx);
      this.villagersSpawned = 0;
      this.workstationsPlaced = 0;
      this.bedsPlaced = 0;
      this.doorsPlaced = 0;
      this.instrStart = null;
      ctx.onServer(
         s -> {
            ServerLevel lvl = (ServerLevel) ctx.serverLevel();
            if (lvl != null) {
               lvl.getServer().setDifficulty(Difficulty.NORMAL, true);
               int half = 24;
               Arena.stoneSlab(lvl, 0, (int)CENTER.y - 1, 0, half, half);
               int by = (int)CENTER.y;
               BlockState[] workstations = new BlockState[]{
                  Blocks.COMPOSTER.defaultBlockState(),
                  Blocks.LECTERN.defaultBlockState(),
                  Blocks.CARTOGRAPHY_TABLE.defaultBlockState(),
                  Blocks.FLETCHING_TABLE.defaultBlockState()
               };
               int wsTotal = 40;

               for (int i = 0; i < wsTotal; i++) {
                  double angle = i * (Math.PI * 2) / wsTotal;
                  int wx = (int)(CENTER.x + Math.cos(angle) * 22.0);
                  int wz = (int)(CENTER.z + Math.sin(angle) * 22.0);
                  lvl.setBlock(new BlockPos(wx, by, wz), workstations[i % workstations.length], 3);
                  this.workstationsPlaced++;
               }

               BlockState bedRedFoot = Blocks.RED_BED
                     .defaultBlockState()
                     .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST)
                     .setValue(BlockStateProperties.BED_PART, BedPart.FOOT);
               BlockState bedRedHead = Blocks.RED_BED
                     .defaultBlockState()
                     .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST)
                     .setValue(BlockStateProperties.BED_PART, BedPart.HEAD);
               int bedRows = 8;
               int bedsPerRow = 5;
               int bedXStart = (int)CENTER.x - 8;
               int bedZStart = (int)CENTER.z - 4;

               for (int r = 0; r < bedRows; r++) {
                  for (int c = 0; c < bedsPerRow; c++) {
                     int bx = bedXStart + c * 3;
                     int bz = bedZStart + r * 2;
                     lvl.setBlock(new BlockPos(bx, by, bz), bedRedFoot, 3);
                     lvl.setBlock(new BlockPos(bx + 1, by, bz), bedRedHead, 3);
                     this.bedsPlaced++;
                  }
               }

               BlockState doorLower = Blocks.OAK_DOOR.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER);
               BlockState doorUpper = Blocks.OAK_DOOR.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER);

               for (int d = 0; d < 16; d++) {
                  int dx = bedXStart + d % 4 * 4;
                  int dz = bedZStart + d / 4 * 4 - 1;
                  lvl.setBlock(new BlockPos(dx, by, dz), doorLower, 3);
                  lvl.setBlock(new BlockPos(dx, by + 1, dz), doorUpper, 3);
                  this.doorsPlaced++;
               }

               Holder<VillagerType> plainsType = lvl.registryAccess().lookupOrThrow(Registries.VILLAGER_TYPE).getOrThrow(VillagerType.PLAINS);
               Holder<VillagerProfession>[] profs = new Holder[]{
                  prof(lvl, VillagerProfession.FARMER),
                  prof(lvl, VillagerProfession.LIBRARIAN),
                  prof(lvl, VillagerProfession.CARTOGRAPHER),
                  prof(lvl, VillagerProfession.FLETCHER)
               };
               Random rng = new Random(this.seed());

               for (int i = 0; i < 80; i++) {
                  double dx = (rng.nextDouble() - 0.5) * 2.0 * 20.0;
                  double dz = (rng.nextDouble() - 0.5) * 2.0 * 20.0;
                  Villager v = new Villager(EntityType.VILLAGER, lvl, plainsType);
                  v.snapTo(CENTER.x + dx, CENTER.y, CENTER.z + dz, rng.nextFloat() * 360.0F, 0.0F);
                  v.setVillagerData(new VillagerData(plainsType, profs[i % profs.length], 1));
                  v.setNoAi(false);
                  v.setPersistenceRequired();
                  ctx.spawnTracked(v, lvl);
                  this.villagersSpawned++;
               }

               lvl.setDayTime(0L);
            }
         }
      );
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.add(0.0, 6.0, 0.0), 28.0, 12.0, 0.4));
      Arena.teleport(ctx, CENTER.add(0.0, 14.0, 30.0), 180.0F, 30.0F);
   }

   private static Holder<VillagerProfession> prof(ServerLevel lvl, ResourceKey<VillagerProfession> key) {
      return lvl.registryAccess().lookupOrThrow(Registries.VILLAGER_PROFESSION).getOrThrow(key);
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
      r.extra("villagers_spawned", this.villagersSpawned);
      r.extra("workstations_placed", this.workstationsPlaced);
      r.extra("beds_placed", this.bedsPlaced);
      r.extra("doors_placed", this.doorsPlaced);
      if (this.instrStart != null) {
         Instr.Snapshot d = Instr.snapshot().delta(this.instrStart);
         r.extra("scheduled_block_ticks", (double)d.scheduledBlockTicks());
         r.extra("block_state_changes", (double)d.blockStateChanges());
         r.extra("neighbour_updates", (double)d.neighbourUpdates());
      }
   }
}