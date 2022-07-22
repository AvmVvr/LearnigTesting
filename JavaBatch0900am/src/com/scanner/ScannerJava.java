package com.scanner;
import java.util.Scanner;
public class ScannerJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Full Name: ");
		String fullName = sc.nextLine();
		System.out.println("Entered Name is : "+fullName);	
		System.out.println("Enter the First Name: ");
		String firstName = sc.next();
		System.out.println("Entered Name is : "+firstName);
		System.out.println("Enter your mobile :");
		int mobile = sc.nextInt();
		System.out.println("ENtered mobile no is "+mobile);
		sc.close();
	}
}