package com.array;

public class Arrayy {
	public static void main(String[] args) {
		// Array Declare and Size
		int arr[] = new int[5];

		// Assigning the value for array
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		arr[4] = 15;

		// print the value using array-index
		System.out.println(arr[4]);

		// finding array length
		System.out.println("-------------------------");
		int arrLength = arr.length;
		System.out.println(arrLength);

		// print array - for loop
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// clone
		int[] arrClone = arr.clone();
		System.out.println("-------------------------");
		for (int j : arrClone) {
			System.out.println(j);
		}
	}
}