package com.dgm.mcbc.bench;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class MultiAnglePath implements CameraPath {
    private final List<Cut> cuts;
    private final int totalTicks;

    public MultiAnglePath(List<Cut> cuts) {
        this.cuts = List.copyOf(cuts);
        int total = 0;

        for (Cut c : cuts) {
            total += c.ticksToHold;
        }

        this.totalTicks = Math.max(1, total);
    }

    @Override
    public CameraPath.Pose poseAt(int tick, float partial) {
        int t = tick % this.totalTicks;
        int acc = 0;

        for (Cut c : this.cuts) {
            if (t < acc + c.ticksToHold) {
                return c.pose;
            }

            acc += c.ticksToHold;
        }

        return this.cuts.get(this.cuts.size() - 1).pose;
    }

    @Environment(EnvType.CLIENT)
    public record Cut(int ticksToHold, CameraPath.Pose pose) {
    }
}