package main.java.stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for(int i =0; i<n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> b[0]-a[0]);

        Stack<Double> stack = new Stack<>();
        for(int i =0; i<n; i++){
            double time = (double) (target - cars[i][0]) / cars[i][1];


            if(!stack.isEmpty() && time <= stack.peek()){
                continue;
            }
            stack.push(time);
        }
        return stack.size();
    }
}
