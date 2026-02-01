package com.interfaces.defaultmethodsinterface.paymentgateway;
public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment of " + amount + " processed");
    }
}