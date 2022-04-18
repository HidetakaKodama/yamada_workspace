package e4_18;
/**
 *
 * コンストラクタのオーバーロード。
 * mainのクラスとは別のクラスを用いて、2人の人物の学籍番号と名前を代入する。
 * 代入する際に別のクラスではコンストラクタを２つのコンストラクタを用いる。
 * 引数の型によりインスタンスを作成する時に自動的に判別されるよう学籍番号と名前の引数を設定する。
 *
 */
public class Sample8 {
	public static void main(String[] args) {
		Human std1 = new Human(1002,"太郎");
		Human std1 = new Human(1001);

	}
}


class Human {
	int id;
	String name;

	Human(int id, String name){
		this.id = id;
		this.name = name;
	}

	Human(int id){
		this(id,"名無し");
	}

	void introduce() {
		System.out.println("あなたの学籍番号は" + this.id + "です。");
		System.out.println("あなたの名前は" + this.name + "です。");
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	重複ローカル変数 std1
//
//	at e4_18.Sample8.main(Sample8.java:6)
//
//
//エラー内容
//
//メソッド内で定義されたstd1が同じブロック内で同じ変数の宣言が重複している。
//
//
//解決内容
//
//エラーを見てみると、10行目で9行目と同じ変数を用いて宣言されている。
//Javaでは同じブロック内での同じ変数の宣言はできないのでここでは新たに変数を用意して
//宣言してあげるとエラーが解消される。
//(例)Human std2 = new Human(1001);    など