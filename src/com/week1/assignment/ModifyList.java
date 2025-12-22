package com.week1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ModifyList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4));

       /* for(Integer i : number){
            if(i==2){
                number.remove(i);   // -> fail at run time
            }
        } */

        Iterator<Integer> iterator = number.iterator();

        while (iterator.hasNext()){
            Integer i = iterator.next();
            if(i==2){
                iterator.remove();
            }
        }
        System.out.println(number);

    }
}
