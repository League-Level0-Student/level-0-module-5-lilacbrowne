
public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = a + b;

		for (int i = 0; i < 21; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
		}

	}
}
