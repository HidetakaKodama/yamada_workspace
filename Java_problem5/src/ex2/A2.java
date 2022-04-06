package ex2;

public class A2 {
	public static void main(String[]args) {
		String eng = "";
		String[] English = {"abc", "def", "ghi"};
		for(int i = 0; i < English.length; i++) {
			eng += English[i];
		}
		System.out.println(eng);
	}
}
