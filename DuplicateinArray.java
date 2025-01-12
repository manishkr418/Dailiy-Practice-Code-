package java_Program;

import java.util.HashSet;

public class DuplicateinArray {

	/*
	 * int[] arr = { 1, 2, 4, 3, 2, 4, 6, 6 };
	 * 
	 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
	 * j++) { if (arr[i] == arr[j]) System.out.print(arr[i] + " "); } }
	 */

	public static void main(String[] args) {
		// same as string, or other
		int[] arr = { 1, 2, 4, 3, 2, 4, 6, 6, 6, 2 };

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println("Duplicate integers: " + duplicates);
	}
}
