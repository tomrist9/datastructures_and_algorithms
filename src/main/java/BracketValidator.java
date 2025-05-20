package main.java;

import java.util.Stack;

public class BracketValidator {
    private static boolean balancedBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && stack.isEmpty() || ch == '}' && stack.isEmpty() || ch == ']' && stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

}