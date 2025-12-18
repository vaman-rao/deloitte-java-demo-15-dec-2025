package com.deloitte.demo.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {

//		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> myList = new ArrayList<>();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20);
		myList.add(30);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(0);
		System.out.println(myList);
		System.out.println(myList.size());
//		myList.
//		myList.add(false); // CE
//		myList.add("abc"); // CE
//		myList.add(10.25); // CE
		myList.add(40);
		System.out.println(myList);
		System.out.println(myList.size());

		List<String> myFriends = new ArrayList<String>();
		myFriends.add("Sonu");
		myFriends.add("Monu");
//		myFrields.add(true); // CE
//		myFrields.add(10.25); // CE
		System.out.println(myFriends);

	}

}
