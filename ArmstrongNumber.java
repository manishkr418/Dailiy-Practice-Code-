package java_Program;

public class ArmstrongNumber {
// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153   	
	public static void main(String[] args) {

		int number = 153, originalNumber, remainder;
		double result = 0;

		originalNumber = number;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result = result + Math.pow(remainder, 3);
			originalNumber = originalNumber / 10;

		}

		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");

	}
}
