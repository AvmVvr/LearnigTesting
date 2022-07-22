package com.string;

public class StringMethod2 {

	public static void main(String[] args) {
		String Name1 = "Chennai";
		String Name2 = "Besant Nagar";
		String Name3 = "";
		
		//isempty
		boolean result1 = Name1.isEmpty();
		System.out.println(result1);//false
		boolean result2 = Name3.isEmpty();
		System.out.println(result2);//true
		
		//starts&endswith
		System.out.println("------------------------------");
		boolean startsWith = Name1.startsWith("Chennai");
		boolean endsWith = Name2.endsWith("r");
		System.out.println(startsWith);
		System.out.println(endsWith);
		
		//ASCII
		System.out.println("------------------------------");
		char letter = 'a';
		int num = letter;
		
		System.out.println(num);
		System.out.println("------------------------------");
		for(int i=97;i<=122;i++)
		{
			System.out.println((char)i);
		}
		
		
		//Compareto
		System.out.println("------------------------------");
		String name1= "ab";
		String name2 = "aa";
		
		int compareTo = name1.compareTo(name2);
		System.out.println(compareTo);
		
		
		
		
		
		
		
	}

}
