package com.constructor.levelone;

public class CarRental {

    public String customerName;
    public String carModel;
    public int rentalDays;
    public double costPerDay;

    // default constructor
    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Hatchback";
        this.rentalDays = 1;
        this.costPerDay = 1000;
    }

    // parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // display rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

