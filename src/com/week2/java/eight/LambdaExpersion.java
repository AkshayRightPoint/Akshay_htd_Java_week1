package com.week2.java.eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LambdaExpersion {
    private int num = 10;
void display() {
    Runnable instance = () -> {
        System.out.println("Instance Variable: " + num);
    };
    instance.run();
}
    public static void main(String[] args) {
//        ArrayList<String> name = new ArrayList<>();
//
//        name.add("akshay"); name.add("kumar"); name.add("pandey"); name.add("raj");
//        Collections.sort(name);

        ArrayList<Integer> number = new ArrayList<>();
        number.add(2); number.add(3); number.add(1); number.add(6); number.add(5);

        Collections.sort(number, ((o1, o2) -> (o1 > o2) ? -1 :
                (o1 < o2) ? 1 : 0));

        System.out.println("Descending order -> " + number);
        Collections.sort(number);

        System.out.println("Accending order -> "+number);

        LambdaExpersion instanceVariable = new LambdaExpersion();

        instanceVariable.display();
    }
}
