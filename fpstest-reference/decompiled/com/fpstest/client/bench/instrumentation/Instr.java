package com.fpstest.client.bench.instrumentation;

import java.util.concurrent.atomic.AtomicLong;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class Instr {
   public static final AtomicLong scheduledBlockTicks = new AtomicLong();
   public static final AtomicLong scheduledFluidTicks = new AtomicLong();
   public static final AtomicLong blockStateChanges = new AtomicLong();
   public static final AtomicLong neighbourUpdates = new AtomicLong();
   public static final AtomicLong sectionRebuilds = new AtomicLong();
   public static final AtomicLong explosions = new AtomicLong();
   public static final AtomicLong fallingBlockLandings = new AtomicLong();

   private Instr() {
   }

   public static Instr.Snapshot snapshot() {
      return new Instr.Snapshot(
         scheduledBlockTicks.get(),
         scheduledFluidTicks.get(),
         blockStateChanges.get(),
         neighbourUpdates.get(),
         sectionRebuilds.get(),
         explosions.get(),
         fallingBlockLandings.get()
      );
   }

   public static void reset() {
      scheduledBlockTicks.set(0L);
      scheduledFluidTicks.set(0L);
      blockStateChanges.set(0L);
      neighbourUpdates.set(0L);
      sectionRebuilds.set(0L);
      explosions.set(0L);
      fallingBlockLandings.set(0L);
   }

   @Environment(EnvType.CLIENT)
   public record Snapshot(
      long scheduledBlockTicks,
      long scheduledFluidTicks,
      long blockStateChanges,
      long neighbourUpdates,
      long sectionRebuilds,
      long explosions,
      long fallingBlockLandings
   ) {
      public Instr.Snapshot delta(Instr.Snapshot earlier) {
         return new Instr.Snapshot(
            this.scheduledBlockTicks - earlier.scheduledBlockTicks,
            this.scheduledFluidTicks - earlier.scheduledFluidTicks,
            this.blockStateChanges - earlier.blockStateChanges,
            this.neighbourUpdates - earlier.neighbourUpdates,
            this.sectionRebuilds - earlier.sectionRebuilds,
            this.explosions - earlier.explosions,
            this.fallingBlockLandings - earlier.fallingBlockLandings
         );
      }
   }
}
