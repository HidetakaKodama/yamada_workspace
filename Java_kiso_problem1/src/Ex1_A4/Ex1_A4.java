package Ex1_A4;

import java.util.Scanner;

public class Ex1_A4 {
	public static void main(String[] args) {
		System.out.println("おいくらですか？");
		Scanner num1 = new Scanner(System.in);
		int prise1 = num1.nextInt();
        System.out.println(prise1 + "ですね。");

        double tax = 8;
        System.out.println("税込価格は" + (int)Math.floor(prise1*(1+tax*0.01))  + "です！");
	}
}
