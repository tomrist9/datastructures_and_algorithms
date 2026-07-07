package main.java.heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestNumberInfiniteSet {
    Set<Integer> set;
    PriorityQueue<Integer> minHeap;
    int current;
    public SmallestNumberInfiniteSet() {
        set= new HashSet<>();
        minHeap = new PriorityQueue<>();
        current=1;
    }

    public int popSmallest() {
        if(!minHeap.isEmpty()){
            int smallest= minHeap.poll();
            set.remove(smallest);
            return smallest;
        }

        int smallest=current;
        current++;
        return smallest;
    }

    public void addBack(int num) {
        if(num< current && !set.contains(num)){
            minHeap.offer(num);
            set.add(num);
        }
    }
}