package com.TrainCompanion;

// Doubly Linked List for train compartments
public class TrainRoute{
    private Compartment head;
    private Compartment tail;
    private Compartment current;
   
    // Add compartment at end
    public void addCompartment(String name){
        Compartment newCompartment=new Compartment(name);
        if(head==null){
            head=tail=current=newCompartment;
            return;
        }
        tail.next=newCompartment;
        newCompartment.prev=tail;
        tail=newCompartment;
    }
  
    // Move to next compartment
    public void moveNext(){
        if(current!=null&&current.next!=null){
            current=current.next;
            System.out.println("Moved to: "+current.name);
        }else{
            System.out.println("No next compartment");
        }
    }
   
    // Move to previous compartment
    public void movePrevious(){
        if(current!=null&&current.prev!=null){
            current=current.prev;
            System.out.println("Moved to: "+current.name);
        }else{
            System.out.println("No previous compartment");
        }
    }
    // Remove a compartment
    public void removeCompartment(String name){
        Compartment temp=head;
        while(temp!=null){
            if(temp.name.equalsIgnoreCase(name)){
                if(temp.prev!=null){
                    temp.prev.next=temp.next;
                }else{
                    head=temp.next;
                }
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                }else{
                    tail=temp.prev;
                }
                if(current==temp){
                    current=head;
                }
                System.out.println("Compartment removed: "+name);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Compartment not found");
    }
   
    // Display adjacent compartments
    public void showAdjacent(){
        if(current==null){
            System.out.println("No compartments available");
            return;
        }
        System.out.println("Current: "+current.name);
        System.out.println("Previous: "+(current.prev!=null?current.prev.name:"None"));
        System.out.println("Next: "+(current.next!=null?current.next.name:"None"));
    }
  
    // Display full route
    public void displayRoute(){
        Compartment temp=head;
        while(temp!=null){
            System.out.print(temp.name+" <-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
}
