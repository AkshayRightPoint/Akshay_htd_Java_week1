package com.week1.collection;

import java.util.*;

/** unique elements * does not allow duplicate elements.
     * efficient search, insertion, and deletion operations.
  */
public class SetDataType {
    public static void main(String[] args) {

        //HashSet
        Set<Integer>  hashSet = new HashSet<>();   //The default capacity of a HashSet is 16 and the load factor is 0.75. new capacity = old capacity × 2
        hashSet.add(1); hashSet.add(2); hashSet.add(3);

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println(hashSet.isEmpty());

        //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("akshay"); linkedHashSet.add("kumar"); linkedHashSet.add("pandey");
        linkedHashSet.remove("raj");
        Iterator linkedHashSetIterator = linkedHashSet.iterator();
        while (linkedHashSetIterator.hasNext()){
            System.out.println(linkedHashSetIterator.next() + " ");
        }

        linkedHashSet.equals("right point");
        Spliterator slit = linkedHashSet.spliterator();

        slit.forEachRemaining(System.out::println);


        // TreeSet
        Set<Float> treeSet = new TreeSet<>();
        treeSet.add(1.0f); treeSet.add(2.0f); treeSet.add(3.0f);

        System.out.println(treeSet);

        
    }
}
