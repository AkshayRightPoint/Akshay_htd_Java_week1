package com.week2.mix.quesion;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskProcessor<T, R> {
    private final List<T>  task;
   // private final Map<K, V> map;

    TaskProcessor(List<T> task){
        this.task = task;
    }

    public List<R> processTask (Predicate<T> filter, Function<T, R> mapper){
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Object> result = Collections.synchronizedList(new ArrayList<>());
        // Collections.synchronizedList(new HashMap<K,V>());

        try{

            List<T> tasks = task.stream().filter(filter).collect(Collectors.toList());

            for(T task:tasks) {
                executorService.submit(() -> {
                    R results = mapper.apply(task);
                    result.add(results);
                });
            }
        }finally {
            executorService.shutdown();
        }
        return (List<R>) result;


    }
}
