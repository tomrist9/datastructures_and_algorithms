package main.java.array;

public class MaxSumSubarrayK {

    public static int maxSubArrayWithSizeK(int[] nums, int k){
        int windowSum = 0;
        int maxSum = 0;
        for(int i =0 ; i<k; i++){
            windowSum += nums[i];
        }
        maxSum = windowSum;
        for(int i=k; i<nums.length; i++){
            windowSum+=nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
