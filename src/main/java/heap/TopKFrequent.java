package main.java.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>
                ((a, b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            heap.offer(entry);

            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = heap.poll().getKey();
        }
        return res;
    }
}
