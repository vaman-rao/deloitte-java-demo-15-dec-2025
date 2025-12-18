package com.deloitte.casestudy.rideapp.service;

public interface RideService {

	double calculateFare(double distance) throws Exception;

	default void showServiceType() {
		System.out.println("Standard Ride Service");
	}
}