package com.fpstest.client.bench.camera;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface CameraPath {
   Pose poseAt(int var1, float var2);
}
