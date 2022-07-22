package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWrapper {
public static void main(String[] args) {
	List<Integer> li = new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	
	// Size of the List
	int listSize = li.size();
	System.out.println(listSize);
	System.out.println("---------------");
	
	// print particular value
	Integer value = li.get(0);
	System.out.println(value);
	
	//for each
	System.out.println("---------------");
	for (Integer values : li) {
		System.out.println(values);
	}
	
	//remove
	li.remove(0);
	System.out.println("---------------");
	System.out.println(li);
	
	//index based add() --> insert
	
	li.add(1, 100);
	li.add(200);
	li.add(250);
	System.out.println("---------------");
	System.out.println(li);

	//set()-> Replace
	li.set(0, 100);
	System.out.println("---------------");
	System.out.println(li);

	// contain 
	
	boolean result = li.contains(200);//true
	boolean result1 = li.contains(1000);//false
	System.out.println("---------------");
	System.out.println(result);
	System.out.println(result1);
	
	li.add(100);
	System.out.println("---------------");
	System.out.println(li);
	
	System.out.println("---------------");
	int listSize1 = li.size();
	System.out.println(listSize1);
	
}
}
