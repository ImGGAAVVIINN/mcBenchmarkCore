package com.dgm.mcbc.bench.metrics;

public final class RingBuffer<T> {
    private final Object[] buffer;
    private final int capacity;
    private int head = 0;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public RingBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new Object[capacity];
    }

    public void add(T value) {
        buffer[head] = value;
        head = (head + 1) % capacity;
        if (size < capacity) {
            size++;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int actualIndex = (head - size + index + capacity) % capacity;
        @SuppressWarnings("unchecked")
        T value = (T) buffer[actualIndex];
        return value;
    }

    public T getLatest() {
        if (size == 0) return null;
        int index = (head - 1 + capacity) % capacity;
        @SuppressWarnings("unchecked")
        T value = (T) buffer[index];
        return value;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void clear() {
        head = 0;
        size = 0;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = get(i);
        }
        return array;
    }
}