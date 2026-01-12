package com.week3.dsa;

public class SortingAdditionalPractise {
    public static void main(String[] args) {
        int[] unsorted = {3,2,1,4,6,0};
        int length = unsorted.length;
        selectionSort(unsorted, length);
    }

    private static void selectionSort(int[] data, int n) {
        for(int i =0; i<n-1; i++){
            int min = i;

            for(int j=i+1; j<n; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
             data[min] = temp;

        }
        for(int sorted:data)
        System.out.print(sorted + " ");
    }
}
