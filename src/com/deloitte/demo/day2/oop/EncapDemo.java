package com.deloitte.demo.day2.oop;

//OOP 
//Abstraction 
//Encaosulation 
//Polymorphism 
//Inheritance 

public class EncapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

//		emp.salary = 10;
//		emp.salary = 20;
//		System.out.println(emp.salary);
		System.out.println(emp.getSalary());
		emp.setSalary(10);
		System.out.println(emp.getSalary());

	}

}
