package learning;

public class Calculator {
	public void add() {
		int a = 5;
		int b = 5;
		int c;
		c = a + b;
		System.out.println(c);
	}

	public void sub() {
		int d = 10;
		int e = 5;
		int f;
		f = d - e;
		System.out.println(f);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
	}
}