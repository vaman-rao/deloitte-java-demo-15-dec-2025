package com.deloitte.demo.day3.ex;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3 = 0;

		System.out.println("Start \n Integer division app");

		System.out.println("Enter an integer:");
		num1 = sc.nextInt();

		System.out.println("Enter another integer:");
		num2 = sc.nextInt();

		try {
			num3 = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Do not enter 0!");
		} finally {
			System.out.println(num3);
			sc.close();
		}

		System.out.println("End");

	}

}

//package com.deloitte.demo.day3.ex;
//
//import java.util.Scanner;
//
//public class ExDemo {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Start \n Integer division app");
//
//		System.out.println("Enter an integer:");
//
//		int num1 = sc.nextInt();
//
//		System.out.println("Enter another integer (do not enter 0):");
//
//		int num2 = sc.nextInt();
//
//		int num3 = num1 / num2;
//
//		System.out.println(num3);
//
//		System.out.println();
//
//		sc.close();
//		System.out.println("End");
//
//	}
//
//}
