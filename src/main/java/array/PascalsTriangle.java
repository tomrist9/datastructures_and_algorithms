package main.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows >= 1) {
            triangle.add(Collections.singletonList(1));
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);

            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int j = 1; j < i; j++) {
                int value = prevRow.get(j - 1) + prevRow.get(j);

                newRow.add(value);
            }

            newRow.add(1);

            triangle.add(newRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        pt.generate(5);
    }

}
