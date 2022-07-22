package com.test.details;

public class StringMuttable {
public static void main(String[] args) {
	StringBuilder a4 = new StringBuilder("Greens");
	StringBuilder a5 = new StringBuilder("Greez");
	
	System.out.println(System.identityHashCode(a4));
	System.out.println(System.identityHashCode(a5));
	
	StringBuilder append = a4.append(a5);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
}
}
