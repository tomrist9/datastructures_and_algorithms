package main.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecode {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            j++;
            result.add(s.substring(j, j + length));

            i = j + length;
        }
        return result;
    }

    public static void main(String[] args) {
        EncodeAndDecode codec = new EncodeAndDecode();
        List<String> input = Arrays.asList("neet", "code", "love", "you");
        String encoded = codec.encode(input);
        System.out.println(encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println(decoded);
    }

}
