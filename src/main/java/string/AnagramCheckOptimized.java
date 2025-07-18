package main.java.string;


public class AnagramCheckOptimized {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[26];


        for (char c : s1.toCharArray()) {
            int index = c - 'a';
            charCount[index]++;

        }

        for (char c : s2.toCharArray()) {
            int index = c - 'a';
            charCount[index]--;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }


}