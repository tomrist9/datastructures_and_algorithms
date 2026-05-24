package main.java.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> answer1= new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : set2){
            if(!set1.contains(num)){
                answer2.add(num);
            }
        }
        for(int num : set1){
            if(!set2.contains(num)){
                answer1.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer1);
        answer.add(answer2);

        return answer;
    }
}