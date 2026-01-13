package com.TrafficManager;
import java.util.*;

// Manages roundabout and waiting queue
public class TrafficManager{
    private Vehicle head;
    private Queue<String> waitingQueue=new LinkedList<>();
    private int maxQueueSize=5;

    // Add vehicle to waiting queue
    public void addToQueue(String number){
        if(waitingQueue.size()==maxQueueSize){
            System.out.println("Queue overflow: Cannot add vehicle");
            return;
        }
        waitingQueue.offer(number);
        System.out.println("Vehicle added to waiting queue");
    }
    
    // Move vehicle from queue to roundabout
    public void enterRoundabout(){
        if(waitingQueue.isEmpty()){
            System.out.println("Queue underflow: No vehicle waiting");
            return;
        }
        String number=waitingQueue.poll();
        Vehicle newVehicle=new Vehicle(number);
        if(head==null){
            head=newVehicle;
            head.next=head;
        }else{
            Vehicle temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newVehicle;
            newVehicle.next=head;
        }
        System.out.println("Vehicle entered roundabout: "+number);
    }
    
    // Remove vehicle from roundabout
    public void exitRoundabout(String number){
        if(head==null){
            System.out.println("Roundabout is empty");
            return;
        }
        Vehicle curr=head;
        Vehicle prev=null;
        do{
            if(curr.number.equals(number)){
                if(curr==head&&curr.next==head){
                    head=null;
                }else{
                    if(curr==head){
                        Vehicle last=head;
                        while(last.next!=head){
                            last=last.next;
                        }
                        head=head.next;
                        last.next=head;
                    }else{
                        prev.next=curr.next;
                    }
                }
                System.out.println("Vehicle exited roundabout: "+number);
                return;
            }
            prev=curr;
            curr=curr.next;
        }while(curr!=head);
        System.out.println("Vehicle not found in roundabout");
    }
    
    // Display roundabout state
    public void displayRoundabout(){
        if(head==null){
            System.out.println("Roundabout is empty");
            return;
        }
        Vehicle temp=head;
        do{
            System.out.print(temp.number+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("(back to "+head.number+")");
    }
    
    // Display waiting queue
    public void displayQueue(){
        System.out.println("Waiting Queue: "+waitingQueue);
    }
}
