package date;

import java.util.Date;

public class DateSample1 {
	public static void main(String[] args) {
		Date date = new Date();  // 現在の時刻日付曜日
		System.out.println(date);
		Date date2 = new Date(100000);  // 引数内には基準値(1970年1月1日0時0分0秒)から経過させたいミリ秒
		System.out.println(date2);
	}
}
