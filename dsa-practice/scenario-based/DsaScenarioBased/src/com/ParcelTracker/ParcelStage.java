package com.ParcelTracker;

// Node representing a parcel stage
public class ParcelStage{
    String stage;
    ParcelStage next;
    
    //Creating constructor 
    public ParcelStage(String stage){
        this.stage=stage;
        this.next=null;
    }
}
