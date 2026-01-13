package com.SmartCheckout;
import java.util.*;

// Manages billing queue and inventory
public class SmartCheckoutManager{
    private Queue<Customer> customerQueue=new LinkedList<>();
    private HashMap<String,Item> inventory=new HashMap<>();

    // Add item to inventory
    public void addItem(String name,double price,int stock){
        inventory.put(name,new Item(name,price,stock));
        System.out.println("Item added to inventory");
    }
    
    // Add customer to queue
    public void addCustomer(String name,List<String> items){
        customerQueue.offer(new Customer(name,items));
        System.out.println("Customer added to queue");
    }
    
    // Process next customer
    public void processCustomer(){
        if(customerQueue.isEmpty()){
            System.out.println("No customers in queue");
            return;
        }
        Customer c=customerQueue.poll();
        double total=0;
        System.out.println("Billing customer: "+c.name);
        for(String itemName:c.items){
            Item item=inventory.get(itemName);
            if(item!=null&&item.stock>0){
                total+=item.price;
                item.stock--;
                System.out.println(itemName+" added | Price: "+item.price);
            }else{
                System.out.println(itemName+" out of stock");
            }
        }
        System.out.println("Total Bill: "+total);
    }
    
    // Display inventory
    public void displayInventory(){
        for(Item i:inventory.values()){
            System.out.println(i.name+" | Price: "+i.price+" | Stock: "+i.stock);
        }
    }
    
    // Display customer queue
    public void displayQueue(){
        System.out.print("Queue: ");
        for(Customer c:customerQueue){
            System.out.print(c.name+" ");
        }
        System.out.println();
    }
}
