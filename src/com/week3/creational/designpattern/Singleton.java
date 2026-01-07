package com.week3.creational.designpattern;

public class Singleton {
    private static Singleton instance;

    private static Singleton getInstance() {
        return instance;
    }

    public Singleton getSingletonInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
