package com.test.details;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value between 0 - 5 : ");
	int num = sc.nextInt();
	switch (num) {
	case 0:
		System.out.println("You have Entered : "+num);
		break;
	case 1:
		System.out.println("You have Entered : "+num);
		break;
	case 2:
		System.out.println("You have Entered : "+num);
		break;
	case 3:
		System.out.println("You have Entered : "+num);
		break;
	case 4:
		System.out.println("You have Entered : "+num);
		break;
	case 5:
		System.out.println("You have Entered : "+num);
		break;
	default:
	System.out.println("Warning: Enter the value between 0 - 5");
	break;
	}
	
}
}
