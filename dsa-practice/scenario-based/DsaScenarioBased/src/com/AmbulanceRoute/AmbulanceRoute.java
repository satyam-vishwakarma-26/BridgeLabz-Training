package com.AmbulanceRoute;
// Circular Linked List to manage hospital units
public class AmbulanceRoute{
    private HospitalUnit head;
    // Add a new hospital unit
    public void addUnit(String name,boolean available){
        HospitalUnit newUnit=new HospitalUnit(name,available);
        if(head==null){
            head=newUnit;
            head.next=head;
            return;
        }
        HospitalUnit temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newUnit;
        newUnit.next=head;
    }
    // Find nearest available unit
    public void findAvailableUnit(){
        if(head==null){
            System.out.println("No hospital units available");
            return;
        }
        HospitalUnit temp=head;
        do{
            if(temp.available){
                System.out.println("Redirect patient to: "+temp.name);
                return;
            }
            temp=temp.next;
        }while(temp!=head);
        System.out.println("No available unit found");
    }
    // Remove unit under maintenance
    public void removeUnit(String name){
        if(head==null){
            return;
        }
        HospitalUnit curr=head;
        HospitalUnit prev=null;
        do{
            if(curr.name.equals(name)){
                if(curr==head){
                    HospitalUnit last=head;
                    while(last.next!=head){
                        last=last.next;
                    }
                    head=head.next;
                    last.next=head;
                }else{
                    prev.next=curr.next;
                }
                System.out.println("Unit removed: "+name);
                return;
            }
            prev=curr;
            curr=curr.next;
        }while(curr!=head);
    }
    // Display all units
    public void displayUnits(){
        if(head==null){
            return;
        }
        HospitalUnit temp=head;
        do{
            System.out.print(temp.name+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("(back to "+head.name+")");
    }
}
