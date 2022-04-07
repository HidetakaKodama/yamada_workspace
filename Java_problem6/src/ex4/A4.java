package ex4;

import java.util.Scanner;

public class A4 {
	public static void main(String[]args) {
		System.out.println("おいくらまでお出ししますか？");
		Scanner i = new Scanner(System.in);
		int price = i.nextInt();

		System.out.println("あなたがお出しした値段は" + price + "円ですね？");

		int dis_price = Calc_price(price);
		System.out.println("お会計は" + dis_price + "円となります。");
	}

	public static int Calc_price(double price) {
		double dis_price;
		if(price >= 20000) {
			dis_price = (double)(price - (price * 0.4));
		}else if(price >= 10000) {
			dis_price = (double)(price - (price * 0.2));
		}else if(price >= 5000) {
			dis_price = (double)(price - (price * 0.1));
		}else{
			dis_price = (double)price;
		}
		return (int)dis_price;
	}
}
