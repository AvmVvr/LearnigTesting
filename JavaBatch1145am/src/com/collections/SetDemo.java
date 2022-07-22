package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<>();
		s.add("Apple");
		s.add("Banana");
		s.add("Cherry");
		s.add("DraganFruit");
		s.add("Fig");
		s.add("Fig");
		s.add(null);
		s.add(null);

		System.out.println(s);

		boolean contains = s.contains("Apple");
		System.out.println(contains);// true
		boolean contains2 = s.contains("zebra");
		System.out.println(contains2);// false

		Set<String> s1 = new HashSet<>();
		s1.addAll(s);
		System.out.println(s1);

		boolean equals = s.equals(s1);
		System.out.println(equals);

		boolean empty = s1.isEmpty();
		System.out.println(empty);// false
	}
}
