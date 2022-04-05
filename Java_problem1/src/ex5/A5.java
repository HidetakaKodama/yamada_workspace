package ex5;

import java.util.Scanner;

public class A5 {
	public static void main(String[]args) {
		System.out.println("あなたの国語の点数は何点ですか？");
		Scanner a = new Scanner(System.in);
		int lan = a.nextInt();

		System.out.println("あなたの数学の点数は何点ですか？");
		Scanner b = new Scanner(System.in);
		int math = b.nextInt();

		System.out.println("あなたの英語の点数は何点ですか？");
		Scanner c = new Scanner(System.in);
		int eng = c.nextInt();

		int total = lan + math + eng;
		System.out.println("あなたのテストの合計点は" + total + "です！");

		int average = total/3;
		System.out.println("あなたのテストの平均点は" + Math.floor(average) + "です‼");

	}
}
