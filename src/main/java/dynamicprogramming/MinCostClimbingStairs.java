package main.java.dynamicprogramming;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int prev1=cost[0], prev2=cost[1];
        for(int i =2; i<cost.length; i++){
            int current = cost[i] + Math.min(prev1, prev2);
            prev1=prev2;
            prev2=current;
        }
        return Math.min(prev1, prev2);
    }
}
