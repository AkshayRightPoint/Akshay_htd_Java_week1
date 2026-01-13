package com.week3.dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<String> name = new ArrayDeque<>();
        name.add("akshay"); name.add("kumar"); name.add("pandey");

        System.out.println("Name -> "+ name);

        System.out.println("first inserted -> " + name.peek());
        System.out.println("get first element -> "+ name.getFirst());
        System.out.println("get last element -> " + name.getLast());

        name.offer("raj");
        System.out.println("offer method Add element at top -> " + name);

        name.offerFirst("mr");
        name.offerLast("kumar");

        System.out.println("after adding first and name -> " + name );

        System.out.println("Peek to find first element -> " + name.peekFirst());
        System.out.println("Peek to find last element -> " + name.peekLast());

        System.out.println("remove element using pop -> " + name.pop());

        System.out.println("remove first element ->  " + name.removeFirst());
        System.out.println("Remove last element -> " + name.removeLast());

        System.out.println(name);

    }
}
