package main.java.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();
        for(int asteroid : asteroids){
            boolean alive = true;
            while(alive && asteroid <0 && !stack.isEmpty() && stack.peek()>0){
                if(stack.peek()<-asteroid){
                    stack.pop();
                }
                else  if(-asteroid==stack.peek() ){
                    stack.pop();
                    alive = false;
                }else{
                    alive=false;
                }


            }
            if(alive){
                stack.push(asteroid);
            }
        }

        int[] res = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            res[i]=stack.pop();
        }

        return res;
    }
}