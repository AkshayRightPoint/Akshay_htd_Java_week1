package com.week3.creational.designpattern;


public class AbstractFactoryMethod {
    public static void main(String[] args) {
        PaymentGateway paymentGateway;
         String provider = "Paypal";

        if(provider.equals("Paypal")){
            paymentGateway=  new PaypalFactory();
        }else{
            paymentGateway = new LazerPayFactory();
        }
        OrderService order = new OrderService(paymentGateway);
        order.checkOut(100.10);
        order.cancel(100.10);
    }
}
