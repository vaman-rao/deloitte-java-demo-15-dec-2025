package com.deloitte.demo.day2.oop.overload;

public class OverloadingDemo {

	public static void main(String[] args) {

		Calc calc = new Calc();

		System.out.println(calc.addNums(10, 20));
		System.out.println(calc.addNums(10, 20, 30));
		System.out.println(calc.addNums(10, 20, 30, 40));

	}

}
