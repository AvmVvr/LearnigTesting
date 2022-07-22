package com.scanner;

import java.util.Scanner;

public class Choice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Name");
		String Name = sc.nextLine();
		
		System.out.println("Enter you inital");
		String inital = sc.next();
		
		System.out.println("You have Entered "+Name+"."+inital);
		
		System.out.println("Enter your MObile no.");
		int mobile = sc.nextInt();
		System.out.println("Your Number is "+mobile);
		
		sc.close();
	}
}