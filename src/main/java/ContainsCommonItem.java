package main.java;

public class ContainsCommonItem {
    public static boolean containsCommonItem(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
