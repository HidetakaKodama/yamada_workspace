package e4_11;

/**
 *
 * よくある凡ミス。第５部のA2問題。
 * 配列の要素に順番び文字を入れて置き、それぞれの文字をすべてつなげるコードを表している。
 *
 */

public class Sample3 {
	public static void main(String[] args) {
		String[] English = {"abc", "def", "ghi"};
		for(int i = 0; i < English.length; i++) {
			String eng ;
			eng += English[i];
		}
		System.out.println(eng);
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	eng を変数に解決できません
//
//	at e4_11.Sample3.main(Sample3.java:17)
//
//
//エラー内容
//
//「eng」を変数として参照可能ではない。
//
//
//解決方法
//
//見てみると、13行から16行のfor文内でString型の変数engを宣言しているため、
//for文外の17行のSystem.out.println()内のengは変数として参照ができていないので、
//for文の外で記述する必要がある。
//なので、実際には12行13行目あたりにあらたに宣言してあげる。
//

