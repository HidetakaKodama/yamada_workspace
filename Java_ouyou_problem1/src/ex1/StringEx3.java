package ex1;

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		boolean truth = true;
		while(truth) {
			System.out.println("文字列を入力してください");
			System.out.print("入力 → ");
			Scanner sc = new Scanner(System.in);
			String letter = sc.next();
			if(letter.equals("end")) {
				break;
			}else {
				System.out.println("文字数＝" + letter.length());
			}
		}
		System.out.println("終了します");
	}
}
