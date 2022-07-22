package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSett {
	public static void main(String[] args) {
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("Hello");
		lhs.add("Java");
		lhs.add("website");
		lhs.add("123");
		lhs.add("Hello");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		Set<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Airtel");
		
		boolean addAll = lhs1.addAll(lhs);
		
		System.out.println(lhs1);
		
		int size = lhs1.size();
		System.out.println(size);	
	}
}
