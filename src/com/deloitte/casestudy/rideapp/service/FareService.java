package com.deloitte.casestudy.rideapp.service;

public class FareService implements RideService {

	@Override
	public double calculateFare(double distance) {
		final double BASE_FARE = 30;
		final double RATE_PER_KM = 10;
		return BASE_FARE + (distance * RATE_PER_KM);
	}

	// Overloaded method
	public double calculateFare(double distance, double surge) {
		return calculateFare(distance) * surge;
	}
}