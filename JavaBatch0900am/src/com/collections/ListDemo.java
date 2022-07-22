package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<>();
		// add method is used to add the values in list 
		li.add(10);
		li.add(20);
		li.add("shell");
		li.add(5.25f);
		li.add(true);
		li.add('C');
		li.add(9894277988l);
		li.add(null);
		li.add(null);
		
		// size method is used to find the value of the list
		int sizeList = li.size();
		System.out.println(sizeList);
		
		//Get method is used to get the 
//		particular value from the list
		System.out.println(li.get(0));
		
		// print the list
		System.out.println(li);
		
		// print using for each
		for (Object c : li) {
		System.out.println(c);	
		}
	}
}
