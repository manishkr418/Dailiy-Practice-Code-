package java_Program;

import java.util.ArrayList;

public class ConvertArraylistToArray {

	public static void main(String[] args) {

		// Creating and initializing ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pear");

		Object[] ar = fruits.toArray();

		for (Object obj : ar) {
			System.out.println(obj);

			
		}
	}
	/*
	 * List<Integer> al = new ArrayList<>(); al.add(10); al.add(20); al.add(30);
	 * al.add(40);
	 * 
	 * Object[] objects = al.toArray(); for (Object obj : objects) {
	 * System.out.print(obj + " "); } }
	 */

}
