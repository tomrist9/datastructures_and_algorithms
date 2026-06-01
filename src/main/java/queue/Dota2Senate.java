package main.java.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Deque<Integer> radiant= new ArrayDeque<>();
        Deque<Integer> dire = new ArrayDeque<>();
        int n = senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R'){
                radiant.offer(i);
            }else{
                dire.offer(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int radIndex= radiant.poll();
            int dirIndex= dire.poll();

            if(radIndex<dirIndex){
                radiant.offer(radIndex+n);
            }else{
                dire.offer(dirIndex+n);
            }
        }
        return radiant.isEmpty()?"Dire":"Radiant";
    }

}