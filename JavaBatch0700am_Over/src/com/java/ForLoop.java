package com.java;

public class ForLoop {
	public void descending() {
		for (int i = 100; i >= 0; i = i - 5) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		ForLoop fl = new ForLoop();
		fl.descending();
	}

}
