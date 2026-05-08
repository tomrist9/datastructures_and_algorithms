package main.java.twopointers;

public class StringCompression {
    public int compress(char[] chars) {
        int read=0;
        int write =0;

        while(read < chars.length){
            char current = chars[read];
            int count=0;
            while(read<chars.length && chars[read]==current){
                read++;
                count++;
            }
            chars[write++]=current;


            if(count>1){
                String ctr=String.valueOf(count);


                for(char c: ctr.toCharArray()){
                    chars[write++]=c;
                }
            }

        }
        return write;
    }
}