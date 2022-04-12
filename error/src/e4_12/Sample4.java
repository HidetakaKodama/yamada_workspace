package e4_12;

/**
 *
 * 配列を作成し、それぞれの要素に数字を代入し、それらの数字を順番に足していく。
 * 足した数は出力する。
 *
 */

public class Sample4 {
	public static void main(String[] args) {
		int[] num = new int{5};
		int total = 0;
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		for(int i = 0; i < num.length; i++) {
			total += num[i];
		}
		System.out.println(total);
	}
}



//
//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation pr oblem:
//	トークン "int" に構文エラーがあります。このトークンの後にはDimensions を指定する必要があります
//
//	at e4_12.Sample4.main(Sample4.java:11)
//
//
//エラー内容
//
//int型の構文でエラーが検出された。Dimensionsとのことなので幅や高さといったサイズを指定するところでエラーが
//出たのではないか。
//
//
//解決方法
//
//intの構文でDimensionsなので配列の要素数を宣言するところでエラーが出ていると考え、
//11行目を見てみると、「new int{5}」で大括弧が波括弧になっている。
//波括弧を使う場合は数字を代入する場合なのでここでは波括弧を大括弧に直すとエラーがなくなる。
//
