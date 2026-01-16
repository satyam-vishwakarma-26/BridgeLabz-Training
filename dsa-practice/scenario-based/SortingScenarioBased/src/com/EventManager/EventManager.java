package com.EventManager;
import java.util.*;

// Manages tickets and sorting
public class EventManager{
    private ArrayList<Ticket> tickets=new ArrayList<>();

    // Add ticket
    public void addTicket(double price){
        tickets.add(new Ticket(price));
        System.out.println("Ticket added");
    }
    
    // Public method to start quick sort
    public void sortTickets(){
        if(tickets.size()>1){
            quickSort(0,tickets.size()-1);
            System.out.println("Tickets sorted by price");
        }
    }
    
    // Quick sort recursive method
    private void quickSort(int low,int high){
        if(low<high){
            int pivotIndex=partition(low,high);
            quickSort(low,pivotIndex-1);
            quickSort(pivotIndex+1,high);
        }
    }
    
    // Partition logic
    private int partition(int low,int high){
        double pivot=tickets.get(high).price;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(tickets.get(j).price<=pivot){
                i++;
                Ticket temp=tickets.get(i);
                tickets.set(i,tickets.get(j));
                tickets.set(j,temp);
            }
        }
        Ticket temp=tickets.get(i+1);
        tickets.set(i+1,tickets.get(high));
        tickets.set(high,temp);
        return i+1;
    }
    
    // Display tickets
    public void displayTickets(){
        if(tickets.isEmpty()){
            System.out.println("No tickets available");
            return;
        }
        for(Ticket t:tickets){
            t.display();
        }
    }
    
    // Display top cheapest or expensive tickets
    public void displayTop(int count,boolean cheapest){
        if(tickets.isEmpty()){
            System.out.println("No tickets available");
            return;
        }
        sortTickets();
        if(cheapest){
            System.out.println("Cheapest Tickets:");
            for(int i=0;i<Math.min(count,tickets.size());i++){
                tickets.get(i).display();
            }
        }else{
            System.out.println("Most Expensive Tickets:");
            for(int i=tickets.size()-1;i>=Math.max(0,tickets.size()-count);i--){
                tickets.get(i).display();
            }
        }
    }
}
