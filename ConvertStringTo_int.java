package java_Program;

public class ConvertStringTo_int {

	public static void main(String[] args) {

		// .valueof we convert any type of value

		String str = "123";
		int s = Integer.parseInt(str);

		System.out.println(s);

		int number = 12345;

		String Str = Integer.toString(number);
		System.out.println(Str);

		byte b = 12;
		String s2 = Byte.toString(b);
		System.out.println(s2);

		long l = 123;
		int lon = Integer.valueOf(b);
		String.valueOf(l);

		System.out.println(lon);
	}
}
