package com.controlStatement;

public class NestedIf {
	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 30;

		if (a > b) {
			if (a > c) {
				System.out.println("a is big");
			} else {
				System.out.println("c is big");
			}
		} else 
			if (b > c) {
			System.out.println("B is big");
		} else {
			System.out.println("C is Big");
		}
	}
}
