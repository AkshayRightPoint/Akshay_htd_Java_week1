package com.week3.dsa;

import java.util.Arrays;
import java.util.List;

public class Sorting {


    //Bubble sort
    public static int[] bubbleSort(int[] unsorted){
        for(int pass =0; pass< unsorted.length-1; pass++) {
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (unsorted[i] > unsorted[i + 1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                }
            }
        }
        return unsorted;
    }

    public static void main(String[] args) {
        int[] unsorted ={10, 4, 43, 5, 57, 91, 45, 9, 7};
        int[] sortedList = bubbleSort(unsorted);
        for(int sorted:sortedList){
            System.out.print(sorted + " , ");
        }

    }
}
