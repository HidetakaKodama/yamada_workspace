package Ex4_B3;

import java.util.Scanner;

public class Ex4_B3 {
	public static void main(String[] args) {
		int temp;
		System.out.println("片方の数字を入力してください");
		Scanner i = new Scanner(System.in);
		int num = i.nextInt();

		System.out.println("もう片方の数字を入力してください");
		Scanner j = new Scanner(System.in);
		int Num = j.nextInt();

		while((temp = num%Num)!=0) {
			num = Num;
			Num = temp;
		}
		System.out.println(Num);

	}
}
