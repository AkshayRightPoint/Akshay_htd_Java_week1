package com.week3.creational.designpattern;

public class PaypalFactory implements PaymentGateway {
    @Override
    public Payment createPayment() {
        return new PayPal();
    }

    @Override
    public Refund createRefund() {
        return new PaypalRefund();
    }
}
