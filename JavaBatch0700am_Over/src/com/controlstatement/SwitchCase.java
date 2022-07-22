package com.controlstatement;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Calculator");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("Enter the option (1-4):");
	int a = sc.nextInt();
	System.out.println("Enter the first Value ");
	int num1 = sc.nextInt();
	System.out.println("Enter the Second Value ");
	int num2 = sc.nextInt();
	sc.close();
		
	switch (a) {
	case 1:
		int add =num1+num2;
		System.out.println("Result: "+add);
		break;
		
	case 2:
		int sub =num1-num2;
		System.out.println("Result: "+sub);
		break;

	case 3:
		int mul =num1*num2;
		System.out.println("Result: "+mul);
		break;
	case 4:
		int div =num1/num2;
		System.out.println("Result: "+div);
		break;

	default:
		System.out.println("Enter value between 1-4");
		break;
	}
}
}
