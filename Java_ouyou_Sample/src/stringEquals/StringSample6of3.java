package stringEquals;

public class StringSample6of3 {
	public static void main(String[] args) {
		String str = "あいうえおかきくけこさしすせそ";
		System.out.println(str.contains("あいう")); //文字列を指定して、その文字列が含まれているなら「true」
		System.out.println(str.contains("かきく"));
		System.out.println(str.contains("ABC")); // 文字列が含まれていないので、「false」
	}
}
