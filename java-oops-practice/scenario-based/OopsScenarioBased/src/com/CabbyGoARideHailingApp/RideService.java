package com.CabbyGoARideHailingApp;

class RideService implements IRideService {
	private Vehicle vehicle;
	private Driver driver;
	private double fare;

	// Constructor
	RideService(Vehicle vehicle, Driver driver) {
		this.vehicle = vehicle;
		this.driver = driver;
	}

	// Book ride
	public void bookRide(double distance) {
		fare = vehicle.calculateFare(distance);
		System.out.println("Ride booked with " + driver.getName());
		System.out.println("Vehicle Type: " + vehicle.type);
		System.out.println("Fare: ₹" + fare);
	}

	// End ride
	public void endRide() {
		System.out.println("Ride ended successfully");
	}
}

