package main.java.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSum {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            int val = temp.val;
            list.add(val);
            temp = temp.next;
        }
        int i=0;
        int j = list.size()-1;
        int maxSum=0;
        while(i<j){
            int sum = list.get(i)+list.get(j);
            maxSum=Math.max(maxSum, sum);
            i++;
            j--;
        }
        return maxSum;
    }
}