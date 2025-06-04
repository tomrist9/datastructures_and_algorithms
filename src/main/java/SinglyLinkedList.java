package main.java;

public class SinglyLinkedList {
    Node head;


    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
            this.next=null;

            }
        public void append(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void prepend(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }


