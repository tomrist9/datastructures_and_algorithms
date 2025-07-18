package main.java.sort;

public class MergeSortedArrays {

    public static int [] merge(int [] nums1, int [] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] result = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k =0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]){
                result[k++] = nums2[j++];
            } else {
                result[k++] = nums1[i++];
            }
        }
        while(i<n1){
            result[k++] = nums1[i++];
        }
        while(j<n2){
            result[k++] = nums2[j++];
        }
        return result;
    }
}
