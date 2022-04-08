package ex3;

import java.util.Scanner;

public class Sample_scan {
	public static void main(String[] args) {
		System.out.println("片方の数字を入力してください！");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();

		System.out.println("もう片方の数字を入力してください！");
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();

		System.out.println("大きい数字はこちらです！");
		int num_com = Math.max(num1,num2);
		System.out.println(num_com);


		int num3 = new java.util.Random().nextInt(num_com);
		System.out.println(num3);

	}
}
