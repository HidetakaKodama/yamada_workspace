package Ex3_B1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MealTicketMain_Ex3B1 {
	public static void main(String[] args) {

		while (true) {
			try {
				System.out.println("メニューの番号を入力してください[1] ～ [3]");
				System.out.println("１：カレー");
				System.out.println("２：ラーメン");
				System.out.println("３：寿司");
				Scanner s = new Scanner(System.in);
				int num = s.nextInt();

				MealTicketFactory_Ex3B1 mtf = new MealTicketFactory_Ex3B1();
				MealTicket mt = mtf.chooseMeal(num);

				mt.ticketing();
				break;
				} catch (InputMismatchException|NullPointerException e) {
					System.out.println("有効な整数を入力してください。");
					System.out.println();
			}
		}
	}
}
