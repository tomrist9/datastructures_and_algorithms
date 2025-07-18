package main.java.linkedlist;

public class MyStack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object();
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            throw new RuntimeException("Stack overflow");
        }
        stackArray[++top] = value;
    }

    public T pop(T value){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top--];
    }
    public T peek(T value){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
