package main.java.array;

public class FindMissingNumber {
    public static int findMissingXOR(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ n;

    }
}