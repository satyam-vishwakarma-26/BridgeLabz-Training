package com.TourMate;
public class InternationalTrip extends Trip{

    public InternationalTrip(String destination,int duration,
                             Transport transport,Hotel hotel,Activity activity){
        super(destination,duration,transport,hotel,activity);
    }

    @Override
    public void bookTrip(){
        System.out.println("\nBooking International Trip...");
        transport.book();
        hotel.book();
        activity.book();
        System.out.println("Visa & insurance processed 🌍");
        System.out.println("International Trip booked successfully ✈️");
    }
}
