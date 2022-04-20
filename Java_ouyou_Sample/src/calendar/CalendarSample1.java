package calendar;

import java.util.Calendar;

public class CalendarSample1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println("今日は" + year + "年" + month + "月" + day + "日です。");
	}
}
