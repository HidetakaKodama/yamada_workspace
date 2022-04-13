package e4_13;
/**
 *
 * int型の数字を２つ用意し、新しく作成したメソッド内で計算したものを戻り値で返して出力する。
 *
 */
public class Sample5 {
	public static void main(String[] args) {
		int num1 = 3;
		 int num2 = 24;

		int sum = totalNum(num1, num2);
		System.out.println(sum);
	}

	public int totalNum(int n1, int n2) {
		int total = 0;
		total = n2 + n1;
		return total;
	}
}


//
//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	型 Sample5 の非 static メソッド totalNum(int, int) を static 参照することはできません
//
//	at e4_13.Sample5.main(Sample5.java:8)
//
//
//エラー内容
//
//static(クラスメソッド)ではないtotalNumメソッドをstatic(クラスメソッド)のmainメソッドから参照することはできないです。
//クラス全体の処理に関わるエラー。
//
//
//解決方法
//
//12行目の「public」の部分を「static」にするか、「public」のあとに「static」を
//割り込むことでエラーを解消できる。
//
