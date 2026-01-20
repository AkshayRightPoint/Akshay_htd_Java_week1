package com.evaluation.core;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargest(nums));
    }

    private static int findSecondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: nums){
            if(num>largest){
                secondLargest = largest;
                largest =num;
            }
            else if(num >secondLargest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
