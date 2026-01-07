package com.week3.creational.designpattern;

public class LazerPayFactory implements PaymentGateway {

    @Override
    public Payment createPayment() {
        return new LazerPay();
    }

    @Override
    public Refund createRefund() {
        return new LazerPayRefund();
    }
}
