package java_Program;

public class Palindrome {

	// palindrom no 121 reverse sams as number
// First reverse string and compare the string 

	public static int reversenumber(int n) {
		int reversed_n = 0;
		while (n > 0) {
			reversed_n = reversed_n * 10 + n % 10;
			n = n / 10;
		}
		return reversed_n;

	}

	public static void main(String[] args) {
		int n = 121;
		int num = reversenumber(n);

		if (n == num) {
			System.out.println("palindrom  : yes ");
		} else {
			System.out.println("not palindrom  : no ");
		}

	}

}
