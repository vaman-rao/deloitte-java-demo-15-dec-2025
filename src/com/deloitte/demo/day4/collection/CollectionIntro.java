package com.deloitte.demo.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionIntro {

	public static void main(String[] args) {

		int[] arr = { 95, 97, 96, 98, 99 };
		// stores only one type of data
		// size is fixed
		// type safety

//		ArrayList myList = new ArrayList();
		List myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20);
		myList.add(30);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(0);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(false);
		myList.add("abc");
		myList.add(10.25);
		System.out.println(myList);
		System.out.println(myList.size());

	}

}
