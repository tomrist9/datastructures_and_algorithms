package main.java.binarysearch;

import java.util.Arrays;

public class SuccessfulPairsSpellsPotions {
    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int[] res = new int[spells.length];
            Arrays.sort(potions);
            for (int j = 0; j < spells.length; j++) {
                int left = 0;
                int right = potions.length - 1;
                int firstIndex = potions.length;

                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    long product = (long) spells[j] * potions[mid];
                    if (product >= success) {
                        firstIndex = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }

                    res[j] = potions.length - firstIndex;
                }
            }

            return res;
        }
    }
}