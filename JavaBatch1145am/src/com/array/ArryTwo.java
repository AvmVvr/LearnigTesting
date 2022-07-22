package com.array;

import java.util.Scanner;

public class ArryTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i= 0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("enter the index to be print");
		int y = s.nextInt();
		System.out.println(a[y]);
		
	}
}
