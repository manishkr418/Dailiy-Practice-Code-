package java_Program;

public class StrongNumber {

//	when we want to print number like 1 to 10000;

	/*
	 * System.out.println("Strong numbers between 1 and 1000 are:"); for (int i =1;
	 * i <= 1000000; i++) { if (isStrongNumber(i)) { System.out.println(i); } }
	 */

	public static boolean isStrongNumber(int number) {

		int sum = 0;
		int temp = number;

		while (number > 0) {
			int d = number % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			number = number / 10;

		}
		return temp == sum;

	}

	public static void main(String[] args) {

		int numb = 145;
		int sum = 0;
		int temp = numb;

		while (numb != 0) {
			int d = numb % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			numb = numb / 10;

		}
		if (temp == sum) {
			System.out.println("strong");
		} else {
			System.out.println("not strong");
		}
      
		
	}

}
