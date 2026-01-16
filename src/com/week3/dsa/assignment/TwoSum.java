package com.week3.dsa.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,11,7,1,15}; int target = 9;

       // int[] result = twoSum(num, target);
        int[] index = twoSumHashMap(num, target);
        System.out.println(Arrays.toString(index));
    }
    static int[] twoSum(int[] nums, int target){
        int[] data = new int[0];
        for(int i =0; i<nums.length-1; i++){
            for(int j = i+1; j<= nums.length-1; j++){
                if(nums[i]+nums[j] == target) {
                    System.out.println(i + " " + j);
                    data =  new int[]{i, j};
                    return data;
                }
            }
        }
        return data;  // O(n2)
    }

   public static int[] twoSumHashMap(int[] num, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<num.length; i++){
            int data = target - num[i];
            if(map.containsKey(data)){
                return new int[] {map.get(data), i};
            }
            map.put(num[i], i);
        }
        return new int[]{};
    }  //time O(n) ->space O(n);
}
