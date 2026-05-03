package main.java.string;

public class ReverseWords {
    public String reverseWords(String s) {

        int right = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(right>=0){
            while(right>=0 && s.charAt(right)==' '){
                right--;
            }

            if(right<0) break;

            int left =right;
            while(left>=0 && s.charAt(left)!=' '){
                left--;
            }
            if (sb.length() > 0) sb.append(" ");

            for(int i=left+1; i<=right; i++){
                sb.append(s.charAt(i));

            }
            right = left - 1;

        }
        return sb.toString();
    }
}