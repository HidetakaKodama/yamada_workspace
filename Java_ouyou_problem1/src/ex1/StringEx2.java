package ex1;

import java.util.Scanner;

public class StringEx2 {
	public static void main(String[] args) {
		System.out.println("電話番号を入力してください[ハイフン付き]");
		System.out.print("電話番号 → ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] nums = str.split("-");
		System.out.println("市外局番は「" + nums[0] + "」");
	}
}
