package com.exception;

import java.util.ArrayList;
import java.util.List;

public class IndexoutofBound {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
//		System.out.println(li.size());
		System.out.println(li.get(10));	
	}
}