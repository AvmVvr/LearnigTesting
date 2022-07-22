package com.controlstatement;

public class NestedFor {
	public static void main(String[] args) {

		for (int row = 1; row <= 5; row++) {
			for (int column = 5; column >= row; column--) {
				System.out.print("*" + " ");
			}

			System.out.println("");
		}
	}
}
