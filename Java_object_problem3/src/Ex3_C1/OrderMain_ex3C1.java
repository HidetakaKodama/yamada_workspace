package Ex3_C1;

public class OrderMain_ex3C1 {
	public static void main(String[] args) {
		System.out.println("メニューのサイズを選んでください");

		AbstractSize_ex3C1 std1 = new HamburgerSize_ex3C1("チーズバーガー");
		AbstractSize_ex3C1 std2 = new FrenchFriesSize_ex3C1("ポテト");
		AbstractSize_ex3C1 std3 = new DrinkSize_ex3C1("ファンタメロン");

		System.out.println("【選んだメニュー】");

		int std_ham = std1.selectSize();
		int std_fry = std2.selectSize();
		int std_dri = std3.selectSize();

		System.out.println(std1.getName() + "：" + std_ham + "円");
		System.out.println(std2.getName() + "：" + std_fry + "円");
		System.out.println(std3.getName() + "：" + std_dri + "円");

		Calc_ex3C1 cal = new Calc_ex3C1();
		int total_cal = cal.total(std_ham, std_fry, std_dri);

		System.out.println("お会計は" + total_cal + "円です。s");
	}
}
