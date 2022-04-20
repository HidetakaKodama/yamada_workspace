package stringEquals;

public class StringSample6of2 {
	public static void main(String[] args) {
		String str = "あいうえおかきくけこさしすせそ";
		System.out.println(str.indexOf("えおか"));  //3  インデックス番号
		System.out.println(str.indexOf("きくけ")); //6  インデックス番号
		System.out.println(str.indexOf("ABC")); //-1  インデックスにないため「-1」を返されている
	}
}
