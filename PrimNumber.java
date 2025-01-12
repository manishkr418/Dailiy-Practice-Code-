package java_Program;

public class PrimNumber {

	// a number divided by it self like 2 5 7 11
	public static void main(String[] args) {
		/*
		 * int num = 100; int i; int j; int temp;
		 * 
		 * for (i = 2; i <= num; i++) { temp = 0;
		 * 
		 * for (j = 2; j < i; j++) { if (i % j == 0) { temp++; break; } } if (temp == 0)
		 * { System.out.print(i + " "); } }
		 */

		int number = 100;
		int temp = 0;

		// you can also do the 20 to 100
		// for (int i = 20; i <= number; i++) {

		for (int i = 1; i <= number; i++) {
			temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp++;

				}

			}
			if (temp == 0) {
				System.out.print(i + " ");
			}
		}

	}
}