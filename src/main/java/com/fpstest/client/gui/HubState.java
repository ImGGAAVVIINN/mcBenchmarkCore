package com.fpstest.client.gui;

import java.util.LinkedHashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class HubState {
   public static BenchmarkHub.Tab tab = BenchmarkHub.Tab.OVERVIEW;
   public static BenchmarkHub.Preset preset = BenchmarkHub.Preset.QUICK;
   public static final Set<String> customQueue = new LinkedHashSet<>();

   private HubState() {
   }
}
