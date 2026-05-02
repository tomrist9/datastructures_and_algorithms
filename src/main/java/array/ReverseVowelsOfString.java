package main.java.array;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isVowel(sb.charAt(left))) {
                left++;
            }
            while (left < right && !isVowel(sb.charAt(right))) {

                right--;
            }


            char temp = s.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }


        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}