package main.java.dynamicprogramming;

import java.util.Set;

public class StairCase {

    public int countWays(int n, Set<Integer> steps) {
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i=0; i<=n; i++) {
            for(int step : steps) {
                if(i-step>=0){
                    dp[i] +=dp[i-step];
                }
            }
        }
        return dp[n];
    }
}
