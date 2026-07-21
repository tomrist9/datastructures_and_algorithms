package main.java.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> res = new ArrayList<>();

            backtracking(1, k, n, 0, new ArrayList<>(),res);
            return res;
        }

        private void backtracking(int start, int k, int n, int sum, List<Integer> current, List<List<Integer>> res){
            if(current.size() == k){
                if(sum==n){
                    res.add(new ArrayList<>(current));
                }
                return;
            }

            for(int i=start; i<=9; i++){

                if(sum+i>n){
                    break;
                }

                current.add(i);
                backtracking(i+1,k, n,sum+i, current, res);

                current.remove(current.size()-1);


            }
        }
}