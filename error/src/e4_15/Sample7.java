package e4_15;
/**
 *
 * 別のクラスでフィールドの値を設定し、インスタンスを作成。フィールドの値を代入し、メッセージメソッドを呼び出す。
 */
public class Sample7 {
	public static void main(String[] args) {
		Student sd = new Student();
		sd.id(18);
		sd.name("太郎");

		sd.introduce();

	}
}

class Student{
	int id;
	String name;

	void introduce() {
		System.out.println("あなたの学籍番号は" + this.id);
		System.out.println("あならの名前は" + this.name);
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problems:
//	メソッド id(int) は型 Student で未定義です
//	太郎 を変数に解決できません
//
//	at e4_15.Sample7.main(Sample7.java:6)
//
//
//エラー内容
//
//メソッドのint型idはStudent型として定義されていない。
//「太郎」は変数として参照できない。
//
//
//解決方法
//
//idと「太郎」と記述されているので9行目と10行目の辺りを見てみると
//フィールドの値の代入の書き方が「＝」イコールではなく「（）」括弧で
//記述されているのでこれを「＝」イコールに直すとエラーが解消される