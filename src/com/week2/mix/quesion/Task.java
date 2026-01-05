package com.week2.mix.quesion;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        var stringTasks = List.of(
                "Java",
                "",
                "Concurrency",
                "  ",
                "Generics",
                "Java 8",
                "Java 11",
                "Streams"
        );

        var task = new TaskProcessor<String, Integer>(stringTasks);
       var result =  task.processTask(
                s -> !s.isBlank(), String::length);


        System.out.println("Final Result");

        result.forEach(System.out::println);

        boolean blank = " ".isBlank();


    }


}
