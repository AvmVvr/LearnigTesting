package com.exception;

import java.util.Scanner;

public class InputMismatchExce {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println("your age "+age);
	}
}