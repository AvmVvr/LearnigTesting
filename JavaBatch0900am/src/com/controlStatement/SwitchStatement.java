package com.controlStatement;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter the your choice:");
		int a = sc.nextInt();
		System.out.println("******************************");
		switch (a) {
		default:
			System.out.println("Enter the value from 1 to 4");
			break;
		case 1:
			System.out.println("Enter the Number 1");
			int num1 = sc.nextInt();
			System.out.println("Enter the Number 2");
			int num2 = sc.nextInt();
			System.out.println("Result "+(num1+num2));
			break;
		case 2:
			System.out.println("Enter the Number 1");
			int num3 = sc.nextInt();
			System.out.println("Enter the Number 2");
			int num4 = sc.nextInt();
			System.out.println("Result "+(num3 - num4));
			break;
		case 3:
			System.out.println("Enter the Number 1");
			int num5 = sc.nextInt();
			System.out.println("Enter the Number 2");
			int num6 = sc.nextInt();
			System.out.println("Result "+(num5 * num6));
			break;
		case 4:
			System.out.println("Enter the Number 1");
			int num7 = sc.nextInt();
			System.out.println("Enter the Number 2");
			int num8 = sc.nextInt();
			System.out.println("Result "+(num7 / num8));
			break;
		}
	}
}