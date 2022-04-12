package Ex1_C1;

public class orderMain {
	public static void main(String[] args) {
		System.out.println("メニューのサイズを選んでください。");

		Hamburger s1 = new Hamburger("チーズバーガー");
		FrenchFries s2 = new FrenchFries("ポテト");
		Drink s3 = new Drink("ファンタメロン");

		int s1Size = s1.selectSize();
		int s2Size = s2.selectSize();
		int s3Size = s3.selectSize();

		System.out.println("【選んだメニュー】");

		System.out.println("チーズバーガー：" + s1Size + "円");
		System.out.println("ポテト：" + s2Size + "円");
		System.out.println("ファンタメロン：" + s3Size + "円");

		Calc std = new Calc();
		int totalPrice = std.total(s1Size, s2Size, s3Size);
		System.out.println("お会計は" + totalPrice + "円です");

	}
}
