package com.deloitte.demo.day4.steramsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(new Employee(101, "Sonu", 90000),
				new Employee(102, "Monu", 95000), new Employee(103, "Tonu", 93000), new Employee(104, "Sonu", 92000)));

		System.out.println("All employees:");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees with salary > 92K:");

	}

}
