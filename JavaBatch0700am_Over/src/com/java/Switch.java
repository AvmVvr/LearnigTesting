package com.java;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You have entered one");
			break;
		case 2:
			System.out.println("You have entered two");
			break;
		case 3:
			System.out.println("You have entered three");
			break;

		default:
			System.out.println("Note please enter b/w 1-3");
			break;
		}
	}
}