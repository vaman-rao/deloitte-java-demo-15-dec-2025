package com.deloitte.demo.day2.wrapper;

public class BoxingDemo {

	public static void main(String[] args) {

//		int num = 10;
//		System.out.println(num); // int
//		System.out.println(20); // int
//		System.out.println("Hi " + num);

		int num = 10;

		Integer num2 = num; // int -> Integer // auto-boxing

		Integer num3 = Integer.valueOf(num); // int -> Integer // manual boxing
		// static method call

		int num4 = num3; // Integer -> int // auto-un-boxing

		int num5 = num3.intValue(); // Integer -> int // manual un-boxing
		// non static method call / instance method call

		Integer num6 = Integer.valueOf(25);
		
		
		
		

	}

}
