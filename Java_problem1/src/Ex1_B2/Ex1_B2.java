package Ex1_B2;

public class Ex1_B2 {
	public static void main(String[]args) {
		int a = new java.util.Random().nextInt();
		int b = new java.util.Random().nextInt();

		System.out.println("片方の数字は" + a + "です");
		System.out.println("もう片方の数字は" + b + "です");
		System.out.println("大きい数字はこちらです！");
		int num3 = Math.max(a,b);
		System.out.println(num3);
	}
}
