package com.deloitte.demo.day2.oop.overload;

public class Calc {

	public int addNums(int i, int j) {
		return i + j;
	}

	public int addNums(double i, int j) {
		return (int) (i + j);
	}

	public int addNums(int i, double j) {
		return (int) (i + j);
	}

	public int addNums(double i, double j) {
		return (int) (i + j);
	}

	public int addNums(int i, int j, int k) {
		return i + j + k;
	}

	public int addNums(int i, int j, int k, int l) {
		return i + j + k + l;
	}

}
