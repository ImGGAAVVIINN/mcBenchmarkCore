package com.fpstest.client;

import com.fpstest.client.bench.BenchmarkRegistry;
import com.fpstest.client.bench.CinematicRunner;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.fpstest.client.gui.BenchmarkHub;
import com.fpstest.client.hud.PerfHud;
import com.fpstest.client.metrics.FpsTracker;
import com.fpstest.client.metrics.MemoryTracker;
import com.fpstest.client.metrics.SystemUsageTracker;
import com.fpstest.client.metrics.TickTracker;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fpstest.client.bench.camera.CinematicState;

@Environment(EnvType.CLIENT)
public class FpsTestClient implements ClientModInitializer {
    public static final String MOD_ID = "fpstest";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);
    public static final FpsTracker FPS = new FpsTracker();
    public static final TickTracker TICKS = new TickTracker();
    public static final MemoryTracker MEMORY = new MemoryTracker();
    public static final SystemUsageTracker SYSTEM_USAGE = new SystemUsageTracker();
    public static final CinematicRunner RUNNER = new CinematicRunner();

    private boolean escWasDown = false;
    private boolean hotkeyWasDown = false;
    private boolean startupCleanupDone = false;
    private final PerfHud perfHud = new PerfHud();

    @Override
    public void onInitializeClient() {
        BenchmarkRegistry.bootstrap();
        LOG.info("MC Benchmark Core loaded — {} benchmarks registered", BenchmarkRegistry.all().size());

        ClientTickEvents.START_CLIENT_TICK.register(client -> {
            TICKS.onTickStart();
        });

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            TICKS.onTickEnd();
            MEMORY.sample();
            SYSTEM_USAGE.tick();
            RUNNER.onClientTick(client);
            pollAbortKey(client);
            pollBenchmarkMenuHotkey(client);

            if (!startupCleanupDone) {
                startupCleanupDone = true;
                EphemeralWorld.cleanupStaleOnStartup();
            }
        });

        HudRenderCallback.EVENT.register((ctx, tickCounter) -> {
            FPS.onFrame();
            perfHud.render(ctx);
        });
    }

    private void pollAbortKey(net.minecraft.client.Minecraft client) {
        if (client != null && client.getWindow() != null) {
            long handle = client.getWindow().handle();
            boolean escDown = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_ESCAPE) == GLFW.GLFW_PRESS;
            if (escDown && !this.escWasDown && RUNNER.busy()) {
                boolean shift = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS
                        || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;
                if (shift) {
                    RUNNER.abortAll("user pressed Shift+ESC");
                } else {
                    RUNNER.abortCurrentRequested("user pressed ESC");
                }
            }

            this.escWasDown = escDown;
        }
    }

    /**
     * Experimental access path: CTRL+ALT+SHIFT+F+J opens the existing benchmark
     * menu (with the experimental warning). It never starts a benchmark itself.
     */
    private void pollBenchmarkMenuHotkey(net.minecraft.client.Minecraft client) {
        if (client != null && client.getWindow() != null) {
            long handle = client.getWindow().handle();
            boolean ctrl = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                    || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS;
            boolean alt = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_ALT) == GLFW.GLFW_PRESS
                    || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_ALT) == GLFW.GLFW_PRESS;
            boolean shift = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS
                    || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;
            boolean f = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_F) == GLFW.GLFW_PRESS;
            boolean j = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_J) == GLFW.GLFW_PRESS;
            boolean combo = ctrl && alt && shift && f && j;
            if (combo && !this.hotkeyWasDown && !RUNNER.busy()) {
                BenchmarkHub.experimentalMenu = true;
                client.setScreen(new BenchmarkHub(client.screen));
            }
            this.hotkeyWasDown = combo;
        }
    }
}