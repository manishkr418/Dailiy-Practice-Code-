package java_Program;

public class OddEvenCountInnumber {

	public static void main(String[] args) {
		
		int number = 1234567;
		int evenCount = 0, oddCount = 0;

		while (number > 0) {
			int digit = number % 10; // Extract the last digit
			if (digit % 2 == 0) {
				evenCount++; // Increment even digit count
			} else {
				oddCount++; // Increment odd digit count
			}
			number /= 10; // Remove the last digit

		}

		System.out.println(evenCount);
		System.out.println(oddCount);

		
		
	}
}
