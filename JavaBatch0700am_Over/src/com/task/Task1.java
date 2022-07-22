package com.task;

public class Task1 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "-Hello");
			} else if (i % 2 == 0) {
				System.out.println(i + "-Even");
			} else
				System.out.println(i + "-Odd");
		}
	}
}
/*
 * 1. print from 1 to 100; in that print the "Even" along with even number; do
 * for Odd Values also print "Hello" for multiplies of three
 * 
 */
