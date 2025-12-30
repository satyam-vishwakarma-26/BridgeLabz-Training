package com.Objectmodeling.levelone;

class CustomerII{
    int customerId;
    String customerName;

    public CustomerII(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }

    //place order
    public void placeOrder(Order order){
        System.out.println("\nCustomer "+customerName+" placed an order");
        order.showOrder();
    }
}
