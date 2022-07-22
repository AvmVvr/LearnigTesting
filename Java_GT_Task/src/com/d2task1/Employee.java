package com.d2task1;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Emp id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String empName = sc.next();
		System.out.println("Enter the Email");
		String mail = sc.next();
		System.out.println("Enter the PhoneNum");
		int phonenum = sc.nextInt();
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		System.out.println("Enter the gender");
		String gender = sc.next();
		System.out.println("Enter the city");
		String city = sc.next();
		System.out.println("Entered Emp id is " + id);
		System.out.println("Entered the name is " + empName);
		System.out.println("Entered the Email is " + mail);
		System.out.println("Entered PhoneNum is " + phonenum);
		System.out.println("Entered salary is " + salary);
		System.out.println("Entered the gender is " + gender);
		System.out.println("Entered the City is " + city);
		sc.close();
	}
}
