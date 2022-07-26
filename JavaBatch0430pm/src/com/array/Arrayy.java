package com.array;

public class Arrayy {
	public static void main(String[] args) {
		// array Declare and Assigning the size of array(fixed)
		// similar datatype
		int arr[] = new int[5];// indexbased (0-4)
//int arr[] = {10,20,30,40,50};
		System.out.println("-----Array Length------");
		int length = arr.length;
		System.out.println(length);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("-----print Specific Value------");
		System.out.println(arr[4]);// 50

		// update the particular index value
		arr[4] = 60;

		System.out.println("-----print s.value after update------");
		System.out.println(arr[4]);// 60

		// out of bound value Check ?
		// arr[5] = 60;

		// printing the array using for loop
		System.out.println("---printing the array using for loop----");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---printing the Clone array using for-each loop----");
		int[] cloneArr = arr.clone();
		for (int j : cloneArr) {
			System.out.println(j);
		}
		System.out.println("---comparing the array and Clone array----");
		boolean equals = cloneArr.equals(arr);
		System.out.println(equals);
	}
}