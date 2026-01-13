package com.week3.dsa;

import java.util.Stack;

public class Stacks {
    // LIFO
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);  //add
        stack.push(20);
        stack.push(30);
        System.out.println(" Elements as " + stack);

        System.out.println(stack.peek());         // top element
        System.out.println( stack.pop() );      // remove last inserted
        System.out.println(stack);

        System.out.println("Search element is at index : -> " + stack.search(20));
    }


}
