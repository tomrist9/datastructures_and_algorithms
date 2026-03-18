package main.java.array;

import java.util.HashSet;
import java.util.Set;

public class HighestEvenNumber {
    public static Integer highestEven(int[] arr) {
        Integer max=null;

        for(int num : arr){
        if(num%2==0){
           if(max==null || num>max){
               max=num;
           }
        }


        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,8,24, 35, 38, 40, 4};

        System.out.println(highestEven(arr));
    }
}
