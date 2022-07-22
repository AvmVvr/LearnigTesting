package com.string;
public class StringBasic {
	public static void main(String[] args) {
		String name1 = "Rahul";
		String name2 = "Aswanth";
		String name3 = "Santhosh";
//	print the length of the string
		int name3length = name3.length();
		System.out.println(name3length);
//	Print the particular Character
		System.out.println("----------------------");
		char charAtname1 = name1.charAt(3);
		System.out.println(charAtname1);
// compare the Strings 
		System.out.println("----------------------");
		boolean equals2 = name1.equals("RahuL");
		System.out.println(equals2);
		boolean equals3 = name1.equals(name2);
		System.out.println(equals3);
//comparing the String (equalsIgnoreCase)
		System.out.println("----------------------");
		boolean result = name2.equalsIgnoreCase("ASWANTH");
		System.out.println(result);
// Contain - method
		System.out.println("----------------------");
		boolean contains1 = name1.contains("raj");
		System.out.println(contains1);
		boolean contains2 = name3.contains("San");
		System.out.println(contains2);
	}	
}