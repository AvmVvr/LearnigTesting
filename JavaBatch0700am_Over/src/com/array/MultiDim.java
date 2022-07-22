package com.array;

import java.util.Scanner;

public class MultiDim {

	public static void main(String[] args) {
//		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row");
		int row = sc.nextInt();
		System.out.println("Enter the Column");
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		int i;
		int j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("Enter the Values");
				 arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entered 2 dimensional Array");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
	}	
}
}