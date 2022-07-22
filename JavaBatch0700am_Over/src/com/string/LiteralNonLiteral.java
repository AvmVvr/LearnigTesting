package com.string;

public class LiteralNonLiteral {
	public static void main(String[] args) {
		// Literal 
		String S1 = "Java";
		String S2 = "Java";
		
		
		
		int s1hashcode = System.identityHashCode(S1);
		int s2hashcode = System.identityHashCode(S2);
		System.out.println(s1hashcode);
		System.out.println(s2hashcode);
		
		System.out.println("---------------------------------------------");
		// Non Literal 
		String string1 = new String("Testing");
		String string2 = new String("Testing");
		System.out.println(System.identityHashCode(string1));
		System.out.println(System.identityHashCode(string2));
		
	}

}
