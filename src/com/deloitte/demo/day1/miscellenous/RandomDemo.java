package com.deloitte.demo.day1.miscellenous;

public class RandomDemo {

	public static void main(String[] args) {

		System.out.println(com.deloitte.demo.day1.miscellenous.Random.num);

//		FQN
		java.util.Random random = new java.util.Random();

		for (int i = 1; i <= 10; i++)
			System.out.println(random.nextInt(100));

	}

}

//FQN 

