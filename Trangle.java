package java_Program;

public class Trangle {

	public static void main(String[] args) {

		// pyramid and trangle

		int num = 6;

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
				// if remove space from * its became a trangle
			}
			System.out.println();

		}

	}
}
