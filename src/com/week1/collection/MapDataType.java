package com.week1.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDataType {
    public static void main(String[] args) {
        //HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "akshay"); hashMap.put(2, "kumar"); hashMap.put(3, "pandey");
        System.out.println(hashMap);

        //LinkedHashMap
        Map<Integer, String> linkedHashMap  = new LinkedHashMap<>();
        linkedHashMap.put(4, "raj"); linkedHashMap.put(5, "pandey");

        linkedHashMap.containsKey("Raj");
        System.out.println(linkedHashMap.entrySet() );
    }
}
