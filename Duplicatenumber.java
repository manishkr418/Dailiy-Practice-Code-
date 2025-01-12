package java_Program;

import java.util.HashSet;

public class Duplicatenumber {
	// duplicate in number
	public static HashSet<Character> duplicateInnumber(int number) {
// write number 
		
		
		String numberstr = Integer.toString(number);

		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();
		for (char c : numberstr.toCharArray()) {
			if (!set.add(c)) {
				duplicate.add(c);
			}

		}
		System.out.println("duplicate is :" + duplicate);
		return duplicate;
	}

	public static void main(String[] args) {
		// duplicateInnumber(11223);
		String str = "appppleisgoooda";

		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j] + " ");
  
					
				}
			}
		}

	}
}
