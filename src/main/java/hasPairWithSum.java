package main.java;

public class hasPairWithSum {

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

    }

    public static void main(String[] args) {
        System.out.println( hasPairWithSum( new int[]{1,2,3,4,6}, 10 ));
    }
}
