package Ex2_A4;

import java.util.Scanner;

public class Ex2_A4 {
	public static void main(String[] args) {
		System.out.println("あなたの点数を入力してください！");
		Scanner num_off = new Scanner(System.in);
		int num_on = num_off.nextInt();

		if(num_on >= 85) {
			System.out.println("あなたの評価は「優」です！");
		}else if(num_on >= 75) {
			System.out.println("あなたの評価は「良」です！");
		}else if(num_on >= 60) {
			System.out.println("あなたの評価は「可」です！");
		}else if(num_on < 60){
			System.out.println("あなたの評価は「不可」です！");
		}
	}
}
