package com.controlstatement;

import java.util.Scanner;
public class SwitchCaseStatement {
	public static void main(String[] args) {
		
		System.out.println("Enter you option from 1 to 3");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("You have Selected one");
			break;
		case 2:
			System.out.println("You have Selected two");
			break;
		case 3:
			System.out.println("You have Selected three");
			break;
		default:
			System.out.println("input must be  1-3");
			break;
		}
	}
}
