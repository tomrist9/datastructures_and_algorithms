package main.java;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static char firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }
        for(char c : s.toCharArray()){
            if(frequencyMap.get(c)==1){
                return c;
            }
        }
        return ' ';
    }
}
