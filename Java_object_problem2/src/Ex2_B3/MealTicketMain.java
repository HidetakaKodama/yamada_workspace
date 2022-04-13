package Ex2_B3;

import java.util.Scanner;

public class MealTicketMain {
	public static void main(String[] args) {
		System.out.println("メニューの番号を入力してください[1] ～ [3]");
		System.out.println("１：カレー");
		System.out.println("２：ラーメン");
		System.out.println("３：寿司");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		MealTicketFactory mtf = new MealTicketFactory();
		MealTicket mt = mtf.chooseMeal(num);
		mt.ticketing();
	}
}
