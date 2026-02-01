package com.interfaces.defaultmethodsinterface.paymentgateway;
public class UpiPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment of " + amount + " processed");
    }
}