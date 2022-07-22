package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSett {
	public static void main(String[] args) {
		Set<Object> ex = new LinkedHashSet<>();
		ex.add(10);
		ex.add("Java");
		ex.add(30l);
		ex.add('c');
		ex.add(50.56);
		ex.add(50.56);
		ex.add(null);
		ex.add(null);
		System.out.println(ex);
		System.out.println("-----------------");
		ex.remove(30l);
		System.out.println(ex);
	}

}
