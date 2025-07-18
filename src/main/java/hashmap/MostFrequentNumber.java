package main.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
    public static int findFrequentNumber(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequentNumber = nums[0];
        for(int num : nums){
            int count = frequencyMap.getOrDefault(num, 0)+1;
            frequencyMap.put(num, count);

            if(count > maxCount){
                maxCount = count;
                mostFrequentNumber = num;
            }

        }
        return mostFrequentNumber;
    }
}
