package com.week1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**How to create unmodifiable/Immutable list?
 *
 */
public class ImmutiableList {
    public static void main(String[] args) {

        List<String> immutiableList = List.of("akshay", "kumar", "pandey" /*, null */); // ->  null not allowed
        //immutiableList1.add("Raj");
       // immutiableList1.set(0, "bikas");   //Any modification throws UnsupportedOperationException:
        System.out.println(immutiableList);

        List<Integer> immutiableSingletonList = Collections.singletonList(1);
        List<Integer> immutiableListNull = Collections.singletonList(null); // -> null allowed
        // immutiableList2.add(2); error unmodifiable
        System.out.println(immutiableSingletonList);
        System.out.println(immutiableListNull);


        //Java 16+
        List<String> immutiableStreamList = Stream.of("A", "B", "C").toList();
        System.out.println(immutiableStreamList);

    }
}
