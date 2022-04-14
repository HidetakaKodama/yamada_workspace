package e4_14;
/**
 *
 * 配列を作成し、要素に好きな数字を代入する。それぞれの要素の合計点とその合計点を要素数で割った平均点を出力する。
 *
 */
public class Sample6 {
	public static void main(String[] args) {
		int[] score = {10,20,30,40,50};
		int sum =
				(score[1] + score[2] + score[3] + score[4] + score[5]);
		int avg = sum / score.length;

		System.out.println("合計点は" + sum);
		System.out.println("平均点は" + avg);
	}
}


//エラーコード
//
//
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//at e4_14.Sample6.main(Sample6.java:11)
//
//
//エラー内容
//
//ArrayIndexOutOfBoundsと書いてあるので配列に問題が生じている。
//
//
//解決方法
//
//Arrayは配列、Indexは添え字、OutOfBoundsは範囲外と読み解き、配列を宣言をする辺りのコードを
//見てみると9行目の宣言では特に問題はないが10行11行目の合計点の計算では１つ目の要素の数字が
//0からではなく１から始まっている。
//配列の要素は1からではなく0から数えるのでそこを修正すればエラーはなくなる。
//

