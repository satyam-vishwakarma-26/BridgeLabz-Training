package com.constructor.levelone;

public class HotelBooking {

    public String guestName;
    public String roomType;
    public int nights;

    // default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // copy constructor
    public HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // display booking details
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

