package calendar;

import java.util.Calendar;

public class CalendarSample2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.YEAR, 10); //10年加える
		cal.add(Calendar.MONTH, 2); //2か月加える
		cal.add(Calendar.DAY_OF_MONTH, -5); // 5日分減る
	}
}
