package Ex2_A1;

import java.util.Scanner;

public class Ex2_A1 {
	public static void main(String[]args) {
		System.out.println("数字を入力してください！");
		Scanner num = new Scanner(System.in);
		int num_ans = num.nextInt();

		if(num_ans == 1) {
			System.out.println("赤");
		}else {
			System.out.println("青");
		}
	}
}
