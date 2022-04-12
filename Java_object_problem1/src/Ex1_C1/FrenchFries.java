package Ex1_C1;
/**
 * ここではサイドメニューのサイズをユーザーに１～３の数字の中から選んでもらう。
 * サイドメニューの名前はorderMainの中でコンストラクタを用いて入力をしている。
 */
import java.util.Scanner;

public class FrenchFries {
	String name;

	FrenchFries(String name){
		this.name = name;
	}

	int selectSize() {
		System.out.println(name);//ポテト(orderMain)
		System.out.println("1:S、2:M、3:L");

		Scanner s = new Scanner(System.in);//サイドメニューのサイズを１～３で選ぶ
		int size = s.nextInt();

		switch(size) {
		case 1:
			size = 240;
			break;
		case 2:
			size = 300;
			break;
		case 3:
			size = 360;
			break;
		}
		return size;
	}
}
