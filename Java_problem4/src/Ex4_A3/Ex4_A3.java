package Ex4_A3;

import java.util.Scanner;

public class Ex4_A3 {
	public static void main(String[]args) {
		while(true) {
		System.out.println("文字を入力してください");
		Scanner i = new Scanner(System.in);
		String str = i.next();

		if(str.equals("こんにちは")) {
			System.out.println("はい、こんにちは");
			break;
		}else {
			System.out.println("本当にそれで合っていますか？");
		}

		}
	}
}

