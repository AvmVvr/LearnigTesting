package learning;

public class Triangle {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 14) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(a+" ");
					a = a + 1;
				}
				System.out.println();
			}
		}
	}
}