package com.java;

import java.util.Scanner;

public class Inputt {
	public static void main(String[] args) {
//		String Name ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your NAme ");
		String Name = sc.nextLine();
		
		System.out.println("Enter Your inital ");
		String inital = sc.nextLine();
		System.out.println("You have Entered "+Name +"."+inital);
		
		System.out.println("Enter your Age ");
		int age = sc.nextInt();
		System.out.println("Your Age is "+age);
	}

}
