package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class NextClosestTime {
    public String nextClosestTime(String time) {
        Set<Character> set = new HashSet<>();
        for (char c : time.toCharArray()) {
            if (c != ':') {
                set.add(c);
            }
        }

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3));

        while (true) {
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
            }
            if (hour == 24) {
                hour = 0;
            }


            String next = String.format("%02d:%02d", hour, minute);

            boolean ok = true;
            for(char c : next.toCharArray()){
                if(c!=':' && !set.contains(c)){
                    ok = false;
                    break;
                }
            }
            if(ok){
                return next;
            }

        }
    }
}