package com.string;
public class StringBasic {
	public static void main(String[] args) {
		
		String Name1 = "Chennai";
		System.out.println(Name1);
		
//	print the length of the string	
		int stringSize = Name1.length();
		System.out.println(stringSize);
		
//	Print the particular Character
		char letter = Name1.charAt(6);
		System.out.println(letter);		
		
// compare the Strings 
		boolean Result = Name1.equals("chennai");
		System.out.println(Result);
		
//comparing the String (equalsIgnoreCase)
		boolean R2 = Name1.equalsIgnoreCase("chennai");
		System.out.println(R2);
		
	// Contain - method
		String Sentence = "Hello Those are Java Programming Course";
		boolean R3 = Sentence.contains("java");
		boolean R4 = Sentence.contains("Hello");
		System.out.println(R3);
		System.out.println(R4);
		System.out.println("***************************");
		
		//split
		String[] sa1 = Sentence.split(" ");
		
		for (int i = 0; i < sa1.length; i++) {
			System.out.println(sa1[i]);
		}
	System.out.println("***************************");
	String[] sa2 = Sentence.split("a");
		System.out.println(sa2.length);
		for (String string : sa2) {
			System.out.println(string);
		}
}
}