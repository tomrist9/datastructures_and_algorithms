package main.java.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class RemovingStarsFromString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        Iterator<Character> it = stack.descendingIterator();

        while (it.hasNext()) {
            sb.append(it.next());
        }

        return sb.toString();
    }
}