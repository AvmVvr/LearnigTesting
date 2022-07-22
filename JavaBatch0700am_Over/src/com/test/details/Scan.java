package com.test.details;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name");
		String empName = sc.nextLine();
		System.out.println("Entered the name is " + empName);
		
		System.out.println("Enter the id");
		int nextInt = sc.nextInt();
		System.out.println("Entered id is " + nextInt);

		
	}
}
