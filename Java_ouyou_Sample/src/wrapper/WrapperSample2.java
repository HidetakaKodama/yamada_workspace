package wrapper;
/**
 *
 * 文字列をプリミティブ型に変換
 *
 */
public class WrapperSample2 {
	public static void main(String[] args) {
		int num = Integer.parseInt("123");
		double d = Double.parseDouble("3.14");
		boolean b = Boolean.parseBoolean("true");

		System.out.println(num);
		System.out.println(d);
		System.out.println(b);
	}
}
