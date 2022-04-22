package ex2;

import java.util.Calendar;

public class DataEx1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 20);
		String week[] = { "日", "月", "火", "水", "木", "金", "土" };

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		String weekday = week[cal.get(Calendar.DAY_OF_WEEK) - 1];
		System.out.println(year + "年" + month + "月" + day + "日(" + weekday + ")");
	}
}


//DAY_OF_WEEK : 曜日を示す