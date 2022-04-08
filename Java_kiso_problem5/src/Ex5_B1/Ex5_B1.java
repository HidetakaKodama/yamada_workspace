package Ex5_B1;

import java.util.Scanner;

public class Ex5_B1 {
	public static void main(String[] args) {
		int[] scores = {88, 55, 77, 99, 66};

		System.out.println("検索したい整数を入力してください");
		Scanner num = new Scanner(System.in);
		int score = num.nextInt();

		boolean exist = false;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == score) {
				exist = true;
				break;
			}
		}

		if(exist) {
			System.out.println("その数字は見つかりました！");
		}else {
			System.out.println("残念ながらその数字は見つかりませんでした・・・。");
		}
	}
}
