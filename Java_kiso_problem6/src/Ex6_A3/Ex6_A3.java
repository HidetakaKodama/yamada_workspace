package Ex6_A3;

public class Ex6_A3 {
	public static void main(String[] args) {
		int price = 10000;
		int discounted = Calc_price(price);
		System.out.println(discounted);
	}

	public static int Calc_price(int price) {
		int dis_price = (int)(price - (price * 0.3));
		return dis_price;
	}
}
