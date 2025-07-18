package main.java.linkedlist;

public class LinkedList {
    Node head;

    public void insertAtIndex(int index, int value) {
        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeAtIndex(int index) {
        if (index < 0) throw new IllegalArgumentException("Index cannot be negative");

        if (head == null) throw new IndexOutOfBoundsException("List is empty");

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) throw new IndexOutOfBoundsException("Index out of bounds");
            current = current.next;
        }

        if (current.next == null) throw new IndexOutOfBoundsException("Index out of bounds");

        current.next = current.next.next;
    }

}
