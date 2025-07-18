package main.java.binarysearch;

public class BinarySearchRecursive {

    public static int binarySearch(int[] nums, int target, int left, int right) {
       if(left>right) return -1;
       int mid = left + (right - left) / 2;
       if(nums[mid] == target){
           return mid;
       }else if (nums[mid] < target){
           return binarySearch(nums, target, mid + 1, right);
       }else{
           return binarySearch(nums, target, left, mid -1);
       }
    }
}
