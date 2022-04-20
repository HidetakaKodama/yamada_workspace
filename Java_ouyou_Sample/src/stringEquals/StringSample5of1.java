package stringEquals;

public class StringSample5of1 {
	public static void main(String[] args) {
		String str = "明日の天気は晴れ時々くもりです";
		System.out.println(str.replaceAll("晴れ","雷")); //前で指定した文字列を後ろの文字列の置き換える
	}
}
