package org.stud.detail;

import java.util.Scanner;

public class StudentDetail {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student id:");
	int stuId = sc.nextInt();
	System.out.println("Enter the Student Name:");
	String StudName = sc.next();
	System.out.println("Enter the Student Mark1:");
	int Mark1 = sc.nextInt();
	System.out.println("Enter the Student Mark2:");
	int Mark2 = sc.nextInt();
	System.out.println("Enter the Student Mark3:");
	int Mark3 = sc.nextInt();
	System.out.println("Enter the Student Mark4:");
	int Mark4 = sc.nextInt();
	System.out.println("Enter the Student Mark5:");
	int Mark5 = sc.nextInt();	
	int total = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
	float average = (total/5);
	System.out.println("Student Id is "+stuId);
	System.out.println("Student Name is "+StudName);
	System.out.println("Student Mark1 is "+Mark1);
	System.out.println("Student Mark2 is "+Mark2);
	System.out.println("Student Mark3 is "+Mark3);
	System.out.println("Student Mark4 is "+Mark4);
	System.out.println("Student Mark5 is "+Mark5);
	System.out.println("Total Mark of 5 subjects is "+total);
	System.out.println("Average of 5 subject is: "+average);
	sc.close();
}
}