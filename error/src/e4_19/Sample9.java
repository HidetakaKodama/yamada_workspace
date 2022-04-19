package e4_19;
/**
 *
 *mainクラスとは別のクラスを用いる。
 *犬の名前と体重を表示するクラスをスーパークラス、像の名前と重さを表示するサブクラスを作成して、
 *クラスをオーバーライドして、mainクラスではサブクラスのインスタンスを作成してメソッドを呼び出し結果を出力する。
 *
 */
public class Sample9 {
	public static void main(String[] args) {
		OverDog d = new OverDog("ポチ", 33.3);

		d.introduce();
	}
}


class Dog {
	private String name;
	private double height;

	Dog(String name, double height){
		this.name = name;
		this.height = height;
	}

	public void introduce() {
		System.out.println("うちの犬の名前は" + this.name + "です。");
		System.out.println("体重は" + this.height + "kgです。");
	}
}


class OverDog extends Dog{
	@Override
	public void introduce() {
		System.out.println("あの像の名前は" + this.name + "です。");
		System.out.println("像の重さは" + this.height + "らしいです。");
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	コンストラクター OverDog(String, double) は未定義です
//
//	at e4_19.Sample9.main(Sample9.java:9)
//
//
//エラー内容
//
//OverDogクラスでは明示的なコンストラクタが未定義です。
//
//
//解決方法
//サブクラスであるOverDogクラスでsuper句を使い、コンストラクタを定義することで
//エラーが解消される。
//
//(例) OverDog(String name, double height) {
//	   super(name, height);
//    }





