package main.java.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {
    Deque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t){
        queue.offer(t);

        while (!queue.isEmpty() && queue.peek()<(t-3000)){
            queue.poll();
        }
        return queue.size();
    }
}