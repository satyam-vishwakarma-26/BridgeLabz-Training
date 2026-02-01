package com.interfaces.defaultmethodsinterface.paymentgateway;
public interface PaymentProcessor {

    void processPayment(double amount);

    // Newly added default method
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed using default mechanism");
    }
}