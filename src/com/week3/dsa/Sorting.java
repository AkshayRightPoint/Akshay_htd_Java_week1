package com.week3.dsa;

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

    //Selection Sort

    public static int[] SelectionSort(int[] unsorted){
        for(int i= 0; i<unsorted.length-1; i++){
            int min = i;
            for(int j =i+1; j<unsorted.length; j++) {
                if (unsorted[j] < unsorted[min]) {
                    min = j;
                }
            }
                int temp = unsorted[i];
                unsorted[i] = unsorted[min];
                unsorted[min] = temp;
        }
        return unsorted;
    }
    public static void main(String[] args) {
        int[] unsorted ={10, 4, 43, 5, 57, 91, 45, 9, 7};
        int[] unsorted2 ={1, 4, 3, 5};

       /*
        int[] sortedList = bubbleSort(unsorted);
        for(int sorted:sortedList){
            System.out.print(sorted + " ");
        }
        */


        /*
        int[] selectionSortList = SelectionSort(unsorted);

        for(int sorted:selectionSortList){
            System.out.print(sorted + " ");
        }
            */

        insertionSort(unsorted2);  // -> use for sort data
    }

    private static void insertionSort(int[] unsorted2) {
        int n = unsorted2.length;
        for(int i =1; i<n; i++ ){
            int key = unsorted2[i];
            int j = i-1;

            while (j>=0 && unsorted2[j] >key){
                unsorted2[j+1] = unsorted2[j];
                j--;
            }
            unsorted2[j+1] =key;
        }
        for (int sorted:unsorted2){
            System.out.print(sorted + " ");
        }
    }
}
