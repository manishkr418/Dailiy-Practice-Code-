package java_Program;

import java.util.ArrayList;
import java.util.List;

public class RemoveNUmberFromString {

	public static void main(String[] args) {

		/*
		 * String str = "java123";
		 * 
		 * char[] ch = str.toCharArray();
		 * 
		 * ArrayList<Character> al = new ArrayList<Character>(); for (Character c : ch)
		 * { if (!Character.isDigit(c)) { al.add(c);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(al);
		 */

		String str = "java123";
		String result ="";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!Character.isDigit(ch[i])) {
				result = result + ch[i];

			}

		}
		System.out.println(result);
	}
}
