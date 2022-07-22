package com.array;
public class Mark {
	public static void main(String[] args) {
		int arr[] = new int[5];
		// 0-4 index based
		arr[0] = 15;
		arr[1] = 25;
		arr[2] = 35;
		arr[3] = 45;
		arr[4] = 55;
		arr[4] = 65;
		System.out.println("************Orginal**********");
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*****************************");
		int length = arr.length;
		System.out.println(length);
		System.out.println("**********Clone*******************");
		int[] clone = arr.clone();
		clone[2]=550;
		clone[3]=1000;
		for (int value : clone) {
			System.out.println(value);
		}
	}
}