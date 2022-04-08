package Ex6_B2;

import java.util.Scanner;

public class Ex6_B2 {
	public static void main(String[] args) {
		System.out.println("片方の整数を入力してください");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();

		System.out.println("もう片方の整数を入力してください");
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();

		int comDiv = Calc_num(num1, num2);
		System.out.println("最大公約数は  " + comDiv);
	}

	public static int Calc_num(int n1, int n2) {
		int temp = 0;
		while((temp = n1 % n2) != 0) {
			n1 = n2;
			n2 = temp;
		}
		return n2;
	}
}
