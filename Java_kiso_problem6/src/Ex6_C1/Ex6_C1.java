package Ex6_C1;

import java.util.Random;
import java.util.Scanner;

public class Ex6_C1 {
	public static void main(String[] args) {
		Calc_janken();
		}

	public static void Calc_janken() {
		System.out.println("何を出すか決めてください [グー：0][チョキ：1][パー：2]");
		Scanner s = new Scanner(System.in);
		int hand1 = s.nextInt();
		showHand("あなたが出したものは？", hand1);

		Random rand = new Random();
		int hand2 = rand.nextInt(3) + 1;
		showHand("相手が出したものは？", hand2);

		System.out.println();
		if ((hand1 == 1 && hand2 == 2) || (hand1 == 2 && hand2 == 3)|| (hand1 == 3 && hand2 == 1)) {
		System.out.println("あなたの勝ちです！");
		}else if (hand1 == hand2) {
			System.out.println("あいこです！");
		} else {
			System.out.println("あなたの負けです・・・。");
		}
		System.out.println();
	}

	public static void showHand(String name, int hand) { //何を見せるか
		switch (hand) {
		case 0:
			System.out.println(name + "：グー");
			break;
		case 1:
			System.out.println(name + "：チョキ");
			break;
		case 2:
			System.out.println(name + "：パー");
			break;
		}
	}
}