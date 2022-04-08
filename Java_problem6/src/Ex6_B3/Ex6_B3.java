package Ex6_B3;

import java.util.Scanner;

public class Ex6_B3 {
	public static void main(String[] args) {
		System.out.println("年数を入力してください");
		Scanner s1 = new Scanner(System.in);
		int year = s1.nextInt();

		boolean exist = Calc_year(year);
		if(exist == true) {
			System.out.println("明治時代です");
		}else {
			System.out.println("明治時代以外です");
		}
	}

	public static boolean Calc_year(int y) {
		boolean truth = false;
		if((1868 <= y) && (y <= 1912)) {
			truth = true;
		}
		return truth;
	}
}
