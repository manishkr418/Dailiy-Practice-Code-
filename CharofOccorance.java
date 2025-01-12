package java_Program;

import java.util.HashMap;
import java.util.Map;

public class CharofOccorance {
	/*
	 * String input = "hellojji";
	 * 
	 * also we can do that
	 * String str = "hello hi hi hiii hiiii";
		String[] ch = str.split(" ");
		// char ch[] = str.toCharArray();

	 * 
	 * 
	 * 
	 * char ch[] = input.toCharArray(); Map<Character, Integer> charCountMap = new
	 * HashMap<Character, Integer>();
	 * 
	 * for (char c : ch) { charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	 * 
	 * }
	 * 
	 * for (Map.Entry<Character, Integer> entry :charCountMap.entrySet()) {
	 * System.out.println("Character: " + entry.getKey() + " | Occurrences: " +
	 * entry.getValue());
	 * 
	 * }
	 */

	
	
	
	
	

	public static Map<Character, Integer> countCharacterOccurrences(String str) {
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		return charCountMap;
	}

	public static void main(String[] args) {

		
		String input = " hi this is java program";
		Map<Character, Integer> charCountMap = countCharacterOccurrences(input);
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println("Character: " + entry.getKey() + " | Occurrences: " + entry.getValue());

		}

	}
}
