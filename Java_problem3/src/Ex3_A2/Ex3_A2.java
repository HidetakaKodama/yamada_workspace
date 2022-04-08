package Ex3_A2;

import java.util.Scanner;

public class Ex3_A2 {
	public static void main(String[]args) {
		System.out.println("メッセージを入力してください。");
		Scanner i = new Scanner(System.in);
		String message = i.next();

		int j = 0;
		int x = 0;
		int y = 0;

		System.out.println("for文の場合");
		for(j = 0; j < 5; j++) {
			System.out.println(message);
		}

		System.out.println("while文の場合");
		while(x<5) {
			System.out.println(message);
			x++;
		}

		System.out.println("do-while文の場合");
		do {
			System.out.println(message);
			y++;
		}while(y<5);
	}
}
