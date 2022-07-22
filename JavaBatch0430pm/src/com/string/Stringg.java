package com.string;

public class Stringg {
	public static void main(String[] args) {
		String s1 = "APPLE";
		String s2 = "fig"; 
		String s3 = "orange";

		System.out.println("-----Print the String-----");
		System.out.println(s1);
		System.out.println("Raj");

		System.out.println("-----Print the String Char-----");
		char result1 = s1.charAt(0);
		System.out.println(result1);// V

		// String index out of bound
//		char result2 = s1.charAt(9);
//		System.out.println(result2);
		System.out.println("-----------------------");
//		compareTo
		int result2 = s1.compareTo(s3);//65-97
		System.out.println(result2);//-32
		System.out.println("-----------------------");
//		compareTo
		int result3 = s1.compareToIgnoreCase(s3);//65-97
		System.out.println(result3);//-32//0
		System.out.println("-----------------------");
//		concat
		String result4 = s1.concat(s2);
		System.out.println(result4);
		System.out.println("-----------------------");
		//upper-lower case
		String upperCase = s2.toUpperCase();
		String lowerCase = s1.toLowerCase();
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println("-----------------------");
		boolean result5 = s1.contains("pple");
		System.out.println(result5);
		
		boolean result6 = s1.contains("PPLE");
		System.out.println(result6);
		
		System.out.println("-----------------------");
		
		boolean startsWith = s1.startsWith("A");
		System.out.println(startsWith);
		
		boolean endsWith = s3.endsWith("nge");
		System.out.println(endsWith);
		
		System.out.println("-----------------------");
		boolean result7 = s1.equals("Apple");
		System.out.println(result7);//false
		boolean result8 = s1.equals("APPLE");
		System.out.println(result8);//true
		
		System.out.println("-----------------------");
		boolean result9 = s1.equalsIgnoreCase("apple");
		System.out.println(result9);
		
		System.out.println("-----------------------");
		String s4 = "This is Java Programming course";
		String[] s4Split = s4.split("s");
		for (String word : s4Split) {
			System.out.println(word);
		}
		System.out.println("-----------------------");
		CharSequence result10 = s4.subSequence(0, 10);
		System.out.println(result10);
		String result11 = s4.substring(5);
		System.out.println(result11);
		String result12 = s4.substring(0, 5);
		System.out.println(result12);
		
		System.out.println("-----------------------");
		int result13 = s4.indexOf("J");
		System.out.println(result13);
		int result14 = s4.indexOf('c');
		System.out.println(result14);
		System.out.println("-----------------------");
		int length = s4.length();
		System.out.println(length);	
	}
}