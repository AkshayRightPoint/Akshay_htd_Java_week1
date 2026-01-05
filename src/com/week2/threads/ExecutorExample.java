package com.week2.threads;

import java.util.concurrent.*;

public class ExecutorExample {
    static class Task implements Runnable{
        private int taskId;

        Task(int taskId){
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + "Executed by" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0; i<=5; i++){
            executorService.execute(new Task(i));
        }
        executorService.shutdown();

        ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();
        Callable<Integer> call = () -> {
            return 10+20;
        };
        Future<Integer> submit = singleExecutorService.submit(call);
        System.out.println("Result -> "+ submit.get());
        singleExecutorService.shutdown();
    }
}
