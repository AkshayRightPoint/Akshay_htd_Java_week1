package com.week3.dsa;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 43, 5, 57, 91, 45, 9, 7};
        MargeSort ms = new MargeSort();
        ms.sort(arr, 0, arr.length-1);
    }

   public static void sort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left+right)/2;

            sort(arr, left, mid);
            sort(arr, mid+1, right);

            marge(arr, left, mid, right);
        }
    }

    private static void marge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
