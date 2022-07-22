package com.string;

public class MutableImmutable {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java"; 
		System.out.println(s1);//java
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String result = s1.concat(s2);
		System.out.println(result);
		System.out.println(s1);//java
		System.out.println(System.identityHashCode(result));
//	
		
		System.out.println("***************Mutable********************");
		StringBuffer x1 = new StringBuffer("Java");
		StringBuffer x2 = new StringBuffer("Java");
		System.out.println(x1);//java
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		x2.append(x1);
		System.out.println(x1);//java
		System.out.println(x2);//kumarjava
		System.out.println(System.identityHashCode(x2));
	}

}
