package main.java.string;

public class ReverseString {
    public void reverseString(char[]s){
        int left = 0;
        int right = s.length - 1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
