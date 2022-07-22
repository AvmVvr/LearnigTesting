package com.string;

public class StringMethods {

	
	public static void main(String[] args) {
		String Name = "Chennai - Adyar";
		
		//Upper & Lower case
		String lowerCaseName = Name.toLowerCase();
		System.out.println(lowerCaseName);
		String upperCaseName = Name.toUpperCase();
		System.out.println(upperCaseName);

		// subString 	
		int length = Name.length();
		System.out.println(length);
		String substring1 = Name.substring(10);
		System.out.println(substring1);
		String substring2 = Name.substring(0,5);
		System.out.println(substring2);
		
		//indexOf
		int charPosition = Name.indexOf("e");
		System.out.println(charPosition);
		
		int charPosition1 = Name.indexOf("n");
		System.out.println(charPosition1);
		
		int charPosition2 = Name.indexOf("z");
		System.out.println(charPosition2);
		
		// lastIndexOf
		int indexOf1 = Name.indexOf("a");
		System.out.println(indexOf1);
		int lastIndexOf = Name.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		//replace
		String replace = Name.replace("Adyar", "Salem");
		System.out.println(replace);
		
		//isEmpty
		boolean Result = Name.isEmpty();
		System.out.println(Result);
		String Name2 = "";
		boolean Result2 = Name2.isEmpty();
		System.out.println(Result2);
		System.out.println("*************");
		//StartsWith & Endswith
		boolean startsWith = Name.startsWith("Che");
		System.out.println(startsWith);
		boolean startsWith1 = Name.startsWith("che");
		System.out.println(startsWith1);
		boolean endsWith = Name.endsWith("ar");
		System.out.println(endsWith);
			
		//ASCII 
		char s = 'T';
		int x = s;
		System.out.println(x);
		
		//compareTo
		String Name3 = "BOY";
		String Name4 = "TOY";
		
		int compareTo = Name4.compareTo(Name3);
		System.out.println(compareTo);
	}
	
	

}
