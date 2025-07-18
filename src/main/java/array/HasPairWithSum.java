package main.java.array;

import java.util.HashSet;
import java.util.Set;

public class HasPairWithSum {

    //brute force solution
    public static boolean hasPairWithSum(int[] nums, int targetSum) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean hasPairWithSumOptimized(int[] nums, int targetSum) {

        Set<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            if (mySet.contains(targetSum - num)) {
                return true;
            }
            mySet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasPairWithSumOptimized(new int[]{1, 2, 3, 4, 6}, 10));
    }
}
