package e4_20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample10 {
		public static void main(String[] args) {
			String[] a = {"りんご", "みかん", "さくらんぼ", "桃", "梨"};
			System.out.println("参照したいデータのインデックスを入力してください");
			try {

				Scanner sc = new Scanner(System.in);
				int index = sc.nextInt();
				System.out.println(index + "： " + a[index]);

			} catch (InputMismatchException) {
				System.out.println("インデックスは整数で入力してください。");
			} catch (ArrayIndexOutOfBoundsException) {
				System.out.println("お探しのインデックスは存在しません。");
			}
		}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problems:
//	構文エラーがあります。"VariableDeclaratorId" を挿入して FormalParameter を完了してください
//	構文エラーがあります。"VariableDeclaratorId" を挿入して FormalParameter を完了してください
//
//	at e4_20.Sample10.main(Sample10.java:16)
//
//エラー内容
//
//スタックトレースeが記述されていない
//
//
//解決ほうほう
//
//16行目と17行目のcatch()の中で例外処理のエラーを吐き出す際にスタックトレースに使われるeが
//入っていないので記述する必要がある。