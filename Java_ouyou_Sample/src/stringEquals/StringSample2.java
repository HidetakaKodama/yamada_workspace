package stringEquals;

public class StringSample2 {
	public static void main(String[] args) {
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		String str3 = new String("AB");

		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //false
		System.out.println(str1 == str2); //false
	}
}
