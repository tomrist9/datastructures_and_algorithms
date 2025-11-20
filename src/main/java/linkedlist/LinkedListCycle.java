package main.java.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> seen = new HashSet<>();
        while(head!=null){
            if(seen.contains(head)){
                return true;
            }else{
                seen.add(head);
                head = head.next;
            }
        }
        return false;
    }

    public boolean hasCycleOptimizedSolution(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
