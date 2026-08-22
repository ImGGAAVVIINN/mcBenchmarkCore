package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum BenchPhase {
   IDLE,
   SETUP,
   WARMUP,
   SAMPLING,
   COOLDOWN,
   CLEANUP,
   DONE;

   public boolean running() {
      return this != IDLE && this != DONE;
   }
}
