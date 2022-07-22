package com.java;

public class NestedIf {
	public static void main(String[] args) {
		int a = 100;
		int b = 250;
		int c = 200;
		// find the maximum weight

		if (a > b) {
			if (a > c) {
				System.out.println("A has max. weight");

			} else {
				System.out.println("C has Max. Weight");

			}

		} else {
			if (b > c) {
				System.out.println("b has max weight");
			} else {
				System.out.println("c has max weight");
			}

		}

	}

}
