package learning;

public class Triangle3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int a = 5;
				while (a >= i) {
					System.out.print(a + " ");
					a--;
				}
				System.out.println();
			}
		}
	}
}
