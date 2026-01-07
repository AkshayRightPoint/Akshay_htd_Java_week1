package com.week3.creational.designpattern;

public class PayPal implements Payment {

        @Override
        public void pay(double amoubt) {
            System.out.println("Payment received by PayPal of amount : "+ amoubt);
        }
    }

    class PaypalRefund implements Refund {

        @Override
        public void refund(double amoubt) {
            System.out.println("Amount refunded by PayPal of amount " + amoubt);
        }
}
