package com.deloitte.demo.day2.oop.overloading;

public class Calc {

	public int addNums(int i, int j) {
		return i + j;
	}

	public int addNums(int i, int j, int k) {
		return i + j + k;
	}

	public int addNums(int i, int j, int k, int l) {
		return i + j + k + l;
	}
}
