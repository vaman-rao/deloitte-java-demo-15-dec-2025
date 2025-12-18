package com.deloitte.casestudy.rideapp;

import java.util.Random;
import java.util.Scanner;

import com.deloitte.casestudy.rideapp.model.Customer;
import com.deloitte.casestudy.rideapp.model.Driver;
import com.deloitte.casestudy.rideapp.service.FareService;
import com.deloitte.casestudy.rideapp.service.RideService;

public class RideApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer ID:");
		int customerId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Customer Name:");
		String customerName = sc.nextLine();

		System.out.println("Enter Ride Distance (km):");
		double distance = sc.nextDouble();

		Customer customer = new Customer(customerId, customerName);

		Driver[] drivers = { new Driver(1, "Sonu", 4.6, true), new Driver(2, "Monu", 4.3, false),
				new Driver(3, "Tonu", 4.8, true), new Driver(4, "Ponu", 4.8, false), new Driver(5, "Gonu", 4.8, true) };

		RideService fareService = new FareService();
		double fare = fareService.calculateFare(distance);

		Driver assigned = drivers[new Random().nextInt(4)];

		System.out.println("\n====== RIDE RECEIPT ======");
		customer.displayProfile();

		if (assigned.isAvailable()) {
			System.out.println("Driver Assigned:");
			assigned.displayProfile();
			System.out.println("Distance: " + distance + " km");
			System.out.println("Total Fare: ₹" + fare);
			fareService.showServiceType();
			System.out.println("==========================");
			Double fareObj = fare;
			System.out.println("Fare " + fareObj);
		} else {
			System.out.println("Oops! Drivers not available.");
		}

		sc.close();
	}
}