package com.DealTracker;
class Deal extends Promotion<String> {
    public Deal(String code, String validTill,
                int discount, int minPurchase) {
        super(code, validTill, discount, minPurchase);
    }
}
