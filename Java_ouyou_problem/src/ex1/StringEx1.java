package ex1;

import java.util.Scanner;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("ファイルパスを入力してください");
		System.out.print("ファイルパス → ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] values = str.split("\\\\");
		System.out.println("「" + values[values.length-1] + "」");
	}
}


//要素は0からなので配列の長さから１引くと最後の要素に該当する [values.length-1]