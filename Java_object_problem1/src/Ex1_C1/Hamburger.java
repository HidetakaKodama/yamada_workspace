package Ex1_C1;
/**
 * ここではハンバーガーのサイズをユーザーに１～３の数字の中から選んでもらう。
 * ハンバーガーの名前はorderMainの中でコンストラクタを用いて入力をしている。
 */
import java.util.Scanner;

public class Hamburger {
	String name;

	Hamburger(String name){
		this.name = name;
	}

	int selectSize() {
		System.out.println(name);//チーズバーガー(orderMain)
		System.out.println("1:シングル、 2:ダブル");

		Scanner s = new Scanner(System.in);//ハンバーガーのサイズを１～３で選ぶ
		int size = s.nextInt();

		switch(size) {
		case 1:
			size = 240;
			break;
		case 2:
			size = 350;
			break;
		}
		return size;
	}
}
