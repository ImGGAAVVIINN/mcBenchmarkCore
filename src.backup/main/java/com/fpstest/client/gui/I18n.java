package com.fpstest.client.gui;

import net.minecraft.network.chat.Component;

public final class I18n {
    private I18n() {
    }

    public static String tr(String key) {
        return key;
    }

    public static Component t(String key) {
        return Component.literal(tr(key));
    }
}