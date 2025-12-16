package com.deloitte.demo.day2.wrapper;

import com.deloitte.demo.day1.oop.classes.Employee;

public class ObjectLifeCycleDemo {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println(emp.toString());
		
//		emp = null; // garbage collection 
		
		
	}

}
