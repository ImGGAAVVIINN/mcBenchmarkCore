package com.fpstest.client.command;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.TeleportTarget;
import net.minecraft.util.math.Vec3d;

public class EphemeralWorldCommand {
    public static void register() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(ClientCommandManager.literal("fpstest")
                .then(ClientCommandManager.literal("ephemeral")
                    .then(ClientCommandManager.literal("create")
                        .executes(EphemeralWorldCommand::create))
                    .then(ClientCommandManager.literal("destroy")
                        .executes(EphemeralWorldCommand::destroy))
                    .then(ClientCommandManager.literal("enter")
                        .executes(EphemeralWorldCommand::enter))
                )
            );
        });
    }

    private static int create(CommandContext<FabricClientCommandSource> context) {
        // Cast to FabricClientCommandSource to access client-specific methods
        FabricClientCommandSource source = (FabricClientCommandSource) context.getSource();
        
        // Check if we have an integrated server (singleplayer)
        MinecraftClient minecraft = source.getClient();
        if (minecraft == null || minecraft.getServer() == null) {
            source.sendError(Text.literal("[MinecraftClient Benchmark Core] No integrated server running. Please load a singleplayer world first."));
            return 0;
        }
        
        // Create the ephemeral world with a deterministic test seed
        // This uses the normal singleplayer world creation flow
        long testSeed = 12345L;
        EphemeralWorld.create(testSeed, WorldType.OVERWORLD);
        
        source.sendFeedback(Text.literal("[MinecraftClient Benchmark Core] Ephemeral world created with seed " + testSeed + ". The client will now load the new world."));
        return 1;
    }

    private static int destroy(CommandContext<FabricClientCommandSource> context) {
        // Cast to FabricClientCommandSource to access client-specific methods
        FabricClientCommandSource source = (FabricClientCommandSource) context.getSource();
        
        // Check if we have an integrated server (singleplayer)
        MinecraftClient minecraft = source.getClient();
        if (minecraft == null || minecraft.getServer() == null) {
            source.sendError(Text.literal("[MinecraftClient Benchmark Core] No integrated server running. Please load a singleplayer world first."));
            return 0;
        }
        
        // Destroy the ephemeral world (deletes the save directory)
        EphemeralWorld.destroy();
        
        source.sendFeedback(Text.literal("[MinecraftClient Benchmark Core] Ephemeral world destroyed."));
        return 1;
    }

    private static int enter(CommandContext<FabricClientCommandSource> context) {
        // Cast to FabricClientCommandSource to access client-specific methods
        FabricClientCommandSource source = (FabricClientCommandSource) context.getSource();
        
        // Check if we have an integrated server (singleplayer)
        MinecraftClient minecraft = source.getClient();
        if (minecraft == null || minecraft.getServer() == null) {
            source.sendError(Text.literal("[MinecraftClient Benchmark Core] No integrated server running. Please load a singleplayer world first."));
            return 0;
        }
        
        IntegratedServer server = minecraft.getServer();
        
        // Get the local player (client-side) to find the corresponding server-side player
        net.minecraft.client.network.ClientPlayerEntity localPlayer = source.getPlayer();
        if (localPlayer == null) {
            source.sendError(Text.literal("[MinecraftClient Benchmark Core] No local player found."));
            return 0;
        }
        
        // Get the server-side player from the integrated server using the local player's UUID
        ServerPlayerEntity player = server.getPlayerManager().getPlayer(localPlayer.getUuid());
        if (player == null) {
            source.sendError(Text.literal("[MinecraftClient Benchmark Core] No server-side player found for local player."));
            return 0;
        }
        
        // Get the overworld dimension (the ephemeral world is the current singleplayer world)
        ServerWorld overworld = server.getWorld(World.OVERWORLD);
        if (overworld == null) {
            source.sendError(Text.literal("[MinecraftClient Benchmark Core] Overworld not found in server."));
            return 0;
        }
        
        // Create TeleportTarget to move player to overworld at 0, 100, 0
        Vec3d targetPos = new Vec3d(0, 100, 0);
        Vec3d deltaMovement = Vec3d.ZERO;
        TeleportTarget transition = new TeleportTarget(
            overworld,
            targetPos,
            deltaMovement,
            0.0f, // yRot
            0.0f, // xRot
            TeleportTarget.NO_OP
        );
        
        // Attempt to teleport the player
        boolean teleportResult = false;
        try {
            player.teleportTo(transition);
            teleportResult = true;
        } catch (Exception e) {
            FpsTestClient.LOG.error("[MinecraftClient Benchmark Core] Teleport failed with exception", e);
        }
        
        source.sendFeedback(Text.literal("[MinecraftClient Benchmark Core] Attempted to teleport to overworld at 0, 100, 0. Teleport call success: " + teleportResult));
        return 1;
    }
}