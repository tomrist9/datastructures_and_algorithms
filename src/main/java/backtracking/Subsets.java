package main.java.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> path) {

        result.add(new ArrayList<>(path));


        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);              // seç
            backtrack(i + 1, nums, path);   // davam et
            path.remove(path.size() - 1);   // geri qayıt (backtrack)
        }
    }
}
