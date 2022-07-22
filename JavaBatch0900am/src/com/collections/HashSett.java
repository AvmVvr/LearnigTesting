package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSett {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();

		boolean result2 = hs.isEmpty();
		System.out.println(result2);
		// by using add method , we insert the value into the set(hs)
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(300); // added duplicate value
		hs.add(null);
		hs.add(null);
		boolean result3 = hs.isEmpty();
		System.out.println(result3);

		// print the values in the set
		System.out.println(hs);

		boolean result = hs.contains(3000);
		System.out.println(result);// true

		Set<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(200);

		System.out.println(hs2);
		boolean containsAll = hs.containsAll(hs2);
		System.out.println(containsAll);

		boolean remove = hs.remove(200);
		System.out.println(remove);

		System.out.println(hs);

	}
}