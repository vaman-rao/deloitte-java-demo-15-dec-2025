package com.deloitte.casestudy.rideapp.model;

public class Driver extends User {

    private double rating;
    private boolean available;

    public Driver(int id, String name, double rating, boolean available) {
        super(id, name);
        this.rating = rating;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public void displayProfile() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Driver Name: " + name + ", Rating: " + rating;
    }
}