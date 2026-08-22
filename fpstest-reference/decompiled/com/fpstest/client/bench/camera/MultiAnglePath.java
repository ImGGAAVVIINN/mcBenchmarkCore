package com.fpstest.client.bench.camera;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class MultiAnglePath implements CameraPath {
   private final List<MultiAnglePath.Cut> cuts;
   private final int totalTicks;

   public MultiAnglePath(List<MultiAnglePath.Cut> cuts) {
      this.cuts = List.copyOf(cuts);
      int total = 0;

      for (MultiAnglePath.Cut c : cuts) {
         total += c.ticksToHold;
      }

      this.totalTicks = Math.max(1, total);
   }

   @Override
   public Pose poseAt(int tick, float partial) {
      int t = tick % this.totalTicks;
      int acc = 0;

      for (MultiAnglePath.Cut c : this.cuts) {
         if (t < acc + c.ticksToHold) {
            return c.pose;
         }

         acc += c.ticksToHold;
      }

      return this.cuts.get(this.cuts.size() - 1).pose;
   }

   @Environment(EnvType.CLIENT)
   public record Cut(int ticksToHold, Pose pose) {
   }
}
