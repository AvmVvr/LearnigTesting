package com.string;

import java.util.Scanner;

public class FindingVowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
					str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.println("Given string contains the vowel " + str.charAt(i) + " at the index " + i);
			}
			
		}
	}
}
