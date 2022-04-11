package Ex6_C1;

import java.util.Random;
import java.util.Scanner;

public class Ex6_C1 {
	public static void main(String[] args) {
		}

	public static void janken() {
		System.out.println("何を出すか決めてください [グー：1][チョキ：2][パー：3]");
		Scanner s = new Scanner(System.in);
		int hand1 = s.nextInt();

			janken();
		System.out.println("相手が出したものは？");
		Random rand = new Random();
		int hand2 = rand.nextInt(3) + 1;

		// プレイヤーの手を表示
		showHand("あなた", hand1);

		// コンピュータの手を表示
		showHand("コンピュータ", hand2);

		// 勝者を表示
		if (hand1 == hand2) {

			// あいこ
			System.out.println("あいこです！");
		} else if ((hand1 == 1 && hand2 == 2)
			|| (hand1 == 2 && hand2 == 3)
			|| (hand1 == 3 && hand2 == 1)) {

			// プレイヤーが勝ち
			System.out.println("あなたの勝ちです！");
		} else {

			// コンピュータが勝ち
			System.out.println("コンピュータの勝ちです！");
		}
		System.out.println();
	}

	// 手と名前を表示するメソッド
	static void showHand(String name, int hand) {
		switch (hand) {
		case 1:
			System.out.println(name + "：グー");
			break;
		case 2:
			System.out.println(name + "：チョキ");
			break;
		case 3:
			System.out.println(name + "：パー");
			break;
		}
	}
}