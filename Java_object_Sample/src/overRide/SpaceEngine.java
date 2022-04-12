package overRide;

public class SpaceEngine {
	public static void main(String[] args) {
		humanDate hd = new humanDate();
		hd.month = 4;
		hd.date = 3;
		hd.weather = "雷";

		hd.info();
	}
}

class Tenki {
	protected int month;
	protected int date;
	protected String weather;



	public void info() {
		System.out.println("明日は" + this.month + "月の" + this.date + "日です。");
		System.out.println("そして明日の天気は" + this.weather + "を予報しています。");
	}
}



class humanDate extends Tenki {
	@Override
	public void info() {
		System.out.println("次に解く問題は問題集の第" + this.month + "部のA" + this.date + "番をやる予定です。");
		System.out.println("一番の壁は" + this.weather + "でしょう。");
	}
}
