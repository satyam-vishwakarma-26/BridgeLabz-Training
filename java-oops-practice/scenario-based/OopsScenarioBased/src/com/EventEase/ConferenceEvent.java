package com.EventEase;

public class ConferenceEvent extends Event{

	//Created the constructor for object initialization
    public ConferenceEvent(int eventId,String location,String date,int attendees,
                            double venueCost,double serviceCost,double discount){
    	
        super(eventId,"Conference",location,date,attendees,
              venueCost,serviceCost,discount);
    }

    //polymorphism
    public void schedule(){
        System.out.println("Conference scheduled with projectors and seating 🎤");
    }

    public void reschedule(String newDate){
        this.date=newDate;
        System.out.println("Conference rescheduled to "+newDate);
    }

    public void cancel(){
        System.out.println("Conference cancelled");
    }
}
