package e4_11;

/**
 *
 * よくある凡ミス。第５部のA2問題。
 * 配列の要素に順番の文字を入れて置き、それぞれの文字をすべてつなげるコードを表している。
 *
 */

public class Sample3 {
	public static void main(String[] args) {
		String eng;
		String[] English = {"abc", "def", "ghi"};
		for(int i = 0; i < English.length; i++) {
			eng += English[i];
		}
		System.out.println(eng);
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problems:
//	ローカル変数 eng が初期化されていない可能性があります
//	ローカル変数 eng が初期化されていない可能性があります
//
//	at e4_11.Sample3.main(Sample3.java:15)
//
//
//エラー内容
//
//String型変数engの中身が初期化されていません。
//中身が何かわからない状態。
//
//
//解決方法
//
//変数を定義する際は中身を定義することを忘れていはいけないので。
//この場合は「""」と入力しておく。
