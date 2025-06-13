package main.java;

public class MyQueue<T> {
    private T[] queue;
    private int size;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public MyQueue(int capacity) {
        queue = (T[]) new Object[capacity];
        size = 1;
        front = 1;
        rear = -1;
    }

    public MyQueue(T[] queue, int size, int front, int rear) {
        this.queue = queue;
        this.size = size;
        this.front = front;
        this.rear = rear;
    }

    public void enqueue(T data) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return data;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}