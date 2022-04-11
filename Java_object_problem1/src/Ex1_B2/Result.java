package Ex1_B2;

public class Result {
	int withTax;
	int discount;

	void show() {
		System.out.println("税込価格は" + this.withTax + "円です。");
		System.out.println("割引価格は" + this.discount + "円です。");
	}
}
