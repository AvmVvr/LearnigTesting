package com.java;

public class Ifladder {
public static void main(String[] args) {
	for(int i = 1;i<=25;i++)
	{
	
	if(i%3==0 && i%5==0) {
		System.out.println("Hi Hello");
	}
	else if(i%3==0) {
	System.out.println("Hi");
	}
	else if(i%5==0) {
		System.out.println("hello");
	}
	else {
		System.out.println(i);
	}	
	}
}
}
