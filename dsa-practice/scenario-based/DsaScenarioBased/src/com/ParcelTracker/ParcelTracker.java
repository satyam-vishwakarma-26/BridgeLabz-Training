package com.ParcelTracker;

// Singly Linked List to manage parcel stages
public class ParcelTracker{
    private ParcelStage head;

    // Initialize default delivery stages
    public void initializeStages(){
        head=new ParcelStage("Packed");
        head.next=new ParcelStage("Shipped");
        head.next.next=new ParcelStage("In Transit");
        head.next.next.next=new ParcelStage("Delivered");
    }
    
    // Display parcel tracking stages
    public void trackParcel(){
        if(head==null){
            System.out.println("Parcel lost or tracking unavailable");
            return;
        }
        ParcelStage temp=head;
        while(temp!=null){
            System.out.print(temp.stage+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    
    // Add custom checkpoint after a stage
    public void addCheckpoint(String afterStage,String newStage){
        ParcelStage temp=head;
        while(temp!=null){
            if(temp.stage.equalsIgnoreCase(afterStage)){
                ParcelStage newNode=new ParcelStage(newStage);
                newNode.next=temp.next;
                temp.next=newNode;
                System.out.println("Checkpoint added");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Stage not found");
    }
   
    // Simulate parcel lost
    public void markParcelLost(){
        head=null;
        System.out.println("Parcel marked as lost");
    }
}
