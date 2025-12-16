package com.deloitte.demo.day2.oop.abstr;

public class AbstractDemo {

	public static void main(String[] args) {

//		Calc calc = new Calc();
//		int sum = calc.addNums(10, 20);
//		System.out.println(sum);

//		Rbi rbi = new Rbi();
//		rbi.doKyc();

		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		bank1.payInterest();
		bank1.paySalary();
		bank1.payTax();
////		bank1 = new IciciBank();
//		IciciBank bank2 = new IciciBank();
//		bank2.doKyc();
//
////		int num = 10; // 9 11
//		Rbi bank3 = new HdfcBank(); //
////		bank3.payInterest();
//		bank3 = new IciciBank();
//		bank3.doKyc();
//
////		int num = 10;
////		num = 20;
	}

}
