package com.dgm.mcbc.bench;

import net.minecraft.util.math.Vec3d;

public final class CinematicState {
    private CameraPath currentPath;
    private double pathProgress;
    private double pathDuration;
    private boolean active;
    private String currentSegment;
    private int segmentIndex;

    public CinematicState() {
        this.active = false;
        this.pathProgress = 0;
        this.pathDuration = 0;
        this.currentSegment = "";
        this.segmentIndex = -1;
    }

    public void startPath(CameraPath path, double durationTicks, String segmentName, int segmentIndex) {
        this.currentPath = path;
        this.pathDuration = durationTicks;
        this.pathProgress = 0;
        this.active = true;
        this.currentSegment = segmentName;
        this.segmentIndex = segmentIndex;
    }

    public void update() {
        if (!active || currentPath == null || pathDuration <= 0) {
            return;
        }
        pathProgress += 1.0 / pathDuration;
        if (pathProgress >= 1.0) {
            pathProgress = 1.0;
            active = false;
        }
    }

    public CameraPath.Pose getCurrentPose() {
        if (currentPath == null) {
            return new CameraPath.Pose(Vec3d.ZERO, 0, 0);
        }
        return currentPath.sample(pathProgress);
    }

    public boolean isActive() {
        return active;
    }

    public double getProgress() {
        return pathProgress;
    }

    public String getCurrentSegment() {
        return currentSegment;
    }

    public int getSegmentIndex() {
        return segmentIndex;
    }

    public void stop() {
        this.active = false;
        this.currentPath = null;
    }
}