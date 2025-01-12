package java_Program;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int num = 10, sum = 0;
		// pre- increment ++i
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
			// sum += i;

		}
		System.out.println("Sum = " + sum);

	}
}
