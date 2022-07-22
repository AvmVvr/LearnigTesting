package com.scanner;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = sc.nextLine();
		System.out.println("Enter your Initial:");
		String initial = sc.next();
		System.out.println("Your Name is : "+Name+"."+initial);
		System.out.println("Enter Your Salary");
		int salary = sc.nextInt();
		System.out.println("Your Salary is "+salary);
	}
}