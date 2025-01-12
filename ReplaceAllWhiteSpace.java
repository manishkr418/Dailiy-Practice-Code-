package java_Program;

public class ReplaceAllWhiteSpace {

	public static void main(String[] args) {

		String str = "  Saket Saurav        is a QualityAna    list  ";

		String st = str.replaceAll("\\s", "");
		System.out.println(st);

		System.out.println(str.trim());
        
		
		
		
		
	}
}
