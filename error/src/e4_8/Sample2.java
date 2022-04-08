package e4_8;

import java.util.Scanner;

/**
 * 「Scanner」クラスを用いて、標準入力から数字を入力する。
 *  入力した数字は出力される。
 */

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("数字を入力してください。");
		Scanner i = new Scanner(System.in);
		int  num = nextInt();

		System.out.println(num);
	}
}



//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	メソッド nextInt() は型 Sample2 で未定義です
//
//	at e4_8.Sample2.main(Sample2.java:13)
//
//
//エラー内容
//
//・「Sample2」ファイルの中で「nextInt()」メソッドは未定義の状態です。
//
//
//解決方法
//
//・ユーザーが入力した文字を整数に変換するためのメソッドであり、
//  変換する対象の変数を指定する。
//
//  「i.nextInt()」と記述しなおす必要がある。