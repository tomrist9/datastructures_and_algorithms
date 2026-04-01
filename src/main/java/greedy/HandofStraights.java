package main.java.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HandofStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        Arrays.sort(hand);
        Map<Integer, Integer> count = new HashMap<>();

        for(int num : hand){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        for(int num : hand){
            if(count.get(num)==0) continue;

            for(int i =0; i< groupSize; i++){
                int curr = num + i;

                if(count.getOrDefault(curr, 0)==0) return false;

                count.put(curr, count.getOrDefault(curr, 0)-1);
            }
        }
        return true;
    }
}