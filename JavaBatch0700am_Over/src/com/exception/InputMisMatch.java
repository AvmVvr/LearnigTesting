package com.exception;

import java.util.Scanner;

public class InputMisMatch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Value");
	try {
		int res = sc.nextInt();
		System.out.println("The entered value is "+res);
	} catch (Exception e) {
		System.out.println("INput must be integer");
	}
	
}
}
