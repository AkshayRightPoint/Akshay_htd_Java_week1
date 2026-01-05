package com.week2.threads;

public class Singleton {
    private static Singleton instance;

    private static volatile Singleton singletonInstance;
    private Singleton() {
    }

    // synchronized causes performance overhead (every call is locked)

    /**
     * public static synchronized Singleton getInstance() {
     * if (instance == null) {
     * instance = new Singleton();
     * }
     * return instance;
     * }
     */


    /** Prevents instruction reordering

     Ensures visibility across threads
     */

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}
