package com.deloitte.demo.day1.oop.access;

public class DemoClass {

	public static int num = 10; // accessible everywhere 
	protected static int num2 = 20; // accessible within subclass and within the package 
	static int num3 = 30; // accessible within the package 
	private static int num4 = 40; // accessible only within the class 

	public static void main(String[] args) {
		System.out.println(DemoClass.num);
		System.out.println(DemoClass.num2);
		System.out.println(DemoClass.num3);
		System.out.println(DemoClass.num4);
	}

}
