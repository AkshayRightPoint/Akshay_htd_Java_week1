package com.week1.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** List we use when Elements can be accessed by index.
 *Implementing Classes: ArrayList, LinkedList, Vector, Stack.
 * allows duplicate
 */

public class ListDataType {
    public static void main(String[] args) {

//ArrayList
        List<Integer> arrayList = new ArrayList<>();  // fast random access *Memory efficiency matters
        arrayList.add(1); arrayList.add(2); arrayList.add(3);

        arrayList.remove(4);
        arrayList.set(4, 5);

        System.out.println(arrayList.contains(4));

        arrayList.get(1);

        arrayList.lastIndexOf(arrayList);

        arrayList.size();

        arrayList.toArray();



        List<String> linkedList = new LinkedList<>();  // *You do frequent insertions and deletions *doubly linked list
        linkedList.add("akshay"); linkedList.add("kumar"); linkedList.add("pandey"); linkedList.remove("none");
        System.out.println(linkedList);


    }
}
