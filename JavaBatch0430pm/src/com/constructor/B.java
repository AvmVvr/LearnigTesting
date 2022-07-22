package com.constructor;

public class B{
public B() {
System.out.println("Super class");
}
public B(int id) {
System.out.println("parent id: "+id);//12
}
public B(String id) {
System.out.println("String parent id: "+id);
}
public static void main(String[] args) {
	B b = new B(12);
}
}


