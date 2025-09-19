package main.java.linkedlist;

public class CopyListWithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        //7->13->11

        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }

            current = current.next.next;
        }
        Node dummyHead = new Node(0);
        Node copyList = dummyHead;
        current = head;
        while (current != null) {
            Node copy = current.next;
            copyList.next = copy;
            copyList = copy;

            current.next = copy.next;
            current = current.next;
        }

        return dummyHead.next;
    }
}

