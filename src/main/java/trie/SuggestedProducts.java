package main.java.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuggestedProducts {
    public List<List<String>> suggestedProducts(
            String[] products,
            String searchWord
    ) {
        Arrays.sort(products);

        List<List<String>> result = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();

        int start = 0;

        for (char character : searchWord.toCharArray()) {
            prefix.append(character);

            while (start < products.length
                    && !products[start].startsWith(prefix.toString())) {
                start++;
            }

            List<String> suggestions = new ArrayList<>();

            for (int i = start;
                 i < Math.min(start + 3, products.length);
                 i++) {

                if (products[i].startsWith(prefix.toString())) {
                    suggestions.add(products[i]);
                }
            }

            result.add(suggestions);
        }

        return result;
    }
}
