package main.java.greedy;

public class JumpFrogII {
    int jumps=0;
    int end=0;
    int farthest=0;
    public int jump(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
            farthest=Math.max(farthest, i+nums[i]);
            if(i==end){
                jumps++;
                end=farthest;
            }

        }
        return jumps;
    }
}