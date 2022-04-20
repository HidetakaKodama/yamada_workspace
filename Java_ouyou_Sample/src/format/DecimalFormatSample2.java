package format;
/**
 * ３桁ごとのカンマ区切り
 *
 */
import java.text.DecimalFormat;

public class DecimalFormatSample2 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		int num = 1000001;
		String str = df.format(num);
		System.out.println(str);     // 1,000,000
	}
}
