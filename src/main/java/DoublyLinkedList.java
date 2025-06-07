package main.java;

class DoublyLinkedList {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    void prepend(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            append(value);
            return;
        }

        Node newNode = new Node(value);
        Node nextNode = current.next;

        current.next = newNode;
        newNode.prev = current;

        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

    void remove(int index) {
        if (head == null) return;

        // Remove head
        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null; // list is now empty
            return;
        }

        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) return;

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current == tail) {
            tail = current.prev;
        }
    }

    void reverse(){
        Node current = head;
        Node temp = null;

        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }
}