package Ex1_B1;

import java.util.Scanner;

public class Ex1_B1 {
	public static void main(String[]args) {
		System.out.println("4桁の数字を入力してください");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();

		System.out.println(num + "なら");
		String str = String.valueOf(num);

		String str1 = str.substring(3,4);
		System.out.println("1桁目の数字は" + str1 + "です！");
		String str2 = str.substring(2,3);
		System.out.println("2桁目の数字は" + str2 + "です！");
		String str3 = str.substring(1,2);
		System.out.println("3桁目の数字は" + str3 + "です！");
		String str4 = str.substring(0,1);
		System.out.println("4桁目の数字は" + str4 + "です！");
	}
}