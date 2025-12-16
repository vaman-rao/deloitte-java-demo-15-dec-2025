package com.deloitte.demo.day1.oop.constr;

public class StringDemo {

	public static void main(String[] args) {

//		Employee employee3 = new Employee(103, "Tonu", 11.75);
////		System.out.println(employee3.id + " " + employee3.name + " " + employee3.salary);
//		System.out.println(employee3.toString());

//		String str2 = new String("def");

//		String str = "abc";
//		String str2 = str.concat("def");
//		System.out.println(str);
//		System.out.println(str2);

//		String str = "abc";
//		System.out.println(str);
//		System.out.println(str.hashCode());
//		str = "def";
//		System.out.println(str);		
//		System.out.println(str.hashCode());

		StringBuilder str3 = new StringBuilder("abc");

		System.out.println(str3);
		System.out.println(str3.hashCode());
		str3.append("def");

		System.out.println(str3);
		System.out.println(str3.hashCode());

	}

}
