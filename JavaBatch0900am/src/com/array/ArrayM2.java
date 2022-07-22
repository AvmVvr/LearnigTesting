package com.array;
public class ArrayM2 {
public static void main(String[] args) {
	
	int arr[] = {10,11,12,13,14};
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
