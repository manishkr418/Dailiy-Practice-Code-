package java_Program;

public class Reverse_String {

	public static void main(String[] args) {

		
		// 1. way reverse string
		String str = "selenium";
		/*
		 * char[] ch = str.toCharArray();
		 * 
		 * for(int i=ch.length-1;i>=0;i--) {
		 * 
		 * System.out.print(ch[i]);
		 * 
		 */
		// 2 way

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

		
		
		
		
	}
}
