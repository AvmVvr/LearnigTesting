package com.scannerrr;

import java.util.Scanner;

public class Scannerr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		System.out.println("You Have Entered: " + Name);

		System.out.println("Enter your Initial");
		String Initial = sc.next();
		System.out.println("Your inital is :" + Initial);

//		System.out.println("Your Name is " + Name + "." + Initial);
		
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		System.out.println("Your Age is "+age);
	}
}