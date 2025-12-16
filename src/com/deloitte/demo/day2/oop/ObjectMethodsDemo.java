package com.deloitte.demo.day2.oop;

public class ObjectMethodsDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Sonu", 10.50);
		Employee emp2 = new Employee(101, "Sonu", 10.50);

		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));

	}

}
