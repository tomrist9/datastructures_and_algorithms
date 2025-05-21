package main.java;

import java.util.HashSet;
import java.util.Set;

public class ContainsCommonItem {

    //brute force
//    public static boolean containsCommonItem(int[] nums1, int[] nums2) {
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
    public static boolean containsCommonItem2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(nums1[1]);
        }
        for(int num:nums2){
            if(set.contains(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {6,7};
        System.out.println(containsCommonItem2(nums1, nums2));
    }
}
