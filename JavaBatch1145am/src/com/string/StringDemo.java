package com.string;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "JAVA"; // 4--->index (0-3)
		String str2 = "programming-code"; // (0-11)
		String str3 = "java1";
		// print the String
		System.out.println(str1);
		System.out.println("Vinoth");

		// String length
		System.out.println("-----String Length-------");
		System.out.println(str1.length());
		int s2l = str2.length();
		System.out.println(s2l);

		// String charAt
		System.out.println("-----String charAt-------");
		System.out.println(str2.charAt(0));
		char charAt = str2.charAt(5);
		System.out.println(charAt);

		// String indexOf
		System.out.println("-----String indexOf-------");
		int indexOf = str2.indexOf('m');
		System.out.println(indexOf);

		// String lastIndexOf
		System.out.println("-----String lastIndexOf-------");
		int lastIndexOf = str2.lastIndexOf('m');
		System.out.println(lastIndexOf);

		// String Equals
		System.out.println("-----String Equals-------");
		boolean result1 = str1.equals(str3);
		System.out.println(result1);

		// String equalsIgnoreCase
		System.out.println("-----String equalsIgnoreCase-------");
		boolean result2 = str1.equalsIgnoreCase(str3);
		System.out.println(result2);
		
		//String Replace
		System.out.println("-----String Replace-------");
		System.out.println(str2);
		String str2Replace = str2.replace("code", "Language");
		System.out.println(str2Replace);
		
		//String UpperCase & LowerCase
		System.out.println("-----String UpperCase & LowerCase-------");
		String upperCase = str2.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = str1.toLowerCase();
		System.out.println(lowerCase);
	}
}