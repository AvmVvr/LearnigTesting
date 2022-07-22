package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Sett {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Cat");
		s.add("Apple");
		s.add("Dog");
		s.add("Bat");
		s.add("Zebra");
		s.add("Zebra");
		s.add(null);
		s.add(null);
		System.out.println(s);
		boolean result = s.contains("Zebr");
		System.out.println(result);

	}
}
