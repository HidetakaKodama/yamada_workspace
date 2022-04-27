package e4_27;

import java.util.Calendar;

public class Sample13 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		String week[] = {"土","日","月","火","水","木","金"};

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.MONTH);
		String weekday = week[cal.get(Calendar.WEEK)];
		System.out.println("今日は" + year + "年" + month + "月" + day + "日" + weekday + "曜日です。");
	}
}


//エラーコード
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problems:
//	DAY は解決できないか、フィールドではありません
//	WEEK は解決できないか、フィールドではありません
//
//	at e4_27.Sample13.main(Sample13.java:12)
//
//
//
//エラー内容
//
//12行目のDAYとWEEKでエラーが出ています、もしくはフィールドとして扱えません。
//
//
//
//解決方法
//
//何日を表示する場合と何曜日を表示する場合は「DAY_OF_MONTH」と「DAY_OF_WEEK」というように記述する。



//+α
//
//MONTHは最初は「０」から開始されるので「１」を足す。

