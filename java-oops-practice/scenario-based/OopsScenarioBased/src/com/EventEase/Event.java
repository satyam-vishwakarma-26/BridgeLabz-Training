package com.EventEase;

public abstract class Event implements ISchedulable{
	
	//making the variable
    private final int eventId;
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    //constructor without services
    public Event(int eventId,String eventName,String location,String date,int attendees,double venueCost){
    	
        this.eventId=eventId;
        this.eventName=eventName;
        this.location=location;
        this.date=date;
        this.attendees=attendees;
        this.venueCost=venueCost;
    }

    //constructor with services
    public Event(int eventId,String eventName,String location,String date,int attendees,
                 double venueCost,double serviceCost,double discount){
        this(eventId,eventName,location,date,attendees,venueCost);
        this.serviceCost=serviceCost;
        this.discount=discount;
    }

    //cost calculation
    protected double calculateTotalCost(){
        return venueCost+serviceCost-discount;
    }

    //Print the event details when called 
    public void showEvent(){
        System.out.println("\nEvent ID: "+eventId);
        System.out.println("Event: "+eventName);
        System.out.println("Location: "+location);
        System.out.println("Date: "+date);
        System.out.println("Attendees: "+attendees);
        System.out.println("Total Cost: ₹"+calculateTotalCost());
    }
}
