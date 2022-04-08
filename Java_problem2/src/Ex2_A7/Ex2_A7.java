package Ex2_A7;

import java.util.Scanner;

public class Ex2_A7 {
	public static void main(String[]args) {
		System.out.println("値を入力してください！");
		Scanner num = new Scanner(System.in);
		int value = num.nextInt();

		System.out.println("あなたの選択した色は");
		switch(value){
		case 1:
			System.out.println("赤です！");
			break;
		case 2:
			System.out.println("黄です！");
			break;
		case 3:
			System.out.println("青です！");
			break;
		}
	}
}
