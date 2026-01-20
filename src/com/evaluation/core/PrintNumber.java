package com.evaluation.core;

public class PrintNumber {
    private int number =1;
    private  int max = 20;

    public static void main(String[] args) {
       PrintNumber thread = new PrintNumber();
        Thread oddOrEven = new Thread(thread::printOddEven);
        oddOrEven.start();
    }

//    Thread t = new Thread( {
//            e -> System.out.println(number)
//    });

    public synchronized  void printOddEven() {
        while (number<=max){
            if (number%2==0){
                    System.out.println("Even -> " +number);
            }else if(number %2!=0){
                System.out.println("odd -> " + number);
            }
            number++;
        }
    }
}
