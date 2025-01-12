package java_Program;

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingHashmap {

	public static void main(String[] args) {

		// word occurrence in String

		String str = "This this is is done by Saket Saket";

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] words = str.split(" ");

		for (String word : words) {

			Integer interger = map.get(word);

			if (interger == null) {
				map.put(word, 1);
			} else {
				map.put(word, interger + 1);
			}

		}
		System.out.println(map);

	}
}
