package com.fpstest.client.control;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;

public class KeyboardInput {
    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static boolean isKeyDown(KeyBinding key) {
        return key.isPressed();
    }

    public static boolean isKeyPressed(KeyBinding key) {
        return key.wasPressed();
    }

    public static double getMouseX() {
        return mc.mouse.getX();
    }

    public static double getMouseY() {
        return mc.mouse.getY();
    }

    // Mouse delta tracking
    private static double lastMouseX = 0;
    private static double lastMouseY = 0;
    private static boolean firstFrame = true;

    public static double getMouseDeltaX() {
        double currentX = mc.mouse.getX();
        double delta = firstFrame ? 0 : currentX - lastMouseX;
        lastMouseX = currentX;
        firstFrame = false;
        return delta;
    }

    public static double getMouseDeltaY() {
        double currentY = mc.mouse.getY();
        double delta = firstFrame ? 0 : currentY - lastMouseY;
        lastMouseY = currentY;
        return delta;
    }
}