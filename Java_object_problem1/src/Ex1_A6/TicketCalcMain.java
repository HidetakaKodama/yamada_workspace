package Ex1_A6;

import java.util.Scanner;

public class TicketCalcMain {
	public static void main(String[] args) {
		System.out.print("基本料金を入力してください");
		Scanner s1 = new Scanner(System.in);
		int price = s1.nextInt();

		System.out.println("年齢を入力してください");
		Scanner s2 = new Scanner(System.in);
		int ages = s2.nextInt();

		int total = TicketCalc.ticket(price, ages);
		System.out.println("チケット代は" + total + "です。");
	}
}
