package main.java.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
//    public boolean containsDuplicate(int[] nums) {
//        if (nums.length == 0) return false;
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1]) return true;
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
