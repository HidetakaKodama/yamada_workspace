package format;
/**
 * 小数点第３位までの表示
 */
import java.text.DecimalFormat;

public class DecimalFormatSample3 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		double num = 3.14159265;
		String str = df.format(num);
		System.out.println(str);       // 3.142
	}
}
