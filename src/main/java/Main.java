package main.java;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        logAllPairsOfArray(arr);
    }

    public static void logAllPairsOfArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
            }
        }

    }
}
