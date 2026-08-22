package com.fpstest.client.control;

import com.fpstest.client.bench.camera.CameraPath;
import com.fpstest.client.bench.camera.Pose;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class CinematicState {
   public static volatile boolean active = false;
   public static volatile CameraPath path;
   public static volatile int pathTick;
   public static volatile boolean hidePlayer = true;
   public static volatile boolean holdPose = false;
   private static volatile Pose frozenPose;

   private CinematicState() {
   }

   public static Pose currentPose(float partialTick) {
      CameraPath p = path;
      if (p == null) {
         return frozenPose;
      } else if (holdPose && frozenPose != null) {
         return frozenPose;
      } else {
         Pose pose = p.poseAt(pathTick, partialTick);
         if (pose != null) {
            frozenPose = pose;
         }

         return pose;
      }
   }

   public static void reset() {
      active = false;
      path = null;
      pathTick = 0;
      hidePlayer = true;
      holdPose = false;
      frozenPose = null;
   }
}
