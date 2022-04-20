package format;
/**
 * 0埋め(4桁)の例
 *
 */
import java.text.DecimalFormat;

public class DecimalFormatSample1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0000");
		int num = 1;
		String str = df.format(num);
		System.out.println(str);      // 0001
	}
}
