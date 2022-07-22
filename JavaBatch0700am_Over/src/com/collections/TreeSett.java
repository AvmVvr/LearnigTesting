package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSett {
	public static void main(String[] args) {
		Set<Integer> ex = new TreeSet<>();
		ex.add(10);
		ex.add(30);
		ex.add(20);
		ex.add(40);
		ex.add(50);
		ex.add(20);

		System.out.println(ex);
		ex.remove(40);
		System.out.println("-----------------");
		System.out.println(ex);
		System.out.println("-----------------");
		for (Integer i : ex) {
		System.out.println(i);
		}
	}
}

