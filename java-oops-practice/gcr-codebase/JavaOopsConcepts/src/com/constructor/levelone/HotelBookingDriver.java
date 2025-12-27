package com.constructor.levelone;

public class HotelBookingDriver {

    public static void main(String[] args) {

        // default booking
        HotelBooking b1 = new HotelBooking();
        b1.display();

        System.out.println("-----");

        // custom booking
        HotelBooking b2 = new HotelBooking("Satyam", "Deluxe", 3);
        b2.display();

        System.out.println("-----");

        // copied booking
        HotelBooking b3 = new HotelBooking(b2);
        b3.display();
    }
}

