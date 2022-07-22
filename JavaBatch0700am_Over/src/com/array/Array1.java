package com.array;

public class Array1 {
public static void main(String[] args) {
	int arr[]= new int[5];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=55;
	
	
	int length = arr.length;
	System.out.println(length);
	
	
	int[] dummy = arr.clone();
	
	System.out.println(dummy[3]);
	
	System.out.println("---------------");
	
	arr[3]=60;
	System.out.println(arr[3]);
	
	
}
}
