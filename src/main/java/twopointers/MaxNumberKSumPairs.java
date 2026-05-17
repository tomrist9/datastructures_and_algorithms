package main.java.twopointers;

import java.util.Arrays;

public class MaxNumberKSumPairs {
    public int maxOperations(int[] nums, int k) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max =0;
        int left =0;
        int right = nums.length-1;

        while(left< right){
            int sum = nums[left]+nums[right];
            if(sum==k){
                max++;
                left++;
                right--;
            }else if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}