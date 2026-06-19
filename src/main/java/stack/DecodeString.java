package main.java.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    //Input: s = "3[a2[c]]"
    public String decodeString(String s) {
        Deque<Integer> counts = new ArrayDeque<>();
        Deque<StringBuilder> repeatedStrings = new ArrayDeque<>();
        int currentRepeats = 0;
        StringBuilder currentString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentRepeats = currentRepeats * 10 + Character.getNumericValue(c);
            } else if (c == '[') {
                counts.push(currentRepeats);
                repeatedStrings.push(currentString);
                currentString = new StringBuilder();
                currentRepeats = 0;
            } else if (c == ']') {
                int repeatedTimes = counts.pop();
                StringBuilder decodedString = repeatedStrings.pop();
                for (int i = 0; i < repeatedTimes; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            }
        }

        return currentString.toString();
    }

}
