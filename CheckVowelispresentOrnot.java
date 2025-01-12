package java_Program;

public class CheckVowelispresentOrnot {

	public static void main(String[] args) {

		
		// your word 
		String input = "Hello how are you";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.print(ch + " ");

			}

		}

	}
}
