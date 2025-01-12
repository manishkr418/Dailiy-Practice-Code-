package java_Program;

public class SwappingTwoNumBer {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		System.out.println("before swapping : " + a + "AND" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping :" + a + "AND" + b);

	}

}
