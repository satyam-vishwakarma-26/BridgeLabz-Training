package com.interfaces.defaultmethodsinterface.paymentgateway;
public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPaymentProcessor();
        PaymentProcessor card = new CreditCardPaymentProcessor();
        PaymentProcessor wallet = new WalletPaymentProcessor();

        upi.processPayment(1000);
        upi.refund(200);

        card.processPayment(1500);
        card.refund(300);

        wallet.processPayment(500);
        wallet.refund(100);
    }
}