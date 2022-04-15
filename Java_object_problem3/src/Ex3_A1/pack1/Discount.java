package Ex3_A1.pack1;

public class Discount {
	public String product;
	public int price;

	public void info() {
		System.out.println("これは" + this.product + "です。");
		System.out.println("値段は" + this.price + "円です。");
	}

	public void cutIn(int cut) {
		this.price -= cut;
		System.out.println("決算セールで" + cut + "円値引きされます。");
	}
}
