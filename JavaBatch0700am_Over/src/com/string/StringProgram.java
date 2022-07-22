package com.string;

public class StringProgram {
	public static void main(String[] args) {
		String name1 = "Vinothraj";
//		print the length of the string	
		int lengthString = name1.length();
		System.out.println(lengthString);
//		Print the particular Character
		char charAt = name1.charAt(4);
		System.out.println(charAt);
// 		compare the Strings 
		String name2 = "vinothraJ";
		boolean result1 = name1.equals(name2);
		System.out.println(result1);
//		comparing the String (INgore the case)
		boolean result2 = name1.equalsIgnoreCase(name2);
		System.out.println(result2);
//		Contain - method
		boolean result3 = name1.contains("V");
		System.out.println(result3);
		boolean result4 = name1.contains("Z");
		System.out.println(result4);
		boolean result5 = name1.contains("Vinoth");
		System.out.println(result5);
		boolean result6 = name1.contains("Vinothraj");
		System.out.println(result6);
//		split
		System.out.println("---------Split-----------------");
		String sentence = "Hi Good Morining How are you";
		String[] split = sentence.split(";");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("---------Split using o-----------------");
		String[] split1 = sentence.split("o");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split1[i]);
		}
	}
}