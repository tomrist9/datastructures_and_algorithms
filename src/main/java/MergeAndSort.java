package main.java;

import java.util.Arrays;

public class MergeAndSort {

    public static int [] mergeAndSort( int [] arr1, int [] arr2){
        int  totalLength = arr1.length + arr2.length;
        int [] merged =new int[totalLength];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Arrays.sort(merged);
        return merged;
     }

    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7};
        int [] arr2 = {2,4,6,8};
        int [] merged = mergeAndSort(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
}
