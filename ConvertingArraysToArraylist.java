package java_Program;

import java.util.Arrays;
import java.util.List;

public class ConvertingArraysToArraylist {
	public static void main(String[] args) {

		String[] str = { "Rahul", "Utkarsh", "Shubham", "Neelam", "swati", "priya" };

// Conversion of array to ArrayList
// using Arrays.asList
		List<String> al = Arrays.asList(str);

		for (String string : al) {
			System.out.println(string);
		}

	}

}
