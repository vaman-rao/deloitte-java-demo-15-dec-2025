package com.deloitte.demo.day2.oop.abstr;

public class Banking {

}

abstract class Rbi {

	public abstract void doKyc();

}

interface FinMin {

//	public abstract void payTax();
	void payTax(); // same as above

}

interface StateGovt {

	public abstract void paySalary();

}

class HdfcBank extends Rbi implements FinMin, StateGovt {

	@Override
	public void doKyc() {
		System.out.println("KYC with Aadhaar");
	}

	public void payInterest() {
		System.out.println("Interest");
	}

	@Override
	public void payTax() {
		System.out.println("pay tax");
	}

	@Override
	public void paySalary() {
		System.out.println("pay salary");
	}

}

class IciciBank extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("KYC with PAN");
	}
}
