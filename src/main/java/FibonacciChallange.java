package main.java;

import java.util.HashMap;
import java.util.Map;

public class FibonacciChallange {
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        memo.put(n, result);
        return result;

    }

    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
