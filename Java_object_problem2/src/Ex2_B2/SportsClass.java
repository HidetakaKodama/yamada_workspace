package Ex2_B2;

public class SportsClass extends AbstractClassInfo{
	protected void info() {
		System.out.println("スポーツクラスはスポーツ推薦入学者のクラスです");
	}

	protected void classes() {
		System.out.println("授業内容は比較的易しいです");
	}

	protected void classmate() {
		System.out.println("７割が男性です");
	}

	protected void club() {
		System.out.println("部活は入学時の推薦枠によって必ず参加です");
	}
}
