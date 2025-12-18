package com.week1.oops.strings;

public class StringIntern {
    public static void main(String[] args) {
        /** intern() is a method of String that adds the string to the String Constant Pool (SCP) and returns the pooled reference.

         If the same content already exists in the pool, it returns the existing reference.
         Otherwise, it adds the string to the pool and returns it.
         */

        String s1 = new String("Java"); // heap object
        String s2 = s1.intern();        // pooled reference
        String s3 = "Java";             // pooled literal

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true


        // ============================

        String name1 = new String("akshay");
        String name2 = name1.concat("akshay");

        String name3 = name2.intern();

        System.out.println(name2 == name3);




    }

}
