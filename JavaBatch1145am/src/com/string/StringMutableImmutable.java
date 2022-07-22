package com.string;

public class StringMutableImmutable {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Programming";
		String s3 = "Java";
		
		System.out.println("--------Immuttable-------------");
		
		int s1IHC = System.identityHashCode(s1);
		int s2IHC = System.identityHashCode(s2);
		int s3IHC = System.identityHashCode(s3);
		
		System.out.println(s1IHC);
		System.out.println(s2IHC);
		System.out.println(s3IHC);
		
		String newString = s1.concat(s2);
		System.out.println(newString);
		System.out.println(System.identityHashCode(newString));
		
		
		
		System.out.println("---------mutable (String Buffer)---------------");
		
		StringBuilder s6 = new StringBuilder("Testing");
		StringBuilder s7 = new StringBuilder("Testing");
		
	
		int s6IHC = System.identityHashCode(s6);
		int s7IHC = System.identityHashCode(s7);
		System.out.println(s6IHC);
		System.out.println(s7IHC);
		
		StringBuilder result = s7.append(s6);
				System.out.println(result);
		System.out.println(System.identityHashCode(result));
		
		
		
//		StringBuilder s6 = new StringBuilder("Testing");

	}
}
