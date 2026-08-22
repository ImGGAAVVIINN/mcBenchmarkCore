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
import net.minecraft.class_1267;
import net.minecraft.class_1299;
import net.minecraft.class_1646;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2742;
import net.minecraft.class_2756;
import net.minecraft.class_3218;
import net.minecraft.class_3850;
import net.minecraft.class_3852;
import net.minecraft.class_3854;

@Environment(EnvType.CLIENT)
public final class VillagerAiVillageBenchmark implements Benchmark {
   private static final class_243 CENTER = new class_243(0.5, 70.0, 0.5);
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
            class_3218 lvl = ctx.serverLevel();
            if (lvl != null) {
               lvl.method_8503().method_3776(class_1267.field_5802, true);
               int half = 24;
               Arena.stoneSlab(lvl, 0, (int)CENTER.field_1351 - 1, 0, half, half);
               int by = (int)CENTER.field_1351;
               class_2680[] workstations = new class_2680[]{
                  class_2246.field_17563.method_9564(),
                  class_2246.field_16330.method_9564(),
                  class_2246.field_16336.method_9564(),
                  class_2246.field_16331.method_9564()
               };
               int wsTotal = 40;

               for (int i = 0; i < wsTotal; i++) {
                  double angle = i * (Math.PI * 2) / wsTotal;
                  int wx = (int)(CENTER.field_1352 + Math.cos(angle) * 22.0);
                  int wz = (int)(CENTER.field_1350 + Math.sin(angle) * 22.0);
                  lvl.method_8652(new class_2338(wx, by, wz), workstations[i % workstations.length], 3);
                  this.workstationsPlaced++;
               }

               class_2680 bedRedFoot = (class_2680)((class_2680)class_2246.field_10069
                     .method_9564()
                     .method_11657(class_2741.field_12481, class_2350.field_11034))
                  .method_11657(class_2741.field_12483, class_2742.field_12557);
               class_2680 bedRedHead = (class_2680)((class_2680)class_2246.field_10069
                     .method_9564()
                     .method_11657(class_2741.field_12481, class_2350.field_11034))
                  .method_11657(class_2741.field_12483, class_2742.field_12560);
               int bedRows = 8;
               int bedsPerRow = 5;
               int bedXStart = (int)CENTER.field_1352 - 8;
               int bedZStart = (int)CENTER.field_1350 - 4;

               for (int r = 0; r < bedRows; r++) {
                  for (int c = 0; c < bedsPerRow; c++) {
                     int bx = bedXStart + c * 3;
                     int bz = bedZStart + r * 2;
                     lvl.method_8652(new class_2338(bx, by, bz), bedRedFoot, 3);
                     lvl.method_8652(new class_2338(bx + 1, by, bz), bedRedHead, 3);
                     this.bedsPlaced++;
                  }
               }

               class_2680 doorLower = (class_2680)class_2246.field_10149.method_9564().method_11657(class_2741.field_12533, class_2756.field_12607);
               class_2680 doorUpper = (class_2680)class_2246.field_10149.method_9564().method_11657(class_2741.field_12533, class_2756.field_12609);

               for (int d = 0; d < 16; d++) {
                  int dx = bedXStart + d % 4 * 4;
                  int dz = bedZStart + d / 4 * 4 - 1;
                  lvl.method_8652(new class_2338(dx, by, dz), doorLower, 3);
                  lvl.method_8652(new class_2338(dx, by + 1, dz), doorUpper, 3);
                  this.doorsPlaced++;
               }

               class_3852[] profs = new class_3852[]{class_3852.field_17056, class_3852.field_17060, class_3852.field_17054, class_3852.field_17058};
               Random rng = new Random(this.seed());

               for (int i = 0; i < 80; i++) {
                  double dx = (rng.nextDouble() - 0.5) * 2.0 * 20.0;
                  double dz = (rng.nextDouble() - 0.5) * 2.0 * 20.0;
                  class_1646 v = new class_1646(class_1299.field_6077, lvl, class_3854.field_17073);
                  v.method_5808(CENTER.field_1352 + dx, CENTER.field_1351, CENTER.field_1350 + dz, rng.nextFloat() * 360.0F, 0.0F);
                  v.method_7195(new class_3850(class_3854.field_17073, profs[i % profs.length], 1));
                  v.method_5977(false);
                  v.method_5971();
                  ctx.spawnTracked(v, lvl);
                  this.villagersSpawned++;
               }

               lvl.method_29199(0L);
            }
         }
      );
      ctx.setArenaOrigin(CENTER);
      ctx.setCameraPath(new OrbitPath(CENTER.method_1031(0.0, 6.0, 0.0), 28.0, 12.0, 0.4));
      Arena.teleport(ctx, CENTER.method_1031(0.0, 14.0, 30.0), 180.0F, 30.0F);
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
