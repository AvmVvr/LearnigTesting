package com.controlstatement;

public class NestedIf {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		
		if (a < b) { 
			if (a < c) { 
				System.out.println("a is small");
			} else {
				System.out.println("c is small");
			}

		} else if (b < c) { 
			System.out.println("b is small");

		} else {
			System.out.println("c is small");

		}
	}
}
