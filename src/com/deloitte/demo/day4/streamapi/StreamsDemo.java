package com.deloitte.demo.day4.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(new Employee(101, "Sonu", 90000),
				new Employee(102, "Monu", 95000), new Employee(103, "Tonu", 93000), new Employee(104, "Sonu", 92000)));

		System.out.println("All employees:");
		empList.forEach(e -> System.out.println(e.toString()));

//		System.out.println("Employees with salary > 92K using for each loop:");
//		for (Employee emp : empList) {
//			if (emp.getSalary() > 92000)
//				System.out.println(emp.toString());
//		}

		System.out.println("Employees with salary > 92K using Streams API:");

//		// convert list to stream
//		Stream<Employee> empStream = empList.stream();
//		// perform required operation
//		Stream<Employee> empWithHighSalary = empStream.filter(e -> e.getSalary() > 92000);
//		// process the result
//		empWithHighSalary.forEach(e -> System.out.println(e.toString()));
		// shortcut syntax -
		empList.stream().filter(e -> e.getSalary() > 92000).forEach(e -> System.out.println(e.toString()));
//		// other methods - try these methods 
//		empStream.map(null);
//		empStream.limit(0);
//		empStream.skip(0);

		List<Employee> empListWithHighSal = empList.stream().filter(e -> e.getSalary() > 92000).toList();

		empListWithHighSal.forEach(e -> System.out.println(e));

	}

}
