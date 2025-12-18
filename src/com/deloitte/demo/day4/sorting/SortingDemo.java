package com.deloitte.demo.day4.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator, Comparable 

public class SortingDemo {

	public static void main(String[] args) {

		List<String> friendList = new ArrayList<>(Arrays.asList("Sonu", "Monu", "Tonu", "Soni", "Ponu"));

		System.out.println("Friendlist in insertion order:");
		friendList.forEach(f -> System.out.println(f));

		System.out.println("Friendlist in sorted order:");
		Collections.sort(friendList);
		friendList.forEach(f -> System.out.println(f));

		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(new Employee(101, "Sonu", 90000),
				new Employee(102, "Monu", 95000), new Employee(103, "Tonu", 93000), new Employee(104, "Ponu", 92000)));

		System.out.println("EmployeeList in insertion order:");
		empList.forEach(e -> System.out.println(e));

		System.out.println("EmployeeList in the order of name:");

//		Collections.sort(empList);
//		empList.forEach(e -> System.out.println(e));
//		Collections.sort(empList, Comparator.comparing(e -> e.getName().reversed()));
//		Collections.sort(empList, Comparator.comparing(e -> e.getName()).thenComparing(e -> e.getSalary()));

		// Sort by name in descending order (reversed), then by salary in ascending
		// order
		Collections.sort(empList,
				Comparator.comparing((Employee e) -> e.getName()).reversed().thenComparing(e -> e.getSalary()));

		// Sort by name in ascending order, then by salary in descending order
		Collections.sort(empList,
				Comparator.comparing((Employee e) -> e.getName()).thenComparing(e -> e.getSalary()).reversed());

		empList.forEach(e -> System.out.println(e));

		System.out.println("EmployeeList in the order of salary:");
		Collections.sort(empList, Comparator.comparing(e -> e.getSalary()));
		empList.forEach(e -> System.out.println(e));
	}

}
