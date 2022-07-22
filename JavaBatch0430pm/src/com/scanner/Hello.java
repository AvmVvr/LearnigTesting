package com.scanner;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		System.out.println("Enter your Initial");
		String inital = sc.next();
		System.out.println("Your Name "+Name+"."+inital);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("your age is "+age);
	
	}

}
