package Ex6_A5;

import java.util.Scanner;

public class Ex6_A5 {
	public static void main(String[] args) {
		System.out.println("正の整数を１つ入力してください。");

		Scanner p = new Scanner(System.in);
		int num = p.nextInt();

		int sum = num_total(num);

		System.out.println("合計は" + sum + "となります！");
	}

	static int num_total(int n) {
		int total= 0;
		for(int i = 1; i <= n; i++) {
			 total = total + i;
		}
		return total;
	}
}
