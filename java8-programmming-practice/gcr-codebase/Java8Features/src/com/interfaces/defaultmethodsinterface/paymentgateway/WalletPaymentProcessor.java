package com.interfaces.defaultmethodsinterface.paymentgateway;
public class WalletPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Wallet payment of " + amount + " processed");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Wallet refund of " + amount + " processed instantly");
    }
}