package com.fpstest.client.metrics;

public class RingBuffer {
    private final int capacity;
    private final long[] buffer;
    private int position = 0;
    private int count = 0;
    
    public RingBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new long[capacity];
    }
    
    public void add(long value) {
        buffer[position] = value;
        position = (position + 1) % capacity;
        if (count < capacity) {
            count++;
        }
    }
    
    public double getAverage() {
        if (count == 0) return 0.0;
        long sum = 0;
        int limit = Math.min(count, capacity);
        for (int i = 0; i < limit; i++) {
            sum += buffer[i];
        }
        return (double) sum / limit;
    }
    
    public long getLatest() {
        if (count == 0) return 0;
        int idx = (position - 1 + capacity) % capacity;
        return buffer[idx];
    }
    
    public int size() {
        return count;
    }
    
    public boolean isFull() {
        return count >= capacity;
    }
}
