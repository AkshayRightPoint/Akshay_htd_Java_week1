package com.week3.creational.designpattern;

public class OrderService {
    private Payment payment;
    private Refund refund;

    OrderService(PaymentGateway factory){
        payment= factory.createPayment();
        refund = factory.createRefund();
    }

    public void checkOut(double amount){
        payment.pay(amount);
    }

    public  void cancel(double amount){
        refund.refund(amount);
    }
}
