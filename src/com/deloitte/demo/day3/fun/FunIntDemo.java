package com.deloitte.demo.day3.fun;

// How to use an abstract method from an interface? 
//-------------------------------------------------

//// answer 1 = through a concrete class 
// --------------------------------------
//public class FunIntDemo {
//
//	public static void main(String[] args) {
//		
//		FunInt obj = new ConcreteClass();
////		ConcreteClass obj = new ConcreteClass();
//		
//		obj.funMethod();
//
//	}
//
//}

////answer 2 = through anonymous inner class 
/// self learning 
// --------------------------------------

// incomplete code 
//public class FunIntDemo {
//
//	public static void main(String[] args) {
//		
//		FunInt obj = new 		
//		obj.funMethod();
//
//	}
//
//}

//answer 3 = through lambda expression 
// only for functional interface 
//--------------------------------------

public class FunIntDemo {

	public static void main(String[] args) {

		FunInt obj = () -> System.out.println("fun method implemented with lambda");

		obj.funMethod();

	}

}
