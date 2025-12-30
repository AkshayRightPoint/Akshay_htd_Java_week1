package com.week2.java.eight;

public class LambdaWithThread {
    public static void main(String[] args) {

        Runnable thread = () -> {
          Thread.currentThread().setName("MyThread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " Is Running ");
        };
        Thread run = new Thread(thread);
        Thread run2 = new Thread(thread);
        Thread run3 = new Thread(thread);
        run.start();
        run2.start();
        run3.start();

    }
}
