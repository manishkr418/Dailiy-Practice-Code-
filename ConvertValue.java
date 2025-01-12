package java_Program;

public class ConvertValue {

	public static void main(String[] args) {

		// 1. boolean to string
		boolean value = true;
		String output = Boolean.toString(value);
		System.out.println(output);

		// 2 string to double
		String strValue = "1234";
		Double doubleval = Double.parseDouble(strValue);
		System.out.println(doubleval);

		// 3 string to long
		String str = "999999999999";

		// Converting into Long
		long varLong = Long.parseLong(str);

		// Printing String as Long
		System.out.println("Long - " + varLong);

		//4 
	}
}
