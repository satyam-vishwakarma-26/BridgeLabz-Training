package com.Objectmodeling.levelone;
import java.util.ArrayList;

class Order{
    int orderId;
    ArrayList<Product> products=new ArrayList<>();

    public Order(int orderId){
        this.orderId=orderId;
    }

    //add product to order
    public void addProduct(Product product){
        products.add(product);
    }

    //calculate total bill
    public double calculateTotal(){
        double total=0;
        for(Product p:products){
            total+=p.price;
        }
        return total;
    }

    //show order details
    public void showOrder(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Products:");
        for(Product p:products){
            p.showProduct();
        }
        System.out.println("Total Amount: ₹"+calculateTotal());
    }
}

