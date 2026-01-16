package com.week3.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7};
        int target=7;
        int ans = binarySearch(arr, target);
        if(ans != -1){
            System.out.println("found at index -> " + ans);
        }else {
            System.out.println("Target number not found");
        }
    }
    static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                return mid;
            }
           else if(arr[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
