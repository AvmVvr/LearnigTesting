package com.array;

public class TwoDim {
	public static void main(String[] args) {
	/*int java[][] = new int[3][3];
	java[0][0]=1;
	java[0][1]=2;
	java[0][2]=3;
	java[1][0]=4;
	java[1][1]=5;
	java[1][2]=6;
	java[2][0]=7;
	java[2][1]=8;
	java[2][2]=9;*/
		
int java[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(java[i][j]+" ");
	}
		System.out.println();
}
}
}