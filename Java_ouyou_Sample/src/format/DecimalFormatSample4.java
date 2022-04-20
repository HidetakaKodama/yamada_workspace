package format;
/**
 *
 *  String#formatでの0埋め
 *
 */
public class DecimalFormatSample4 {
	public static void main(String[] args) {
		int num = 1;
		String str = String.format("%04d", num);   //「1」を右に４つずらし、ずらして空いた部分に「0」を埋める
		System.out.println(str); // 0001
	}
}
