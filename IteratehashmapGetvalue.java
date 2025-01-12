package java_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratehashmapGetvalue {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "java");
		hm.put(2, "selenium");
		hm.put(3, "manual");

       	hm.entrySet().iterator();
		for (Entry<Integer, String> me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());

		}
	}
}
