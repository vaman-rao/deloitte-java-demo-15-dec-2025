package com.deloitte.demo.day4.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		System.out.println(list.size());
		list.add("Sonu");
		list.add("Monu");
		list.add("Tonu");
//		System.out.println(list);
		list.add(1, "Ponu");
//		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Soni");
		list2.add("Moni");

		list.addAll(1, list2);
		System.out.println(list);

		System.out.println("iterate list elements using iterator");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("iterate list elements using for loop");

		System.out.println("iterate list elements using for each loop");

	}

}
