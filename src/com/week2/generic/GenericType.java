package com.week2.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericType {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Akshay");
        list.add(2);
        String s = (String) list.get(1);
        System.out.println(s);

        List<String> generics = new ArrayList<>();
        generics.add("Kumar");
        // generics.add(2); //complie-time error.


    }



}
