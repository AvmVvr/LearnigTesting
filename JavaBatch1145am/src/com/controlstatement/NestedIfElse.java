package com.controlstatement;

import java.util.Scanner;
public class NestedIfElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 3 values: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println("First Value big");
			} else {
				System.out.println("Thrid Value big");
			}
		} else {
			if (b > c) {
				System.out.println("Second Value big");
			} else {
				System.out.println("Thrid Value big");
			}
		}
	}
}