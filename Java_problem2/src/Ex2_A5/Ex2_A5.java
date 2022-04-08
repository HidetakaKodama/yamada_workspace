package Ex2_A5;

import java.util.Scanner;

public class Ex2_A5 {
	public static void main(String[]args) {
		System.out.println("あなたの性別は何ですか？「女性:1」「男性:それ以外」");
		Scanner ma = new Scanner(System.in);
		int gender = ma.nextInt();

		System.out.println("何曜日に行きますか？「月:1」「火:2」「水:3」「木:4」「金:5」「土:6」「日:7」");
		Scanner week = new Scanner(System.in);
		int day = week.nextInt();

		if(gender == 1) {
			if(day == 3) {
				System.out.println("チケット代は1000円です！");
			}else {
				System.out.println("チケット代は2000円です！");
			}
		}else {
			System.out.println("チケット代は2000円です！");
		}
	}
}
