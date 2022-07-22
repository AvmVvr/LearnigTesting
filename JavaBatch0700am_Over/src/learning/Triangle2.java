package learning;

public class Triangle2 {
	public static void main(String[] args) {
	int a = 5;
	while(a>=1) {
			for (int i = 1; i <= 5; i++) {
				for (int j = 5; j >= i; j--) {
				System.out.print(a+" ");
				}
				a--;
				System.out.println();
			}
		}
	}
}
