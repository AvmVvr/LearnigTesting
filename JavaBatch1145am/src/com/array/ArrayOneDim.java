package com.array;

public class ArrayOneDim {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		
		int [] arr2 = new int[5];
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		arr2[4] = 500;
		
		System.out.println(arr2[4]);
		System.out.println("*******************");
		//length
		int lengtharr1 = arr1.length;
		int lengtharr2 = arr2.length;
		System.out.println(lengtharr1);
		System.out.println(lengtharr2);
		//clone
		int[] clonearr1 = arr1.clone();
		
		System.out.println("-----------------");
		//print - for loop & for each
		for(int i =0; i< clonearr1.length;i++) {
			System.out.println(clonearr1[i]);
		}
		System.out.println("-----------------");
		arr2[5]=600;
		for (int i : arr2) {
			System.out.println(i);
		}
		

	}
}
