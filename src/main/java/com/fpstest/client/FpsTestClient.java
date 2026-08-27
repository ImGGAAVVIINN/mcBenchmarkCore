package com.fpstest.client;

import com.fpstest.client.bench.BenchmarkRegistry;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.fpstest.client.metrics.FpsTracker;
import com.fpstest.client.metrics.MemoryTracker;
import com.fpstest.client.metrics.TickTracker;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.instrumentation.Instr;

@Environment(EnvType.CLIENT)
public class FpsTestClient implements ClientModInitializer {
    public static final String MOD_ID = "fpstest";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);
    public static final FpsTracker FPS = new FpsTracker();
    public static final TickTracker TICKS = new TickTracker();
    public static final MemoryTracker MEMORY = new MemoryTracker();
    public static final CinematicRunner RUNNER = new CinematicRunner();

    private int debugTicks = 0;
    private boolean startupCleanupDone = false;

    @Override
    public void onInitializeClient() {
        BenchmarkRegistry.bootstrap();
        LOG.info("FPS TEST mod initialized — {} benchmarks registered", BenchmarkRegistry.all().size());

        ClientTickEvents.START_CLIENT_TICK.register(client -> {
            TICKS.onTickStart();
        });

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            TICKS.onTickEnd();
            MEMORY.sample();
            RUNNER.onClientTick(client);

            if (!startupCleanupDone) {
                startupCleanupDone = true;
                EphemeralWorld.cleanupStaleOnStartup();
            }

            debugTicks++;

            if (debugTicks >= 20) {
                debugTicks = 0;

                LOG.info(
                    "Block state changes: {}, Neighbor updates: {}, Camera updates: {}",
                    Instr.blockStateChanges.get(),
                    Instr.neighbourUpdates.get(),
                    Instr.cameraUpdates.get()
                );
            }
        });

        HudRenderCallback.EVENT.register((ctx, tickCounter) -> {
            FPS.onFrame();
        });
    }
}