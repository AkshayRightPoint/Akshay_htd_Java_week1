package com.week3.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.offer(40);

        System.out.println( "Size of queue -> " + queue.size() );

        System.out.println(queue);
        queue.poll();

        System.out.println("Removed - first in element using poll -> " + queue );

        System.out.println("Top Element -> " + queue.peek());

        queue.remove();
        System.out.println("remove first inserted -> "+ queue);


    }
}
