package com.week1.assignment;

import com.sun.tools.javac.Main;

import java.util.Map;

public class UncheckedExcpetionHandling {
    public static void main(String[] args) {
        int a =10;
        int b=0;
         /* int c = a/b;   // uncheck expetion will thorw error during complie time
        Exception in thread "main" java.lang.ArithmeticException: / by zero
          */
        try{
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Zero not divisible...  " + e);
        }
    }
}
