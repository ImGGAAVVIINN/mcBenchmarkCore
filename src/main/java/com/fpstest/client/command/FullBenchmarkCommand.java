package com.fpstest.client.command;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.gui.BenchmarkHub;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.network.chat.Component;

/**
 * Command to trigger the FULL BENCHMARK suite from in-game.
 * Usage: /fpstest fullbenchmark
 */
public class FullBenchmarkCommand {
    public static void register() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(ClientCommandManager.literal("fpstest")
                .then(ClientCommandManager.literal("fullbenchmark")
                    .executes(FullBenchmarkCommand::runFullBenchmark))
            );
        });
    }

    private static int runFullBenchmark(CommandContext<FabricClientCommandSource> context) {
        FabricClientCommandSource source = context.getSource();
        if (FpsTestClient.RUNNER.busy()) {
            source.sendError(Component.literal("[MC Benchmark Core] Benchmark already running!"));
            return 0;
        }
        
        source.sendFeedback(Component.literal("[MC Benchmark Core] Starting FULL BENCHMARK suite..."));
        boolean started = BenchmarkHub.startFullBenchmark();
        
        if (started) {
            source.sendFeedback(Component.literal("[MC Benchmark Core] FULL BENCHMARK started successfully."));
        } else {
            source.sendError(Component.literal("[MC Benchmark Core] Failed to start FULL BENCHMARK."));
        }
        
        return started ? 1 : 0;
    }
}
