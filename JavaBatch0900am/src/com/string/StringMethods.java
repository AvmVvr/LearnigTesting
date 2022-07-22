package com.string;

public class StringMethods {

	public static void main(String[] args) {
		// Split
		String Sentence = "Hi this is Java Programming Coursez";
		String[] splitArray = Sentence.split(" ");
		for (String s : splitArray) {
			System.out.println(s);
		}

		// Upper & Lower case
		System.out.println("----------------------");
		String Name = "adyar-Chennai";
		String upperCase = Name.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = Name.toLowerCase();
		System.out.println(lowerCase);

		// subString
		System.out.println("----------------------");
		int length = Name.length();
		System.out.println(length);// 0-12
		String substring = Name.substring(2);
		System.out.println(substring);
		String substring2 = Name.substring(1, 10);
		System.out.println(substring2);

		// indexOf
		System.out.println("----------------------");
		int indexOf = Name.indexOf('z');
		System.out.println(indexOf);
		int indexOf2 = Name.indexOf('C');
		System.out.println(indexOf2);
		int indexOf3 = Name.indexOf('a');
		System.out.println(indexOf3);

		// last index of
		System.out.println("----------------------");
		int lastIndexOf = Name.lastIndexOf('a');
		System.out.println(lastIndexOf);

		// replace
		System.out.println("----------------------");
		String replace = Name.replace("adyar", "Parrys");
		System.out.println(replace);
	}
}