package main.java.sort;

import java.util.Arrays;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = right;
            int partitionIndex = partition(array, pivot, left, right);

            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    public static int partition(int[] array, int pivot, int left, int right) {
        int pivotValue = array[pivot];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i] < pivotValue) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, right, partitionIndex);
        return partitionIndex;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}

