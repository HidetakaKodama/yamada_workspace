package e4_7;

public class Sample1 {
	public static void main(String[]args) {

		String i = "Hello";
		String j = "Wrold";

		System.out.println("こんにちは =" + i , ", 世界 =" + j);
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	型 PrintStream のメソッド println(String) は引数 (String, String) に適用できません
//
//	at e4_6.Sample1.main(Sample1.java:9)
//
//
//エラー内容
//
//printlnメソッドの引数として(String, String)というような書き方は適用できないです。
//
//
//解決方法
//
//System.out.println("こんにちは =" + i , "世界 =" + j);
//と記述するのではなく。
//System.out.println("こんにちは =" + i);
//System.out.println("世界 =" + j);
//と別々の記述するか。
//System.out.println("こんにちは =" + i + ", 世界 =" + j);
//というように文章をつなげる場合は[,]ではなく「＋」で記述する。
