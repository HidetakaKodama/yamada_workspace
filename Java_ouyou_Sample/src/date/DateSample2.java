package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");

		Date date = new Date();  //現在の日付時刻をゲット
		String dateStr = sdf.format(date);  //フォーマットに現在の日付時刻を代入してdateStrに代入
		System.out.println(dateStr);
	}
}
