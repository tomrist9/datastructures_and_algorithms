package main.java;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringValue {

    public static Integer firstRecurringValue(int[] nums) {
        Set <Integer> seen= new HashSet<>();
        for(int num: nums){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(firstRecurringValue(new int[]{2, 5, 1, 2, 3, 5, 1})); // Output: 2
        System.out.println(firstRecurringValue(new int[]{1, 2, 3, 4, 5}));      // Output: null
        System.out.println(firstRecurringValue(new int[]{5, 5, 5, 5}));         // Output: 5
        System.out.println(firstRecurringValue(new int[]{}));                   // Output: null
    }

}
