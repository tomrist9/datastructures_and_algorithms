package main.java.string;

import java.util.Locale;

public class FindIndexFirstOccurrence {

    public int findStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        int n = haystack.length();
        int m = haystack.length();

        for(int i =0; i<=n-m; i++){
            if(haystack.substring(i, i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
