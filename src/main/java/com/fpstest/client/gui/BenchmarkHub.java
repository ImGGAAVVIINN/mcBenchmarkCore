package com.fpstest.client.gui;

// Minimal GUI class - will be expanded later
// For now, just a placeholder that compiles

public class BenchmarkHub {
    // Placeholder class - GUI functionality to be added incrementally
    // This compiles successfully and serves as a starting point
    
    public static final int PRESET_COUNT = 41;
    private int selectedPreset = 0;
    
    public BenchmarkHub() {
        // Default constructor
    }
    
    public void setSelectedPreset(int index) {
        if (index >= 0 && index < PRESET_COUNT) {
            selectedPreset = index;
        }
    }
    
    public int getSelectedPreset() {
        return selectedPreset;
    }
}
