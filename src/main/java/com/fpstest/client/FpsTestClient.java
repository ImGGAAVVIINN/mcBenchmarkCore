package com.fpstest.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FpsTestClient implements ClientModInitializer {
    public static final String MOD_ID = "fpstest";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOG.info("FPS TEST mod initialized — {} benchmarks registered", 0);
    }
}
