package com.TailorShop;
import java.util.*;

// Manages orders and insertion sort logic
public class TailorShopManager{
    private ArrayList<Order> orders=new ArrayList<>();

    // Add order and keep sorted by deadline
    public void addOrder(String name,int deadline){
        Order order=new Order(name,deadline);
        orders.add(order);
        insertionSort();
        System.out.println("Order added and list updated");
    }
    
    // Insertion sort by deadline
    private void insertionSort(){
        for(int i=1;i<orders.size();i++){
            Order key=orders.get(i);
            int j=i-1;
            while(j>=0&&orders.get(j).deadline>key.deadline){
                orders.set(j+1,orders.get(j));
                j--;
            }
            orders.set(j+1,key);
        }
    }
    
    // Display all orders
    public void displayOrders(){
        if(orders.isEmpty()){
            System.out.println("No orders available");
            return;
        }
        for(Order o:orders){
            o.display();
        }
    }
}
