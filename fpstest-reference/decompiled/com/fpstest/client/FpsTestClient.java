package com.fpstest.client;

import com.fpstest.client.bench.BenchmarkRegistry;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.fpstest.client.hud.PerfHud;
import com.fpstest.client.metrics.FpsTracker;
import com.fpstest.client.metrics.MemoryTracker;
import com.fpstest.client.metrics.TickTracker;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class FpsTestClient implements ClientModInitializer {
   public static final String MOD_ID = "fpstest";
   public static final Logger LOG = LoggerFactory.getLogger("fpstest");
   public static final FpsTracker FPS = new FpsTracker();
   public static final TickTracker TICKS = new TickTracker();
   public static final MemoryTracker MEMORY = new MemoryTracker();
   public static final CinematicRunner RUNNER = new CinematicRunner();
   public static final PerfHud HUD = new PerfHud();
   private boolean escWasDown;

   public void onInitializeClient() {
      BenchmarkRegistry.bootstrap();
      ClientTickEvents.START_CLIENT_TICK.register((StartTick)client -> TICKS.onTickStart());
      ClientTickEvents.END_CLIENT_TICK.register((EndTick)client -> {
         TICKS.onTickEnd();
         MEMORY.sample();
         RUNNER.onClientTick(client);
         this.pollAbortKey(client);
      });
      HudRenderCallback.EVENT.register((HudRenderCallback)(ctx, tickCounter) -> {
         FPS.onFrame();
         HUD.render(ctx);
      });
      LOG.info("FPS Test loaded — {} benchmarks registered", BenchmarkRegistry.all().size());
      boolean[] startupCleanupDone = new boolean[]{false};
      ClientTickEvents.END_CLIENT_TICK.register((EndTick)client -> {
         if (!startupCleanupDone[0]) {
            startupCleanupDone[0] = true;
            EphemeralWorld.cleanupStaleOnStartup();
         }
      });
   }

   private void pollAbortKey(class_310 client) {
      if (client != null && client.method_22683() != null) {
         long h = client.method_22683().method_4490();
         boolean escDown = class_3675.method_15987(h, 256);
         if (escDown && !this.escWasDown && RUNNER.busy()) {
            boolean shift = class_3675.method_15987(h, 340) || class_3675.method_15987(h, 344);
            if (shift) {
               RUNNER.abortAll("user pressed Shift+ESC");
            } else {
               RUNNER.abortCurrentRequested("user pressed ESC");
            }
         }

         this.escWasDown = escDown;
      }
   }
}
