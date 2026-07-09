package main.java.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n= nums1.length;
        int[][] pairs = new int[n][2];
        for(int i=0; i<n; i++){
            pairs[i][0]=nums2[i];
            pairs[i][1]=nums1[i];
        }

        Arrays.sort(pairs, (a, b)->b[0]-a[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum =0;
        long answer=0;
        for(int[]pair : pairs){
            int currNums2 = pair[0];
            int currnums1=pair[1];
            sum+=currnums1;
            minHeap.offer(currnums1);


            if(minHeap.size()>k){
                sum-=minHeap.poll();
            }

            if(minHeap.size()==k){
                long score = sum *currNums2;
                answer=Math.max(score, answer);
            }
        }

        return answer;

    }
}