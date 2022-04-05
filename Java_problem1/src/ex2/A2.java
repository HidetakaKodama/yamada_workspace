package ex2;

public class A2 {
	public static void main(String[]args) {
		String num1 = "23";
		String num2 = "40";

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);

		System.out.println("和は" + (a + b));
		System.out.println("差は" + (a - b));
		System.out.println("積は" + (a * b));
		System.out.println("割は" + (a / b));
		System.out.println("あまりは" + (a % b));


		char num3 = '4';
		char num4 = '3';

		int c = num3 - '0';
		int d = num4 - '0';
		System.out.println("和は" + (c + d));
		System.out.println("差は" + (c - d));
		System.out.println("積は" + (c * d));
		System.out.println("割は" + (c / d));
		System.out.println("あまりは" + (c % d));

	}
}
