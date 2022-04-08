package Ex4_C2;

import java.util.Random;
import java.util.Scanner;

public class Ex4_C2 {
	public static void main(String[]args) {
		System.out.println("あなたは何を出しますか「数字」？ グー[0], チョキ[1], パー[2]");
		Scanner i = new Scanner(System.in);
		int you_hand = i.nextInt();

		Random rand = new Random();
		int num = rand.nextInt(3);

		System.out.println("あなたが出したものは？");
		switch(you_hand) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		default:
			System.out.println("0～2の数字を入力してください！");
		}

		System.out.println("相手が出したものは？");
		switch(num) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		}

		if(((you_hand == 0) && (num == 1)) || ((you_hand == 1) && (num == 2)) || ((you_hand == 2) && (num == 0))) {
			System.out.println("あなたの勝ちです！");
		}else if(((you_hand == 0) && (num == 2)) || ((you_hand == 1) && (num == 0)) || ((you_hand == 2) && (num == 1))) {
			System.out.println("あなたの負けです。");
		}else {
			System.out.println("あいこです。もう一度！");
		}
	}
}
