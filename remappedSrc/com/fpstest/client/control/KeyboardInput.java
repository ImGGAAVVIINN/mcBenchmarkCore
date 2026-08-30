package com.fpstest.client.control;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;

public class KeyboardInput {
    private static final Minecraft mc = Minecraft.getInstance();

    public static boolean isKeyDown(KeyMapping key) {
        return key.isDown();
    }

    public static boolean isKeyPressed(KeyMapping key) {
        return key.consumeClick();
    }

    public static double getMouseX() {
        return mc.mouseHandler.xpos();
    }

    public static double getMouseY() {
        return mc.mouseHandler.ypos();
    }

    // Mouse delta tracking (Minecraft 1.21.11 doesn't expose getXVelocity/getYVelocity)
    private static double lastMouseX = 0;
    private static double lastMouseY = 0;
    private static boolean firstFrame = true;

    public static double getMouseDeltaX() {
        double currentX = mc.mouseHandler.xpos();
        double delta = firstFrame ? 0 : currentX - lastMouseX;
        lastMouseX = currentX;
        firstFrame = false;
        return delta;
    }

    public static double getMouseDeltaY() {
        double currentY = mc.mouseHandler.ypos();
        double delta = firstFrame ? 0 : currentY - lastMouseY;
        lastMouseY = currentY;
        return delta;
    }
}