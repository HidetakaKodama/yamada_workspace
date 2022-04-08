package Ex4_A2;

import java.util.Scanner;

public class Ex4_A2 {
	public static void main(String[]args) {
		System.out.println("正の数字を入力してください：1個目");
		Scanner i = new Scanner(System.in);
		int number = i.nextInt();

		System.out.println("正の数字を入力してください：2個目");
		Scanner j = new Scanner(System.in);
		int Number = j.nextInt();

		System.out.println("正の数字を入力してください：3個目");
		Scanner a = new Scanner(System.in);
		int nUmber = a.nextInt();

		System.out.println("正の数字を入力してください：4個目");
		Scanner b = new Scanner(System.in);
		int nuMber = b.nextInt();

		System.out.println("正の数字を入力してください：5個目");
		Scanner c = new Scanner(System.in);
		int numBer = c.nextInt();


		int num1 = Math.max(number,Number);
		int num2 = Math.max(num1,nUmber);
		int num3 = Math.max(num2, nuMber);
		int num4 = Math.max(num3,numBer);

		System.out.println("この中で大きい数字は = " + num4);
	}
}
