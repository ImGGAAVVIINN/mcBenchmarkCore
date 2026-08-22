package com.fpstest.client.bench;

import com.fpstest.client.bench.camera.CameraPath;
import com.fpstest.client.control.CinematicState;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class BenchContext {
   public final class_310 client;
   private final List<UUID> spawned = new ArrayList<>();
   private class_243 arenaOrigin = class_243.field_1353;
   private RunPlan plan;

   public BenchContext(class_310 client) {
      this.client = client;
   }

   public RunPlan plan() {
      return this.plan;
   }

   public void setPlan(RunPlan plan) {
      this.plan = plan;
   }

   @Nullable
   public class_746 player() {
      return this.client.field_1724;
   }

   @Nullable
   public class_638 clientLevel() {
      return this.client.field_1687;
   }

   @Nullable
   public MinecraftServer server() {
      return this.client.method_1576();
   }

   @Nullable
   public class_3222 serverPlayer() {
      MinecraftServer s = this.server();
      return s != null && this.client.field_1724 != null ? s.method_3760().method_14602(this.client.field_1724.method_5667()) : null;
   }

   @Nullable
   public class_3218 serverLevel() {
      class_3222 sp = this.serverPlayer();
      if (sp != null) {
         return sp.method_51469();
      } else {
         MinecraftServer s = this.server();
         return s != null ? s.method_30002() : null;
      }
   }

   public void onServer(Consumer<MinecraftServer> action) {
      MinecraftServer s = this.server();
      if (s != null) {
         if (s.method_18854()) {
            action.accept(s);
         } else {
            s.method_19537(() -> action.accept(s));
         }
      }
   }

   public void spawnTracked(class_1297 entity, class_3218 world) {
      world.method_8649(entity);
      this.spawned.add(entity.method_5667());
   }

   public int trackedCount() {
      return this.spawned.size();
   }

   public void removeTracked() {
      if (!this.spawned.isEmpty()) {
         MinecraftServer s = this.server();
         if (s == null) {
            this.spawned.clear();
         } else {
            List<UUID> snapshot = new ArrayList<>(this.spawned);
            this.spawned.clear();
            s.execute(() -> this.drainBatch(s, snapshot, 0));
         }
      }
   }

   private void drainBatch(MinecraftServer s, List<UUID> ids, int from) {
      class_3218 lvl = s.method_30002() != null ? s.method_30002() : null;
      if (lvl != null) {
         int batch = 50;
         int end = Math.min(from + batch, ids.size());

         for (int i = from; i < end; i++) {
            try {
               class_1297 e = lvl.method_14190(ids.get(i));
               if (e != null) {
                  e.method_31472();
               }
            } catch (Throwable var9) {
            }
         }

         if (end < ids.size()) {
            s.execute(() -> this.drainBatch(s, ids, end));
         }
      }
   }

   public void setBlock(class_3218 world, class_2338 pos, class_2680 state) {
      world.method_8652(pos, state, 2);
   }

   public void setArenaOrigin(class_243 origin) {
      this.arenaOrigin = origin;
   }

   public class_243 arenaOrigin() {
      return this.arenaOrigin;
   }

   public void setCameraPath(@Nullable CameraPath path) {
      CinematicState.path = path;
      CinematicState.pathTick = 0;
   }
}
