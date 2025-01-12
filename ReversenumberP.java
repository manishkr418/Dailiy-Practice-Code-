package java_Program;

public class ReversenumberP {

	public static void main(String[] args) {

		/*
		 * int number = 54321;
		 * 
		 * String str = Integer.toString(number); System.out.println(str);
		 * 
		 * StringBuffer sb = new StringBuffer(str); System.out.println(sb.reverse());
		 * 
		 */

		int number = 54321;

		int rem, rev = 0;

		while (number > 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;

		}
		System.out.println(rev);

		
	}
}
