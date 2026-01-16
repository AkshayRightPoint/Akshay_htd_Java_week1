package com.week3.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,1,3,7};
        int target=7;
        linerSearchNumber(arr, target);

     }
    static int linerSearchNumber(int[] arr, int target) {
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == target) {
                System.out.println("Target number " + target + " Found at index " + i);
            }

        }
        return -1;
    }
}
