package date;
/**
 *
 * 文字列を日付に変換する
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample3 {
	public static void main(String[] args) {
		String str = "2022年4月20日";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
}
