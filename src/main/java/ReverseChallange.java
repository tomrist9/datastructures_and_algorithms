package main.java;

public class ReverseChallange {
//
//    public static String reverse(String input) {
//
//        return new StringBuilder((input)).reverse().toString();
//    }


    public static String reverse2(String input){

        char [] chars = input.toCharArray();
        int left =0;
        int right = chars.length-1;
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println(reverse2(input));
    }
}
