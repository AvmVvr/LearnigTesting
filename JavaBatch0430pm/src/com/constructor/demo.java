package com.constructor;

public class demo{
public demo() {
this("JAVA");
System.out.println("Default const...");
}

public demo(int id) {
this(3456.5678f);
System.out.println(id);
}

public demo(String name) {
this(12);
System.out.println(name);
}

public demo(float sal) {
System.out.println(sal);
}

public static void main(String[] args) {
demo a = new demo();
}
}