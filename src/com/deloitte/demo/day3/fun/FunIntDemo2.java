package com.deloitte.demo.day3.fun;

public class FunIntDemo2 {

	public static void main(String[] args) {

		Gst obj = (double a, double b) -> {
			return a * b;
		};

		Gst obj2 = (double a, double b) -> a * b;

		double amount = obj.getGst(100, 18);

		System.out.println(amount);

	}

}
