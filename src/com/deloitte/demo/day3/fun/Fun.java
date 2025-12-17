package com.deloitte.demo.day3.fun;

public class Fun {

}

// functional interface == 
// it contains only one abstract method 
// such a method is called functional method 
@FunctionalInterface
interface FunInt {

	public abstract void funMethod();

//	public abstract void funMethod2(); // CE 

}

//class ConcreteClass implements FunInt {
//
//	@Override
//	public void funMethod() {
//		System.out.println("fun method implemented in concrete class");
//	}
//
//}