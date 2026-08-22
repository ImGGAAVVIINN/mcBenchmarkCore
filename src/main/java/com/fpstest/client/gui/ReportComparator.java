package com.fpstest.client.gui;

public class ReportComparator {
    // Comparator for benchmark reports
    public enum SortBy {
        FPS_AVERAGE,
        FPS_MIN,
        FPS_MAX,
        DURATION
    }
    
    // Simple comparison methods using primitive values
    public static int compareFPSAverage(double fps1, double fps2) {
        return Double.compare(fps2, fps1); // Descending order
    }
    
    public static int compareMinFPS(long min1, long min2) {
        return Long.compare(min2, min1); // Descending order
    }
    
    public static int compareMaxFPS(long max1, long max2) {
        return Long.compare(max2, max1); // Descending order
    }
    
    public static int compareDuration(long duration1, long duration2) {
        return Long.compare(duration2, duration1); // Descending order
    }
}
