package com.CabbyGoARideHailingApp;

class Vehicle {
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	protected double ratePerKm;

	// Constructor
	Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.ratePerKm = ratePerKm;
	}

	// Calculate fare
	double calculateFare(double distance) {
		double baseFare = 50;
		return baseFare + (distance * ratePerKm);
	}
}

