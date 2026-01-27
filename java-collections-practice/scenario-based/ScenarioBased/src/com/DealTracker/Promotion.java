package com.DealTracker;
class Promotion<T> {
    T code;
    String validTill;
    int discount;
    int minPurchase;

    public Promotion(T code, String validTill,
                     int discount, int minPurchase) {
        this.code = code;
        this.validTill = validTill;
        this.discount = discount;
        this.minPurchase = minPurchase;
    }
}
