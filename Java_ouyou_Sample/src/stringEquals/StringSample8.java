package stringEquals;

public class StringSample8 {
	public static void main(String[] args) {
		String str = "あいうえおかきくけこさしす";
		System.out.println(str.startsWith("あ")); //開始文字を指定して、その文字で始まればtrue
		System.out.println(str.endsWith("し"));//終了文字を指定して、その文字で終わればtrue
	}
}
