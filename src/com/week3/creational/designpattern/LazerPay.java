package com.week3.creational.designpattern;

public class LazerPay implements Payment {
    @Override
    public void pay(double amoubt) {
        System.out.println("Payment received by LazerPay of amount : "+ amoubt);
    }
}

class LazerPayRefund implements Refund {

    @Override
    public void refund(double amoubt) {
        System.out.println("Amount refunded by LazerPay " + amoubt);
    }
}
