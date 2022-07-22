package com.controlstatement;

import java.util.Scanner;

public class SwitchStatment {
	public static void main(String[] args) {

		System.out.println("Calculator");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
//		System.out.println("3. Multiplication");
//		System.out.println("4. Division");
		System.out.println("Enter your choice (1-2):");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Number 1:");
			int a = sc.nextInt();
			System.out.println("Enter Number 2:");
			int b = sc.nextInt();
			int addResult = a+b;
			System.out.println("Addition of two Number: "+addResult);
			break;
		case 2:
			System.out.println("Enter Number 1:");
			int c = sc.nextInt();
			System.out.println("Enter Number 2:");
			int d = sc.nextInt();
			int subResult = c-d;
			System.out.println("subtraction of two Number: "+subResult);
			break;

		default:
			System.out.println("choose from 1 - 2");
			break;
		}
	}
}
