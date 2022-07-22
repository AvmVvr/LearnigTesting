package com.keywords;

public class Demo extends FinalKeyWord{
	int a =10;
	@Override
	public void method() {
		int a =100;
		System.out.println(this.a);//current class reference
		System.out.println(super.a);
		super.method(); // Parent Class refer.
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.method();
	}

}
