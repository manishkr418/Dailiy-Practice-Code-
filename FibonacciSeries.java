package java_Program;

public class FibonacciSeries {

	// Addition To first and last like 1,2,3,,5,8,

	public static void main(String[] args) {

		int number = 10;
		int a = 0, b = 0, c = 1;

		for (int i = 1; i <= number; i++) {

			a = b;
			b = c;
			c = a + b;

			System.out.print(c + " ");

		}

	}

}
