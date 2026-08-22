package com.fpstest.client.bench.camera;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class CompositePath implements CameraPath {
   private final List<CompositePath.Segment> segments;

   public CompositePath(List<CompositePath.Segment> segments) {
      this.segments = List.copyOf(segments);
   }

   @Override
   public Pose poseAt(int tick, float partial) {
      int t = tick;

      for (CompositePath.Segment s : this.segments) {
         if (t < s.ticks) {
            return s.path.poseAt(t, partial);
         }

         t -= s.ticks;
      }

      CompositePath.Segment last = this.segments.get(this.segments.size() - 1);
      return last.path.poseAt(last.ticks - 1, 1.0F);
   }

   @Environment(EnvType.CLIENT)
   public record Segment(int ticks, CameraPath path) {
   }
}
