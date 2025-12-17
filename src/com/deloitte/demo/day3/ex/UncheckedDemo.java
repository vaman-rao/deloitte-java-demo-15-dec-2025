package com.deloitte.demo.day3.ex;

public class UncheckedDemo {

	// unchecked exceptions

	public static void main(String[] args) {

//		System.out.println(10 / 0); // ArithmeticException 

//		int[] arr = { 10, 20, 30 };
//		System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

//		String str = "abcde";
//		System.out.println(str.charAt(5)); // StringIndexOutOfBoundsException

		// parse == try to convert
		int num = Integer.parseInt("10");
		System.out.println(num);
		int num2 = Integer.parseInt("abc"); // NumberFormatException
		System.out.println(num2);

	}

}
