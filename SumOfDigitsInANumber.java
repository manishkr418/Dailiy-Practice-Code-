package java_Program;

public class SumOfDigitsInANumber {
	public static void main(String[] args) {

		int number = 12456;
		int remainder;
		int sum = 0;

		while (number > 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		System.out.println("sum of number :" + sum);

		
	}
}
