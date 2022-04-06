package ex5;

import java.util.Scanner;

public class SwitchJava1 {
	public static void main(String[]args) {
		System.out.println("0～2の数字で何か出してください");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();

		System.out.println("今日のあなたの運勢は～");
		switch(num) {
		case 0:
			System.out.println("大吉です！");
			break;
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("凶です(涙)");
		default:
			System.out.println("あなたは運勢に左右されない人生を歩むでしょう！");
		}
	}
}
