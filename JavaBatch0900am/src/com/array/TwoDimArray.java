package com.array;

public class TwoDimArray {
	public static void main(String[] args) {
		int tda[][] = new int[2][2];
		tda[0][0] = 10;
		tda[0][1] = 20;
		tda[1][0] = 30;
		tda[1][1] = 40;

		int tda1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				System.out.print(tda[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(tda1[r][c] + " ");
			}
			System.out.println();
		} } }