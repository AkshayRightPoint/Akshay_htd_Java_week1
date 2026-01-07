package com.week2.java.eight;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Filters{
    public static void main(String[] args) {
        List<Integer> list =  List.of(1,2,3,4,5,6,7,8);

        List<Integer> even = list.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(even);

        List<Integer> odd = list.stream().filter(e->e%2==1).toList();
        System.out.println(odd);

        System.out.println(list.stream().filter(e-> e>=5).toList());

        Stream<String> prefix = Stream.of("akshay", "raj", "sham", "ram", "narresh");
        prefix.filter(x -> x.startsWith("aksh")).forEach(System.out::println);

        AtomicInteger atomicInteger = new AtomicInteger(1);

        Stream.of("akshay", "raj", "sham", "ram", "narresh").
                filter(e -> atomicInteger.getAndIncrement()%2==0).forEach(System.out::println); //increament by 1
//
//        IntStream.rangeClosed(0, prefix.toArray().length-1).filter(x -> x%2==0).mapToObj(x -> prefix)
//                .forEach(System.out::println);

        System.out.println( Stream.of(2,4,1,0,3).collect(Collectors.toSet()) );

    }
}
