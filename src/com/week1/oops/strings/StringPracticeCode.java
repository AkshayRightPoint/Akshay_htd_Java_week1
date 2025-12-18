package com.week1.oops.strings;

/** String is a sequence of character, it's immutable in nature.
 * Strings use Heap area with string constant pool for storing the data and getter management...
 */
public class StringPracticeCode {
    // Ways to create a String
    String str = "Akshay";
    String str2 = new String("Raj");


    public static void main(String[] args) {
        // adding 2 string
        String name1 = "Sachin";
        String name2 = " Tendulkar";

        System.out.println(name1 + name2);
        String concated = name1.concat(" Tendulkar");
        System.out.println( concated);

       byte ascii[] = {65, 80, 80};
        System.out.println(ascii);
       String ascii2 = new String(ascii, 1,2); //start and end...
        System.out.println(ascii2);


        /** it's immutable in nature. an object's state cannot be changed after it is created
         "Hello" → unchanged
                * "Hello World" →new object
                * s1 now points to the new object  */

        String s1 = "Hello";
        s1 = s1.concat(" World");
        System.out.println(s1);


       /** Strings are immuitable in nature to make it mutable we use string buffer and builder

               String s = "Hello";
               s = s.append("world");  -> not allowed as String is immutable */

       StringBuffer br = new StringBuffer("Hello");
       br = br.append("world");
        System.out.println(br);

    }




}
