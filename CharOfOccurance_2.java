package java_Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharOfOccurance_2 {
	
	

	public static void main(String[] args) {

		String str = "hello hi hi hiii hiiii";

		String[] ch = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String c : ch) {

			map.put(c, map.getOrDefault(c, 0) + 1);

		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			System.out.println(key + "  " + val);

		}

	}
}
