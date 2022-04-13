package Ex2_C1;

public class OrderMain {
	public static void main(String[] args) {
		System.out.println("メニューのサイズを選んでください");

		AbstractSize std1 = new HamburgerSize("チーズバーガー");
		AbstractSize std2 = new FrenchFriesSize("ポテト");
		AbstractSize std3 = new DrinkSize("ファンタメロン");

		System.out.println("【選んだメニュー】");

		int std_ham = std1.selectSize();
		int std_fry = std2.selectSize();
		int std_dri = std3.selectSize();

		System.out.println(std1.getName() + "：" + std_ham + "円");
		System.out.println(std2.getName() + "：" + std_fry + "円");
		System.out.println(std3.getName() + "：" + std_dri + "円");

		Calc cal = new Calc();
		int total_cal = cal.total(std_ham, std_fry, std_dri);

		System.out.println("お会計は" + total_cal + "円です。s");
	}
}
