package com.week1.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //SPLIT
        String text = "Hello welcome to india";
        String[] tokens = text.split( " ");

        for(String token:tokens){
            System.out.print( " -> " + token);
        }
        System.out.println( "       ");
        String vowel = "A::E::I::O::U";
        System.out.println(Arrays.toString(vowel.split("::")));

      // LENGTH

         System.out.println( "Length :: -> " + text.length() );
        System.out.println("Java".length());

        // replace and replaceAll

        String str = "bat ball";
        System.out.println(str.replace("b", "c"));
        System.out.println(str.replaceAll("b", "c"));

        // subString

        String str1 = "java is fun";
        System.out.println(str1.substring(0, 4));

        //indexOf
        int index = str1.indexOf('f');
        System.out.println( index );

        //TRIM
        String str2 = "   Python is funny language     ";   // -> trim spaces
        System.out.println(str2.trim());

        //ChAR

        System.out.println(str2.charAt(6));
    }
}
