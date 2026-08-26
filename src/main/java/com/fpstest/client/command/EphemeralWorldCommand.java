package com.fpstest.client.command;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.client.server.IntegratedServer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.portal.TeleportTransition;
import net.minecraft.world.phys.Vec3;

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
        Minecraft minecraft = source.getClient();
        if (minecraft == null || minecraft.getSingleplayerServer() == null) {
            source.sendError(Component.literal("[FPS Test] No integrated server running. Please load a singleplayer world first."));
            return 0;
        }
        
        // Create the ephemeral world with a deterministic test seed
        // This uses the normal singleplayer world creation flow
        long testSeed = 12345L;
        EphemeralWorld.create(testSeed, WorldType.OVERWORLD);
        
        source.sendFeedback(Component.literal("[FPS Test] Ephemeral world created with seed " + testSeed + ". The client will now load the new world."));
        return 1;
    }

    private static int destroy(CommandContext<FabricClientCommandSource> context) {
        // Cast to FabricClientCommandSource to access client-specific methods
        FabricClientCommandSource source = (FabricClientCommandSource) context.getSource();
        
        // Check if we have an integrated server (singleplayer)
        Minecraft minecraft = source.getClient();
        if (minecraft == null || minecraft.getSingleplayerServer() == null) {
            source.sendError(Component.literal("[FPS Test] No integrated server running. Please load a singleplayer world first."));
            return 0;
        }
        
        // Destroy the ephemeral world (deletes the save directory)
        EphemeralWorld.destroy();
        
        source.sendFeedback(Component.literal("[FPS Test] Ephemeral world destroyed."));
        return 1;
    }

    private static int enter(CommandContext<FabricClientCommandSource> context) {
        // Cast to FabricClientCommandSource to access client-specific methods
        FabricClientCommandSource source = (FabricClientCommandSource) context.getSource();
        
        // Check if we have an integrated server (singleplayer)
        Minecraft minecraft = source.getClient();
        if (minecraft == null || minecraft.getSingleplayerServer() == null) {
            source.sendError(Component.literal("[FPS Test] No integrated server running. Please load a singleplayer world first."));
            return 0;
        }
        
        IntegratedServer server = minecraft.getSingleplayerServer();
        
        // Get the local player (client-side) to find the corresponding server-side player
        net.minecraft.client.player.LocalPlayer localPlayer = source.getPlayer();
        if (localPlayer == null) {
            source.sendError(Component.literal("[FPS Test] No local player found."));
            return 0;
        }
        
        // Get the server-side player from the integrated server using the local player's UUID
        ServerPlayer player = server.getPlayerList().getPlayer(localPlayer.getUUID());
        if (player == null) {
            source.sendError(Component.literal("[FPS Test] No server-side player found for local player."));
            return 0;
        }
        
        // Get the overworld dimension (the ephemeral world is the current singleplayer world)
        ServerLevel overworld = server.getLevel(Level.OVERWORLD);
        if (overworld == null) {
            source.sendError(Component.literal("[FPS Test] Overworld not found in server."));
            return 0;
        }
        
        // Log diagnostic info before teleport
        ResourceKey<Level> currentDim = player.level().dimension();
        ResourceKey<Level> targetDim = overworld.dimension();
        FpsTestClient.LOG.info("[FPS Test] DIAGNOSTIC: enter - current player dimension: {}", currentDim);
        FpsTestClient.LOG.info("[FPS Test] DIAGNOSTIC: enter - target dimension: {}", targetDim);
        
        // Create TeleportTransition to move player to overworld at 0, 100, 0
        Vec3 targetPos = new Vec3(0, 100, 0);
        Vec3 deltaMovement = Vec3.ZERO;
        TeleportTransition transition = new TeleportTransition(
            overworld,
            targetPos,
            deltaMovement,
            0.0f, // yRot
            0.0f, // xRot
            TeleportTransition.DO_NOTHING
        );
        
        // Attempt to teleport the player
        boolean teleportResult = false;
        try {
            player.teleport(transition);
            teleportResult = true;
        } catch (Exception e) {
            FpsTestClient.LOG.error("[FPS Test] Teleport failed with exception", e);
        }
        
        // Log whether dimension-change call returned successfully
        FpsTestClient.LOG.info("[FPS Test] DIAGNOSTIC: enter - teleport call returned successfully: {}", teleportResult);
        
        source.sendFeedback(Component.literal("[FPS Test] Attempted to teleport to overworld at 0, 100, 0. Teleport call success: " + teleportResult));
        return 1;
    }
}