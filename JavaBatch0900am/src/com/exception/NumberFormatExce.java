package com.exception;

public class NumberFormatExce {
	public static void main(String[] args) {
		int s1 = 12345;
		System.out.println(s1+1);//12346
		String s2 = "Vinoth";
		System.out.println(s2+6);//Vinoth6
		String s3 = "1234560";
//		int s3num = Integer.parseInt(s3);
//		System.out.println(s3num+6);//1234566	
		try {
			int s3num = Integer.parseInt(s3);
			System.out.println(s3num+6);
		} catch (Exception e) {
			System.out.println("Cant convert the given value from string to integer");
		}
		finally
		{
			System.out.println("finally executes every time");
		}
		
	}
}