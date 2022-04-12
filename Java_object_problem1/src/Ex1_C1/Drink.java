package Ex1_C1;
/**
 * ここではドリンクのサイズをユーザーに１～３の数字の中から選んでもらう。
 * ドリンクの名前はorderMainの中でコンストラクタを用いて入力をしている。
 */
import java.util.Scanner;

public class Drink {
	String name;

	Drink(String name){
		this.name = name;
	}

	int selectSize() {
		System.out.println(name);//ファンタメロン(orderMain)
		System.out.println("1:S、2:M、3:L");

		Scanner s = new Scanner(System.in); //ドリンクのサイズを１～３で選ぶ
		int size = s.nextInt();

		switch(size) {
		case 1:
			size = 150;
			break;
		case 2:
			size = 200;
			break;
		case 3:
			size = 250;
			break;
		}
		return size;
	}
}
