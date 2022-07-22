package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoo {
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(60);
		ts.add(80);
		ts.add(40);
		ts.add(20);
		ts.add(30);
		ts.add(50);
		ts.add(70);
		ts.add(70);
		
		System.out.println(ts);
		
		for (Integer a : ts) {
			System.out.println(a);
		}
	
	}

}
