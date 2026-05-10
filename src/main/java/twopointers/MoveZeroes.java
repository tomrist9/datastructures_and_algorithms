package main.java.twopointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int read = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[read] = nums[i];
                read++;
            }
        }

        while (read < nums.length) {
            nums[read] = 0;
            read++;
        }
    }
}