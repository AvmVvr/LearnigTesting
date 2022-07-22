package com.array;
public class Array {
	public static void main(String[] args) {
		// Array Declare and Size = 5
		int arr[] = new int[10];
		// Assigning the value for array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		// print the value using array-index
		System.out.println(arr[2]); //30
		System.out.println("--------------------");
		// finding array length
		int length = arr.length;
		System.out.println(length); //5 
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //print array
		}
		System.out.println("--------------------");
		//clone
		int[] duplicate = arr.clone();
		for (int j : duplicate) {
			System.out.println(j); //40
		}
}
}
