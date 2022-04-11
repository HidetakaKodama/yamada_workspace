package Ex1_B2;

import java.util.Scanner;

public class PriceInfoMain {
	public static void main(String[] args) {
		System.out.println("商品の値段・税率・割引率をすべて整数で入力してください");
		System.out.println("商品の値段(円)：");
		Scanner s1 = new Scanner(System.in);
		int circle = s1.nextInt();

		System.out.println("税率(%)：");
		Scanner s2 = new Scanner(System.in);
		int persent = s2.nextInt();

		System.out.println("割引率(%)：");
		Scanner s3 = new Scanner(System.in);
		int dis = s3.nextInt();

		PriceInfo a = new PriceInfo();
		Result res = a.getResult(circle, persent, dis);
		res.show();
	}
}
