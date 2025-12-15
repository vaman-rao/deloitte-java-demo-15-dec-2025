package com.deloitte.demo.day1.oop.classes;

public class ClassDemo {

	public static void main(String[] args) {

//		object creation for a class 

////		int      num = 10;
		Employee.officeAddress = "Gachibowli, Hyderabad";
		Employee.officePhone = 9876543210L;
		Employee emp = new Employee();
		System.out.println(emp.id + " " + emp.name + " " + emp.salary);
		emp.id = 101;
		emp.name = "Sonu";
		emp.salary = 90000.50;
		System.out.println(emp.id + " " + emp.name + " " + emp.salary);
		emp.work();
		System.out.println(Employee.officeAddress + " " + Employee.officePhone);
//		System.out.println(Employee.name); // CE 
//		System.out.println(emp.officeAddress); // Warning 

//		Product product = new Product();
//		product.id = 10;
//		product.name = "Laptop";
//		product.price = 90000.50;
//		System.out.println(product.id + " " + product.name + " " + product.price);
//		product.sale();

	}

}
