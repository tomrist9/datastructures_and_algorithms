package main.java;

import org.w3c.dom.Node;

public  class LinkedList {


    class Node {
        public void insertAtIndex(int index, int value) {
            Node newNode = new Node(value);

            if (index == 0) {
                newNode.next = head;

            }
        }
    }
}