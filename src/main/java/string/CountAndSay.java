package main.java.string;

public class CountAndSay {
    public String countAndSay(int n) {
        String s = "1";
        for(int k=2; k<=n; k++){
            s = describe(s);
        }
        return s;
    }

    public String describe(String s){
        StringBuilder sb =new StringBuilder(s.length()*2);
        int i=0;
        int len =s.length();
        while(i<len){
            char c = s.charAt(i);
            int j= i+1;
            while(j<len && s.charAt(j)==c)j++;
            int count = j-i;
            i=j;
            sb.append(count).append(c);
        }
        return sb.toString();

    }
}
