package com.deloitte.demo.day3.ex;

public class CheckedDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
