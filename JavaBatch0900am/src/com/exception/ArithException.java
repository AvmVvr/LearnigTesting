package com.exception;

public class ArithException {
	public static void main(String[] args) {
		System.out.println(1);//1
		System.out.println(2);//2
		System.out.println(3);//3
		System.out.println(4);//4
		try {
			System.out.println(5/0);//error (or) Exception ?
		} catch (Exception e) {
			System.out.println("Dividend should be Zero");
		}
		System.out.println(6);//6
		System.out.println(7);//7
	}

}
