package com.EventEase;

public class BirthdayEvent extends Event{

	//Creating the constructor for initializing the object variable 
    public BirthdayEvent(int eventId, String location, String date,int attendees,
    		            double venueCost,double serviceCost,double discount){
       
    	super(eventId,"Birthday Party",location,date,attendees,
              venueCost,serviceCost,discount);
    	
    }

    //polymorphism
    public void schedule(){
        System.out.println("Birthday event scheduled with cake and decoration 🎂");
    }

    public void reschedule(String newDate){
        this.date=newDate;
        System.out.println("Birthday event rescheduled to "+newDate);
    }

    public void cancel(){
        System.out.println("Birthday event cancelled");
    }
}
