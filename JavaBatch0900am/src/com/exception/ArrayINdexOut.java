package com.exception;

public class ArrayINdexOut {
	public static void main(String[] args) {
		int arr[] = new int[5]; //index 0-4 ---> default value(0) fix
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}