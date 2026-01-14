package com.CabbyGoARideHailingApp;

import java.util.Scanner;

public class CabbyGoApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// User selects vehicle type
		System.out.println("Welcome to CabbyGo 🚕");
		System.out.println("Select vehicle type:");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. SUV");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter ride distance (km): ");
		double distance = sc.nextDouble();

		Vehicle vehicle;

		// Vehicle selection using polymorphism
		if (choice == 1) {
			vehicle = new Mini("AUTO-MINI");
		} else if (choice == 2) {
			vehicle = new Sedan("AUTO-SEDAN");
		} else {
			vehicle = new SUV("AUTO-SUV");
		}

		// Driver assigned automatically by system
		Driver driver = new Driver("Sumit", "AUTO-LIC", 4.7);

		IRideService ride = new RideService(vehicle, driver);

		// Ride flow
		ride.bookRide(distance);
		ride.endRide();

		sc.close();
	}
}
