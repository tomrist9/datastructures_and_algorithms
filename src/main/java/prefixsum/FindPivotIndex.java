package main.java.prefixsum;

public class FindPivotIndex {
    public int findIndex(int []nums){
        int leftSum =0;
        int totalSum=0;
        for (int num:nums){
            totalSum+=num;
        }
        for(int i=0; i<nums.length; i++){
            int rightSum=totalSum-nums[i]-leftSum;

            if(rightSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }

        return -1;
    }
}