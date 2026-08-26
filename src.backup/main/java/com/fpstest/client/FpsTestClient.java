package com.fpstest.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.instrumentation.Instr;
import com.fpstest.client.command.EphemeralWorldCommand;

public class FpsTestClient implements ClientModInitializer {
    public static final String MOD_ID = "fpstest";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

    private int debugTicks = 0;

    @Override
    public void onInitializeClient() {
        LOG.info("FPS TEST mod initialized — 0 benchmarks registered");

        // Register temporary ephemeral world commands
        EphemeralWorldCommand.register();

        // Temporary verification: activate cinematic mode to enable camera mixin
        CinematicState.active = true;

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
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
    }
}