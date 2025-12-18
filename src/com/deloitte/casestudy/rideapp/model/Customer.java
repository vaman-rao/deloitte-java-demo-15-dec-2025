package com.deloitte.casestudy.rideapp.model;

public class Customer extends User {

    public Customer(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayProfile() {
        System.out.println("Customer Name: " + name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer other = (Customer) obj;
        return this.id == other.id && this.name.equals(other.name);
    }
}