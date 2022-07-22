package com.test.details;

public class StringImmutable {
	
public static void main(String[] args) {
	String s = "Welcome ";
	String s1 = "Java";
	String s2 = "Java";
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));

String concat = s.concat(s1);
System.out.println(concat);
System.out.println(System.identityHashCode(concat));

}
}
