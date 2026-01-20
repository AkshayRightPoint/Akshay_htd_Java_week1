package com.evaluation.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    /**Write a function that takes a string and returns the first character that does not repeat.
     * If all characters repeat, return a null or specific marker. */

    public static Character findFirstNonRepatingChar(String name){
        Map<Character, Integer>  map = new LinkedHashMap<>();

        for(char ch : name.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() ==1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String name = "akshay";
        System.out.println( findFirstNonRepatingChar(name) );
    }
}
