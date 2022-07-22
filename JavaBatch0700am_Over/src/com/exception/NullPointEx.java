package com.exception;

public class NullPointEx {
	public static void main(String[] args) {
		String S1 = "Ashok"; //null
		try {
			System.out.println(S1.length());
		} catch (Exception e) {
			System.out.println("String should be null - To find the length");
		}
		
		
	}
}
