package com.week3.creational.designpattern;

public interface PaymentGateway {
    Payment createPayment();
    Refund createRefund();

}
