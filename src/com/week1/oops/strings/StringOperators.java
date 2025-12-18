package com.week1.oops.strings;

public class StringOperators {
    public static void main(String[] args) {
        String name1 = "Akshay";
        String name2 = "Akshay";
        String name3 = "akshay";
        String name4 = new String("akshay");

        System.out.println(name1 == name2);   // Compares memory addresses, NOT content.
        System.out.println(name1 == name4);

        System.out.println(name1.equals(name2)); //Compares actual string content
        System.out.println(name1.equals(name4));

        System.out.println(name2.equalsIgnoreCase(name3)); //Ignores letter case

        System.out.println(name1.compareTo(name2));  //Compares based on Unicode values

        System.out.println("Contains -> "+name1.contains(name2)); // sequence of char is present or not

        String s = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(s.contentEquals(sb)); //Compare with StringBuffer / Builder



    }
}
