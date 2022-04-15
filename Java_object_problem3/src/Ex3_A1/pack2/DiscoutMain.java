package Ex3_A1.pack2;

import Ex3_A1.pack1.Discount;

public class DiscoutMain {
	public static void main(String[] args) {
		Discount ds = new Discount();
		ds.product = "パソコンラック";
		ds.price = 29800;

		ds.info();
		ds.cutIn(3700);
		ds.info();
	}
}
