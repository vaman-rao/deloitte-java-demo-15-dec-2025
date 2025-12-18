package com.deloitte.demo.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Sonu");
		list.add("Monu");
		list.add("Tonu");
		list.add(1, "Ponu");

		System.out.println(list);

		System.out.println("Iterate using forEach method - ");

//		() -> {};

//		list.forEach((abc) -> {
//			System.out.println(abc);
//		});

		list.forEach(element -> System.out.println(element));
	}

}
