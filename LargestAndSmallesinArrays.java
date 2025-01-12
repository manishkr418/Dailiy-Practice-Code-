package java_Program;

public class LargestAndSmallesinArrays {

	public static void main(String[] args) {

		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = arr[0];
		int samllest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < samllest) {
				samllest = arr[i];
			} else if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("smallest is :" + samllest);
		System.out.println("largest is :" + largest);

	}
}
