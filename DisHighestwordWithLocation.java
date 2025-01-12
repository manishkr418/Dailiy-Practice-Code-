package java_Program;

public class DisHighestwordWithLocation {

	public static void main(String[] args) {

		String[] arr = { "java", "python", "servlet1111111111111111", "selenium123456", "springboot" };

		// we also convert String[]arr to string
		// String[] arr = str.split(" "); (we use this ways)

		String largest = arr[0];
		int x = 0;
		int lenth = arr.length;

		for (int i = 0; i < lenth; i++) {

			if (arr[i].length() > largest.length()) {
				largest = arr[i];
				x = i;

			}
		}
		System.out.println("largest string is :" + largest + " location : " + x);

	}

}
