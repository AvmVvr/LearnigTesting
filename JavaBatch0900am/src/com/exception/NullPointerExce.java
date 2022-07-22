package com.exception;

public class NullPointerExce {
	public static void main(String[] args) {
		String Name = null;
		String Name2 = "";
		int length = Name2.length();
		System.out.println(length);
		int length2 = Name.length();
		System.out.println(length2);
	}
}