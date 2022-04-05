package ex3;

import java.util.Scanner;

public class A3_2 {
	public static void main(String[]args) {
		System.out.println("片方の数字を入力してください！");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();

		System.out.println("もう片方の数字を入力してください！");
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();

		if(num1 < num2) {
			System.out.println("大きい数字はこちらです！");
			System.out.println(num2);
		}else if(num1 > num2) {
			System.out.println("大きい数字はこちらです！");
			System.out.println(num1);
		}else {
			System.out.println("これらの数字は同じ値か全く違う次元の値です！");
		}
	}
}
