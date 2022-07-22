package com.keywords;

public class Childd extends Parentt{
	int a = 500;
	public void key() {
		System.out.println(a);//500
		System.out.println(this.a);//current Class refer//500
		System.out.println(super.a);//Parent Class Refer//100
	}
public static void main(String[] args) {
	Childd c = new Childd();
	c.key();
}
}