package com.string;

public class String2 {
	public static void main(String[] args) {
		// Contain - method
		String String5 = "Programming Course";
		boolean Result10 = String5.contains("Programming");
		boolean Result11 = String5.contains("Hello");
		System.out.println(Result10);
		System.out.println(Result11);
		System.out.println("***************************");

		// split
		String[] strArr = String5.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("***************************");
		String[] strArr2 = String5.split("r");
		for (String Result : strArr2) {
			System.out.println(Result);
		}

		// subString
		System.out.println("***************************");
		String substring1 = String5.substring(10);
		System.out.println(substring1);
		String substring2 = String5.substring(0, 5);
		System.out.println(substring2);

		// Replace
		System.out.println("***************************");
		String replaced = String5.replace("Course", "Language");
		System.out.println(replaced);
		System.out.println(String5);
		System.out.println("***************************");
		// isempty
		String Name10 = "";
		String Name11 = "Dummy";
		System.out.println("***************************");
		boolean N10Res = Name10.isEmpty();
		System.out.println(N10Res);
		boolean N11res = Name11.isEmpty();
		System.out.println(N11res);

		System.out.println("***************************");
		boolean startsWith = String5.startsWith("Pro");
		System.out.println(startsWith);
		System.out.println("***************************");
		boolean endsWith = String5.endsWith("er");
		System.out.println(endsWith);
	}

}
