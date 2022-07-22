package com.test.details;

public class IfStatement {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 45;
//minimum Weight ?
		if (a < b) {
			if (a < c) {
				System.out.println("a has minimum weight");
			} else {
				System.out.println("c has minimum weight");
			}
		} else {
			if (b > c) {
				System.out.println("c has minimum weight");
			} else {
				System.out.println("b has minimum weight");
			}
		}
	}
}
