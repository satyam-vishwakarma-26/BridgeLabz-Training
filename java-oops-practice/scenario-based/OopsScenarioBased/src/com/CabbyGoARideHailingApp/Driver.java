package com.CabbyGoARideHailingApp;

class Driver {
	private String name;
	private String licenseNumber;
	private double rating;

	// Constructor
	Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}

	// Getter
	String getName() {
		return name;
	}
}

