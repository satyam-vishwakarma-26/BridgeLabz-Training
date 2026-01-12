package com.CallCenter;
import java.util.*;

// Manages call queues and customer call data
public class CallCenterManager{
    private Queue<Customer> normalQueue=new LinkedList<>();
    private PriorityQueue<Customer> vipQueue=new PriorityQueue<>(
        (a,b)->a.name.compareTo(b.name)
    );
    private HashMap<String,Integer> callCount=new HashMap<>();
    
    // Add incoming call
    public void addCall(String name,boolean vip){
        Customer c=new Customer(name,vip);
        if(vip){
            vipQueue.offer(c);
            System.out.println("VIP customer added: "+name);
        }else{
            normalQueue.offer(c);
            System.out.println("Normal customer added: "+name);
        }
        callCount.put(name,callCount.getOrDefault(name,0)+1);
    }
    // Serve next call
    public void serveCall(){
        Customer c=null;
        if(!vipQueue.isEmpty()){
            c=vipQueue.poll();
        }else if(!normalQueue.isEmpty()){
            c=normalQueue.poll();
        }
        if(c!=null){
            System.out.println("Serving customer: "+c.name+" | Total calls this month: "+callCount.get(c.name));
        }else{
            System.out.println("No calls in queue");
        }
    }
    // Display queues
    public void displayQueues(){
        System.out.print("VIP Queue: ");
        for(Customer c:vipQueue){
            System.out.print(c.name+" ");
        }
        System.out.println();
        System.out.print("Normal Queue: ");
        for(Customer c:normalQueue){
            System.out.print(c.name+" ");
        }
        System.out.println();
    }
}
