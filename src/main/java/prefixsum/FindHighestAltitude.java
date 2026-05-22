package main.java.prefixsum;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int prefix=Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<gain.length; i++){
            sum+=gain[i];

            prefix= Math.max(sum, prefix);
        }

        return prefix<0? 0 : prefix;
    }
}