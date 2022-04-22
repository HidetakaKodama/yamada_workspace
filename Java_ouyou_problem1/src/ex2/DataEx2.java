package ex2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -30);

		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
	}
}
