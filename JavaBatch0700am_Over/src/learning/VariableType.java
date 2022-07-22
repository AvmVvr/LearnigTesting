package learning;

public class VariableType {
	static int a =5; 		// Static Variable
		   int b = 10; 		// class Variable
		   int c ; 			// class Variable
	public void method1() {
		int d = 100 ;  		//Local Variable
		System.out.println(d);
	}
	public static void main(String[] args) {
		VariableType vt = new VariableType();
		vt.method1();
		System.out.println(vt.c);
		System.out.println(vt.b);
		System.out.println(vt.a);
	}
}