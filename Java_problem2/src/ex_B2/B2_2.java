package ex_B2;

import java.util.Scanner;

public class B2_2 {
	public static void main(String[]args) {
		System.out.println("1～12の内、１つだけ数字を入力してください");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();

		if((num % 2 == 0) && (1 <= num) && (num <= 12)) {
			System.out.println("この値は偶数です。");
		}else if((num % 2 == 1) && (1 <= num) && (num <= 12)) {
			System.out.println("この値は奇数です。");
		}else {
			System.out.println("この値は範囲外です。");
		}
	}
}
