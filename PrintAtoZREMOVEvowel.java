package java_Program;

public class PrintAtoZREMOVEvowel {

	public static void main(String[] args) {

		// Define the vowels
		String vowels = "aeiou";
		int count = 0;

		// Loop through the alphabet
		for (char ch = 'a'; ch <= 'z'; ch++) {
			// Check if the character is not a vowel
			if (vowels.indexOf(ch) == -1) {
				count++;
				System.out.print(ch + " ");
			}
		}
		// we can also count that value
		System.out.println(count);
 
	}
}
